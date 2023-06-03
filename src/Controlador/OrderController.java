/*
 Nombre: Edwing Ricardo Rochin López
Descripción: Clase controlador para Ordenes
Fecha: 15/09/2022
 */
package Controlador;

import Modelo.ClientModel;
import Modelo.EmployeeModel;
import Modelo.OrderCreateModel;
import Modelo.OrderModel;
import Modelo.PositionModel;
import Modelo.ProductsModel;
import Modelo.SuppliesModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Edwin
 */
public class OrderController {
    //Método para obtener los datos de las comandas
     public static ArrayList<OrderModel> GetOrdes(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<OrderModel> orderList = new ArrayList();
        String sql = "SELECT * FROM comanda as C  "
                    +"inner join Empleado as E on C.Empleado_idEmpleado = E.idEmpleado "
                    +"inner join Cliente as CL on C.Cliente_idCliente = idCliente "
                    + " where  C.Estatus != 'final' order by idComanda desc";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                OrderModel order = new OrderModel();
                
                order.idComanda = rs.getInt("idComanda"); 
                order.Hora = rs.getString("Hora");
                order.Fecha = rs.getString("Fecha");
                order.Cliente_idCliente = rs.getInt("Cliente_idCliente");
                order.Empleado_idEmpleado = rs.getInt("Empleado_idEmpleado");
                order.NombreCli = rs.getString("NombreCli");
                order.NombreEmp = rs.getString("NombreEmp");
                order.Estatus = rs.getString("Estatus");
                order.Valor = rs.getDouble("Valor");

                orderList.add(order);
            }
            
            return orderList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
     //MetodoPara obtener la ultima comanda
     public int GetLastOrder(){
        Connection conexionn = ConectionController.getConection();
        String sql = "SELECT MAX(idComanda) FROM comanda";
        int idComanda = 0;
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                
                idComanda = rs.getInt("idComanda");
            }
            
            return idComanda;
        }catch(SQLException e){
            System.err.println(e);
            return 0;
        }
    }
     
    //Metodo para obtener los datos de los clientes
    public static ArrayList<ClientModel> GetClients(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<ClientModel> clientList = new ArrayList();
        String sql = "SELECT * FROM cliente";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                ClientModel client = new ClientModel();
                
                client.idCliente = rs.getInt("idCliente"); 
                client.NombreCli = rs.getString("NombreCli");
                client.RFC = rs.getString("RFC");

                clientList.add(client);
            }
            
            return clientList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para obtener los datos de los productos
    public static ArrayList<ProductsModel> GetProducts(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<ProductsModel> productList = new ArrayList();
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

                productList.add(product);
            }
            
            return productList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para obtener los datos de los precios
    public static double GetPrice(int idProduct){
        Connection conexionn = ConectionController.getConection();
        double price = 0;
        String sql = "SELECT PrecioProducto FROM productos where idProductos = ? limit 1;";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setInt(1,idProduct);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                price = rs.getInt("PrecioProducto"); 
            }           
            
            return price;
        }catch(SQLException e){
            System.err.println(e);
            return 0;
        }
    }
    //Métodos para obtener los precios de los insumos
    public static double GetPriceSupply(int idSupply){
        Connection conexionn = ConectionController.getConection();
        double price = 0;
        String sql = "SELECT PrecioPorcion FROM insumos where idInsumos = ? limit 1;";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setInt(1,idSupply);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                price = rs.getInt("PrecioPorcion"); 
            }           
            
            return price;
        }catch(SQLException e){
            System.err.println(e);
            return 0;
        }
    }
    //Metodo para obtener los datos de los insumos
    public static ArrayList<SuppliesModel> GetSupplies(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<SuppliesModel> supplyList = new ArrayList();
        String sql = "SELECT * FROM insumos where EsIngrediente = 1";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                SuppliesModel supply = new SuppliesModel();
                
                supply.idInsumos = rs.getInt("idInsumos"); 
                supply.NombreInsumo = rs.getString("NombreInsumo");
                supply.PrecioI = rs.getString("PrecioI");
                supply.descripcionI = rs.getString("descripcionI");
                supply.PrecioPorcion = rs.getDouble("PrecioPorcion");
                supply.EsIngrediente = rs.getBoolean("EsIngrediente");

                supplyList.add(supply);
            }
            
            return supplyList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para insertar datos en las comandas
    public static boolean InsertOrders(ArrayList<OrderCreateModel> orderList, int idEmployee, double total){        
       boolean result = false;
       
       String sql = "INSERT INTO comanda (Hora, Fecha, Cliente_IdCliente, Empleado_idEmpleado, Estatus, Valor) VALUES (?,?,?,?,?,?)";
       
       String queryComProd = "INSERT INTO comanda_has_productos (Comanda_idComanda, Productos_idProductos ) VALUES (?,?)";
        
        Connection conexionn = ConectionController.getConection();
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        
        try{
            Date date = new Date();
            long timeInMilliSeconds = date.getTime();
            java.sql.Time hour = new java.sql.Time(timeInMilliSeconds);
            java.sql.Date date1 = new java.sql.Date(timeInMilliSeconds);
            
            String position = "";
            for(OrderCreateModel i : orderList){
                position = i.Cliente;
                break;
            }
            
            String[] parts = position.split("-");
            int idCliente = Integer.parseInt(parts[0]) ;
            
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setTime(1,hour);
            pst.setDate(2,date1);
            pst.setInt(3,idCliente);
            pst.setInt(4,idEmployee);
            pst.setString(5, "Nuevo");
            pst.setDouble(6,total);
            
            pst.execute();
            result = true;
            conexionn.close();
        }catch(SQLException e){
            System.err.println(e);
            result = false;
        }
        
        
        
        try{
            
            conexionn = ConectionController.getConection();
            String sqlMax = "SELECT MAX(idComanda) as idComanda FROM comanda";
            int idComanda = 0;

            try{
                PreparedStatement pst = conexionn.prepareStatement(sqlMax);
                ResultSet rs = pst.executeQuery();

                while (rs.next()) {
                    idComanda = rs.getInt("idComanda");
                }
                
                conexionn.close();
            }catch(SQLException e){
                System.err.println(e);
            }
            
            for(OrderCreateModel ord : orderList){
                String[] parts = ord.Producto.split("-");
                int idProducto = Integer.parseInt(parts[0]) ;
                
                conexionn = ConectionController.getConection();
                PreparedStatement pst = conexionn.prepareStatement(queryComProd);
                pst.setInt(1,idComanda);
                pst.setInt(2,idProducto);

                pst.execute();
            }
            
            result = true;
        }catch(SQLException e){
            System.err.println(e);
            result = false;
        }
    
        return result;
    } 
   //Método para comprobar la existencia de la comanda
    public static OrderModel existsOrder(int idOrder){
        Connection conexionn = ConectionController.getConection();
        OrderModel order = new OrderModel();
        String sql = "SELECT * FROM Comanda where idComanda =? limit 1;";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setInt(1,idOrder);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                order.idComanda = rs.getInt("idComanda"); 
                order.Hora = rs.getString("Hora");
                order.Fecha = rs.getString("Fecha");
                order.Cliente_idCliente = rs.getInt("Cliente_idCliente");
                order.Empleado_idEmpleado = rs.getInt("Empleado_idEmpleado");
                order.Estatus = rs.getString("Estatus");
                order.Valor = rs.getDouble("Valor");
            }
            
            return order;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }    
    
    //Método para eliminar los datos de la comanda
    public static boolean DeleteOrder(int idOrder){
        boolean result = false;
        
        String sql = "Update comanda set Estatus ='final' where idComanda = ?;";
        Connection conexionn = ConectionController.getConection();
         OrderModel order = existsOrder(idOrder);
        
        if(idOrder > 0 && order.idComanda > 0)
        {
            try{
                PreparedStatement pst = conexionn.prepareStatement(sql);
                pst.setInt(1,idOrder);
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
