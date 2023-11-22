/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Forms;

/**
 *
 * @author JULIORUIZ
 */
import Funciones.Data;
import Funciones.ManejoArchivo;
import Funciones.ABB;
import java.util.*;
import java.io.*;
import java.util.List;
import java.util.stream.Collectors;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import static Forms.CrearUsuario.fotoPath;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import Funciones.AESencripter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;
import com.mycompany.primera_parte.ArchivoSecuencialIndizado;
import com.mycompany.primera_parte.PRIMERA_PARTE;
import java.io.UnsupportedEncodingException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Comparator;
import java.nio.file.Paths;
import java.nio.file.Files;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;

public class Buscar extends javax.swing.JFrame {
    ABB ABB = new ABB();
    int Contadoramigo = 0;
    File file;
    byte[] image;
    FileInputStream input;
    
    public Buscar() {
        initComponents();
        try{
                ABB.Cargar();
                }catch(IOException ex) 
                {
                }
        this.setLocationRelativeTo(null);//para colocarlo en medio de la pantalla

        Login s13 = new Login();
        

        if (s13.rol == 0) {//esto del proyecto pasado
            //JBTN_deleteProfile1.setEnabled(false);
            AESencripter fuera = new AESencripter();
            String fileName = "C:\\MEIA\\bitacora_usuario.txt"; // Reemplaza con la ruta de tu archivo
            String fileName2 = "C:\\MEIA\\usuario.txt";
            jtbuscar.setText(s13.usertx);
            jtbuscar.setEnabled(false);
            jbbuscar.setEnabled(true);
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
            admin_rdb.setSelected(false);
            user_rdb.setSelected(true);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        BTN_BAJA = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        mail_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastname_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fotoPath_txt = new javax.swing.JTextField();
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
        jbbuscar = new javax.swing.JButton();
        jtbuscar = new javax.swing.JTextField();
        BTN_MODIFICAR = new javax.swing.JButton();
        jbvolver = new javax.swing.JButton();
        jbfoto = new javax.swing.JButton();
        JCBMOSTRAR = new javax.swing.JCheckBox();
        BTN_REORGANIZAR = new javax.swing.JButton();
        BTN_AMIGOS = new javax.swing.JButton();
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

        BTN_BAJA.setBackground(new java.awt.Color(102, 255, 255));
        BTN_BAJA.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BTN_BAJA.setText("Dar baja");
        BTN_BAJA.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_BAJA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_BAJAActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Busqueda:");

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

        jbbuscar.setBackground(new java.awt.Color(102, 255, 255));
        jbbuscar.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jbbuscar.setText("Buscar Usuario");
        jbbuscar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbbuscarActionPerformed(evt);
            }
        });

        jtbuscar.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        BTN_MODIFICAR.setBackground(new java.awt.Color(102, 255, 255));
        BTN_MODIFICAR.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BTN_MODIFICAR.setText("Modificar");
        BTN_MODIFICAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_MODIFICAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_MODIFICARActionPerformed(evt);
            }
        });

        jbvolver.setBackground(new java.awt.Color(102, 255, 255));
        jbvolver.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jbvolver.setText("Volver");
        jbvolver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbvolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbvolverActionPerformed(evt);
            }
        });

        jbfoto.setBackground(new java.awt.Color(102, 255, 255));
        jbfoto.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jbfoto.setText("Escoger foto");
        jbfoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbfotoActionPerformed(evt);
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

        BTN_REORGANIZAR.setBackground(new java.awt.Color(102, 255, 255));
        BTN_REORGANIZAR.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BTN_REORGANIZAR.setText("Reorganizar");
        BTN_REORGANIZAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_REORGANIZAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_REORGANIZARActionPerformed(evt);
            }
        });

        BTN_AMIGOS.setBackground(new java.awt.Color(102, 255, 255));
        BTN_AMIGOS.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        BTN_AMIGOS.setText("Añadir amigo");
        BTN_AMIGOS.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BTN_AMIGOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTN_AMIGOSActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(JCBMOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addComponent(lastname_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                                    .addComponent(name_txt, javax.swing.GroupLayout.Alignment.LEADING)))
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(29, 29, 29)
                                                .addComponent(jbfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 394, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_rdb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(admin_rdb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(BTN_AMIGOS)
                                .addGap(20, 20, 20)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(370, 370, 370)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(fotoPath_txt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                                        .addComponent(phone_txt, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(mail_txt, javax.swing.GroupLayout.Alignment.LEADING)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(513, 513, 513)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(BTN_REORGANIZAR)
                            .addComponent(BTN_MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbvolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BTN_BAJA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(date_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(mail_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(phone_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(fotoPath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbfoto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(35, 35, 35))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(BTN_BAJA, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_REORGANIZAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jbvolver, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(BTN_MODIFICAR, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(JCBMOSTRAR)
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(admin_rdb)
                                        .addGap(13, 13, 13)
                                        .addComponent(user_rdb))
                                    .addComponent(BTN_AMIGOS, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed


    private void BTN_BAJAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_BAJAActionPerformed
        // TODO add your handling code here:
        String usuarioABorrar = "";
        Login s14 = new Login();

        // Si es admin, verifica el usuario del jtbuscar.
        if (s14.rol == 1) {
            usuarioABorrar = jtbuscar.getText();
        } 
        // Si es usuario regular, verifica el usuario actual.
        else {
            usuarioABorrar = s14.usertx;
        }

        try {
            modificarRegistroEnBloque(usuarioABorrar, "0");
         
            
            modificarRegistroEnIndice(usuarioABorrar, "0");
            
            ArchivoSecuencialIndizado bl = new ArchivoSecuencialIndizado();
            int bloquenumber = bl.getCurrentBloqueNumber();
            bl.updateInactiveCountInDescUsuariosBloque(bloquenumber);
            
            JOptionPane.showMessageDialog(null, "El usuario se dio de baja exitosamente", "Dar de baja", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "ERROR: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (s14.rol == 0) {
            Login adios = new Login();
            adios.setVisible(true);
            this.dispose();
        }
        if (s14.rol == 1) {
            // Reinicio de los campos del formulario (si es necesario)
            user_txt.setText("");
            name_txt.setText("");
            lastname_txt.setText("");
            password_txt.setText("");
            date_txt.setText("");
            mail_txt.setText("");
            phone_txt.setText("");
            fotoPath_txt.setText("");
            jtbuscar.setText("");
        }
    }//GEN-LAST:event_BTN_BAJAActionPerformed

    private void modificarRegistroEnBloque(String usuario, String nuevoEstado) throws IOException {
    int bloqueActual = 1;
    ArchivoSecuencialIndizado archivo = new ArchivoSecuencialIndizado();
    int bloqueMaximo = archivo.getCurrentBloqueNumber();

    while (bloqueActual <= bloqueMaximo) {
        String filePath = "C:\\MEIA\\usuario_bloque" + bloqueActual + ".txt";
        
        ArrayList<String> nuevasLineas = new ArrayList<>();
        
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] palabras = line.split("\\|");

                if (palabras[2].equals(usuario)) { // Columna 'usuario' es la posición 2 en el split
                    palabras[11] = nuevoEstado; // Columna 'Estatus' es la posición 11 en el split
                }

                nuevasLineas.add(String.join("|", palabras));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Error al leer archivo de bloque.");
        }
        
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String nuevaLinea : nuevasLineas) {
                bw.write(nuevaLinea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Error al escribir en archivo de bloque.");
        }
        
        bloqueActual++;
    }
}

    private void modificarRegistroEnIndice(String usuario, String nuevoEstado) throws IOException {
        String filePath = "C:\\MEIA\\indice_usuario.txt";
        ArrayList<String> nuevasLineas = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] palabras = line.split("\\|");

                // Columna 'usuario' es la posición 3 en el split
                if (palabras[3].equals(usuario)) { 
                    palabras[5] = nuevoEstado; // Columna 'estatus' es la posición 5 en el split
                }

                nuevasLineas.add(String.join("|", palabras));
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new IOException("Error al leer archivo del índice.");
        }

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {
            for (String nuevaLinea : nuevasLineas) {
                bw.write(nuevaLinea);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Error al escribir en archivo del índice.");
        }
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

    public byte[] openFile(File file_) {
        byte[] image_ = new byte[1024 * 100];
        try {
            input = new FileInputStream(file);
            input.read(image_);
        } catch (IOException e) {
            return null;
        }
        return image_;
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
        if (user_txt.getText().length() >= 20)//varchar 20
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
        if (admin_rdb.isSelected()) {
            user_rdb.setSelected(false);
        }
    }//GEN-LAST:event_admin_rdbActionPerformed

    private void date_txtKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_txtKeyTyped
        // TODO add your handling code here:
        if (date_txt.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_date_txtKeyTyped

    private void user_rdbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_rdbActionPerformed
        // TODO add your handling code here:
        if (user_rdb.isSelected()) {
            admin_rdb.setSelected(false);
        }
    }//GEN-LAST:event_user_rdbActionPerformed

    private void BTN_MODIFICARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_MODIFICARActionPerformed
        System.out.println("Ingresando a BTN_MODIFICARActionPerformed");
        boolean esAdmin = admin_rdb.isSelected();
        AESencripter fuera = new AESencripter();

        if (emptyFields()) {
            JOptionPane.showMessageDialog(null, "Debe buscar algun usuario", "Error de modificacion", WIDTH);
            return;
        }

        // Validar contraseña al inicio
        String resultadoValidacion = validarcontrasena(password_txt.getText());
        JOptionPane.showMessageDialog(this, resultadoValidacion, "Nivel de seguridad", JOptionPane.INFORMATION_MESSAGE);

        // Interrumpir ejecución si la contraseña no es válida
        if ("Su Contraseña es muy corta".equals(resultadoValidacion) || 
            "CUIDADO, su Contraseña es insegura".equals(resultadoValidacion) || 
            "OJO, se Contraseña es poco segura".equals(resultadoValidacion)) {
            password_txt.setText("");  // Limpia el campo de contraseña
            return;  // Termina la ejecución del método sin realizar más acciones
        }

        try {
            // Preparar los datos para modificar
            String[] nuevosDatos = new String[]{
                user_txt.getText(),        // usuario
                name_txt.getText(),        // Nombre
                lastname_txt.getText(),    // Apellido
                fuera.encriptar(password_txt.getText(), user_txt.getText()), // Password
                date_txt.getText(),        // fecha_nacimiento
                mail_txt.getText(),        // correo_electronico
                fotoPath_txt.getText(),    // path_fotografia
                phone_txt.getText(),       // Telefono
                admin_rdb.isSelected() ? "1" : "0"  // Rol
            };
            String estatus = "1";
            
                // Imprimir datos para depuración
            System.out.println("Datos para modificar:");
            for (String dato : nuevosDatos) {
                System.out.println(dato);
            }
            // Llamar a modificarUsuario
            ArchivoSecuencialIndizado archivo = new ArchivoSecuencialIndizado();
            System.out.println("Intentando modificar usuario...");

            boolean modificado = archivo.modificarUsuario(jtbuscar.getText(), nuevosDatos, estatus);
            System.out.println("Usuario modificado: " + modificado);

            if (modificado) {
                JOptionPane.showMessageDialog(this, "Usuario modificado correctamente", "Modificación", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "Error al modificar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Se produjo un error al modificar el usuario: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }

        // Resetear campos del formulario
        user_txt.setText("");
        name_txt.setText("");
        lastname_txt.setText("");
        password_txt.setText("");
        date_txt.setText("");
        mail_txt.setText("");
        phone_txt.setText("");
        fotoPath_txt.setText("");
        jtbuscar.setText("");
    }//GEN-LAST:event_BTN_MODIFICARActionPerformed

private String validarcontrasena(String contrasena) {
    String contra = new String(password_txt.getPassword());

    try {
        String puntuacio = "C:\\MEIA\\puntuacion.txt";
        String resultado = "C:\\MEIA\\resultado.txt";

        BufferedReader lector = new BufferedReader(new FileReader(puntuacio));
        BufferedReader lector2 = new BufferedReader(new FileReader(resultado));

        StringBuilder puntua = new StringBuilder();
        StringBuilder resul = new StringBuilder();
        String contras = password_txt.getText();

        String linea;
        while ((linea = lector.readLine()) != null) {
            puntua.append(linea).append("\n");
        }

        while ((linea = lector2.readLine()) != null) {
            resul.append(linea).append("\n");
        }

        int puntuac = Character.getNumericValue(puntua.charAt(0));

        if (puntuac == 0 || contras.length() < puntuac) {
            return "Su Contraseña es muy corta";
        }

        int puntuacion = 0;
        int mayus = 0;
        int letra = 0;
        int numero = 0;
        int especial = 0;

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
            int v1 = Integer.parseInt(valores[0]);
            int v2 = Integer.parseInt(valores[1]);
            if (puntuacion >= v1 && puntuacion <= v2) {
                if (v2 == 20) {
                    return "CUIDADO, su Contraseña es insegura";
                } else if (v2 == 30) {
                    return "OJO, se Contraseña es poco segura";
                } else if (v2 == 45) {
                    return "BIEN, su Contraseña es segura";
                } else if (v2 == 100) {
                    return "PERFECTO, su Contraseña es muy segura";
                }
            }
        }

    } catch (FileNotFoundException e) {
        return "ERROR no se encontro el archivo";
    } catch (IOException e) {
        return "ERROR revisa el codigo";
    }

    return "Validación desconocida";
}

    
    
    
    private void jbbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbbuscarActionPerformed
        String searchTerm = jtbuscar.getText();

        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un usuario a buscar", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
            try {
                ArchivoSecuencialIndizado archivo = new ArchivoSecuencialIndizado();

                String[] usuarioData = archivo.buscarUsuarioCompleto(searchTerm);
                if (usuarioData != null) {
                    // Poblamos los campos de texto con los datos del usuario
                    user_txt.setText(usuarioData[2]);
                    name_txt.setText(usuarioData[3]);
                    lastname_txt.setText(usuarioData[4]);
                    jtbuscar.setText(user_txt.getText());
                    
                    AESencripter fuera = new AESencripter();
                    String desc = fuera.desencriptar(usuarioData[5], usuarioData[2]);
                    password_txt.setText(desc);

                    date_txt.setText(usuarioData[6]);
                    mail_txt.setText(usuarioData[7]);
                    fotoPath_txt.setText(usuarioData[8]);
                    phone_txt.setText(usuarioData[9]);

                    // Si es admin
                    if (usuarioData[10].equals("1")) {
                        admin_rdb.setSelected(true);
                    } else {
                        user_rdb.setSelected(true);
                    }
                    
                    // Logic for admin or user
                    Login mo = new Login();
                    if (searchTerm.equals(mo.usertx)) {
                        if (mo.rol == 1) {
                            admin_rdb.setEnabled(false);
                            user_rdb.setEnabled(false);
                            BTN_BAJA.setEnabled(false);
                        } else {
                            admin_rdb.setEnabled(false);
                            user_rdb.setEnabled(false);
                            BTN_BAJA.setEnabled(true);
                            jtbuscar.setText(user_txt.getText());
                        }
                    } else {
                        admin_rdb.setEnabled(true);
                        user_rdb.setEnabled(true);
                        BTN_BAJA.setEnabled(true);
                    }
                    // Actualiza el contenido de jtbuscar para que refleje el nuevo nombre de usuario
                    //jtbuscar.setText(user_txt.getText());
                    
                    JOptionPane.showMessageDialog(this, "Usuario encontrado", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(this, "Usuario NO encontrado", "Error", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (IOException | NoSuchAlgorithmException | NoSuchPaddingException | InvalidKeyException | IllegalBlockSizeException | BadPaddingException e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(this, "Error al buscar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbbuscarActionPerformed

    private void jbvolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbvolverActionPerformed
        Login l1 = new Login();
        l1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jbvolverActionPerformed

    private void jbfotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbfotoActionPerformed
        // TODO add your handling code here:
        // Crea un selector de archivos con una ruta predeterminada
        JFileChooser select = new JFileChooser("C:\\MEIA\\fotografia");

        // Muestra el selector de archivos
        if (select.showDialog(null, null) == JFileChooser.APPROVE_OPTION) {
            file = select.getSelectedFile();
            // Verifica que el archivo pueda ser leido y tenga una extension valida
            if (file.canRead()) {
                if (file.getName().endsWith("jpg") || file.getName().endsWith("png")) {
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

    private void JCBMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBMOSTRARActionPerformed
        // TODO add your handling code here:
        //para mostrar la contraseña
        if (JCBMOSTRAR.isSelected()) {
            password_txt.setEchoChar((char) 0); //muestra la contraseña con el caracter de eco con valor de 0 que es el caracter nulo desactiva la funcion de ocultamiento y muestra la contraseña real ingresada
        } else {
            password_txt.setEchoChar('\u002A'); //oculta la contraseña, con la representacion unicode para el caracter de * decimos que cada caracter ingresado se muestre como *
        }

    }//GEN-LAST:event_JCBMOSTRARActionPerformed

    private void BTN_REORGANIZARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_REORGANIZARActionPerformed
            try { 
                eliminarRegistros();
                condensarIndice();
                copiarDatosEntreBloques();
                actualizarPosicionesEnBloques();
                
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
            JOptionPane.showMessageDialog(this, "Reorganización completada con éxito.", "Reorganizar", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_BTN_REORGANIZARActionPerformed

    private void BTN_AMIGOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTN_AMIGOSActionPerformed
        Contadoramigo++;
        String user = Login.usuarioActual;
        String searchTerm = jtbuscar.getText();
        var manejoarchivo = new ManejoArchivo();
        var strError = "";
        
        if (searchTerm.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ingrese un usuario a buscar", "Error", JOptionPane.INFORMATION_MESSAGE);
            return;
        } else {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
                Date date = new Date();
                //Insertar en arbol de solicitudes
               
                var todosLosRegistros = user + "|" + searchTerm + "|" + dateFormat.format(date) + "|" + "1";
                String LLave  = user + searchTerm + dateFormat.format(date);
            
                ABB.Insertar(LLave, todosLosRegistros);   
                 try {
                ABB.WriteTree("C:/MEIA/tree.txt");
                 
                 clear();
            } catch (IOException ex) {
                //Logger.getLogger(EnvioCorreo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }                         
    }//GEN-LAST:event_BTN_AMIGOSActionPerformed
private void clear(){
        JOptionPane.showMessageDialog(null, "Solicitud Enviada Correctamente", "Mensaje", 1);
}
private void eliminarRegistros() {
        try {
            String rutaArchivo = "C:/MEIA/indice_usuario.txt";
            File archivo = new File(rutaArchivo);
            BufferedReader br = new BufferedReader(new FileReader(archivo));
            StringBuilder nuevoContenido = new StringBuilder();
            StringBuilder nuevoContenido2 = new StringBuilder();

            String linea;
            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split("\\|");
                if (campos.length > 0 && !campos[campos.length - 1].equals("0")) {
                    nuevoContenido.append(linea).append("\n");
                }
            }
            br.close();
            // Sobreescribir el archivo con los registros filtrados
            FileWriter fw = new FileWriter(archivo);
            fw.write(nuevoContenido.toString());
            fw.close();
            nuevoContenido.setLength(0);
            for (int i = 1; i < 10; i++) {
                String rtarc = "C:/MEIA/usuario_bloque" + i + ".txt";
                File archivo2 = new File(rtarc);
                if (archivo2.exists()) {
                    BufferedReader br2 = new BufferedReader(new FileReader(archivo2));
                    while ((linea = br2.readLine()) != null) {
                        String[] campos = linea.split("\\|");
                        if (campos.length > 0 && !campos[campos.length - 1].equals("0")) {
                            nuevoContenido2.append(linea).append("\n");
                        }
                    }
                    br2.close();
                    FileWriter fw2 = new FileWriter(archivo2);
                    fw2.write(nuevoContenido2.toString());
                    fw2.close();
                    nuevoContenido2.setLength(0);
                } else {

                }
            }

            JOptionPane.showMessageDialog(null, "Reorganizado correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al reorganizar ", "Error", JOptionPane.ERROR_MESSAGE);
 
        }
}
//---------------------------------------------------------------------------------------------------------------------------

//---------------------------------------------------------------------------------------------------------------------------
public void copiarDatosEntreBloques() throws IOException {
    // Ruta base de los archivos de bloque
    String rutaBase = "C:/MEIA/";
    File dir = new File(rutaBase);
    File[] archivos = dir.listFiles((d, name) -> name.startsWith("usuario_bloque") && name.endsWith(".txt"));

    if (archivos == null || archivos.length == 0) {
        // No hay bloques para procesar.
        return;
    }

    // Ordenar los archivos por nombre para procesarlos en orden
    Arrays.sort(archivos, Comparator.comparing(File::getName));

    for (int i = 0; i < archivos.length - 1; i++) {
        // El archivo actual y el siguiente
        File bloqueActual = archivos[i];
        File bloqueSiguiente = archivos[i + 1];

        // Verificar si el archivo de bloque siguiente existe y si el actual tiene menos de 5 registros
        if (bloqueSiguiente.exists() && contarLineasEnArchivo(bloqueActual.getPath()) < 5) {
            // Copiar datos del bloque siguiente al bloque actual
            condensarBloques(bloqueSiguiente.getPath(), bloqueActual.getPath());
        }
    }

    // Si el último bloque está vacío después del proceso, considerar eliminarlo
    File ultimoBloque = archivos[archivos.length - 1];
    if (contarLineasEnArchivo(ultimoBloque.getPath()) == 0) {
        ultimoBloque.delete(); // Asegúrate de manejar adecuadamente si hay un error al eliminar
    }
}

private void condensarBloques(String bloque2Path, String bloque1Path) throws IOException {
   
    // Ruta de los archivos de bloque
    //String bloque1Path = "C:/MEIA/usuario_bloque1.txt";
    //String bloque2Path = "C:/MEIA/usuario_bloque2.txt";

    // Verificar si usuario_bloque1 tiene menos de 5 líneas
    int lineCountBloque1 = contarLineasEnArchivo(bloque1Path);

    if (lineCountBloque1 < 5) {
        // Calcular cuántos registros le faltan a usuario_bloque1 para llegar a 5
        int registrosFaltantes = 5 - lineCountBloque1;

        // Verificar si usuario_bloque2 tiene registros
        int lineCountBloque2 = contarLineasEnArchivo(bloque2Path);

        if (lineCountBloque2 > 1) {
            // Leer las líneas adicionales de usuario_bloque2 (desde la segunda línea)
            ArrayList<String> lineasUsuarioBloque2 = new ArrayList<>();
            try (BufferedReader br = new BufferedReader(new FileReader(bloque2Path))) {
                String line;
                // Saltar la primera línea
                br.readLine();
                for (int i = 0; i < registrosFaltantes; i++) {
                    line = br.readLine();
                    if (line != null) {
                        lineasUsuarioBloque2.add(line);
                    }
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new IOException("Error al leer usuario_bloque");
            }

            // Agregar las líneas de usuario_bloque2 a usuario_bloque1
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(bloque1Path, true))) {
                for (String linea : lineasUsuarioBloque2) {
                    bw.write(linea);
                    bw.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
                throw new IOException("Error al escribir en usuario_bloque");
            }
        }
        borrarYGuardarLineasDeBloque2(registrosFaltantes, bloque2Path);
    }
}

public void borrarYGuardarLineasDeBloque2(int registrosFaltantes, String bloque2Path) throws IOException {
    // Ruta de los archivos de bloque
    //String bloque2Path = "C:/MEIA/usuario_bloque2.txt";

    // Verificar si usuario_bloque2 tiene registros
    int lineCountBloque2 = contarLineasEnArchivo(bloque2Path);

    if (lineCountBloque2 > 1) {
        // Crear una lista para almacenar las líneas que deseas conservar
        List<String> lineasAConservar = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(bloque2Path))) {
            String linea;
            // Leer y almacenar el encabezado
            String encabezado = br.readLine();
            lineasAConservar.add(encabezado);

            // Contador para rastrear cuántos registros se han eliminado
            int registrosEliminados = 0;

            while ((linea = br.readLine()) != null) {
                if (registrosEliminados < registrosFaltantes) {
                    // No agregar la línea si es un registro que debe ser eliminado
                    registrosEliminados++;
                } else {
                    // Agregar la línea si no se debe eliminar
                    lineasAConservar.add(linea);
                }
            }
        }

        // Crear un nuevo archivo con el mismo nombre que usuario_bloque2
        File nuevoBloque2 = new File(bloque2Path);

        // Verificar si el nuevo archivo ya existe y borrarlo si es necesario
        if (nuevoBloque2.exists()) {
            nuevoBloque2.delete();
        }

        // Escribir las líneas a conservar en el nuevo archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(bloque2Path))) {
            for (String linea : lineasAConservar) {
                bw.write(linea);
                bw.newLine();
            }
        }
    }
}

// Función para contar líneas en un archivo
private int contarLineasEnArchivo(String filePath) throws IOException {
    int recordCount = 0;

    try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
        String line;
        while ((line = br.readLine()) != null) {
            // Cada línea del archivo representa un registro, así que incrementamos el contador.
            recordCount++;
        }
    return recordCount;
}
}
public int contarArchivosUsuarioBloque() {
    File directorio = new File("C:\\MEIA");
    File[] archivos = directorio.listFiles();
    int contador = 0;

    if (archivos != null) {
        for (File archivo : archivos) {
            if (archivo.isFile() && archivo.getName().startsWith("usuario_bloque")) {
                contador++;
            }
        }
    }

    return contador;
}

public void condensarIndice() throws IOException {
    String indexPath = "C:\\MEIA\\indice_usuario.txt";

    // Leer todas las líneas del archivo de índice
    List<String> lines = Files.readAllLines(Paths.get(indexPath), StandardCharsets.UTF_8);

    // Filtrar registros activos y ordenarlos por usuario
    List<String[]> activeRecords = lines.stream()
            .skip(1) // Omitir encabezado
            .map(line -> line.split("\\|"))
            .filter(parts -> parts[5].equals("1")) // Filtrar registros activos
            .sorted(Comparator.comparing(parts -> parts[3])) // Ordenar por usuario
            .collect(Collectors.toList());

    // Actualizar los campos "inicio", "registro" y "siguiente" de los registros activos
    for (int i = 0; i < activeRecords.size(); i++) {
        String[] record = activeRecords.get(i);
        record[1] = String.valueOf(i + 1); // Actualizar "registro"
        record[4] = i < activeRecords.size() - 1 ? String.valueOf(i + 2) : "0"; // Actualizar "siguiente"
    }

    // El registro con el usuario menor alfabéticamente es el nuevo inicio
    int inicio = Integer.parseInt(activeRecords.get(0)[1]);
    for (String[] record : activeRecords) {
        record[0] = String.valueOf(inicio); // Actualizar "inicio"
    }

    // Reconstruir las líneas con los registros actualizados
    List<String> updatedLines = new ArrayList<>();
    updatedLines.add(lines.get(0)); // Agregar el encabezado sin cambios
    for (String[] record : activeRecords) {
        updatedLines.add(String.join("|", record));
    }

    // Escribir todas las líneas de nuevo en el archivo
    Files.write(Paths.get(indexPath), updatedLines, StandardCharsets.UTF_8);
}
    
public void actualizarPosicionesEnBloques() throws IOException {
    String indexPath = "C:\\MEIA\\indice_usuario.txt";
    List<String> indexLines = Files.readAllLines(Paths.get(indexPath), StandardCharsets.UTF_8);
    ArchivoSecuencialIndizado bloq = new ArchivoSecuencialIndizado();
    int bloqueNumber = bloq.getCurrentBloqueNumber(); // Obtener el número del bloque actual
    int posicionEnIndice = 1; // Inicializar la posición en el índice en 1

    for (int i = 1; i < indexLines.size(); i++) { // Comenzar en 1 para omitir el encabezado
        String[] indexParts = indexLines.get(i).split("\\|");
        String usuario = indexParts[3];
        String newPosicion = String.format("%d.%d", i, posicionEnIndice); // Crear una nueva posición secuencial

        // Incrementar la posición en el índice
        posicionEnIndice++;

        // Obtener el contenido del bloque correspondiente al registro
        String bloquePath = "C:\\MEIA\\usuario_bloque" + bloqueNumber + ".txt";
        List<String> bloqueLines = Files.readAllLines(Paths.get(bloquePath), StandardCharsets.UTF_8);

        // Buscar el registro del usuario en el bloque y actualizar su posición
        for (int j = 0; j < bloqueLines.size(); j++) {
            String[] bloqueParts = bloqueLines.get(j).split("\\|");
            // Asumiendo que el nombre de usuario está en una posición conocida, por ejemplo, bloqueParts[1]
            if (bloqueParts[1].equals(usuario)) {
                bloqueParts[0] = newPosicion; // Actualizar la columna "pos"
                bloqueLines.set(j, String.join("|", bloqueParts)); // Actualizar la línea
                break; // Salir del bucle si encontramos el registro
            }
        }

        // Reescribir el bloque con las posiciones actualizadas
        Files.write(Paths.get(bloquePath), bloqueLines, StandardCharsets.UTF_8);
    }
}


    
    /**
     * @param args the command line arguments
     */
    public boolean correct_dateFormat(String dateText) {
        //Usando regex para validar el formato de fecha: dd/mm/yyyy
        return dateText.matches("^\\d{2}/\\d{2}/\\d{4}$");
    }

    public boolean correct_mailFormat(String mail) {
        // Una validacion basica para asegurarse de que hay un caracter "@" y al menos un "."
        return mail.contains("@") && mail.contains(".");
    }

    public boolean correct_phoneFormat(String phone) {
        // Asegurarse de que el telefono tenga 8 digitos y que este compuesto solo por numeros.
        return phone.matches("^\\d{8}$");
    }

    public boolean emptyFields() {   //Verifica que los campos ingresados no esten vacíos
        return user_txt.getText().isBlank() || name_txt.getText().isBlank()
                || lastname_txt.getText().isBlank() || password_txt.getText().isBlank()
                || phone_txt.getText().isBlank() || mail_txt.getText().isBlank()
                || fotoPath_txt.getText().isBlank() || date_txt.getText().isBlank();
    }

    public boolean invalidChars() {//Verifica que no se ingrese el delimitador
        return user_txt.getText().contains(";") || name_txt.getText().contains(";")
                || lastname_txt.getText().contains(";") || password_txt.getText().contains(";")
                || phone_txt.getText().contains(";") || mail_txt.getText().contains(";")
                || fotoPath_txt.getText().contains(";") || date_txt.getText().contains(";");
    }

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
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Buscar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Buscar().setVisible(true);
            }
        });
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTN_AMIGOS;
    private javax.swing.JButton BTN_BAJA;
    private javax.swing.JButton BTN_MODIFICAR;
    private javax.swing.JButton BTN_REORGANIZAR;
    private javax.swing.JCheckBox JCBMOSTRAR;
    private javax.swing.JMenuItem aboutMenuItem;
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
    private javax.swing.JButton jbbuscar;
    private javax.swing.JButton jbfoto;
    private javax.swing.JButton jbvolver;
    private javax.swing.JTextField jtbuscar;
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
