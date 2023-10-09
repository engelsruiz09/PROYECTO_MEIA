/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Forms;
import java.awt.Image;
import static java.awt.image.ImageObserver.WIDTH;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class MenuAdmin extends javax.swing.JFrame {
    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        Login l2 = new Login();
        user_lbl.setText(Login.usertx);
        if (l2.rol == 1) 
        {
            rol_lbl.setText("Administrador");
            //JBTN_deleteProfile1.setEnabled(false);
        }
        else
        {
            rol_lbl.setText("Usuario");
            JBTN_IngresarUser.setEnabled(false);
            JBTN_backup.setEnabled(false);
            JBTN_search.setEnabled(true);
        }
        foto_lbl.setIcon(new ImageIcon(l2.FotoPath));
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        JBTN_backup = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        JBTN_IngresarUser = new javax.swing.JButton();
        foto_lbl = new javax.swing.JLabel();
        user_lbl = new javax.swing.JLabel();
        rol_lbl = new javax.swing.JLabel();
        JBTN_search = new javax.swing.JButton();
        JBTN_logout = new javax.swing.JButton();
        jlsilencio = new javax.swing.JLabel();
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

        JBTN_backup.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_backup.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_backup.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_backup.setText("Backup");
        JBTN_backup.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTN_backup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_backupActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(102, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 255));
        jLabel1.setText("Mantenimiento Usuarios");

        JBTN_IngresarUser.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_IngresarUser.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_IngresarUser.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_IngresarUser.setText("Ingresar usuario");
        JBTN_IngresarUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTN_IngresarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_IngresarUserActionPerformed(evt);
            }
        });

        foto_lbl.setBackground(new java.awt.Color(153, 153, 153));
        foto_lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        foto_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        user_lbl.setBackground(new java.awt.Color(102, 255, 255));
        user_lbl.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        user_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_lbl.setText("User");
        user_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rol_lbl.setBackground(new java.awt.Color(102, 255, 255));
        rol_lbl.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rol_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rol_lbl.setText("Rol");
        rol_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JBTN_search.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_search.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_search.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_search.setText("Acciones Usuario");
        JBTN_search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTN_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_searchActionPerformed(evt);
            }
        });

        JBTN_logout.setBackground(new java.awt.Color(255, 0, 51));
        JBTN_logout.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_logout.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_logout.setText("Cerrar sesión");
        JBTN_logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTN_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_logoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlsilencio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(112, 112, 112)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(user_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(rol_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(foto_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(69, 69, 69)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(JBTN_IngresarUser)
                                .addGap(27, 27, 27)
                                .addComponent(JBTN_search))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(113, 113, 113)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(JBTN_backup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(JBTN_logout, javax.swing.GroupLayout.DEFAULT_SIZE, 182, Short.MAX_VALUE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(foto_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rol_lbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTN_IngresarUser)
                    .addComponent(JBTN_search))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(JBTN_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(JBTN_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jlsilencio))))
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public static int ValAdm=0;
    public static int ValMod=0;
    public static int validacion;
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void JBTN_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_backupActionPerformed
     String directorioOrigen = "C:/MEIA";
        
        // Crear un cuadro de diálogo para seleccionar la ruta de destino
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int result = fileChooser.showSaveDialog(null);
        
        if (result == JFileChooser.APPROVE_OPTION) {
            String rutaDestino = fileChooser.getSelectedFile().getAbsolutePath();
            
            // Nombre del directorio de respaldo
            String directorioRespaldo = rutaDestino + "/MEIA_Backup";
            
            // Crear directorio de respaldo
            File directorioRespaldoFile = new File(directorioRespaldo);
            directorioRespaldoFile.mkdirs();
            
            // Copiar los archivos y directorios
            copiarDirectorio(new File(directorioOrigen), directorioRespaldoFile);
            
            // Obtener la fecha actual
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String fechaTransaccion = dateFormat.format(new Date());
            
            // Crear la bitácora de respaldos
            String bitacoraPath = "C:/MEIA/bitacora_backup.txt";
            try (FileWriter bitacoraWriter = new FileWriter(bitacoraPath, true)) {
                String registro = "Ruta: " + rutaDestino + " | Usuario: " + Login.usertx + "  Fecha: " + fechaTransaccion + "\n";
                bitacoraWriter.write(registro);
                JOptionPane.showMessageDialog(null, "Copia de seguridad realizada con éxito");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error en la bitácora: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
            
            int numRegistros = leerNumeroRegistros("C:/MEIA/desc_bitacora_backup.txt");

            // Crear el archivo "desc_bitacora_backup"
            String descBitacoraPath = "C:/MEIA/desc_bitacora_backup.txt";
            try (FileWriter descBitacoraWriter = new FileWriter(descBitacoraPath, true)) {
                String nombreSimbolico = "Respaldo" + numRegistros;
                String fechaCreacion = fechaTransaccion;
                String fechaModificacion = fechaTransaccion;
                String registro = "Nombre: " + nombreSimbolico + " | Usuario creacion: " + Login.usertx + " | Fecha : " + fechaCreacion + " | Usuario Modificacion: " + Login.usertx + " | Fecha modificacion: " + fechaModificacion + " | #Registros: " + numRegistros + "\n";
                descBitacoraWriter.write(registro);
                JOptionPane.showMessageDialog(null, "Información registrada en desc_bitacora_backup.");
            } catch (IOException e) {
                JOptionPane.showMessageDialog(null, "Error en desc_bitacora_backup: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_JBTN_backupActionPerformed

        
    private void JBTN_IngresarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_IngresarUserActionPerformed
        // TODO add your handling code here:
        ValAdm = 1;
        validacion = 1;
        CrearUsuario C1= new CrearUsuario();
        C1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTN_IngresarUserActionPerformed
    
    public int obtenerTexto() {
        return validacion;
    }
    
    private void JBTN_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_searchActionPerformed
        // TODO add your handling code here:
        //Busqueda de usuario

        ValMod=1;//1 es que vino para buscar
        Buscar of1 = new Buscar();
        of1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_JBTN_searchActionPerformed

    private void JBTN_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_logoutActionPerformed
        // TODO add your handling code here:
        Login l1 = new Login();
        this.dispose();
        JOptionPane.showMessageDialog(null, "Se ha cerrado sesion actual", "Sesion", WIDTH);
        l1.setVisible(true);
    }//GEN-LAST:event_JBTN_logoutActionPerformed

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
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuAdmin().setVisible(true);
            }
        });
    }
    private static void copiarDirectorio(File origen, File destino) {
        if (origen.isDirectory()) {
            if (!destino.exists()) {
                destino.mkdirs();
            }

            String[] archivos = origen.list();

            if (archivos != null) {
                for (String archivo : archivos) {
                    File archivoOrigen = new File(origen, archivo);
                    File archivoDestino = new File(destino, archivo);

                    copiarDirectorio(archivoOrigen, archivoDestino);
                }
            }
        } else {
            try (InputStream in = new FileInputStream(origen);
                 OutputStream out = new FileOutputStream(destino)) {
                byte[] buffer = new byte[1024];
                int longitud;
                while ((longitud = in.read(buffer)) > 0) {
                    out.write(buffer, 0, longitud);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

     private static int leerNumeroRegistros(String filePath) {
        int numRegistros = 1;
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                numRegistros++;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return numRegistros;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTN_IngresarUser;
    private javax.swing.JButton JBTN_backup;
    private javax.swing.JButton JBTN_logout;
    private javax.swing.JButton JBTN_search;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JLabel foto_lbl;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jlsilencio;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JLabel rol_lbl;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel user_lbl;
    // End of variables declaration//GEN-END:variables

}
