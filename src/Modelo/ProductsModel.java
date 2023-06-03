/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase modelo para productos
Fecha: 15/09/2022
 */
package Modelo;


public class ProductsModel {
    //Declaración de los objetos de los campos de la tabla productos
    public int idProductos = 0;
    public String NombreProducto = "";
    public String Descripcion = "";
    public double PrecioProducto = 0;
    
    //Métdos set y get de los objetos
    public int getidProductos (){
        return idProductos;
    }

    public void setidProductos (int idProductos){
        this.idProductos = idProductos;
    }
    
    public String getNombreProducto (){
        return NombreProducto;
    }

    public void setNombreProducto (String NombreProducto){
        this.NombreProducto = NombreProducto;
    }
    
    public String getDescripcion (){
        return Descripcion;
    }

    public void setDescripcion(String Descripcion){
        this.Descripcion = Descripcion;
    }    
    
    public double getPrecioProducto (){
        return PrecioProducto;
    }

    public void setPrecioProducto(double PrecioProducto){
        this.PrecioProducto = PrecioProducto;
    }  
}
