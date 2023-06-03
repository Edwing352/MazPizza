/*
Nombre: Edwing Ricardo Rochin Lopez
Descripción: Clase para agregar clientes
Fecha: 15/09/2022
 */
package Vista;

import static Controlador.ClientController.DeleteClient;
import static Controlador.ClientController.GetClient;
import static Controlador.ClientController.existsClient;
import Modelo.ClientModel;
import com.mysql.cj.util.StringUtils;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Edwin
 */
public class ClientView extends javax.swing.JPanel {

    /**
     * Creates new form ClientView
     */
DefaultTableModel modelo = new DefaultTableModel();
JTable tabla = new JTable(modelo);
    
    public ClientView() {
        initComponents();
        
        GetData();
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
        btnUpd = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        grdClient = new javax.swing.JTable();
        txtIdCliente = new javax.swing.JTextField();
        btnDeleteClient = new javax.swing.JButton();
        btnUpdateClient = new javax.swing.JButton();
        btnAddClient = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblTituloCli = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 490));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnUpd.setBackground(new java.awt.Color(204, 102, 11));
        btnUpd.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnUpd.setForeground(new java.awt.Color(255, 255, 255));
        btnUpd.setText("Actualizar");
        btnUpd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpd, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 100, 30));

        grdClient.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        grdClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        grdClient.setSelectionBackground(new java.awt.Color(204, 102, 11));
        jScrollPane1.setViewportView(grdClient);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 650, 360));

        txtIdCliente.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        txtIdCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdClienteActionPerformed(evt);
            }
        });
        txtIdCliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdClienteKeyTyped(evt);
            }
        });
        jPanel1.add(txtIdCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 150, 30));

        btnDeleteClient.setBackground(new java.awt.Color(204, 102, 11));
        btnDeleteClient.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnDeleteClient.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteClient.setText("Eliminar");
        btnDeleteClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteClientActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, 100, 30));

        btnUpdateClient.setBackground(new java.awt.Color(204, 102, 11));
        btnUpdateClient.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnUpdateClient.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdateClient.setText("Editar");
        btnUpdateClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateClientActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdateClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 60, 100, 30));

        btnAddClient.setBackground(new java.awt.Color(204, 102, 11));
        btnAddClient.setFont(new java.awt.Font("Roboto", 1, 14)); // NOI18N
        btnAddClient.setForeground(new java.awt.Color(255, 255, 255));
        btnAddClient.setText("Agregar");
        btnAddClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddClientActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddClient, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 100, 30));

        jPanel2.setBackground(new java.awt.Color(204, 102, 11));

        lblTituloCli.setFont(new java.awt.Font("Roboto", 1, 18)); // NOI18N
        lblTituloCli.setForeground(new java.awt.Color(255, 255, 255));
        lblTituloCli.setText("Apartado de Clientes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(lblTituloCli)
                .addContainerGap(462, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(lblTituloCli)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void btnUpdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdActionPerformed
        modelo = new DefaultTableModel();
        grdClient.setModel(modelo);
        
        GetData();
    }//GEN-LAST:event_btnUpdActionPerformed

    public void GetData(){
        //Obtención de datos
        ArrayList<ClientModel> clientList = GetClient();
        grdClient.setModel(modelo);
        
        modelo.addColumn("Id");
        modelo.addColumn("Nombre");
        modelo.addColumn("RFC");
        modelo.addColumn("Correo");
        modelo.addColumn("Telefono");
        modelo.addColumn("Dirección");
        
        for(ClientModel cli: clientList)
            {
                 Object[] filas2 = new Object[6];
                 filas2[0] = cli.idCliente;
                 filas2[1] = cli.NombreCli;
                 filas2[2] = cli.RFC;
                 filas2[3] = cli.CorreoCliente;
                 filas2[4] = cli.TelefonoCliente;
                 filas2[5] = cli.DireccionCliente;
                 
                 modelo.addRow(filas2);
            }
    }
    
    private void txtIdClienteKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyPressed

    }//GEN-LAST:event_txtIdClienteKeyPressed

    private void btnDeleteClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteClientActionPerformed
        //Eliminación del cliente
        int idClient = Integer.parseInt(txtIdCliente.getText());

        boolean corret = DeleteClient(idClient);

        if(corret)
        {
            JOptionPane.showMessageDialog(null, "Se elimino el IdCliente " +idClient+ "correctamente.");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El cliente no existe, intentelo de nuevo.");
        }
    }//GEN-LAST:event_btnDeleteClientActionPerformed

    private void btnUpdateClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateClientActionPerformed
        //Edición de los datos
        int idClient = 0;

        if(!StringUtils.isNullOrEmpty(txtIdCliente.getText()))
        {
            idClient = Integer.parseInt(txtIdCliente.getText());

            ClientModel client = existsClient(idClient);

            if(client.idCliente == idClient){
                new CreateClientView(client).setVisible(true);
            }
            else {
                JOptionPane.showMessageDialog(null, "El cliente que intentas editar no existe, intentelo de nuevo.");
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Es necesario ingresar un idCliente para editar.");
        }
    }//GEN-LAST:event_btnUpdateClientActionPerformed

    private void btnAddClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddClientActionPerformed
        // TODO add your handling code here:
        new CreateClientView().setVisible(true);
    }//GEN-LAST:event_btnAddClientActionPerformed

    private void txtIdClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdClienteActionPerformed

    private void txtIdClienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdClienteKeyTyped
        //Validar que solo ea posible el ingreso de numeros
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;

        if (!numeros)
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtIdClienteKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddClient;
    private javax.swing.JButton btnDeleteClient;
    private javax.swing.JButton btnUpd;
    private javax.swing.JButton btnUpdateClient;
    private javax.swing.JTable grdClient;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloCli;
    private javax.swing.JTextField txtIdCliente;
    // End of variables declaration//GEN-END:variables
}