/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase Modelo para los clientes
Fecha: 15/09/2022
 */
package Modelo;

/**
 *
 * @author Edwin
 */
public class ClientModel {
    //Declaración de los objetos de los campos de la tabla clientes
    public int idCliente = 0;
    public String NombreCli = "";
    public String RFC = "";
    public String CorreoCliente = "";
    public String TelefonoCliente = "";
    public String DireccionCliente = "";
    
    //Métdos set y get de los objetos
     public int getIdCliente (){
        return idCliente;
    }
     
    public void setIdEmpleado (int idCliente){
        this.idCliente = idCliente;
    }
    
    public String getNombreCli (){
        return NombreCli;
    }

    public void setNombreCli (String NombreCli){
        this.NombreCli = NombreCli;
    }
    
    public String getRFC (){
        return RFC;
    }

    public void setRFC(String RFC){
        this.RFC = RFC;
    }
    
     public String getCorreoCliente (){
        return CorreoCliente;
    }

    public void setCorreoCliente(String CorreoCliente){
        this.CorreoCliente = CorreoCliente;
    }
    
     public String getTelefonoCliente (){
        return TelefonoCliente;
    }

    public void setTelefonoCliente(String TelefonoCliente){
        this.TelefonoCliente = TelefonoCliente;
    }
    
     public String getDireccionCliente (){
        return DireccionCliente;
    }

    public void setDireccionCliente(String RFC){
        this.DireccionCliente = DireccionCliente;
    }
}
