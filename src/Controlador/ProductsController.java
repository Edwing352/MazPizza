/*
 Nombre: Edwing Ricardo Rochin López
Descripción: Clase controlador para productos
Fecha: 15/09/2022
 */
package Controlador;

import Modelo.ProductsModel;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductsController {
    private ConectionController mysql = new ConectionController();
    
    public ProductsController() {
    }  
    //Método para obtener los datos de los productos
    public static ArrayList<ProductsModel> GetProduct(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<ProductsModel> productsList = new ArrayList();
        String sql = "SELECT * FROM productos";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                ProductsModel product = new ProductsModel();
                
                product.idProductos = rs.getInt("idProductos"); 
                product.NombreProducto = rs.getString("NombreProducto");
                product.Descripcion = rs.getString("Descripcion");
                product.PrecioProducto = rs.getDouble("PrecioProducto");
                
                productsList.add(product);
            }
            
            return productsList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para comprobar la existencia de los productos
    public static ProductsModel existsProduct(int idProduct){
        Connection conexionn = ConectionController.getConection();
        String sql = "SELECT * FROM productos WHERE idProductos = ? limit 1;";
        ProductsModel product = new ProductsModel();
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setInt(1,idProduct);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                product.idProductos = rs.getInt("idProductos"); 
                product.NombreProducto = rs.getString("NombreProducto");
                product.Descripcion = rs.getString("Descripcion");
                product.PrecioProducto = rs.getDouble("PrecioProducto");
            }
            
            return product;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para insertar datos a los productos
    public static boolean InsertProduct(ProductsModel product, boolean editing){        
        boolean result = false;
        String sql = "INSERT INTO productos(NombreProducto, Descripcion, PrecioProducto) VALUES (?,?,?)";
        
        if(editing){
            sql = "UPDATE productos SET NombreProducto = ?, Descripcion = ?, PrecioProducto = ?  WHERE idProductos = ?";
        }
        
        Connection conexionn = ConectionController.getConection();
        
        try{
          
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setString(1,product.NombreProducto);
            pst.setString(2,product.Descripcion);
            pst.setDouble(3,product.PrecioProducto);
            
            if(editing)
            {
                pst.setInt(4,product.idProductos);
            }            
            
            pst.execute();
            result = true;
        }catch(SQLException e){
            System.err.println(e);
            result = false;
        }
    
        return result;
    }
    //Método para eliminar productos
    public static boolean DeleteProduct(int idProduct){
        boolean result = false;
        
        String sql = "DELETE FROM productos WHERE idProductos = ?;";
        Connection conexionn = ConectionController.getConection();
        ProductsModel product = existsProduct(idProduct);
        
        if(idProduct > 0 && product.idProductos > 0)
        {
            try{
                PreparedStatement pst = conexionn.prepareStatement(sql);
                pst.setInt(1,idProduct);
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
