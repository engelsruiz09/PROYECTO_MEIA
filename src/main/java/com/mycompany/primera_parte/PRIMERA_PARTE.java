/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.primera_parte;

import Forms.*;
import java.io.*;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.IOException;

/**
 *
 * @author JULIORUIZ
 */
public class PRIMERA_PARTE {

    public static void main(String[] args) {
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
        /*try {
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
        }*/
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

        try {
            File archivo = new File("C:\\MEIA\\puntuacion.txt");
            if (archivo.createNewFile()) {
                System.out.println("Archivo creado: " + archivo.getName());
                // Abre el archivo en modo de escritura
                FileWriter fw = new FileWriter(archivo);

                // Crea un BufferedWriter para escribir de manera eficiente
                BufferedWriter bf = new BufferedWriter(fw);

                // Escribe el contenido en el archivo
                bf.write("6\n"
                        + "3\n"
                        + "2\n"
                        + "1\n"
                        + "2\n"
                        + "4\n"
                        + "6\n"
                        + "3");

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
                bf.write("0,20\n"
                        + "21,30\n"
                        + "31,45\n"
                        + "46,100");

                // Cierra el BufferedWriter (esto también cierra el FileWriter)
                bf.close();
            } else {
                System.out.println("Este archivo ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error.");
            e.printStackTrace();
        }

        ///////////////////////////////////////////////////////////////////////////////////////////////////////
//        try {
//            File archivoIndice = new File("C:\\MEIA\\indice_usuario.txt");
//            if (archivoIndice.createNewFile()) {
//                String header = "inicio|registro|posicion|usuario|siguiente|estatus";
//                FileWriter fw = new FileWriter(archivoIndice, true);
//                BufferedWriter bwr = new BufferedWriter(fw);
//                bwr.write(header);
//                bwr.newLine();
//                bwr.close();
//                System.out.println("Archivo creado: " + archivoIndice.getName());
//            } else {
//                System.out.println("El archivo indice_usuario.txt ya existe.");
//            }
//        } catch (IOException e) {
//            System.out.println("Error al crear indice_usuario.txt.");
//            e.printStackTrace();
//        }
        try {
            // bloque inicial y su archivo descriptor:
            int bloqueInicial = 1; // bloque 1
            createBloqueFile(bloqueInicial);
            createDescBloqueFile(bloqueInicial);
        } catch (IOException e) {
            System.out.println("Error al crear los archivos.");
            e.printStackTrace();
        }

//        try {
//            File archivoDescIndice = new File("C:\\MEIA\\desc_indice_usuario.txt");
//            if (archivoDescIndice.createNewFile()) {
//                int currentBloquesCount = getBloquesCountFromDescIndiceUsuario();
//
//                // Agrega el conteo actual de bloques a la cadena info
//                String info = "nombre_archivo: desc_indice_usuario.txt" + System.getProperty("line.separator")
//                    + "fecha_creacion:" + System.getProperty("line.separator")
//                    + "usuario_creacion:" + System.getProperty("line.separator")
//                    + "fecha_modificacion:" + System.getProperty("line.separator")
//                    + "usuario_modificacion:" + System.getProperty("line.separator")
//                    + "registros_activos: 0" + System.getProperty("line.separator")
//                    + "registros_inactivos: 0" + System.getProperty("line.separator")
//                    + "total_registros: 0" + System.getProperty("line.separator")
//                    + "bloques: " + currentBloquesCount + System.getProperty("line.separator")
//                    + "inicio: 0";
//
//                FileWriter fw  = new FileWriter(archivoDescIndice, true);
//                BufferedWriter bwr = new BufferedWriter(fw);
//                bwr.write(info);
//                bwr.close();
//
//                System.out.println("Archivo creado: " + archivoDescIndice.getName());
//
//                // Ahora, actualiza el conteo de bloques
//                updateBloquesCountInDescIndiceUsuario(currentBloquesCount + 1);
//
//            } else {
//                System.out.println("El archivo desc_indice_usuario.txt ya existe.");
//            }
//        } catch (IOException e) {
//            System.out.println("Error al crear desc_indice_usuario.txt.");
//            e.printStackTrace();
//        }
        try {
            createDescListaAmigosFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void inicializarDescriptorIndice(int bloqueNumber) throws IOException {
        try {
            File archivoDescIndice = new File("C:\\MEIA\\desc_indice_usuario.txt");
            if (archivoDescIndice.createNewFile()) {
                int currentBloquesCount = getBloquesCountFromDescIndiceUsuario();

                // Agrega el conteo actual de bloques a la cadena info
                String info = "nombre_archivo: desc_indice_usuario.txt" + System.getProperty("line.separator")
                        + "fecha_creacion:" + System.getProperty("line.separator")
                        + "usuario_creacion:" + System.getProperty("line.separator")
                        + "fecha_modificacion:" + System.getProperty("line.separator")
                        + "usuario_modificacion:" + System.getProperty("line.separator")
                        + "registros_activos: 0" + System.getProperty("line.separator")
                        + "registros_inactivos: 0" + System.getProperty("line.separator")
                        + "total_registros: 0" + System.getProperty("line.separator")
                        + "bloques: " + currentBloquesCount + System.getProperty("line.separator")
                        + "inicio: 0";

                FileWriter fw = new FileWriter(archivoDescIndice, true);
                BufferedWriter bwr = new BufferedWriter(fw);
                bwr.write(info);
                bwr.close();

                System.out.println("Archivo creado: " + archivoDescIndice.getName());

                // Ahora, actualiza el conteo de bloques
                updateBloquesCountInDescIndiceUsuario(currentBloquesCount + 1);

            } else {
                System.out.println("El archivo desc_indice_usuario.txt ya existe.");
            }
        } catch (IOException e) {
            System.out.println("Error al crear desc_indice_usuario.txt.");
            e.printStackTrace();
        }
    }

    public static int getNextBloqueNumber() {
        int n = 1;
        while (true) {
            File tempFile = new File("C:\\MEIA\\usuario_bloque" + n + ".txt");
            if (!tempFile.exists()) {
                return n;
            }
            n++;
        }
    }

    public static void agregarRegistro(String registro) throws IOException {
        int bloqueNumber = getNextBloqueNumber() - 1; // Obtenemos el bloque actual
        String filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
        File archivoBloque = new File(filePath);

        if (!archivoBloque.exists()) {
            System.out.println("Error: El archivo no existe.");
            return;
        }

        List<String> lines = Files.readAllLines(archivoBloque.toPath(), StandardCharsets.UTF_8);
        int currentRecords = lines.size() - 1; // Sin contar el header

        if (currentRecords >= 4) { // Suponiendo que max_organizar es 4
            bloqueNumber = getNextBloqueNumber(); // Crear un nuevo bloque
            filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
            createBloqueFile(bloqueNumber);
            createDescBloqueFile(bloqueNumber);
        }

        FileWriter Escribir = new FileWriter(filePath, true);
        BufferedWriter bw = new BufferedWriter(Escribir);
        bw.write(registro);
        bw.newLine();
        bw.close();

        // Actualiza los registros en el descriptor del bloque
        //updateRecordsInDescBloqueFile(bloqueNumber, 1, 0);
    }

    public static void createBloqueFile(int bloqueNumber) throws IOException {
        String filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
        File archivoBloque = new File(filePath);
        if (!archivoBloque.exists()) {
            archivoBloque.createNewFile();
            String header = "pos|llave|usuario|Nombre|Apellido|Password|fecha_nacimiento|correo_electronico|path_fotografia|Telefono|Rol|Estatus";
            FileWriter Escribir = new FileWriter(archivoBloque, true);
            BufferedWriter bw = new BufferedWriter(Escribir);
            bw.write(header);
            bw.newLine();
            bw.close();
            System.out.println("Archivo creado: " + archivoBloque.getName());
        } else {
            System.out.println("El archivo usuario_bloque" + bloqueNumber + ".txt ya existe.");
        }
    }

    public static void createDescBloqueFile(int bloqueNumber) throws IOException {
        String filePath = "C:\\MEIA\\desc_usuarios_bloque" + bloqueNumber + ".txt";
        File archivoDescBloque = new File(filePath);
        if (!archivoDescBloque.exists()) {
            archivoDescBloque.createNewFile();
            String info = "nombre_archivo: usuario_bloque" + bloqueNumber + ".txt" + System.getProperty("line.separator")
                    + "fecha_creacion:" + System.getProperty("line.separator")
                    + "usuario_creacion:" + System.getProperty("line.separator")
                    + "fecha_modificacion:" + System.getProperty("line.separator")
                    + "usuario_modificacion:" + System.getProperty("line.separator")
                    + "registros_activos: 0" + System.getProperty("line.separator")
                    + "registros_inactivos: 0" + System.getProperty("line.separator")
                    + "total_registros: 0" + System.getProperty("line.separator")
                    + "maximo_reorganizar: 4";

            FileWriter Escribir = new FileWriter(archivoDescBloque, true);
            BufferedWriter bw = new BufferedWriter(Escribir);
            bw.write(info);
            bw.close();

            System.out.println("Archivo creado: " + archivoDescBloque.getName());
        } else {
            System.out.println("El archivo desc_usuarios_bloque" + bloqueNumber + ".txt ya existe.");
        }
    }

    //obtiene el valor actual de bloques
    public static int getBloquesCountFromDescIndiceUsuario() throws IOException {
        File archivoDescIndice = new File("C:\\MEIA\\desc_indice_usuario.txt");
        List<String> lines = Files.readAllLines(archivoDescIndice.toPath(), StandardCharsets.UTF_8);

        for (String line : lines) {
            if (line.startsWith("bloques: ")) {
                return Integer.parseInt(line.split(": ")[1].trim());
            }
        }
        return 0;
    }

    //para actualizar el campo bloques
    public static void updateBloquesCountInDescIndiceUsuario(int newCount) throws IOException {
        File archivoDescIndice = new File("C:\\MEIA\\desc_indice_usuario.txt");
        List<String> lines = Files.readAllLines(archivoDescIndice.toPath(), StandardCharsets.UTF_8);

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("bloques: ")) {
                lines.set(i, "bloques: " + newCount);
                break;
            }
        }

        FileWriter fw = new FileWriter(archivoDescIndice, false); // false para sobrescribir el archivo
        BufferedWriter bwr = new BufferedWriter(fw);
        for (String line : lines) {
            bwr.write(line);
            bwr.newLine();
        }
        bwr.close();
    }

    public static void updateRecordsInDescBloqueFile(int bloqueNumber, int activeChange, int inactiveChange) throws IOException {
        String filePath = "C:\\MEIA\\desc_usuarios_bloque" + bloqueNumber + ".txt";
        File archivoDescBloque = new File(filePath);
        List<String> lines = Files.readAllLines(archivoDescBloque.toPath(), StandardCharsets.UTF_8);

        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("registros_activos: ")) {
                int currentActive = Integer.parseInt(lines.get(i).split(": ")[1].trim());
                lines.set(i, "registros_activos: " + (currentActive + activeChange));
            } else if (lines.get(i).startsWith("registros_inactivos: ")) {
                int currentInactive = Integer.parseInt(lines.get(i).split(": ")[1].trim());
                lines.set(i, "registros_inactivos: " + (currentInactive + inactiveChange));
            } else if (lines.get(i).startsWith("total_registros: ")) {
                int currentTotal = Integer.parseInt(lines.get(i).split(": ")[1].trim());
                lines.set(i, "total_registros: " + (currentTotal + activeChange + inactiveChange));
            }
        }

        FileWriter fw = new FileWriter(archivoDescBloque, false); // false para sobrescribir el archivo
        BufferedWriter bwr = new BufferedWriter(fw);
        for (String line : lines) {
            bwr.write(line);
            bwr.newLine();
        }
        bwr.close();
    }

    public static void createDescListaAmigosFile() throws IOException {
        String descListaAmigosPath = "C:\\MEIA\\desc_lista_amigos.txt";
        File descListaAmigosFile = new File(descListaAmigosPath);
        if (!descListaAmigosFile.exists()) {
            descListaAmigosFile.createNewFile();
            String descInfo = "nombre_simbolico: desc_lista_amigos.txt" + System.getProperty("line.separator")
                    + "fecha_creacion:" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss")) + System.getProperty("line.separator")
                    + "usuario_creacion:" + System.getProperty("line.separator")
                    + "fecha_modificacion:" + System.getProperty("line.separator")
                    + "usuario_modificacion:" + System.getProperty("line.separator")
                    + "#_registros: 0" + System.getProperty("line.separator")
                    + "registros_activos: 0" + System.getProperty("line.separator")
                    + "registros_inactivos: 0";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(descListaAmigosFile))) {
                bw.write(descInfo);
            }
            System.out.println("Archivo creado: " + descListaAmigosFile.getName());
        } else {
            System.out.println("El archivo desc_lista_amigos.txt ya existe.");
        }
    }

}
