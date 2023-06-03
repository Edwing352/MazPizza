/*
 Nombre: Edwing Ricardo Rochin López
Descripción: Clase controlador para insumos
Fecha: 15/09/2022
 */
package Controlador;

import Modelo.SuppliesModel;
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
public class SuppliesController {
    private ConectionController mysql = new ConectionController();
    
    public SuppliesController() {
    }  
    //Método para obtener datos de los insumos
    public static ArrayList<SuppliesModel> GetSupplies(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<SuppliesModel> suppliesList = new ArrayList();
        String sql = "SELECT * FROM insumos";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                SuppliesModel supplie = new SuppliesModel();
                
                supplie.idInsumos = rs.getInt("idInsumos"); 
                supplie.NombreInsumo = rs.getString("NombreInsumo");
                supplie.PrecioI = rs.getString("PrecioI");
                supplie.descripcionI = rs.getString("descripcionI");
                supplie.PrecioPorcion = rs.getDouble("PrecioPorcion");
                supplie.EsIngrediente = rs.getBoolean("EsIngrediente");
                

                suppliesList.add(supplie);
            }
            
            return suppliesList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para comprobar la existencia de insumos
    public static SuppliesModel existsSupplies(int idSupplie){
        Connection conexionn = ConectionController.getConection();
        String sql = "SELECT * FROM insumos WHERE idInsumos = ? limit 1;";
        SuppliesModel supplie = new SuppliesModel();
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setInt(1,idSupplie);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                supplie.idInsumos = rs.getInt("idInsumos"); 
                supplie.NombreInsumo = rs.getString("NombreInsumo");
                supplie.PrecioI = rs.getString("PrecioI");
                supplie.descripcionI = rs.getString("descripcionI");
                supplie.PrecioPorcion = rs.getDouble("PrecioPorcion");
                supplie.EsIngrediente = rs.getBoolean("EsIngrediente");
            }
            
            return supplie;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para insertar datos a los insumos
    public static boolean InsertSupplies(SuppliesModel supplie, boolean editing){        
        boolean result = false;
        String sql = "INSERT INTO insumos(NombreInsumo, PrecioI, descripcionI,PrecioPorcion,EsIngrediente) VALUES (?,?,?,?,?)";
        
        if(editing){
            sql = "UPDATE insumos SET NombreInsumo = ?, PrecioI = ?, descripcionI = ?, PrecioPorcion = ?, EsIngrediente = ?  WHERE idInsumos = ?";
        }
        
        Connection conexionn = ConectionController.getConection();
        
        try{
          
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setString(1,supplie.NombreInsumo);
            pst.setString(2,supplie.PrecioI);
            pst.setString(3,supplie.descripcionI);
            pst.setDouble(4,supplie.PrecioPorcion);
            pst.setBoolean(5,supplie.EsIngrediente);
            
            if(editing)
            {
                pst.setInt(6,supplie.idInsumos);
            }            
            
            pst.execute();
            result = true;
        }catch(SQLException e){
            System.err.println(e);
            result = false;
        }
    
        return result;
    }
    //Método para eliminar datos de los insumos
    public static boolean DeleteSupplies(int idSupplie){
        boolean result = false;
        
        String sql = "DELETE FROM insumos WHERE idInsumos = ?;";
        Connection conexionn = ConectionController.getConection();
        SuppliesModel supplie = existsSupplies(idSupplie);
        
        if(idSupplie > 0 && supplie.idInsumos > 0)
        {
            try{
                PreparedStatement pst = conexionn.prepareStatement(sql);
                pst.setInt(1,idSupplie);
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
