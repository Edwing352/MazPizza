/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase Modelo para las Ordenes
Fecha: 15/09/2022
 */
package Modelo;

public class OrderModel {
    //Declaración de los objetos de los campos de la tabla comanda
    public int idComanda = 0;
    public String Hora = "";
    public String Fecha = "";
    public int Cliente_idCliente = 0;
    public int Empleado_idEmpleado = 0;
    public String NombreCli = "";
    public String NombreEmp = "";
    public String Estatus = "";
    public double Valor = 0;

    //Métdos set y get de los objetos
    public int getIdComanda (){
        return idComanda;
    }

    public void setIdComanda (int idEmpleado){
        this.idComanda = idEmpleado;
    }
    
    public String getHora (){
        return Hora;
    }

    public void setHora (String Hora){
        this.Hora = Hora;
    }
    
    public String getFecha (){
        return Fecha;
    }

    public void setFecha(String Fecha){
        this.Fecha = Fecha;
    }    
    
    public int getCliente_idCliente (){
        return Cliente_idCliente;
    }

    public void setCliente_idCliente(int Cliente_idCliente){
        this.Cliente_idCliente = Cliente_idCliente;
    }    
    
    public int getEmpleado_idEmpleado (){
        return Empleado_idEmpleado;
    }

    public void setEmpleado_idEmpleado(int Empleado_idEmpleado){
        this.Empleado_idEmpleado = Empleado_idEmpleado;
    } 
    
    public String getNombreCli (){
        return NombreCli;
    }

    public void setNombreCli(String NombreCli){
        this.NombreCli = NombreCli;
    }    
    
    public String getNombreEmp (){
        return NombreEmp;
    }

    public void setNombreEmp(String NombreEmp){
        this.NombreEmp = NombreEmp;
    }   
    
    public String getEstatus (){
        return Estatus;
    }

    public void setEstatus(String Estatus){
        this.Estatus = Estatus;
    }    
    
    public double getValor (){
        return Valor;
    }

    public void setValor(double Valor){
        this.Valor = Valor;
    }        
}
