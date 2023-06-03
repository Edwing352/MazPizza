/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase Modelo para la creación de Ordenes
Fecha: 15/09/2022
 */
package Modelo;

/**
 *
 * @author Edwin
 */
public class OrderCreateModel {
    public String Cliente = "";
    public String Producto = "";
    public String Ingrediente1 = "";
    public String Ingrediente2 = "";
    public String Ingrediente3 = "";
    public int Cantidad = 0;
    public double ValorProducto = 0;
    
    
    public String getCliente (){
        return Cliente;
    }

    public void setCliente(String Cliente){
        this.Cliente = Cliente;
    }
    
    public String getProducto (){
        return Producto;
    }

    public void setProducto(String Producto){
        this.Producto = Producto;
    }  
    
    public String getIngrediente1 (){
        return Ingrediente1;
    }

    public void setIngrediente1(String Ingrediente1){
        this.Ingrediente1 = Ingrediente1;
    }  
    
    public String getIngrediente2 (){
        return Ingrediente2;
    }

    public void setIngrediente2(String Ingrediente2){
        this.Ingrediente2 = Ingrediente2;
    }  
    
    public String getIngrediente3 (){
        return Ingrediente3;
    }

    public void setIngrediente3(String Ingrediente3){
        this.Ingrediente3 = Ingrediente3;
    } 
    
    public double getValorProducto (){
        return ValorProducto;
    }

    public void setValorProducto(double ValorProducto){
        this.ValorProducto = ValorProducto;
    } 
    
    public double getCantidad (){
        return Cantidad;
    }

    public void setCantidad(int Cantidad){
        this.Cantidad = Cantidad;
    }  
}
