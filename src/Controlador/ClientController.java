/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase controlador para clientes
Fecha: 15/09/2022
 */
package Controlador;

import Modelo.ClientModel;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Edwin
 */
public class ClientController {
      private ConectionController mysql = new ConectionController();
    
    public ClientController() {
    }  
    //Método para obtener los datos de los clientes
    public static ArrayList<ClientModel> GetClient(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<ClientModel> clientList = new ArrayList();
        String sql = "SELECT * FROM cliente WHERE Estatus != 'Eliminado'";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                ClientModel cliente = new ClientModel();
                
                cliente.idCliente = rs.getInt("idCliente"); 
                cliente.NombreCli = rs.getString("NombreCli");
                cliente.RFC = rs.getString("RFC");    
                cliente.CorreoCliente = rs.getString("CorreoCliente"); 
                cliente.TelefonoCliente = rs.getString("TelefonoCliente");
                cliente.DireccionCliente = rs.getString("DireccionCliente");

                clientList.add(cliente);
            }
            
            return clientList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para comprobar la existencia de los clientes
    public static ClientModel existsClient(int idClient){
        Connection conexionn = ConectionController.getConection();
        String sql = "SELECT * FROM cliente WHERE idCliente = ? limit 1;";
        ClientModel client = new ClientModel();
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setInt(1,idClient);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                client.idCliente = rs.getInt("idCliente"); 
                client.NombreCli = rs.getString("NombreCli");
                client.RFC = rs.getString("RFC"); 
                client.CorreoCliente = rs.getString("CorreoCliente"); 
                client.TelefonoCliente = rs.getString("TelefonoCliente");
                client.DireccionCliente = rs.getString("DireccionCliente"); 
            }
            
            return client;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para insertar datos de los clientes
    public static boolean InsertClient(ClientModel client, boolean editing){        
        boolean result = false;
        String sql = "INSERT INTO cliente(NombreCli, RFC, CorreoCliente, TelefonoCliente, DireccionCliente) VALUES (?,?,?,?,?)";
        
        if(editing){
            sql = "UPDATE cliente SET NombreCli = ?, RFC = ?, CorreoCliente = ?, TelefonoCliente = ?, DireccionCliente = ? WHERE idCliente = ?";
        }
        
        Connection conexionn = ConectionController.getConection();
        
        try{ 
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setString(1,client.NombreCli);
            pst.setString(2,client.RFC);
            pst.setString(3,client.CorreoCliente);
            pst.setString(4,client.TelefonoCliente);
            pst.setString(5,client.DireccionCliente);        
            
            if(editing)
            {
                pst.setInt(6,client.idCliente);
            }            
            
            pst.execute();
            result = true;
        }catch(SQLException e){
            System.err.println(e);
            result = false;
        }
    
        return result;
    }
    //Método para eliminar datos de los clientes
    public static boolean DeleteClient(int idClient){
        boolean result = false;
        
        String sql = "UPDATE cliente SET Estatus = 'Eliminado'  WHERE idCliente = ?;";
        Connection conexionn = ConectionController.getConection();
        ClientModel client = existsClient(idClient);
        
        if(idClient > 0 && client.idCliente > 0)
        {
            try{
                PreparedStatement pst = conexionn.prepareStatement(sql);
                pst.setInt(1,idClient);
                pst.execute();
                pst.close();
                result = true;
            }catch(SQLException e){
                System.err.println(e);
                result = false;
            }
        }        
        
        return result;        
    }
    
}
