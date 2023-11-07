/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Forms;
import javax.swing.JOptionPane;
import java.io.*;
import java.time.format.DateTimeFormatter;
import Funciones.ArchivoSecuencial;
import com.mycompany.primera_parte.ArchivoSecuencialIndizado;
import Funciones.AESencripter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.JFileChooser;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.io.File;
import java.util.List;
/**
 *
 * @author JULIORUIZ
 */
public class CrearUsuario extends javax.swing.JFrame {

    File file;
    File archivo = new File("C:\\MEIA\\usuario.txt");
    File archivo2 = new File("C:\\MEIA\\bitacora_usuario.txt");
    byte[] image;
    FileInputStream input;
    FileOutputStream output;
    FileReader LecturaArchivo;
    BufferedReader LeerArchivo;
    FileWriter Escribir;
    BufferedWriter bw;
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
     public static String fotoPath;
     
    public CrearUsuario() 
    {
        initComponents();
        this.setLocationRelativeTo(null);
        MenuAdmin m1= new MenuAdmin();  
        Login L1=new Login();
        
        File primerBloque = new File("C:\\MEIA\\usuario_bloque1.txt");

        if (primerBloque.exists()) {
            try {
                // Leer las líneas del archivo
                List<String> lines = Files.readAllLines(primerBloque.toPath(), StandardCharsets.UTF_8);
                // Si solo hay una línea (el encabezado), es el primer registro real
                if (lines.size() == 1) {
                    admin_rdb.setSelected(true);
                    user_rdb.setSelected(false);
                    //admin_rdb.setEnabled(false);
                    //user_rdb.setEnabled(false);
                } else {
                    admin_rdb.setSelected(false);
                    user_rdb.setSelected(true);
                    //admin_rdb.setEnabled(false);
                    //user_rdb.setEnabled(false);
                }
            } catch (IOException e) {
                e.printStackTrace();
                // Aquí puedes manejar la excepción, por ejemplo, mostrando un mensaje de error al usuario
                JOptionPane.showMessageDialog(this, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            // Si el archivo no existe, es el primer registro
            admin_rdb.setSelected(true);
            user_rdb.setSelected(false);
            //admin_rdb.setEnabled(false);
            //user_rdb.setEnabled(false);
        }
        
         // Si el usuario actual es admin, permite seleccionar el tipo de usuario a crear
        if (L1.rol == 1) {
            admin_rdb.setEnabled(true);
            user_rdb.setEnabled(true);
        } else {
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jbadd = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        mail_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastname_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fotoPath_txt = new javax.swing.JTextField();
        jbfoto = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        phone_txt = new javax.swing.JTextField();
        user_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        admin_rdb = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        date_txt = new javax.swing.JTextField();
        user_rdb = new javax.swing.JRadioButton();
        add_btn1 = new javax.swing.JButton();
        JCBMOSTRAR = new javax.swing.JCheckBox();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jbadd.setBackground(new java.awt.Color(102, 255, 255));
        jbadd.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jbadd.setText("Agregar usuario");
        jbadd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbaddActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Crear Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setText("Apellido");

        name_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        name_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                name_txtActionPerformed(evt);
            }
        });
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                name_txtKeyTyped(evt);
            }
        });

        mail_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        mail_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                mail_txtKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel2.setText("Usuario");

        lastname_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lastname_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastname_txtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setText("Correo");

        fotoPath_txt.setEditable(false);
        fotoPath_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fotoPath_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fotoPath_txtKeyTyped(evt);
            }
        });

        jbfoto.setBackground(new java.awt.Color(102, 255, 255));
        jbfoto.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jbfoto.setText("Escoger foto");
        jbfoto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbfoto.setDefaultCapable(false);
        jbfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfotoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setText("Contraseña");

        phone_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        phone_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                phone_txtKeyTyped(evt);
            }
        });

        user_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        user_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtActionPerformed(evt);
            }
        });
        user_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                user_txtKeyTyped(evt);
            }
        });

        password_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        password_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                password_txtKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel8.setText("Fecha Nacimiento");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setText("Nombre");

        admin_rdb.setBackground(new java.awt.Color(153, 255, 255));
        admin_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        admin_rdb.setText("Administrador");
        admin_rdb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admin_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_rdbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setText("Rol");

        date_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        date_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                date_txtKeyTyped(evt);
            }
        });

        user_rdb.setBackground(new java.awt.Color(102, 255, 255));
        user_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        user_rdb.setText("Usuario");
        user_rdb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        user_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_rdbActionPerformed(evt);
            }
        });

        add_btn1.setBackground(new java.awt.Color(102, 255, 255));
        add_btn1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        add_btn1.setText("Volver");
        add_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btn1ActionPerformed(evt);
            }
        });

        JCBMOSTRAR.setBackground(new java.awt.Color(102, 255, 255));
        JCBMOSTRAR.setText("Mostrar Contraseña");
        JCBMOSTRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCBMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBMOSTRARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(JCBMOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(user_rdb, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE)
                                    .addComponent(admin_rdb, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jbfoto, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(mail_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE)
                                    .addComponent(date_txt)
                                    .addComponent(fotoPath_txt)
                                    .addComponent(phone_txt)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbadd, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(mail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5)
                                .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbfoto)
                    .addComponent(fotoPath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JCBMOSTRAR)
                        .addGap(9, 9, 9)
                        .addComponent(admin_rdb)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(user_rdb)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbadd, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(add_btn1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(46, 46, 46))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(50, 50, 50))))))
        );

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItem);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void jbaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbaddActionPerformed
        // TODO add your handling code here:
         // Inicializa variables para manejar la puntuacion y validacion de la contraseña
        String contra= new String(password_txt.getPassword());
        int VPaso = 0; // Variable de control para validar la contraseña
        try {
            String puntuacio = "C:\\MEIA\\puntuacion.txt"; // Reemplaza con la ruta de tu archivo
            String resultado = "C:\\MEIA\\resultado.txt";
            // Código que puede arrojar FileNotFoundException
            BufferedReader lector = new BufferedReader(new FileReader(puntuacio));
            BufferedReader lector2 = new BufferedReader(new FileReader(resultado));
            String linea;
            String linea2;
            int puntuacion = 0;
            int mayus = 0;
            int letra = 0;
            int numero = 0;
            int especial = 0;
            int v1 = 0;
            int v2 = 0;
            int cont = 0;
            StringBuilder puntua = new StringBuilder();
            StringBuilder resul = new StringBuilder();
            String contras = password_txt.getText();
            try {
                while ((linea = lector.readLine()) != null) {
                    puntua.append(linea).append("\n");
                }
                while ((linea2 = lector2.readLine()) != null) {
                    resul.append(linea2).append("\n");

                }
                int puntuac = Character.getNumericValue(puntua.charAt(0));
                if (puntuac != 0) {
                    if (contras.length() >= puntuac) {
                        puntuac = Character.getNumericValue(puntua.charAt(1));
                        puntuacion = puntuac * contras.length();
                        for (int i = 0; i < contras.length(); i++) {
                            char caracter = contras.charAt(i);
                            if (Character.isUpperCase(caracter)) {
                                mayus++;
                            }
                        }
                        puntuac = Character.getNumericValue(puntua.charAt(2));
                        puntuacion = puntuacion + (puntuac * mayus);
                        for (int i = 0; i < contras.length(); i++) {
                            if (Character.isLetter(contras.charAt(i))) {
                                letra++;
                            }
                        }
                        puntuac = Character.getNumericValue(puntua.charAt(3));
                        puntuacion = puntuacion + (letra + puntuac);
                        for (int i = 0; i < contras.length(); i++) {
                            if (Character.isDigit(contras.charAt(i))) {
                                numero++;
                            }
                        }
                        puntuac = Character.getNumericValue(puntua.charAt(0));
                        puntuacion = puntuacion + (numero + puntuac);
                        for (int i = 0; i < contras.length(); i++) {
                            switch (contras.charAt(i)) {
                                case '/':
                                    especial++;
                                    break;
                                case '¿':
                                    especial++;
                                    break;
                                case '?':
                                    especial++;
                                    break;
                                case '%':
                                    especial++;
                                    break;
                                case '$':
                                    especial++;
                                    break;
                                case '#':
                                    especial++;
                                    break;
                            }
                        }
                        puntuac = Character.getNumericValue(puntua.charAt(5));
                        puntuacion = puntuacion + especial * (contras.length() + puntuac);
                        if (numero == 0 && especial == 0) {
                            puntuac = Character.getNumericValue(puntua.charAt(6));
                            puntuacion = puntuacion - puntuac;
                        }
                        if (especial == 0 && letra == 0) {
                            puntuac = Character.getNumericValue(puntua.charAt(7));
                            puntuacion = puntuacion - puntuac;
                        }
                        String resultadostotal = resul.toString();
                        String[] lineas = resultadostotal.split("\n");
                        for (String partes : lineas) {
                            String[] valores = partes.split(",");
                            cont++;
                            v1 = Integer.parseInt(valores[0]);
                            v2 = Integer.parseInt(valores[1]);
                            if (cont == 1 && puntuacion >= v1 && puntuacion <= v2) {
                                JOptionPane.showMessageDialog(this, "CUIDADO, su Contraseña es insegura", "Nivel de seguridad", JOptionPane.INFORMATION_MESSAGE);
                                VPaso = 1;
                            } else if (cont == 2 && puntuacion >= v1 && puntuacion <= v2) {
                                JOptionPane.showMessageDialog(this, "OJO, se Contraseña es poco segura", "Nivel de seguridad", JOptionPane.INFORMATION_MESSAGE);
                                VPaso = 1;
                            } else if (cont == 3 && puntuacion >= v1 && puntuacion <= v2) {
                                JOptionPane.showMessageDialog(this, "BIEN, su Contraseña es segura", "Nivel de seguridad", JOptionPane.INFORMATION_MESSAGE);
                                VPaso = 0;
                            } else if (cont == 4 && puntuacion >= v1) {
                                JOptionPane.showMessageDialog(this, "PERFECTO, su Contraseña es muy segura", "Nivel de seguridad", JOptionPane.INFORMATION_MESSAGE);
                                VPaso = 0;
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Su Contraseña es muy corta", "Nivel de seguridad", JOptionPane.INFORMATION_MESSAGE);
                        VPaso = 1;
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "ERROR revisa el codigo", "Error", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (FileNotFoundException e) {
            // Manejo de la excepción
            JOptionPane.showMessageDialog(this, "ERROR no se encontro el archivo", "Error", JOptionPane.INFORMATION_MESSAGE);
        }
        if (VPaso == 1) {
            // Acciones adicionales si la contraseña no es válida
            password_txt.setText("");  // Limpia el campo de contraseña
            return;  // Termina la ejecución del método sin realizar más acciones
        }

        // A partir de aquí, el código asume que la contraseña es válida y procede con el resto de las operaciones
        if (emptyFields()) {
            JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Ingreso no válido", WIDTH);
            return;
        }
        if (invalidChars()) {
            JOptionPane.showMessageDialog(null, "No se puede ingresar el caracter ';'", "Ingreso no válido", WIDTH);
            return;
        }

        try {
            String usuario = user_txt.getText(),
                   nombre = name_txt.getText(),
                   apellido = lastname_txt.getText(),
                   password = password_txt.getText(),
                   fecha = date_txt.getText(),
                   correo = mail_txt.getText(),
                   path_fotografia = fotoPath_txt.getText();
            int telefono = Integer.parseInt(phone_txt.getText());
            int rol = 0, estatus = 1;

            if (admin_rdb.isSelected()) {
                rol = 1;
            }

            if (!correct_dateFormat(fecha)) {
                JOptionPane.showMessageDialog(null, "Formato de fecha incorrecto", "Ingreso no válido", WIDTH);
                return;
            }
            if (!correct_mailFormat(correo)) {
                JOptionPane.showMessageDialog(null, "Formato de correo incorrecto", "Ingreso no válido", WIDTH);
                return;
            }
            if(!correct_phoneFormat(phone_txt.getText())){
                JOptionPane.showMessageDialog(null, "Formato de teléfono incorrecto", "Ingreso no válido", WIDTH);
                return;
            }

            // Comienza la escritura de datos en bitacora
            //String bitacoraUsersPath = "C:\\MEIA\\bitacora_usuario.txt"; 
            //String userPath = "C:\\MEIA\\usuario.txt";
            //String bitacoraDesc = "C:\\MEIA\\desc_bitacora_usuario.txt";
            //String userDec = "C:\\MEIA\\desc_usuario.txt";
            
            // Instancia de la nueva clase ArchivoSecuencialIndizado
            ArchivoSecuencialIndizado asi = new ArchivoSecuencialIndizado();
             
            AESencripter encriptador = new AESencripter();
            String contraseñaCifrada = encriptador.encriptar(password, usuario);
            // Crear la cadena de información del usuario
            String Informacion = String.join("|", usuario, nombre, apellido, contraseñaCifrada, fecha, correo, path_fotografia, Integer.toString(telefono), Integer.toString(rol), "1");


            // Agregar el registro al sistema indizado
            asi.add(Informacion);

            // Redirige al usuario a la pagina de inicio de sesión después de completar el registro
            JOptionPane.showMessageDialog(this, "Usuario creado correctamente", "Crear Usuario", JOptionPane.INFORMATION_MESSAGE);
            Login l1 = new Login();
            l1.setVisible(true);
            this.dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error al tratar de ingresar los datos: " + e.getMessage(), "Error", WIDTH);
        }

    }//GEN-LAST:event_jbaddActionPerformed

     public boolean emptyFields()
     {   //Verifica que los campos ingresados no esten vacíos
        return user_txt.getText().isBlank() || name_txt.getText().isBlank() ||
                lastname_txt.getText().isBlank() || password_txt.getText().isBlank() ||
                phone_txt.getText().isBlank() || mail_txt.getText().isBlank() ||
                fotoPath_txt.getText().isBlank() || date_txt.getText().isBlank();
    }
    
    public boolean invalidChars()
    {//Verifica que no se ingrese el delimitador
        return user_txt.getText().contains(";") || name_txt.getText().contains(";") ||
                lastname_txt.getText().contains(";") || password_txt.getText().contains(";") ||
                phone_txt.getText().contains(";") || mail_txt.getText().contains(";") ||
                fotoPath_txt.getText().contains(";") || date_txt.getText().contains(";");
    }
    
    public boolean correct_dateFormat(String dateText)
    {
        //Usando regex para validar el formato de fecha: dd/mm/yyyy
        return dateText.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }
    
    public boolean correct_mailFormat(String mail)
    {
        // Una validacion basica para asegurarse de que hay un caracter "@" y al menos un "."
        return mail.contains("@") && mail.contains(".");
    }
    
    public boolean correct_phoneFormat(String phone)
    {
        // Asegurarse de que el telefono tenga 8 digitos y que este compuesto solo por numeros.
        return phone.matches("^\\d{8}$");
    }
    
    
    
    private void name_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_name_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_name_txtActionPerformed

    private void name_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyTyped
        // TODO add your handling code here:
        if (name_txt.getText().length() >= 30) //varchar 30
        {
            evt.consume();
        }
    }//GEN-LAST:event_name_txtKeyTyped

    private void mail_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mail_txtKeyTyped
        // TODO add your handling code here:
        if (mail_txt.getText().length() >= 40) //varchar 40
        {
            evt.consume();
        }
    }//GEN-LAST:event_mail_txtKeyTyped

    private void lastname_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lastname_txtKeyTyped
        // TODO add your handling code here:
        if (lastname_txt.getText().length() >= 30) //varchar 30
        {
            evt.consume();
        }
    }//GEN-LAST:event_lastname_txtKeyTyped

    private void fotoPath_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fotoPath_txtKeyTyped
        // TODO add your handling code here:
        if (fotoPath_txt.getText().length() >= 200) //varchar 200
        {
            evt.consume();
        }
    }//GEN-LAST:event_fotoPath_txtKeyTyped

    private void jbfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfotoActionPerformed
        // TODO add your handling code here:
            // Crea un selector de archivos con una ruta predeterminada
        JFileChooser select = new JFileChooser("C:\\MEIA\\fotografia");

        // Muestra el selector de archivos
        if(select.showDialog(null, null) == JFileChooser.APPROVE_OPTION){
            file = select.getSelectedFile();
            // Verifica que el archivo pueda ser leido y tenga una extension valida
            if(file.canRead()){
                if(file.getName().endsWith("jpg") || file.getName().endsWith("png")){
                    image = openFile(file);
                    fotoPath_txt.setText(file.getPath());
                    fotoPath = file.getPath(); 
                } else {
                    JOptionPane.showMessageDialog(null, "Unsupported file format");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cannot read the selected file");
            }
        }
    }//GEN-LAST:event_jbfotoActionPerformed

//   Abre el archivo proporcionado y devuelve su contenido como un array de bytes.
//  file_ Archivo que se desea abrir.
//  return Retorna un array de bytes con el contenido del archivo.
// 
public byte[] openFile(File file_){
       byte[] image_ = new byte[1024*100];
        try{
            input = new FileInputStream(file);
            input.read(image_);
        }
        catch(IOException e){
            return null;
        }
        return image_;
}   
 
///
// Guarda el contenido proporcionado (image_) en el archivo especificado.
// file_ Archivo donde se desea guardar el contenido.
//  image_ Contenido que se desea guardar.
//Retorna un mensaje indicando si el archivo se guardo correctamente.
// 
public String saveFile(File file_, byte[] image_){
        String message = null;
        try{
            output = new FileOutputStream(file_);
            output.write(image_);
            message = "Saved file";
        }
        catch(IOException e){
            return message;
        }
        return message;
}
    
    private void phone_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_phone_txtKeyTyped
        // TODO add your handling code here:
        if (phone_txt.getText().length() >= 8) //telefono dice int pero en guatemala 8 digitos
        {
            evt.consume();
        }
    }//GEN-LAST:event_phone_txtKeyTyped

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txtActionPerformed

    private void user_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_txtKeyTyped
        // TODO add your handling code here:
        if(user_txt.getText().length() >= 20)//varchar 20
        {
            evt.consume();
        }
    }//GEN-LAST:event_user_txtKeyTyped

    private void password_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_password_txtKeyTyped
        // TODO add your handling code here:
        if (password_txt.getText().length() >= 40) //varchar 40
        {
            evt.consume();
        }
    }//GEN-LAST:event_password_txtKeyTyped

    private void admin_rdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admin_rdbActionPerformed
        // TODO add your handling code here:
        if(admin_rdb.isSelected())
        {
            user_rdb.setSelected(false);
        }
    }//GEN-LAST:event_admin_rdbActionPerformed

    private void date_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_txtKeyTyped
        // TODO add your handling code here:
        if (date_txt.getText().length() >= 10)
        {
            evt.consume();
        }
    }//GEN-LAST:event_date_txtKeyTyped

    private void user_rdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_rdbActionPerformed
        // TODO add your handling code here:
        if(user_rdb.isSelected())
        {
            admin_rdb.setSelected(false);
        }
    }//GEN-LAST:event_user_rdbActionPerformed
    
    private void add_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btn1ActionPerformed
        this.dispose();
        MenuAdmin s110 = new MenuAdmin();
        Login s54 = new Login();
        int validar = s110.obtenerTexto();
        
        if(validar == 1) {
            s110.validacion = 0;
            s110.setVisible(true);
        }
        else{
            s54.setVisible(true);
        }
    }//GEN-LAST:event_add_btn1ActionPerformed

    private void JCBMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBMOSTRARActionPerformed
        // TODO add your handling code here:
        //para mostrar la contraseña
        if (JCBMOSTRAR.isSelected())
        {
            password_txt.setEchoChar((char) 0); //muestra la contraseña con el caracter de eco con valor de 0 que es el caracter nulo desactiva la funcion de ocultamiento y muestra la contraseña real ingresada
        }
        else
        {
            password_txt.setEchoChar('\u002A'); //oculta la contraseña, con la representacion unicode para el caracter de * decimos que cada caracter ingresado se muestre como *
        }
    }//GEN-LAST:event_JCBMOSTRARActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CrearUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CrearUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox JCBMOSTRAR;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton add_btn1;
    private javax.swing.JRadioButton admin_rdb;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JTextField date_txt;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JTextField fotoPath_txt;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbadd;
    private javax.swing.JButton jbfoto;
    private javax.swing.JTextField lastname_txt;
    private javax.swing.JTextField mail_txt;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JTextField name_txt;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JTextField phone_txt;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JRadioButton user_rdb;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables

}
