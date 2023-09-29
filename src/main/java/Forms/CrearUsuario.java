/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Forms;
import javax.swing.JOptionPane;
import java.io.*;
import java.time.format.DateTimeFormatter;
import Funciones.ArchivoSecuencial;
import Funciones.AESencripter;
import java.io.FileReader;
import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileWriter;
import java.io.BufferedWriter;
import javax.swing.JFileChooser;
import java.util.logging.Level;
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
        
         if (archivo.length() == 0 && archivo2.length() == 0) 
         {                
            admin_rdb.setSelected(true);
            user_rdb.setSelected(false);
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
        }
        else if(m1.ValAdm==1)
        {
            admin_rdb.setSelected(false);
            user_rdb.setSelected(true);
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
        }
        else if(L1.ValAdm2==2)
        {
            admin_rdb.setSelected(false);
            user_rdb.setSelected(true);
            admin_rdb.setEnabled(false);
            user_rdb.setEnabled(false);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        add_btn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        name_txt = new javax.swing.JTextField();
        mail_txt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lastname_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        fotoPath_txt = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
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

        add_btn.setBackground(new java.awt.Color(102, 255, 255));
        add_btn.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        add_btn.setForeground(new java.awt.Color(0, 0, 0));
        add_btn.setText("Agregar usuario");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Crear Usuario:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Usuario");

        lastname_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        lastname_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                lastname_txtKeyTyped(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Correo");

        fotoPath_txt.setEditable(false);
        fotoPath_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        fotoPath_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fotoPath_txtKeyTyped(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Escoger foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Teléfono");

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
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
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Fecha Nacimiento");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Nombre");

        admin_rdb.setBackground(new java.awt.Color(153, 255, 255));
        admin_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        admin_rdb.setForeground(new java.awt.Color(0, 0, 0));
        admin_rdb.setText("Administrador");
        admin_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admin_rdbActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Rol");

        date_txt.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        date_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                date_txtKeyTyped(evt);
            }
        });

        user_rdb.setBackground(new java.awt.Color(102, 255, 255));
        user_rdb.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        user_rdb.setForeground(new java.awt.Color(0, 0, 0));
        user_rdb.setText("Usuario");
        user_rdb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_rdbActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(admin_rdb)
                    .addComponent(user_rdb, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(249, 249, 249)
                .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)
                .addGap(32, 32, 32))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(36, 36, 36))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jButton1)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(mail_txt)
                            .addComponent(phone_txt)
                            .addComponent(fotoPath_txt)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(password_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3))
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
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel9)
                                            .addComponent(lastname_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(phone_txt, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(jButton1)
                                            .addComponent(fotoPath_txt, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))))
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
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(admin_rdb)
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(2, 2, 2)))
                        .addComponent(user_rdb))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
         // Inicializa variables para manejar la puntuacion y validacion de la contraseña
        String contra= new String(password_txt.getPassword());
        int CTNLong = contra.length();
        int VPaso = 0; // Variable de control para validar la contraseña
        int[] split = new int[8];
        int[] RangoINF = new int[4];
        int[] RangoSUP = new int[4];

        // Lee el archivo de puntuacion para obtener parametros de validacion
        File archivoUNO = new File("C:\\MEIA\\puntuacion.txt");
        if (archivoUNO.exists())
        {
            // Extracts the scoring parameters from the file
            try (FileReader LecturaArchivo = new FileReader(archivoUNO);
                 BufferedReader LeerArchivo = new BufferedReader(LecturaArchivo)) 
            {
                String Linea;
                int indice = 0;
                while ((Linea = LeerArchivo.readLine()) != null) 
                {
                    if (!Linea.isEmpty()) {
                        split[indice] = Integer.parseInt(Linea);
                        indice++;
                    }
                }
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Error: Archivo no encontrado.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "Error al leer el archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Lee el archivo resultado para obtener rangos de validacion
        File archivoDOS = new File("C:\\MEIA\\resultado.txt");
        if (archivoDOS.exists())
        {
            // Extracts the range parameters from the file
            try (FileReader LecturaArchivo2 = new FileReader(archivoDOS);
                 BufferedReader LeerArchivo2 = new BufferedReader(LecturaArchivo2)) 
            {
                String Linea2;
                int indice = 0;
                while ((Linea2 = LeerArchivo2.readLine()) != null)
                {
                    if (!Linea2.isEmpty())
                    {
                        String[] strSplit = Linea2.split(",");
                        RangoINF[indice] = Integer.parseInt(strSplit[0]);
                        RangoSUP[indice] = Integer.parseInt(strSplit[1]);
                        indice++;
                    }
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error de entrada/salida.", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error al interpretar un número del archivo.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        // Evaluacion de la contraseña ingresada
        int NMayus = 0, NLetras = 0, Nnum = 0, Nsimb = 0;
        for (int i = 0; i < contra.length(); i++) 
        {
            char c = contra.charAt(i);
            if (c >= 'A' && c <= 'Z') 
            {
                NMayus++;
                NLetras++;
            } 
            else if (c >= '0' && c <= '9') 
            {
                Nnum++;
            } 
            else if (c >= 'a' && c <= 'z') 
            {
                NLetras++;
            } 
            else 
            {
                Nsimb++;
            }
        }

        // Calculo de la puntuacion basada en las reglas establecidas
        int puntuacion = 0;
        if (split[0] <= CTNLong) 
        {
            puntuacion = split[1] + CTNLong + split[2] * NMayus + NLetras * split[3] + Nnum * split[4] + Nsimb * (CTNLong + split[5]);
            if (NLetras != 0 && Nnum == 0) 
            {
                puntuacion -= split[6];
            }
            else if (NLetras == 0 && Nnum != 0) 
            {
                puntuacion -= split[7];
            }
        } 
        else 
        {
            // Informa al usuario si la contraseña es muy corta
            JOptionPane.showMessageDialog(null, "No puede ingresar una contraseña con menos de " + split[0] + " caracteres.", "Ingreso no válido", WIDTH);
            VPaso = 1;
        }

        if (puntuacion >= RangoINF[0] && puntuacion < RangoSUP[0]) 
        {
            // Informa al usuario si la contraseña es insegura
            JOptionPane.showMessageDialog(null, "Contraseña insegura. Ingrese otra contraseña.", "Ingreso no válido", WIDTH);
            VPaso = 1;
        }

        if (VPaso == 1) 
        {
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
            String bitacoraUsersPath = "C:\\MEIA\\bitacora_usuario.txt"; 
            String userPath = "C:\\MEIA\\usuario.txt";
            String bitacoraDesc = "C:\\MEIA\\desc_bitacora_usuario.txt";
            String userDec = "C:\\MEIA\\desc_usuario.txt";

            AESencripter encriptador = new AESencripter();
            String contraseñaCifrada = encriptador.encriptar(password, usuario);
            String Informacion = String.join("|", usuario, nombre, apellido, contraseñaCifrada, fecha, correo, path_fotografia, Integer.toString(telefono), Integer.toString(rol), "1");

            ArchivoSecuencial as = new ArchivoSecuencial();            
            as.Add(usuario, Informacion, bitacoraUsersPath, userPath, bitacoraDesc, userDec, usuario, false);            

            // Redirige al usuario a la pagina de inicio de sesión después de completar el registro
            Login l1 = new Login();
            l1.setVisible(true);
            this.setVisible(false);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error al tratar de ingresar los datos: " + e.getMessage(), "Error", WIDTH);
        }

    }//GEN-LAST:event_add_btnActionPerformed

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

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
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
    }//GEN-LAST:event_jButton1ActionPerformed

//   Abre el archivo proporcionado y devuelve su contenido como un array de bytes.
//  file_ Archivo que se desea abrir.
//  return Retorna un array de bytes con el contenido del archivo.
// 
public byte[] openFile(File file_){
    byte[] image_ = new byte[1024*100];
    try(FileInputStream input = new FileInputStream(file_))
    {
        input.read(image_);
    } 
    catch(IOException e)
    {
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
    try(FileOutputStream output = new FileOutputStream(file_))
    { 
        output.write(image_);
        return "Saved file";
    } 
    catch(IOException e)
    {
        return "Error saving file";
    }
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
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JButton add_btn;
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
    private javax.swing.JButton jButton1;
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
