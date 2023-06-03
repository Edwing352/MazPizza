/*
Nombre: Edwing Ricardo Rochin López
Fecha:15/09/2022
Descripción: Clase main para el login
 */
package Vista;

import Controlador.ConectionController;
import static Controlador.EmployeesController.existsEmployees;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static Controlador.LoginController.Loguear;
import Modelo.EmployeeModel;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.beans.EventHandler;

public class Login extends javax.swing.JFrame {
    
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null); //Sirve para que la ventana este centrada
    }  
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        lblIniciarS = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        btnLogin = new javax.swing.JButton();
        txtPass = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 290, 10));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesLogin/PizzaLogo.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 60, 190, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesLogin/FondoBanderas.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, -30, 410, 140));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesLogin/PizzaFondo.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 220, 140));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesLogin/FondoLadrillos.png"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(626, 420));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 0, 366, 400));

        lblUserName.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(185, 30, 0));
        lblUserName.setText("USUARIO:");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, -1, -1));

        lblPassword.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(185, 30, 0));
        lblPassword.setText("CONTRASEÑA:");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        lblIniciarS.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblIniciarS.setText("INICIAR SESIÓN");
        jPanel1.add(lblIniciarS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtUserName.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtUserName.setForeground(new java.awt.Color(153, 153, 153));
        txtUserName.setText("Ingrese su nombre de usuario");
        txtUserName.setBorder(null);
        txtUserName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUserNameFocusGained(evt);
            }
        });
        txtUserName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtUserNameMousePressed(evt);
            }
        });
        txtUserName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUserNameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 290, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 290, 10));

        btnLogin.setBackground(new java.awt.Color(185, 30, 0));
        btnLogin.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Ingresar");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });
        jPanel1.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 110, 40));

        txtPass.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtPass.setForeground(new java.awt.Color(153, 153, 153));
        txtPass.setText("************");
        txtPass.setBorder(null);
        txtPass.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPassFocusGained(evt);
            }
        });
        txtPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtPassMousePressed(evt);
            }
        });
        txtPass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPassKeyPressed(evt);
            }
        });
        jPanel1.add(txtPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 290, 30));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesLogin/FondoBlanco.png"))); // NOI18N
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 775, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        entrar();
    }//GEN-LAST:event_btnLoginActionPerformed
//Método para iniciar sesión
    public void entrar()
    {
        String user = txtUserName.getText();
        String pass = new String(txtPass.getPassword()); 
        
        int usrCorrect = Loguear(user, pass);
        
        if(usrCorrect > 0){
            EmployeeModel employee = existsEmployees(usrCorrect);
            new MainWindow(employee).setVisible(true);
            super.dispose();
        }
        else {
            JOptionPane.showMessageDialog(null, "Credenciales no validas, intentalo nuevamente.");
        }
    }
    
    private void txtUserNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUserNameActionPerformed
 
    }//GEN-LAST:event_txtUserNameActionPerformed

    private void txtUserNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserNameMousePressed
       
       
        
    }//GEN-LAST:event_txtUserNameMousePressed

    private void txtPassMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtPassMousePressed
        
    }//GEN-LAST:event_txtPassMousePressed

    private void txtPassFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPassFocusGained
        //Método para ocular los caracteress de la contraseña
        if(String.valueOf(txtPass.getPassword()).equals("************")){
            txtPass.setText("");
            txtPass.setForeground(Color.black);
        }
        
        if(txtUserName.getText().isEmpty()){
            txtUserName.setText("Ingrese su nombre de usuario");
            txtUserName.setForeground(Color.gray);
        }       
    }//GEN-LAST:event_txtPassFocusGained

    private void txtUserNameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUserNameFocusGained
        //Método para ocular los caracteress del nombre de usuario
        if(txtUserName.getText().equals("Ingrese su nombre de usuario")){
           txtUserName.setText("");
           txtUserName.setForeground(Color.black);
       }
       if(String.valueOf(txtPass.getPassword()).isEmpty()){
           txtPass.setText("************");
           txtPass.setForeground(Color.gray);
       }
    }//GEN-LAST:event_txtUserNameFocusGained

    private void txtPassKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPassKeyPressed
        int key = evt.getKeyChar();

        if (key == 10)
        {            
            entrar();
        }
    }//GEN-LAST:event_txtPassKeyPressed

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
    private javax.swing.JButton btnLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblIniciarS;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JPasswordField txtPass;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}
