/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
            * donde está el proyecto https://github.com/engelsruiz09/PROYECTO_MEIA.git
 */
package Forms;
import java.io.*;
import javax.swing.JOptionPane;
import Funciones.ArchivoSecuencial;
import Funciones.AESencripter;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
/**
 *
 * @author JULIORUIZ
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Login
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);//para colocarlo en medio de la pantalla
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        JTFUSUR = new javax.swing.JTextField();
        JPFCONTRA = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        JCBMOSTRAR = new javax.swing.JCheckBox();
        JBTNEWUSU = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        JBINICIAR = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
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
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        JTFUSUR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JTFUSUR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JTFUSURActionPerformed(evt);
            }
        });
        JTFUSUR.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JTFUSURKeyTyped(evt);
            }
        });

        JPFCONTRA.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JPFCONTRA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                JPFCONTRAKeyTyped(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 102, 102));
        jLabel1.setText("----------------------------------------");

        JCBMOSTRAR.setBackground(new java.awt.Color(102, 255, 255));
        JCBMOSTRAR.setText("Mostrar Contraseña");
        JCBMOSTRAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JCBMOSTRAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JCBMOSTRARActionPerformed(evt);
            }
        });

        JBTNEWUSU.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JBTNEWUSU.setForeground(new java.awt.Color(51, 102, 255));
        JBTNEWUSU.setText("CREAR USUARIO");
        JBTNEWUSU.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBTNEWUSU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                JBTNEWUSUMouseClicked(evt);
            }
        });
        JBTNEWUSU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTNEWUSUActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setText("Ingrese Usuario");

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setText("Ingrese Contraseña");

        JBINICIAR.setBackground(new java.awt.Color(102, 255, 255));
        JBINICIAR.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        JBINICIAR.setText("INICIAR");
        JBINICIAR.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JBINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBINICIARActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        jLabel4.setText("LOGIN");

        jButton1.setBackground(new java.awt.Color(102, 255, 255));
        jButton1.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jButton1.setText("SALIR");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JCBMOSTRAR, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JTFUSUR, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JPFCONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10))
                    .addComponent(JBINICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBTNEWUSU, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JTFUSUR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPFCONTRA, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(JCBMOSTRAR)
                .addGap(18, 18, 18)
                .addComponent(JBINICIAR, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JBTNEWUSU, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        menuBar.setBackground(new java.awt.Color(153, 153, 153));
        menuBar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void JCBMOSTRARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JCBMOSTRARActionPerformed
        // TODO add your handling code here:
        //para mostrar la contraseña
        if (JCBMOSTRAR.isSelected()) 
        {
            JPFCONTRA.setEchoChar((char) 0); //muestra la contraseña con el caracter de eco con valor de 0 que es el caracter nulo desactiva la funcion de ocultamiento y muestra la contraseña real ingresada
        } 
        else 
        {
            JPFCONTRA.setEchoChar('\u002A'); //oculta la contraseña, con la representacion unicode para el caracter de * decimos que cada caracter ingresado se muestre como *
        }
        
    }//GEN-LAST:event_JCBMOSTRARActionPerformed

  
    
    
    private void JTFUSURActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JTFUSURActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JTFUSURActionPerformed

    private void JTFUSURKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JTFUSURKeyTyped
        // TODO add your handling code here:
         if (JTFUSUR.getText().length() >= 20) //usuario varchar de 20
         {
            evt.consume();
        }
    }//GEN-LAST:event_JTFUSURKeyTyped

    private void JPFCONTRAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_JPFCONTRAKeyTyped
        // TODO add your handling code here:
         if (JPFCONTRA.getText().length() >= 40)//password varchar de 40 
         {
            evt.consume();
        }
    }//GEN-LAST:event_JPFCONTRAKeyTyped

    private void JBTNEWUSUMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBTNEWUSUMouseClicked
        // TODO add your handling code here:
        ValAdm2=2;
        CrearUsuario F1 = new CrearUsuario(); // creamos una nueva instancia de la clase crearusuario
        F1.setVisible(true); // hacemos visible la ventana del formulario 
        dispose();//cerramos el formulario actual
    }//GEN-LAST:event_JBTNEWUSUMouseClicked

    public static String usertx = "";
    public static String STR_LINE="";
    public static String FotoPath="";
    public static int rol = 0;
    public static int ValAdm2=0;
    
    private void JBINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBINICIARActionPerformed
        // TODO add your handling code here:
                    // Verifica si los campos de usuario y contraseña están vacíos.
            if (JTFUSUR.getText().isBlank() || JPFCONTRA.getText().isBlank()) {
                // Muestra un mensaje de error si alguno de los campos está vacío.
                JOptionPane.showMessageDialog(null, "Se deben llenar todos los campos", "Ingreso no valido", WIDTH);
            }

            // Obtiene la contraseña ingresada por el usuario.
            String contra = new String(JPFCONTRA.getPassword());

            // Crea una instancia del encriptador AES.
            AESencripter encripter = new AESencripter();

            // Variable auxiliar para verificar si la contraseña coincide.
            int CAux = 0;

            // Variable para almacenar la contraseña desencriptada.
            String CTN = "";

            // Crea una instancia de ArchivoSecuencial para buscar usuarios.
            ArchivoSecuencial as = new ArchivoSecuencial();

            // Busca al usuario ingresado primero en la bitacora.
            String resultado = as.Search(JTFUSUR.getText(), "C:\\MEIA\\bitacora_usuario.txt", "C:\\MEIA\\usuario.txt");

            // Si el usuario es encontrado en la bitacora o el archivo principal.
            if (!resultado.equals("null")) {
                // Divide el resultado para obtener los detalles del usuario.
                String[] registro = resultado.split("[|]");

                // Obtiene la contraseña cifrada del registro encontrado.
                String contCifrada = registro[3];
                FotoPath = registro[6];
                rol = Integer.parseInt(registro[8]);

                // Intenta desencriptar la contraseña cifrada usando la clave del usuario.
                try {
                    CTN = encripter.desencriptar(contCifrada, registro[0]);
                } catch (UnsupportedEncodingException | NoSuchAlgorithmException | InvalidKeyException | NoSuchPaddingException | IllegalBlockSizeException | BadPaddingException ex) {
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                }

                // Compara la contraseña desencriptada con la contraseña ingresada por el usuario.
                if (CTN.equals(JPFCONTRA.getText())) {
                    STR_LINE = resultado;
                    CAux = 1;
                }

                // Si las contraseñas coinciden, muestra el menú principal.
                if (CAux == 1) {
                    CAux = 0;
                    usertx = registro[0];
                    MenuAdmin m1 = new MenuAdmin();
                    m1.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta", "Login", JOptionPane.INFORMATION_MESSAGE);
                }
            }
            else{
                JOptionPane.showMessageDialog(this, "Usuario no encontrado", "Login", JOptionPane.INFORMATION_MESSAGE);
            }

    }//GEN-LAST:event_JBINICIARActionPerformed

    private void JBTNEWUSUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTNEWUSUActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTNEWUSUActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBINICIAR;
    private javax.swing.JButton JBTNEWUSU;
    private javax.swing.JCheckBox JCBMOSTRAR;
    private javax.swing.JPasswordField JPFCONTRA;
    private javax.swing.JTextField JTFUSUR;
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
