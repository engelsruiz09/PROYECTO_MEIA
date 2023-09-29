/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/Application.java to edit this template
 */
package Forms;
import java.awt.Image;
import javax.swing.ImageIcon;

public class MenuAdmin extends javax.swing.JFrame {

    /**
     * Creates new form MenuAdmin
     */
    public MenuAdmin() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        Login l2 = new Login();
        user_lbl.setText(l2.usertx);
        if (l2.rol == 1) 
        {
            rol_lbl.setText("Administrador");
            JBTN_deleteProfile1.setEnabled(false);
        }
        else
        {
            rol_lbl.setText("Usuario");
            JBTN_IngresarUser.setEnabled(false);
            JBTN_backup.setEnabled(false);
            JBTN_search.setEnabled(false);
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
        JBTN_modify = new javax.swing.JButton();
        foto_lbl = new javax.swing.JLabel();
        user_lbl = new javax.swing.JLabel();
        rol_lbl = new javax.swing.JLabel();
        JBTN_search = new javax.swing.JButton();
        JBTN_logout = new javax.swing.JButton();
        JBTN_DARBAJANOADMIN = new javax.swing.JButton();
        JBTN_deleteProfile1 = new javax.swing.JButton();
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
        JBTN_IngresarUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_IngresarUserActionPerformed(evt);
            }
        });

        JBTN_modify.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_modify.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_modify.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_modify.setText("Modificar datos");
        JBTN_modify.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_modifyActionPerformed(evt);
            }
        });

        foto_lbl.setBackground(new java.awt.Color(153, 153, 153));
        foto_lbl.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        foto_lbl.setForeground(new java.awt.Color(0, 0, 0));
        foto_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        user_lbl.setBackground(new java.awt.Color(102, 255, 255));
        user_lbl.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        user_lbl.setForeground(new java.awt.Color(0, 0, 0));
        user_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        user_lbl.setText("User");
        user_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        rol_lbl.setBackground(new java.awt.Color(102, 255, 255));
        rol_lbl.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        rol_lbl.setForeground(new java.awt.Color(0, 0, 0));
        rol_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        rol_lbl.setText("Rol");
        rol_lbl.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        JBTN_search.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_search.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_search.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_search.setText("Buscar usuario");
        JBTN_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_searchActionPerformed(evt);
            }
        });

        JBTN_logout.setBackground(new java.awt.Color(255, 0, 51));
        JBTN_logout.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_logout.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_logout.setText("Cerrar sesión");
        JBTN_logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_logoutActionPerformed(evt);
            }
        });

        JBTN_DARBAJANOADMIN.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_DARBAJANOADMIN.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_DARBAJANOADMIN.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_DARBAJANOADMIN.setText("Dar de Baja");
        JBTN_DARBAJANOADMIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBTN_DARBAJANOADMINActionPerformed(evt);
            }
        });

        JBTN_deleteProfile1.setBackground(new java.awt.Color(102, 102, 102));
        JBTN_deleteProfile1.setFont(new java.awt.Font("Segoe UI Black", 0, 18)); // NOI18N
        JBTN_deleteProfile1.setForeground(new java.awt.Color(255, 255, 255));
        JBTN_deleteProfile1.setText("Eliminar perfil");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JBTN_DARBAJANOADMIN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBTN_IngresarUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBTN_deleteProfile1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(JBTN_search, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JBTN_modify, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(JBTN_backup, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
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
                        .addGap(120, 120, 120)
                        .addComponent(JBTN_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(70, Short.MAX_VALUE))
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
                    .addComponent(JBTN_DARBAJANOADMIN)
                    .addComponent(JBTN_modify, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTN_IngresarUser)
                    .addComponent(JBTN_search))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(JBTN_deleteProfile1)
                    .addComponent(JBTN_backup, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(JBTN_logout, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
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
    
    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void JBTN_backupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_backupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTN_backupActionPerformed

    private void JBTN_IngresarUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_IngresarUserActionPerformed
        // TODO add your handling code here:
        CrearUsuario C1= new CrearUsuario();
        C1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBTN_IngresarUserActionPerformed

    private void JBTN_modifyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_modifyActionPerformed
        // TODO add your handling code here:
        ValMod=2;//1 es que vino para buscar
        Buscar of1 = new Buscar();
        of1.setVisible(true);
    }//GEN-LAST:event_JBTN_modifyActionPerformed

    private void JBTN_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_searchActionPerformed
        // TODO add your handling code here:
        //Busqueda de usuario

        ValMod=1;//1 es que vino para buscar
        Buscar of1 = new Buscar();
        of1.setVisible(true);

    }//GEN-LAST:event_JBTN_searchActionPerformed

    private void JBTN_logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_logoutActionPerformed
        // TODO add your handling code here:
        Login l1 = new Login();
        l1.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_JBTN_logoutActionPerformed

    private void JBTN_DARBAJANOADMINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBTN_DARBAJANOADMINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_JBTN_DARBAJANOADMINActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBTN_DARBAJANOADMIN;
    private javax.swing.JButton JBTN_IngresarUser;
    private javax.swing.JButton JBTN_backup;
    private javax.swing.JButton JBTN_deleteProfile1;
    private javax.swing.JButton JBTN_logout;
    private javax.swing.JButton JBTN_modify;
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
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JLabel rol_lbl;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JLabel user_lbl;
    // End of variables declaration//GEN-END:variables

}
