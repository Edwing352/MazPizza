/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase de creación para empleados
Fecha: 15/09/2022
 */
package Vista;
import static Controlador.EmployeesController.GetPositions;
import static Controlador.EmployeesController.InsertEmployees;
import Modelo.EmployeeModel;
import Modelo.PositionModel;
import java.util.ArrayList;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class CreateEmployeeView extends javax.swing.JFrame {
    boolean editing = false;
   
    public CreateEmployeeView() {
        initComponents();
        this.setLocationRelativeTo(null);
        BtnAgregarEmp.setText("Agregar");
        txtIdEmployee.setVisible(false);
        
        LoadPositions();
    }
    
    public CreateEmployeeView(EmployeeModel employee) {
        initComponents();
        LoadPositions();
        txtIdEmployee.setText(String.valueOf(employee.idEmpleado));
        txtNEmployeesAg.setText(employee.NombreEmp);
        txtCalleNumAg.setText(employee.CalleNumero);
        txtNumSS.setText(employee.NumeroSS);
        txtColonia.setText(employee.Colonia);
        txtNombreUsuario.setText(employee.NombreUsuario);
        txtPassword.setText(employee.Password);
        cBoxPosition.setSelectedItem(employee.idPuesto+"-"+employee.NombreP);
        
        txtIdEmployee.setVisible(false);
        BtnAgregarEmp.setText("Editar");
        editing = true;        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        lblTituloPro = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblNameEmployee = new javax.swing.JLabel();
        txtNEmployeesAg = new javax.swing.JTextField();
        lblCalleNum = new javax.swing.JLabel();
        txtCalleNumAg = new javax.swing.JTextField();
        lblUserName = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        lblNumSS = new javax.swing.JLabel();
        txtNumSS = new javax.swing.JTextField();
        lblColonia = new javax.swing.JLabel();
        txtColonia = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        cBoxPosition = new javax.swing.JComboBox<>();
        BtnAgregarEmp = new javax.swing.JButton();
        BtnCancel = new javax.swing.JButton();
        txtIdEmployee = new javax.swing.JTextField();
        lblPuesto = new javax.swing.JLabel();
        jSe4 = new javax.swing.JSeparator();
        jSe1 = new javax.swing.JSeparator();
        jSe2 = new javax.swing.JSeparator();
        jSe7 = new javax.swing.JSeparator();
        jSe3 = new javax.swing.JSeparator();
        jSe5 = new javax.swing.JSeparator();
        jSe6 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(204, 102, 11));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloPro.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTituloPro.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloPro.setText("Agregar Empleado");
        jPanel3.add(lblTituloPro, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 120));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNameEmployee.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblNameEmployee.setForeground(new java.awt.Color(204, 102, 11));
        lblNameEmployee.setText("Nombre:");
        jPanel1.add(lblNameEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 30, -1, -1));

        txtNEmployeesAg.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtNEmployeesAg.setBorder(null);
        jPanel1.add(txtNEmployeesAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 480, 30));

        lblCalleNum.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblCalleNum.setForeground(new java.awt.Color(204, 102, 11));
        lblCalleNum.setText("Dirección:");
        jPanel1.add(lblCalleNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        txtCalleNumAg.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtCalleNumAg.setBorder(null);
        jPanel1.add(txtCalleNumAg, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 480, 30));

        lblUserName.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(204, 102, 11));
        lblUserName.setText("Nombre Usuario:");
        jPanel1.add(lblUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        txtNombreUsuario.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtNombreUsuario.setBorder(null);
        txtNombreUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtNombreUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 480, 30));

        lblNumSS.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblNumSS.setForeground(new java.awt.Color(204, 102, 11));
        lblNumSS.setText("Número de Seguro Social:");
        jPanel1.add(lblNumSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        txtNumSS.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtNumSS.setBorder(null);
        txtNumSS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumSSActionPerformed(evt);
            }
        });
        jPanel1.add(txtNumSS, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 180, 390, 30));

        lblColonia.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblColonia.setForeground(new java.awt.Color(204, 102, 11));
        lblColonia.setText("Colonia:");
        jPanel1.add(lblColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        txtColonia.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtColonia.setBorder(null);
        txtColonia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtColoniaActionPerformed(evt);
            }
        });
        jPanel1.add(txtColonia, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 230, 480, 30));

        lblPassword.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(204, 102, 11));
        lblPassword.setText("Password:");
        jPanel1.add(lblPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        txtPassword.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtPassword.setBorder(null);
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 480, 30));

        cBoxPosition.setBackground(new java.awt.Color(204, 102, 11));
        cBoxPosition.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        cBoxPosition.setForeground(new java.awt.Color(204, 102, 11));
        cBoxPosition.setBorder(null);
        cBoxPosition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPositionActionPerformed(evt);
            }
        });
        jPanel1.add(cBoxPosition, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 480, 30));

        BtnAgregarEmp.setBackground(new java.awt.Color(204, 102, 11));
        BtnAgregarEmp.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        BtnAgregarEmp.setForeground(new java.awt.Color(255, 255, 255));
        BtnAgregarEmp.setText("Agregar");
        BtnAgregarEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAgregarEmpActionPerformed(evt);
            }
        });
        jPanel1.add(BtnAgregarEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 420, 120, 40));

        BtnCancel.setBackground(new java.awt.Color(204, 102, 11));
        BtnCancel.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        BtnCancel.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancel.setText("Cancelar");
        BtnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(BtnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 420, 120, 40));

        txtIdEmployee.setEditable(false);
        jPanel1.add(txtIdEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, 30, 20));

        lblPuesto.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblPuesto.setForeground(new java.awt.Color(204, 102, 11));
        lblPuesto.setText("Puesto:");
        jPanel1.add(lblPuesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 330, -1, -1));

        jSe4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSe4, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 390, 10));

        jSe1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSe1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 480, 10));

        jSe2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSe2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 480, 10));

        jSe7.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSe7, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 360, 480, 10));

        jSe3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSe3, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 480, 10));

        jSe5.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSe5, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 480, 10));

        jSe6.setForeground(new java.awt.Color(0, 0, 0));
        jPanel1.add(jSe6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, 480, 10));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 730, 490));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombreUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreUsuarioActionPerformed

    private void txtNumSSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumSSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumSSActionPerformed

    private void txtColoniaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtColoniaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtColoniaActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void cBoxPositionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPositionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxPositionActionPerformed

    private void BtnAgregarEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAgregarEmpActionPerformed
        //Agregar datos a los empleados más validación para que todos los datos sean digitados
        EmployeeModel newEmloyee = new EmployeeModel();
        String NombreEmp = txtNEmployeesAg.getText();
        String CalleNumero = txtCalleNumAg.getText();
        String NumeroSS = txtNumSS.getText();
        String Colonia = txtColonia.getText();
        String Password = txtPassword.getText();
        String NombreUsuario = txtNombreUsuario.getText();
        String pos = (String)cBoxPosition.getSelectedItem();
        
        if((!NombreEmp.isBlank() || !NombreEmp.isEmpty()) &&
            (!CalleNumero.isBlank() || !CalleNumero.isEmpty()) &&
            (!NumeroSS.isBlank() || !NumeroSS.isEmpty()) &&
            (!Colonia.isBlank() || !Colonia.isEmpty()) &&
            (!Password.isBlank() || !Password.isEmpty()) &&
            (!NombreUsuario.isBlank() || !NombreUsuario.isEmpty()) &&
            (!pos.equals("Seleccione uno...")))
        {
            newEmloyee.NombreEmp = txtNEmployeesAg.getText();
            newEmloyee.CalleNumero = txtCalleNumAg.getText();
            newEmloyee.NumeroSS = txtNumSS.getText();
            newEmloyee.Colonia = txtColonia.getText();
            newEmloyee.Password = txtPassword.getText();
            newEmloyee.NombreUsuario = txtNombreUsuario.getText();

            String position = (String)cBoxPosition.getSelectedItem();
            String[] parts = position.split("-");
            newEmloyee.idPuesto = Integer.parseInt(parts[0]) ;

            if(editing)
            {
                newEmloyee.idEmpleado = Integer.parseInt(txtIdEmployee.getText());
            }

            boolean correct = InsertEmployees(newEmloyee, editing);

            if(correct)
            {
                JOptionPane.showMessageDialog(null, "El empleado se guardo correctamente.");
                super.dispose();
            }
        }
        else{
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }
    }//GEN-LAST:event_BtnAgregarEmpActionPerformed

    private void BtnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelActionPerformed
        super.dispose();
    }//GEN-LAST:event_BtnCancelActionPerformed

    public void LoadPositions(){
        ArrayList<PositionModel> positionList = GetPositions();
        cBoxPosition.addItem("Seleccione uno...");
                
        for(PositionModel pos: positionList)
        {
                cBoxPosition.addItem(pos.idPuesto +"-"+ pos.NombreP);
        }        
    }
    
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
            java.util.logging.Logger.getLogger(CreateEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateEmployeeView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateEmployeeView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAgregarEmp;
    private javax.swing.JButton BtnCancel;
    private javax.swing.JComboBox<String> cBoxPosition;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSe1;
    private javax.swing.JSeparator jSe2;
    private javax.swing.JSeparator jSe3;
    private javax.swing.JSeparator jSe4;
    private javax.swing.JSeparator jSe5;
    private javax.swing.JSeparator jSe6;
    private javax.swing.JSeparator jSe7;
    private javax.swing.JLabel lblCalleNum;
    private javax.swing.JLabel lblColonia;
    private javax.swing.JLabel lblNameEmployee;
    private javax.swing.JLabel lblNumSS;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPuesto;
    private javax.swing.JLabel lblTituloPro;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JTextField txtCalleNumAg;
    private javax.swing.JTextField txtColonia;
    private javax.swing.JTextField txtIdEmployee;
    private javax.swing.JTextField txtNEmployeesAg;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNumSS;
    private javax.swing.JTextField txtPassword;
    // End of variables declaration//GEN-END:variables
}
