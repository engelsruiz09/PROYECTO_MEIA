/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primera_parte;
import java.io.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Comparator;




/**
 *
 * @author JULIORUIZ
 */
public class ArchivoSecuencialIndizado {

    public void add(String registro) throws IOException {
        if (registro == null || !registro.contains("|")) {
            throw new IllegalArgumentException("Registro inválido.");
        }

        String[] parts = registro.split("\\|");
        String llave = parts[0];  // suponiendo que usuario es la primera parte del registro

        int bloqueNumber = getCurrentBloqueNumber();

        if (canAddToCurrentBloque(bloqueNumber)) {
            int fila = getNextFilaForBloque(bloqueNumber);
            String pos = bloqueNumber + "." + fila;
            String newRegistro = pos + "|" + llave + "|" + registro;

            agregarRegistroEnBloque(newRegistro, bloqueNumber);
            
            PRIMERA_PARTE.inicializarDescriptorIndice(bloqueNumber);

            // Agregar entrada al índice después de agregar el registro al bloque
            agregarRegistroIndice(newRegistro);

            updateDescUsuariosBloque(bloqueNumber, newRegistro);
            
            actualizarDescriptorIndice(registro, false);// parts[2] es el nombre de usuario. No es un nuevo bloque, por lo que pasamos false.
        } else {
            // Si no, crea un nuevo bloque y agrega el registro allí
            bloqueNumber = PRIMERA_PARTE.getNextBloqueNumber();
            PRIMERA_PARTE.createBloqueFile(bloqueNumber);
            PRIMERA_PARTE.createDescBloqueFile(bloqueNumber);

            // Inicializar índice para el nuevo bloque antes de agregar registros
            PRIMERA_PARTE.inicializarDescriptorIndice(bloqueNumber);

            int fila = getNextFilaForBloque(bloqueNumber); // En teoría, esto siempre debería ser 1 para un bloque recién creado.
            String pos = bloqueNumber + "." + fila;
            String newRegistro = pos + "|" + llave + "|" + registro;

            agregarRegistroEnBloque(newRegistro, bloqueNumber);

            // Agregar entrada al índice después de agregar el registro al bloque
            agregarRegistroIndice(newRegistro);

            updateDescUsuariosBloque(bloqueNumber, newRegistro);
            
            // Una vez que hayas añadido el registro al nuevo bloque y al índice, actualiza el descriptor
            actualizarDescriptorIndice(registro, true);   // parts[2] es el nombre de usuario. Como es un nuevo bloque, pasamos true.
        }
    }
    
private void actualizarDescriptorIndice(String registro, boolean esNuevoBloque) throws IOException {
    String descPath = "C:\\MEIA\\desc_indice_usuario.txt";
    List<String> lines = Files.readAllLines(Paths.get(descPath), StandardCharsets.UTF_8);
    Map<String, String> descMap = new HashMap<>();

    for (String line : lines) {
        String[] parts = line.split(":");
        descMap.put(parts[0].trim(), parts.length > 1 ? parts[1].trim() : "");
    }

    // Actualizar fecha
    descMap.put("fecha_modificacion", getCurrentDateTime());
    
    // Actualizar usuario_modificacion con el usuario del registro actual
    descMap.put("usuario_modificacion", registro.split("\\|")[0]);

    String indexPath = "C:\\MEIA\\indice_usuario.txt";
    List<String> indexLines = Files.readAllLines(Paths.get(indexPath), StandardCharsets.UTF_8);

    if (!indexLines.isEmpty()) {
        String firstRecord = indexLines.get(1);
        String inicioFromIndex = firstRecord.split("\\|")[0];

        // Actualizar el campo inicio en descMap con el valor extraído
        descMap.put("inicio", inicioFromIndex);
    }

    // Si es el primer registro en el archivo índice, establecer fecha y usuario de creación
    if (indexLines.size() == 2) {  // 1 para el encabezado y 1 para el primer registro
        descMap.put("fecha_creacion", getCurrentDateTime());
        descMap.put("usuario_creacion", registro.split("\\|")[0]);  // usuario del registro actual
    }

    // Si es un nuevo bloque, incrementar el contador de bloques
    if (esNuevoBloque) {
        int bloques = Integer.parseInt(descMap.get("bloques"));
        descMap.put("bloques", String.valueOf(bloques + 1));
    }

    // Contar registros activos e inactivos
    int activos = 0, inactivos = 0;

    // Empezar desde el índice 1 para omitir el encabezado
    for (int i = 1; i < indexLines.size(); i++) {
        String line = indexLines.get(i);
        String[] parts = line.split("\\|");
        int estatus;
        try {
            estatus = Integer.parseInt(parts[5]);
        } catch (NumberFormatException e) {
            continue; // Si ocurre un error al convertir, omite esta línea y continúa con la siguiente
        }
        if (estatus == 1) activos++;
        else inactivos++;
    }

    descMap.put("registros_activos", String.valueOf(activos));
    descMap.put("registros_inactivos", String.valueOf(inactivos));
    descMap.put("total_registros", String.valueOf(activos + inactivos));

    // Escribir de vuelta al archivo
    List<String> updatedLines = descMap.entrySet().stream()
        .map(entry -> entry.getKey() + ": " + entry.getValue())
        .collect(Collectors.toList());
    Files.write(Paths.get(descPath), updatedLines, StandardCharsets.UTF_8);
}



    
private void agregarRegistroIndice(String registro) throws IOException {
    String[] parts = registro.split("\\|");
    String usuarioActual = parts[2];
    String posicionActual = parts[0];

    String indexPath = "C:\\MEIA\\indice_usuario.txt";
    File indiceFile = new File(indexPath);

    // Verificar si el archivo de índice existe y crearlo si no
    if (!indiceFile.exists()) {
        indiceFile.createNewFile();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(indiceFile))) {
            bw.write("inicio|registro|posicion|usuario|siguiente|estatus");
            bw.newLine();
        }
    }

    // Leer todas las líneas del archivo de índice
    List<String> lines = Files.readAllLines(Paths.get(indexPath), StandardCharsets.UTF_8);
    int newRegistro = lines.size(); // Incluye el encabezado en el conteo

    // Agregar el nuevo registro al final del archivo
    lines.add(newRegistro + "|" + newRegistro + "|" + posicionActual + "|" + usuarioActual + "|0|1");

    // Organizar los registros existentes y el nuevo registro por usuario para actualizar "siguiente"
    List<String[]> records = new ArrayList<>();
    for (int i = 1; i < lines.size(); i++) {
        records.add(lines.get(i).split("\\|"));
    }
    records.sort((a, b) -> a[3].compareTo(b[3]));

    // Actualizar el campo "siguiente" para cada registro y encontrar el "inicio"
    for (int i = 0; i < records.size() - 1; i++) {
        records.get(i)[4] = records.get(i + 1)[1]; // El "siguiente" es el índice del registro siguiente
    }
    records.get(records.size() - 1)[4] = "0"; // El último registro apunta a 0 en "siguiente"

    // El registro con el usuario menor alfabéticamente es el nuevo inicio
    int inicio = Integer.parseInt(records.get(0)[1]);

    // Actualizar la columna "inicio" en cada línea con el nuevo valor de inicio
    for (String[] record : records) {
        record[0] = String.valueOf(inicio);
    }

    // Reconstruir las líneas con los registros actualizados
    List<String> updatedLines = new ArrayList<>();
    updatedLines.add(lines.get(0)); // Agregar el encabezado sin cambios
    for (String[] record : records) {
        updatedLines.add(String.join("|", record));
    }

    // Escribir todas las líneas de nuevo en el archivo
    Files.write(Paths.get(indexPath), updatedLines, StandardCharsets.UTF_8);
}
















    private boolean canAddToCurrentBloque(int bloqueNumber) throws IOException {
        String descFilePath = "C:\\MEIA\\desc_usuarios_bloque" + bloqueNumber + ".txt";
        File descArchivoBloque = new File(descFilePath);

        if (!descArchivoBloque.exists()) {
            return true; // Si no hay un archivo descriptor, significa que el bloque está vacío.
        }

        List<String> lines = Files.readAllLines(descArchivoBloque.toPath(), StandardCharsets.UTF_8);
        int totalRegistros = 0;
        int maxReorganizar = 0;      
        for (String line : lines) {
            if (line.startsWith("total_registros: ")) {
                totalRegistros = Integer.parseInt(line.split(": ")[1].trim());
            }
            if (line.startsWith("maximo_reorganizar: ")) {
                maxReorganizar = Integer.parseInt(line.split(": ")[1].trim());
            }
        }        
        return totalRegistros < maxReorganizar; // Si totalRegistros es igual o mayor que maxReorganizar, crea un nuevo bloque.
    }



    public int getCurrentBloqueNumber() {
        return PRIMERA_PARTE.getNextBloqueNumber() - 1;
    }

    private void agregarRegistroEnBloque(String registro, int bloqueNumber) throws IOException {
        String filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
        FileWriter Escribir = new FileWriter(filePath, true);
        BufferedWriter bw = new BufferedWriter(Escribir);
        bw.write(registro);
        bw.newLine();
        bw.close();
        
        // Actualizar total de registros en desc_usuarios_bloque
        updateTotalRegistrosInDesc(bloqueNumber);
    }

    

    private void updateTotalRegistrosInDesc(int bloqueNumber) throws IOException {
        String descFilePath = "C:\\MEIA\\desc_usuarios_bloque" + bloqueNumber + ".txt";
        File descArchivoBloque = new File(descFilePath);
        
        List<String> lines = Files.readAllLines(descArchivoBloque.toPath(), StandardCharsets.UTF_8);
        for (int i = 0; i < lines.size(); i++) {
            if (lines.get(i).startsWith("total_registros: ")) {
                int totalRegistros = Integer.parseInt(lines.get(i).split(": ")[1].trim());
                totalRegistros++;
                lines.set(i, "total_registros: " + totalRegistros);
                break;
            }
        }

        // Escribir las líneas actualizadas de vuelta al archivo
        Files.write(descArchivoBloque.toPath(), lines, StandardCharsets.UTF_8);
    }
    
    
    public int getNextFilaForBloque(int bloqueNumber) throws IOException {
        String filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
        File archivoBloque = new File(filePath);
        if (archivoBloque.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(archivoBloque))) {
                // Ignorar el encabezado
                br.readLine();
                int count = 1;
                while (br.readLine() != null) {
                    count++;
                }
                return count;
            }
        }
        return 1;
    }
    
    
    public void updateDescUsuariosBloque(int bloqueNumber, String registro) throws IOException {
        // Rutas de los archivos
        String filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
        String descFilePath = "C:\\MEIA\\desc_usuarios_bloque" + bloqueNumber + ".txt";

        Map<String, String> descriptorMap = readDescriptorToMap(descFilePath);

        // Actualiza los valores necesarios en el mapa
        String fechaActual = getCurrentDateTime();
        String usuarioCreacion = getFirstUser(bloqueNumber);
        String usuarioModificacion = getLastUser(registro);

        descriptorMap.put("fecha_modificacion", fechaActual);
        if (descriptorMap.get("fecha_creacion").isEmpty()) {
            descriptorMap.put("fecha_creacion", fechaActual);
        }
        if (descriptorMap.get("usuario_creacion").isEmpty()) {
            descriptorMap.put("usuario_creacion", usuarioCreacion);
        }
        descriptorMap.put("usuario_modificacion", usuarioModificacion);

        // Contar registros activos e inactivos
        int activos = 0;
        int inactivos = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("\\|");
                try{
                    if (parts[parts.length - 1].matches("\\d+")) { // Verifica si es un número
                        int estatus = Integer.parseInt(parts[parts.length - 1]);
                        if (estatus == 1) {
                            activos++;
                        } else if (estatus == 0) {
                            inactivos++;
                        }
                    }
                
                }catch(NumberFormatException e){
                    System.out.println("ArchivoMALO");
                    
                }

            }
        }

        descriptorMap.put("registros_activos", String.valueOf(activos));
        descriptorMap.put("registros_inactivos", String.valueOf(inactivos));

        // Escribir el mapa de vuelta al archivo descriptor
        List<String> newDescriptorLines = descriptorMap.entrySet().stream()
            .map(entry -> entry.getKey() + ": " + entry.getValue())
            .collect(Collectors.toList());
        Files.write(Paths.get(descFilePath), newDescriptorLines, StandardCharsets.UTF_8);
    }
    
    private Map<String, String> readDescriptorToMap(String descFilePath) throws IOException {
        Map<String, String> descriptorMap = new HashMap<>();
        List<String> lines = Files.readAllLines(Paths.get(descFilePath), StandardCharsets.UTF_8);
        for (String line : lines) {
            String[] parts = line.split(":");
            if (parts.length > 1) {
                descriptorMap.put(parts[0].trim(), parts[1].trim());
            } else {
                descriptorMap.put(parts[0].trim(), "");
            }
        }
        return descriptorMap;
    }



    
    private String getCurrentDateTime() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy H:mm");
        LocalDateTime now = LocalDateTime.now();
        return now.format(formatter);
    }
    
    private String getFirstUser(int bloqueNumber) throws IOException {
        String filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
        File archivoBloque = new File(filePath);

        try (BufferedReader br = new BufferedReader(new FileReader(archivoBloque))) {
            br.readLine(); // Omitir la primera línea
            String line = br.readLine(); // Leer la segunda línea
            if (line != null) {
                String[] parts = line.split("\\|");
                return parts[2];  // Retorna la tercera columna que es el nombre de usuario.
            }
        }
        return "";  // Retorna una cadena vacía si el archivo está vacío.
    }


    
    private String getLastUser(String registro) {
        if (registro == null || !registro.contains("|")) {
            throw new IllegalArgumentException("Registro inválido.");
        }

        String[] parts = registro.split("\\|");
        return parts[1];  // Retorna la segunda columna que es la llave/usuario.
    }
    
public String[] buscarUsuarioYContrasena(String llave) throws IOException {
    String indexPath = "C:\\MEIA\\indice_usuario.txt";
    List<String> indexLines = Files.readAllLines(Paths.get(indexPath), StandardCharsets.UTF_8);
    
    // Omitir la primera fila
    for (int i = 1; i < indexLines.size(); i++) {
        String line = indexLines.get(i);
        String[] parts = line.split("\\|");
        if (parts.length > 3 && parts[3].equals(llave) && parts[5].equals("1")) { 
            String[] posParts = parts[2].split("\\.");
            int bloqueNumber = Integer.parseInt(posParts[0]);
            int fila = Integer.parseInt(posParts[1]);
            
            String bloquePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
            List<String> bloqueLines = Files.readAllLines(Paths.get(bloquePath), StandardCharsets.UTF_8);
            
            if (bloqueLines.size() > fila) { 
                String detalleUsuario = bloqueLines.get(fila); 
                String[] detalleParts = detalleUsuario.split("\\|");
                return new String[]{ detalleParts[2], detalleParts[5], detalleParts[8], detalleParts[10] };  // Asumiendo que la posición 0 tiene el nombre de usuario y la posición 5 tiene la contraseña
            }
        }
    }
    return null; 
}

public String[] buscarUsuarioCompleto(String usuarioBuscado) throws IOException {
    String indexPath = "C:\\MEIA\\indice_usuario.txt";
    List<String> indexLines = Files.readAllLines(Paths.get(indexPath), StandardCharsets.UTF_8);

    for (int i = 1; i < indexLines.size(); i++) { 
        String line = indexLines.get(i);
        String[] parts = line.split("\\|");

        if (parts.length > 3 && parts[3].equals(usuarioBuscado) && parts[5].equals("1")) {
            String[] posParts = parts[2].split("\\.");
            int bloqueNumber = Integer.parseInt(posParts[0]);
            int fila = Integer.parseInt(posParts[1]);

            String bloquePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
            List<String> bloqueLines = Files.readAllLines(Paths.get(bloquePath), StandardCharsets.UTF_8);
            
            if (bloqueLines.size() > fila) { //condición de tamaño
                return bloqueLines.get(fila).split("\\|");  // Accedemos directamente a la fila (sin restarle 1)
            }
        }
    }
    return null; 
}

public boolean modificarUsuario(String usuarioBuscado, String[] nuevosDatos, String estatus) throws IOException {
    String indexPath = "C:\\MEIA\\indice_usuario.txt";
    String descPath = "C:\\MEIA\\desc_indice_usuario.txt";
    List<String> indexLines = Files.readAllLines(Paths.get(indexPath), StandardCharsets.UTF_8);
    List<String> descLines = Files.readAllLines(Paths.get(descPath), StandardCharsets.UTF_8);
    boolean usuarioModificado = false;
    int bloqueNumber = -1;

    for (int i = 1; i < indexLines.size(); i++) { 
        String line = indexLines.get(i);
        String[] parts = line.split("\\|");

        if (parts.length > 3 && parts[3].equals(usuarioBuscado) && parts[5].equals("1")) {
            String[] posParts = parts[2].split("\\.");
            bloqueNumber = Integer.parseInt(posParts[0]);
            int fila = Integer.parseInt(posParts[1]);

            String bloquePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
            List<String> bloqueLines = Files.readAllLines(Paths.get(bloquePath), StandardCharsets.UTF_8);
            
            if (bloqueLines.size() > fila) { //condición de tamaño
                String[] datosAntiguos = bloqueLines.get(fila).split("\\|");
                String[] datosCompletos = new String[] {
                    datosAntiguos[0], // pos
                    nuevosDatos[0], // llave (actualizamos con el nuevo usuario)
                    nuevosDatos[0], // usuario
                    nuevosDatos[1], // Nombre
                    nuevosDatos[2], // Apellido
                    nuevosDatos[3], // Password
                    nuevosDatos[4], // fecha_nacimiento
                    nuevosDatos[5], // correo_electronico
                    nuevosDatos[6], // path_fotografia
                    nuevosDatos[7], // Telefono
                    nuevosDatos[8], // Rol
                    estatus
                };
                bloqueLines.set(fila, String.join("|", datosCompletos)); // Reemplaza la línea con los nuevos datos
                
                // Actualizamos la entrada en el archivo de índice también
                parts[3] = nuevosDatos[0]; // Actualizar el usuario
                indexLines.set(i, String.join("|", parts)); 
                
                // Escribe de nuevo el archivo bloque con los datos actualizados
                Files.write(Paths.get(bloquePath), bloqueLines, StandardCharsets.UTF_8);
                // Escribe de nuevo el archivo índice con los datos actualizados
                Files.write(Paths.get(indexPath), indexLines, StandardCharsets.UTF_8);
                usuarioModificado = true;
                break;
            }
        }
    }
    if (usuarioModificado) {
        String usuarioCreacion = "";
        String usuarioModificacion = nuevosDatos[0]; // El usuario que realiza la modificación
        
        for (int i = 0; i < descLines.size(); i++) {
            if (descLines.get(i).startsWith("usuario_creacion")) {
                usuarioCreacion = descLines.get(i).split(":")[1].trim();
                // Si el usuario que creó el archivo es el mismo que está siendo modificado, actualizamos el usuario_creacion
                if (usuarioCreacion.equals(usuarioBuscado)) {
                    descLines.set(i, "usuario_creacion: " + nuevosDatos[0]);
                }
            } else if (descLines.get(i).startsWith("usuario_modificacion")) {
                descLines.set(i, "usuario_modificacion: " + usuarioModificacion);
            }
        }
        Files.write(Paths.get(descPath), descLines, StandardCharsets.UTF_8);
        
        // Actualizar desc_usuarios_bloque(n).txt
        String bloqueDescPath = "C:\\MEIA\\desc_usuarios_bloque" + bloqueNumber + ".txt";
        List<String> bloqueDescLines = Files.readAllLines(Paths.get(bloqueDescPath), StandardCharsets.UTF_8);

        for (int i = 0; i < bloqueDescLines.size(); i++) {
            if (bloqueDescLines.get(i).startsWith("usuario_creacion")) {
                String usuarioBloqueCreacion = bloqueDescLines.get(i).split(":")[1].trim();
                if (usuarioBloqueCreacion.equals(usuarioBuscado)) {
                    bloqueDescLines.set(i, "usuario_creacion: " + nuevosDatos[0]);
                }
            } else if (bloqueDescLines.get(i).startsWith("usuario_modificacion")) {
                bloqueDescLines.set(i, "usuario_modificacion: " + nuevosDatos[0]);
            }
        }
        Files.write(Paths.get(bloqueDescPath), bloqueDescLines, StandardCharsets.UTF_8);
        
        
        // Luego de modificar el descriptor, actualizamos el resto del descriptor
        actualizarDescriptorIndice(usuarioModificacion, false);
    }
    
    System.out.println("Dentro de modificarUsuario...");

    return usuarioModificado; 
}


//para el label del menuadmin
public String obtenerUsuarioModificadoReciente(String usuarioBuscado) {
    String usuarioModificado = "";
    int numeroUltimoBloque = obtenerUltimoBloque();
    
    // Iteramos desde el último bloque hacia el primero para encontrar el registro modificado más reciente.
    for (int i = numeroUltimoBloque; i > 0; i--) {
        String bloquePath = "C:\\MEIA\\usuario_bloque" + i + ".txt";
        try {
            List<String> lineas = Files.readAllLines(Paths.get(bloquePath), StandardCharsets.UTF_8);
            for (int j = lineas.size() - 1; j > 0; j--) {
                String[] datos = lineas.get(j).split("\\|");
                if (datos[2].equals(usuarioBuscado)) {  // Suponiendo que 'usuario' es la tercera columna
                    usuarioModificado = datos[2];
                    return usuarioModificado;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    return usuarioModificado;
}


public int obtenerUltimoBloque() {
    int numeroUltimoBloque = 1; // Supongamos que siempre hay al menos un bloque.
    File directorio = new File("C:\\MEIA");
    String[] archivos = directorio.list();
    
    for (String archivo : archivos) {
        if (archivo.startsWith("usuario_bloque")) {
            String numeroBloque = archivo.replace("usuario_bloque", "").replace(".txt", "");
            try {
                int numero = Integer.parseInt(numeroBloque);
                if (numero > numeroUltimoBloque) {
                    numeroUltimoBloque = numero;
                }
            } catch (NumberFormatException e) {
                // Ignorar en caso de que no sea un número
            }
        }
    }
    
    return numeroUltimoBloque;
}

public void updateInactiveCountInDescUsuariosBloque(int bloqueNumber) throws IOException {
    String filePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
    String descFilePath = "C:\\MEIA\\desc_usuarios_bloque" + bloqueNumber + ".txt";

    Map<String, String> descriptorMap = readDescriptorToMap(descFilePath);

    int inactivos = 0;
    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            String[] parts = line.split("\\|");
            try {
                if (parts[parts.length - 1].matches("\\d+")) { // Verifica si es un número
                    int estatus = Integer.parseInt(parts[parts.length - 1]);
                    if (estatus == 0) {
                        inactivos++;
                    }
                }
            } catch (NumberFormatException e) {
                System.out.println("ArchivoMALO");
            }
        }
    }

    descriptorMap.put("registros_inactivos", String.valueOf(inactivos));

    // Escribir el mapa de vuelta al archivo descriptor
    List<String> newDescriptorLines = descriptorMap.entrySet().stream()
        .map(entry -> entry.getKey() + ": " + entry.getValue())
        .collect(Collectors.toList());
    Files.write(Paths.get(descFilePath), newDescriptorLines, StandardCharsets.UTF_8);
}











}

