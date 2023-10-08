/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Funciones;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Base64;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;


 //Esta clase proporciona funciones para encriptar y desencriptar datos usando el algoritmo AES cifrado simetrico (ADVANCED ENCRYPTION STANDARD )

public class AESencripter {

//    
//     Crea una clave SecretKeySpec a partir de una clave proporcionada.
//      clave Clave proporcionada por el usuario.
//     return SecretKeySpec para su uso en operaciones de cifrado.

    private SecretKeySpec crearClave(String clave) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        // Convierte la clave en bytes usando UTF-8.
        byte[] claveEncriptacion = clave.getBytes("UTF-8");
        
        // Crea un digest SHA-1 de la clave.
        MessageDigest sha = MessageDigest.getInstance("SHA-1");
        
        // Aplica el digest SHA-1 a la clave.
        claveEncriptacion = sha.digest(claveEncriptacion);
        // Recorta o llena con ceros la clave hasta que tenga 16 bytes.
        claveEncriptacion = Arrays.copyOf(claveEncriptacion, 16);
        
        // Crea y devuelve una SecretKeySpec con la clave encriptada.
        SecretKeySpec secretKey = new SecretKeySpec(claveEncriptacion, "AES");

        return secretKey;
    }
    
//    
//     Encripta los datos proporcionados usando AES.
//     datos Datos a encriptar.
//      claveSecreta Clave para encriptar datos.
//      Datos encriptados en formato de texto.

    public String encriptar(String datos, String claveSecreta) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        // Obtiene la SecretKeySpec a partir de la clave secreta proporcionada.
        SecretKeySpec secretKey = this.crearClave(claveSecreta);
        
        // Inicializa un objeto Cipher para encriptacion usando AES.
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5Padding");        
        cipher.init(Cipher.ENCRYPT_MODE, secretKey);

        // Convierte los datos en bytes usando UTF-8.
        byte[] datosEncriptar = datos.getBytes("UTF-8");
        // Encripta los datos.
        byte[] bytesEncriptados = cipher.doFinal(datosEncriptar);
        // Convierte los datos encriptados a formato de texto.
        String encriptado = Base64.getEncoder().encodeToString(bytesEncriptados);

        return encriptado;
    }
    
//    
//     Desencripta los datos proporcionados usando AES.
//      datosEncriptados Datos encriptados en formato de texto.
//      claveSecreta Clave para desencriptar datos.
//      Datos desencriptados.
    public String desencriptar(String datosEncriptados, String claveSecreta) throws UnsupportedEncodingException, NoSuchAlgorithmException, InvalidKeyException, NoSuchPaddingException, IllegalBlockSizeException, BadPaddingException {
        // Obtiene la SecretKeySpec a partir de la clave secreta proporcionada.
        SecretKeySpec secretKey = this.crearClave(claveSecreta);

        // Inicializa un objeto Cipher para desencriptacion usando AES.
        Cipher cipher = Cipher.getInstance("AES/ECB/PKCS5PADDING");
        cipher.init(Cipher.DECRYPT_MODE, secretKey);
        
        // Decodifica los datos encriptados desde su formato de texto a bytes.
        byte[] bytesEncriptados = Base64.getDecoder().decode(datosEncriptados);
        // Desencripta los datos.
        byte[] datosDesencriptados = cipher.doFinal(bytesEncriptados);
        // Convierte los datos desencriptados a formato de texto.
        String datos = new String(datosDesencriptados);
        
        return datos;
    }
}

