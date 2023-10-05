/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import static java.awt.image.ImageObserver.WIDTH;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;

/**
 *
 * @author JULIORUIZ
 */
public class ArchivoSecuencial {

    // Se define un formateador de fecha y hora con el patron especificado.
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

//    
//      El metodo Search busca un ID especifico primero en el archivo de bitacora y luego en el archivo maestro.
//      id El ID que se busca.
//     bitacora La ruta del archivo de bitacora.
//      master La ruta del archivo maestro.
//      Retorna la linea del archivo donde se encuentra el ID o "null" si no se encuentra o si el registro esta deshabilitado.
//     
    public String Search(String id, String bitacora, String master) {
        //Se crean objetos File para los archivos de bitacora y maestro.
        File bit = new File(bitacora);
        File mast = new File(master);
        FileReader LecturaArchivo;
        BufferedReader LeerArchivo;

        //Se verifica si el archivo de bitacora existe.
        if (bit.exists()) {
            try {
                LecturaArchivo = new FileReader(bit);
                LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;
                Linea = LeerArchivo.readLine();

                //Se recorre cada linea del archivo de bitacora.
                while (Linea != null) {
                    if (!"".equals(Linea)) {
                        if (Linea.contains(id)) {
                            if (!Linea.endsWith("1")) {
                                //Si el registro esta deshabilitado, se regresa "null".
                                return "null";
                            }
                            LecturaArchivo.close();
                            LeerArchivo.close();
                            return Linea;  // Retorna la línea donde se encuentra el ID.
                        }
                    }
                    Linea = LeerArchivo.readLine();
                }
                LecturaArchivo.close();
                LeerArchivo.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return "null";
            } catch (IOException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return "null";
            }
        }

        //Se verifica si el archivo maestro existe.
        if (mast.exists()) {
            try {
                LecturaArchivo = new FileReader(mast);
                LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;
                Linea = LeerArchivo.readLine();

                //Se recorre cada línea del archivo maestro.
                while (Linea != null) {
                    if (!"".equals(Linea)) {
                        if (Linea.contains(id)) {
                            if (!Linea.endsWith("1")) {
                                //Si el registro esta deshabilitado, se regresa "null".
                                return "null";
                            }
                            LecturaArchivo.close();
                            LeerArchivo.close();
                            return Linea;  //Retorna la linea donde se encuentra el ID.
                        }
                    }
                    Linea = LeerArchivo.readLine();
                }
                LecturaArchivo.close();
                LeerArchivo.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return "null";
            } catch (IOException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return "null";
            }
        }

        //Si el ID no se encuentra en ninguno de los archivos, se regresa "null".
        return "null";
    }

///
// El metodo Add se encarga de añadir un nuevo registro al sistema.
// Verifica la existencia previa del registro y decide si añadirlo a la bitacora o al archivo maestro.
// Si la bitacora esta llena, realiza una reorganizacion.
// param key Llave primaria del registro a añadir.
// param ingreso Informacion del registro a añadir.
// param pathBit Ruta del archivo de bitacora.
// param pathMaster Ruta del archivo maestro.
// param pathBitDes Ruta del descriptor de la bitacora.
// param pathMasterDesc Ruta del descriptor del archivo maestro.
// param user Usuario que realiza la insercion.
// param repetidos Indica si se permiten registros repetidos.
// 
    public void Add(String key, String ingreso, String pathBit, String pathMaster, String pathBitDes, String pathMasterDesc, String user, boolean repetidos) {
        if (!repetidos) {
            if (!Search(key, pathBit, pathMaster).equals("null")) {
                //Si la llave primaria ya esta en la bitacora o en el maestro, se retorna
                System.out.println("Llave primaria ya existente.");
                return;
            }
        }

        // Verificar si hay algún administrador.
        boolean existeAdmin = hayAdmin(pathMaster);
        String primerAdmin;

        if (!existeAdmin) {
            // El usuario actual es el primer administrador.
            primerAdmin = user;
        } else {
            // Obtener la información del primer administrador almacenado previamente.
            primerAdmin = getPrimerAdmin(pathMaster);
        }

        //Verificar descriptor
        String[][] descriptorBit = getDescriptor(pathBitDes);
        String[][] descriptorMast = getDescriptor(pathMasterDesc);

        if (descriptorBit == null || descriptorMast == null) {
            System.out.println("Error al obtener los descriptores.");
            return;
        }

        String fechaMod;
        if ("".equals(descriptorBit[1][1]) && "".equals(descriptorBit[2][1])) {
            //Fecha creación
            fechaMod = dtf.format(LocalDateTime.now());
            descriptorBit[1][1] = fechaMod;
            descriptorMast[1][1] = fechaMod;
            //Usuario creación
            descriptorBit[2][1] = primerAdmin;
            descriptorMast[2][1] = primerAdmin;
            setDescriptor(descriptorMast, pathMasterDesc);
            setDescriptor(descriptorBit, pathBitDes);
        }

        int cantRegistrosB = Integer.parseInt(descriptorBit[5][1].trim());
        int regActivosB = Integer.parseInt(descriptorBit[6][1].trim());
        int maxReorgB = Integer.parseInt(descriptorBit[8][1].trim());
        String error = "";
        if (cantRegistrosB < maxReorgB) {
            //Se inserta en la bitácora            
            LlenarArchivo(pathBit, ingreso, error);
            cantRegistrosB += 1;
            regActivosB += 1;
            fechaMod = dtf.format(LocalDateTime.now());
            descriptorBit[3][1] = fechaMod;
            descriptorBit[4][1] = user;
            descriptorBit[5][1] = cantRegistrosB + "";
            descriptorBit[6][1] = regActivosB + "";
            setDescriptor(descriptorBit, pathBitDes);
        } else {
            // Antes de llamar a Reorganizar y despues a Add, verifica que realmente es necesario.
            if (cantRegistrosB >= maxReorgB) {
                Reorganizar(pathBit, pathMaster, pathBitDes, pathMasterDesc, user);
                descriptorBit = getDescriptor(pathBitDes);  // Refresca el descriptor
                cantRegistrosB = Integer.parseInt(descriptorBit[5][1].trim());
                if (cantRegistrosB < maxReorgB) {
                    Add(key, ingreso, pathBit, pathMaster, pathBitDes, pathMasterDesc, user, repetidos);
                } else {
                    System.out.println("Error: La reorganización no redujo los registros de la bitácora.");
                }
            }
        }
    }

//    
//    El metodo getDescriptor recupera la informacion del descriptor del archivo y la retorna en una matriz.
//    param ruta Ruta del archivo descriptor.
//     return Retorna una matriz con la informacion del descriptor del archivo.
//     
    private String[][] getDescriptor(String ruta) {
        String[][] fileInfo = new String[9][2];
        File file = new File(ruta);
        if (file.exists() == true) {
            try {
                FileReader LecturaArchivo = new FileReader(file);
                BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo);
                for (int i = 0; i < 9; i++) {
                    String lineStr = LeerArchivo.readLine();
                    if (lineStr != null) {
                        String[] line = lineStr.split(":");
                        fileInfo[i][0] = line.length > 0 ? line[0] : "";
                        fileInfo[i][1] = line.length > 1 ? line[1] : "";
                    } else {
                        fileInfo[i][0] = "";
                        fileInfo[i][1] = "";
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage(), "Error", WIDTH);
            }
        }
        return fileInfo;
    }

//    
//     El metodo setDescriptor actualiza la informacion del descriptor en el archivo.
//     param descriptor Matriz con la informacion del descriptor.
//     param Path Ruta del archivo descriptor.
//     
    private void setDescriptor(String[][] descriptor, String Path) {
        try {
            File Archivo = new File(Path);
            FileWriter Escribir = new FileWriter(Archivo);

            //Escribe la informacion del descriptor en el archivo
            for (int i = 0; i < 9; i++) {
                Escribir.write(descriptor[i][0] + ":" + descriptor[i][1] + System.getProperty("line.separator"));
            }
            Escribir.close();

        } catch (IOException ex) {
            //Manejo de error de escritura en el archivo
        }
    }

//    
//     El metodo LlenarArchivo escribe contenido en un archivo especificado.
//     param strPath Ruta del archivo donde se escribe el contenido.
//     param strContenido Contenido a escribir en el archivo.
//     param strError String donde se almacena el mensaje de error en caso de existir.
//     return Retorna true si se escribe correctamente, de lo contrario retorna false.
//     
    private boolean LlenarArchivo(String strPath, String strContenido, String strError) {
        try {
            // Se usa try-with-resources para asegurarnos de que BufferedWriter se cierra después de usarlo.
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(strPath, true))) {
                bw.write(strContenido + System.getProperty("line.separator"));
                return true;
            }
        } catch (IOException ex) {
            strError = ex.getMessage();
            return false;
        }
    }

//   
// El metodo Reorganizar se encarga de reorganizar la informacion entre la bitacora y el archivo maestro.
// Combina ambos archivos, ordena los registros y actualiza los descriptores.
// param pathBit Ruta del archivo de bitacora.
// param pathMaster Ruta del archivo maestro.
// param pathBitDesc Ruta del descriptor de la bitacora.
// param pathMasterDesc Ruta del descriptor del archivo maestro.
// param user Usuario que realiza la reorganizacion.
// 
    private void Reorganizar(String pathBit, String pathMaster, String pathBitDesc, String pathMasterDesc, String user) {
        // Obtiene los descriptores de ambos archivos
        String[][] descriptorM = getDescriptor(pathMasterDesc);
        String[][] descriptorB = getDescriptor(pathBitDesc);
        File bitacora = new File(pathBit);
        File master = new File(pathMaster);
        ArrayList<String> auxiliar = new ArrayList<>();

        try {
            // Lee la bitacora y añade los registros activos a la lista auxiliar
            FileReader LecturaArchivo = new FileReader(bitacora);
            BufferedReader LeerAR = new BufferedReader(LecturaArchivo);
            String Linea = LeerAR.readLine();
            int cantidad = 0;
            while (Linea != null) {
                if (!"".equals(Linea) && Linea.endsWith("1")) {
                    auxiliar.add(Linea);
                    cantidad += 1;
                }
                Linea = LeerAR.readLine();
            }
            LecturaArchivo.close();
            LeerAR.close();
            // Limpia el archivo de bitacora
            bitacora.delete();
            bitacora.createNewFile();

            // Lee el archivo maestro y añade los registros activos a la lista auxiliar
            LecturaArchivo = new FileReader(master);
            LeerAR = new BufferedReader(LecturaArchivo);
            Linea = LeerAR.readLine();
            while (Linea != null) {
                if (!"".equals(Linea) && Linea.endsWith("1")) {
                    auxiliar.add(Linea);
                    cantidad += 1;
                }
                Linea = LeerAR.readLine();
            }
            LecturaArchivo.close();
            LeerAR.close();
            // Limpia el archivo maestro
            master.delete();
            master.createNewFile();
            // Ordena la lista auxiliar y escribe los registros en el archivo maestro
            Collections.sort(auxiliar);
            String error = "";
            for (var s : auxiliar) {
                LlenarArchivo(pathMaster, s, error);
            }

            // Actualiza el descriptor del archivo maestro
            String fechaMod = dtf.format(LocalDateTime.now());
            descriptorM[3][1] = fechaMod;
            descriptorM[4][1] = user;
            descriptorM[5][1] = cantidad + "";
            descriptorM[6][1] = cantidad + "";
            setDescriptor(descriptorM, pathMasterDesc);

            // Actualiza el descriptor de la bitacora
            fechaMod = dtf.format(LocalDateTime.now());
            descriptorB[3][1] = fechaMod;
            descriptorB[4][1] = user;
            descriptorB[5][1] = 0 + "";
            descriptorB[6][1] = 0 + "";
            setDescriptor(descriptorB, pathBitDesc);

        } catch (FileNotFoundException ex) {
            Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

///
// El metodo getAll busca y retorna todos los registros que coincidan con el ID proporcionado.
// Busca en el archivo maestro y en la bitacora y agrega los registros activos a una lista.
// param id ID que se utiliza para buscar registros en los archivos.
// param pathMaster Ruta del archivo maestro.
// param pathBit Ruta del archivo de bitacora.
// return Retorna una lista con todos los registros activos que coincidan con el ID.
// 
    public ArrayList<String> getAll(String id, String pathMaster, String pathBit) {
        ArrayList<String> resultado = new ArrayList<>();
        File bit = new File(pathBit);
        File mast = new File(pathMaster);
        FileReader LecturaArchivo;
        BufferedReader LeerArchivo;

        //Verifica si el archivo de bitacora existe
        if (bit.exists()) {
            try {
                LecturaArchivo = new FileReader(bit);
                LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;
                Linea = LeerArchivo.readLine();

                //Recorre el archivo de bitacora y busca registros que coincidan con el ID
                while (Linea != null) {
                    if (!"".equals(Linea)) {
                        if (Linea.contains(id)) {
                            if (!Linea.endsWith("1")) {
                                //Si el registro esta deshabilitado se regresa un null
                                continue;
                            }
                            LecturaArchivo.close();
                            LeerArchivo.close();
                            resultado.add(Linea);
                        }
                    }
                    Linea = LeerArchivo.readLine();
                }
                LecturaArchivo.close();
                LeerArchivo.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            } catch (IOException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }

        //Verifica si el archivo maestro existe
        if (mast.exists()) {
            try {
                LecturaArchivo = new FileReader(mast);
                LeerArchivo = new BufferedReader(LecturaArchivo);
                String Linea;
                Linea = LeerArchivo.readLine();

                //Recorre el archivo maestro y busca registros que coincidan con el ID
                while (Linea != null) {
                    if (!"".equals(Linea)) {
                        if (Linea.contains(id)) {
                            if (!Linea.endsWith("1")) {
                                //Si el registro esta deshabilitado se regresa continua
                                continue;
                            }
                            LecturaArchivo.close();
                            LeerArchivo.close();
                            resultado.add(Linea);
                        }
                    }
                    Linea = LeerArchivo.readLine();
                }
                LecturaArchivo.close();
                LeerArchivo.close();

            } catch (FileNotFoundException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            } catch (IOException ex) {
                Logger.getLogger(ArchivoSecuencial.class.getName()).log(Level.SEVERE, null, ex);
                return null;
            }
        }
        return resultado;
    }

    private boolean hayAdmin(String pathUsuarios) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathUsuarios))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                // Si el rol es 1 (administrador) y el estado es 1 (activo)
                if ("1".equals(partes[8]) && "1".equals(partes[9])) {
                    return true; // Ya hay un administrador
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }

    private String getPrimerAdmin(String pathUsuarios) {
        try (BufferedReader br = new BufferedReader(new FileReader(pathUsuarios))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] partes = linea.split("\\|");
                // Si el rol es 1 (administrador) y el estado es 1 (activo)
                if ("1".equals(partes[8]) && "1".equals(partes[9])) {
                    return partes[0]; // Retorna el nombre de usuario del primer administrador
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null; // Retorna null si no hay ningún administrador
    }

}
