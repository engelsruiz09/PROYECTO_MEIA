/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primera_parte;
import Forms.*;
import java.io.*;
/**
 *
 * @author JULIORUIZ
 */
public class PRIMERA_PARTE {

    public static void main(String[] args) 
 {
        // Despliega el formulario de ingreso
        Login f1 = new Login();
        f1.setVisible(true);

        // Inicializa los objetos para escribir en archivos
        FileWriter Escribir;
        BufferedWriter bw;

        // Intenta crear el archivo usuario.txt
        try {
            File archivo = new File("C:\\MEIA\\usuario.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        // Intenta crear y configurar el archivo desc_usuario.txt
        try {
            File archivo2 = new File("C:\\MEIA\\desc_usuario.txt");
            if (archivo2.createNewFile()) {
                // Define la informacion a escribir en el archivo
                String info = "nombre_simbolico: usuario.txt" + System.getProperty("line.separator")
                    + "fecha_creacion:" + System.getProperty("line.separator")
                    + "usuario_creacion:" + System.getProperty("line.separator")
                    + "fecha_modificacion:" + System.getProperty("line.separator")
                    + "usuario_modificacion:" + System.getProperty("line.separator")
                    + "#_registros: 0" + System.getProperty("line.separator")
                    + "registros_activos: 0" + System.getProperty("line.separator")
                    + "registros_inactivos: 0" + System.getProperty("line.separator")
                    + "Max. para reorganizar: 3";

                // Escribe la informacion en el archivo
                Escribir = new FileWriter(archivo2, true);
                bw = new BufferedWriter(Escribir);
                bw.write(info);
                bw.close();

                System.out.println("Archivo creado: " + archivo2.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        // Intenta crear el archivo bitacora_backup.txt
        try {
            File archivo3 = new File("C:\\MEIA\\bitacora_backup.txt");
            if (archivo3.createNewFile()) {
                System.out.println("Archivo creado: " + archivo3.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        // Intenta crear y configurar el archivo desc_bitacora_backup.txt
        try {
            File archivo4 = new File("C:\\MEIA\\desc_bitacora_backup.txt");
            if (archivo4.createNewFile()) {
                // Define la informacion a escribir en el archivo
                String info = "nombre_simbolico: bitacora_usuario.txt" + System.getProperty("line.separator")
                    + "fecha_creacion:" + System.getProperty("line.separator")
                    + "usuario_creacion:" + System.getProperty("line.separator")
                    + "fecha_modificacion:" + System.getProperty("line.separator")
                    + "usuario_modificacion:" + System.getProperty("line.separator")
                    + "#_registros: 0";

                // Escribe la informacion en el archivo
                Escribir = new FileWriter(archivo4, true);
                bw = new BufferedWriter(Escribir);
                bw.write(info);
                bw.close();

                System.out.println("Archivo creado: " + archivo4.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        // Intenta crear el archivo bitacora_usuario.txt
        try {
            File archivo5 = new File("C:\\MEIA\\bitacora_usuario.txt");
            if (archivo5.createNewFile()) {
                System.out.println("Archivo creado: " + archivo5.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        // Intenta crear y configurar el archivo desc_bitacora_usuario.txt
        try {
            File archivo6 = new File("C:\\MEIA\\desc_bitacora_usuario.txt");
            if (archivo6.createNewFile()) {
                // Define la informacion a escribir en el archivo
                 System.out.println("Archivo creado: " + archivo6.getName());
                String info = "nombre_simbolico: bitacora_usuario.txt" + System.getProperty("line.separator")
                    + "fecha_creacion:" + System.getProperty("line.separator")
                    + "usuario_creacion:" + System.getProperty("line.separator")
                    + "fecha_modificacion:" + System.getProperty("line.separator")
                    + "usuario_modificacion:" + System.getProperty("line.separator")
                    + "#_registros: 0" + System.getProperty("line.separator")
                    + "registros_activos: 0" + System.getProperty("line.separator")
                    + "registros_inactivos: 0" + System.getProperty("line.separator")
                    + "Max. para reorganizar: 3";

                // Escribe la informacion en el archivo
                Escribir = new FileWriter(archivo6, true);
                bw = new BufferedWriter(Escribir);
                bw.write(info);
                bw.close();

                //System.out.println("Archivo creado: " + archivo6.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        // Intenta crear el archivo indice.txt
        try {
            File indice = new File("C:\\MEIA\\indice.txt");
            if (indice.createNewFile()) {
                System.out.println("Archivo creado: " + indice.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        // Intenta crear y configurar el archivo desc_indice.txt
        try {
            File desc_indice = new File("C:\\MEIA\\desc_indice.txt");
            if (desc_indice.createNewFile()) {
                // Define la informacion a escribir en el archivo
                String info = "nombre_simbolico: indice.txt" + System.getProperty("line.separator")
                    + "fecha_creacion:" + System.getProperty("line.separator")
                    + "usuario_creacion:" + System.getProperty("line.separator")
                    + "fecha_modificacion:" + System.getProperty("line.separator")
                    + "usuario_modificacion:" + System.getProperty("line.separator")
                    + "reg_inicial:" + System.getProperty("line.separator")
                    + "#_registros: 0" + System.getProperty("line.separator")
                    + "registros_activos: 0" + System.getProperty("line.separator")
                    + "registros_inactivos: 0" + System.getProperty("line.separator")
                    + "Max. para reorganizar: 3" + System.getProperty("line.separator")
                    + "num_bloques: 0";

                // Escribe la informacion en el archivo
                Escribir = new FileWriter(desc_indice, true);
                bw = new BufferedWriter(Escribir);
                bw.write(info);
                bw.close();

                System.out.println("Archivo creado: " + desc_indice.getName());
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }
        
        try {
            File archivo = new File("C:\\MEIA\\puntuacion.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
                // Abre el archivo en modo de escritura
                FileWriter fw = new FileWriter(archivo);

                // Crea un BufferedWriter para escribir de manera eficiente
                BufferedWriter bf = new BufferedWriter(fw);

                // Escribe el contenido en el archivo
                bf.write("6\n" +
                            "3\n" +
                                "2\n" +
                                    "1\n" +
                                        "2\n" +
                                            "4\n" +
                                                "6\n" +
                                                    "3");

                // Cierra el BufferedWriter (esto también cierra el FileWriter)
                bf.close();
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        try {
            File archivo = new File("C:\\MEIA\\resultado.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
                // Abre el archivo en modo de escritura
                FileWriter fw = new FileWriter(archivo);

                // Crea un BufferedWriter para escribir de manera eficiente
                BufferedWriter bf = new BufferedWriter(fw);

                // Escribe el contenido en el archivo
                bf.write("0,20\n" +
                            "21,30\n" +
                                "31,45\n" +
                                    "46,100");

                // Cierra el BufferedWriter (esto también cierra el FileWriter)
                bf.close();
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

 }
 }
