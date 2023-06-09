/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase de creación para insumos
Fecha: 15/09/2022
 */
package Vista;

import static Controlador.SuppliesController.InsertSupplies;
import Modelo.SuppliesModel;
import javax.swing.JOptionPane;

public class CreateSuppliesView extends javax.swing.JFrame {
    boolean editing = false;    
    
    public CreateSuppliesView() {
        initComponents();
        cargarCombo();
        this.setLocationRelativeTo(null);
        BtnAddSup.setText("Agregar");
        txtIdSupplies.setVisible(false);
    }

public CreateSuppliesView(SuppliesModel supplies) {
        initComponents();
        cargarCombo();
        this.setLocationRelativeTo(null);
        txtIdSupplies.setText(String.valueOf(supplies.idInsumos));
        txtNameSupplies.setText(supplies.NombreInsumo);
        txtPreSupplies.setText(supplies.PrecioI);
        txtDesSupplies.setText(supplies.descripcionI);
        txtPrePorPorcion.setText(String.valueOf(supplies.PrecioPorcion));
        if(supplies.EsIngrediente){
            cBoxPizzaI.setSelectedItem("1-Si");
        } else{
            cBoxPizzaI.setSelectedItem("2-No");
        }
        
        
        txtIdSupplies.setVisible(false);
        BtnAddSup.setText("Editar");
        editing = true;        
    }
    
public void cargarCombo(){
    cBoxPizzaI.addItem("Seleccione uno...");
    cBoxPizzaI.addItem("1-Si");
    cBoxPizzaI.addItem("2-No");
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
        jPanel2 = new javax.swing.JPanel();
        lblTituloSupp = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        txtIdSupplies = new javax.swing.JTextField();
        BtnAddSup = new javax.swing.JButton();
        BtnCancelSup = new javax.swing.JButton();
        txtPreSupplies = new javax.swing.JTextField();
        lblForPizza = new javax.swing.JLabel();
        txtNameSupplies = new javax.swing.JTextField();
        lblNameSupplies = new javax.swing.JLabel();
        txtDesSupplies = new javax.swing.JTextField();
        lblDesSupplies = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        cBoxPizzaI = new javax.swing.JComboBox<>();
        lblPreSupplies1 = new javax.swing.JLabel();
        lblPrePorPorcion = new javax.swing.JLabel();
        txtPrePorPorcion = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(204, 102, 11));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblTituloSupp.setFont(new java.awt.Font("Roboto", 1, 36)); // NOI18N
        lblTituloSupp.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloSupp.setText("Agregar Insumo");
        jPanel2.add(lblTituloSupp, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 120));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtIdSupplies.setEditable(false);
        jPanel3.add(txtIdSupplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, 30, -1));

        BtnAddSup.setBackground(new java.awt.Color(204, 102, 11));
        BtnAddSup.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        BtnAddSup.setForeground(new java.awt.Color(255, 255, 255));
        BtnAddSup.setText("Agregar");
        BtnAddSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnAddSupActionPerformed(evt);
            }
        });
        jPanel3.add(BtnAddSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 350, 120, 40));

        BtnCancelSup.setBackground(new java.awt.Color(204, 102, 11));
        BtnCancelSup.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        BtnCancelSup.setForeground(new java.awt.Color(255, 255, 255));
        BtnCancelSup.setText("Cancelar");
        BtnCancelSup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnCancelSupActionPerformed(evt);
            }
        });
        jPanel3.add(BtnCancelSup, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 350, 120, 40));

        txtPreSupplies.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtPreSupplies.setBorder(null);
        txtPreSupplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPreSuppliesActionPerformed(evt);
            }
        });
        txtPreSupplies.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPreSuppliesKeyTyped(evt);
            }
        });
        jPanel3.add(txtPreSupplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 490, 30));

        lblForPizza.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblForPizza.setForeground(new java.awt.Color(204, 102, 11));
        lblForPizza.setText("Ingrediente para pizza:");
        jPanel3.add(lblForPizza, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 240, -1));

        txtNameSupplies.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtNameSupplies.setBorder(null);
        txtNameSupplies.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameSuppliesFocusGained(evt);
            }
        });
        txtNameSupplies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameSuppliesActionPerformed(evt);
            }
        });
        jPanel3.add(txtNameSupplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 490, 30));

        lblNameSupplies.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblNameSupplies.setForeground(new java.awt.Color(204, 102, 11));
        lblNameSupplies.setText("Nombre :");
        jPanel3.add(lblNameSupplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, -1, -1));

        txtDesSupplies.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtDesSupplies.setBorder(null);
        jPanel3.add(txtDesSupplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 490, 30));

        lblDesSupplies.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblDesSupplies.setForeground(new java.awt.Color(204, 102, 11));
        lblDesSupplies.setText("Descripción:");
        jPanel3.add(lblDesSupplies, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 490, 20));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 70, 490, 20));

        jSeparator3.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 490, 20));

        cBoxPizzaI.setBackground(new java.awt.Color(204, 102, 11));
        cBoxPizzaI.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        cBoxPizzaI.setForeground(new java.awt.Color(204, 102, 11));
        cBoxPizzaI.setBorder(null);
        cBoxPizzaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cBoxPizzaIActionPerformed(evt);
            }
        });
        jPanel3.add(cBoxPizzaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 340, 30));

        lblPreSupplies1.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblPreSupplies1.setForeground(new java.awt.Color(204, 102, 11));
        lblPreSupplies1.setText("Costo:");
        jPanel3.add(lblPreSupplies1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        lblPrePorPorcion.setFont(new java.awt.Font("Roboto", 1, 20)); // NOI18N
        lblPrePorPorcion.setForeground(new java.awt.Color(204, 102, 11));
        lblPrePorPorcion.setText("Precio por porción:");
        jPanel3.add(lblPrePorPorcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 220, -1, -1));

        txtPrePorPorcion.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
        txtPrePorPorcion.setBorder(null);
        txtPrePorPorcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrePorPorcionActionPerformed(evt);
            }
        });
        txtPrePorPorcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrePorPorcionKeyTyped(evt);
            }
        });
        jPanel3.add(txtPrePorPorcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 220, 450, 30));

        jSeparator4.setForeground(new java.awt.Color(0, 0, 0));
        jPanel3.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 450, 20));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 730, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 540, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnAddSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnAddSupActionPerformed
        SuppliesModel newSupp = new SuppliesModel();
        String cbPizza = (String)cBoxPizzaI.getSelectedItem();
        String txtNameSup = txtNameSupplies.getText();
        String txtPreSup = txtPreSupplies.getText();
        String txtDesSup = txtDesSupplies.getText();
        String txtPp = txtPrePorPorcion.getText();
        String esONo = (String)cBoxPizzaI.getSelectedItem();
        
        if(!cbPizza.equals("Seleccione uno...") && 
           !esONo.equals("Seleccione uno...") &&
           (!txtNameSup.isEmpty() || !txtNameSup.isBlank())&&
           (!txtPreSup.isEmpty() || !txtPreSup.isBlank()) &&
           (!txtDesSup.isEmpty() || !txtDesSup.isBlank()) &&
           (!txtPp.isEmpty() || !txtPp.isBlank())
           ){     
             newSupp.NombreInsumo = txtNameSupplies.getText();
             newSupp.PrecioI = txtPreSupplies.getText();
             newSupp.descripcionI = txtDesSupplies.getText();
             newSupp.PrecioPorcion = Double.parseDouble(txtPrePorPorcion.getText());
             
             newSupp.EsIngrediente = false;
            
                if(esONo.equals("1-Si")){
                    newSupp.EsIngrediente = true;
                }

                if(editing)
                {
                    newSupp.idInsumos = Integer.parseInt(txtIdSupplies.getText());
                }

                boolean correct = InsertSupplies(newSupp, editing);

                if(correct)
                {
                    JOptionPane.showMessageDialog(null, "El insumo se guardo correctamente.");
                    super.dispose();
                }
        }
        else {            
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios.");
        }
    }//GEN-LAST:event_BtnAddSupActionPerformed

    private void BtnCancelSupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnCancelSupActionPerformed
        super.dispose();
    }//GEN-LAST:event_BtnCancelSupActionPerformed

    private void txtPreSuppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPreSuppliesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPreSuppliesActionPerformed

    private void txtNameSuppliesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameSuppliesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameSuppliesActionPerformed

    private void txtNameSuppliesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNameSuppliesFocusGained
     
    }//GEN-LAST:event_txtNameSuppliesFocusGained

    private void cBoxPizzaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cBoxPizzaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cBoxPizzaIActionPerformed

    private void txtPrePorPorcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrePorPorcionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtPrePorPorcionActionPerformed

    private void txtPrePorPorcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrePorPorcionKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtPrePorPorcionKeyTyped

    private void txtPreSuppliesKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPreSuppliesKeyTyped
        // TODO add your handling code here:
         int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtPreSuppliesKeyTyped

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
            java.util.logging.Logger.getLogger(CreateSuppliesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateSuppliesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateSuppliesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateSuppliesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreateSuppliesView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnAddSup;
    private javax.swing.JButton BtnCancelSup;
    private javax.swing.JComboBox<String> cBoxPizzaI;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel lblDesSupplies;
    private javax.swing.JLabel lblForPizza;
    private javax.swing.JLabel lblNameSupplies;
    private javax.swing.JLabel lblPrePorPorcion;
    private javax.swing.JLabel lblPreSupplies1;
    private javax.swing.JLabel lblTituloSupp;
    private javax.swing.JTextField txtDesSupplies;
    private javax.swing.JTextField txtIdSupplies;
    private javax.swing.JTextField txtNameSupplies;
    private javax.swing.JTextField txtPrePorPorcion;
    private javax.swing.JTextField txtPreSupplies;
    // End of variables declaration//GEN-END:variables

}
