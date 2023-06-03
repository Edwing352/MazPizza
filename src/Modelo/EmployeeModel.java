/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase Modelo para los empleados
Fecha: 15/09/2022
 */
package Modelo;

import java.sql.Date;


public class EmployeeModel extends SuppliesModel {
    //Declaración de los objetos de los campos de la tabla empleados
    public int idEmpleado = 0;
    public String NombreEmp = "";
    public String CalleNumero = "";
    public String NombreUsuario = "";
    public String NumeroSS = "";
    public String Colonia = "";
    public String Password = "";    
    public int idPuesto = 1;
    public String NombreP = "";
    
    //Métdos set y get de los objetos
    public int getIdEmpleado (){
        return idEmpleado;
    }

    public void setIdEmpleado (int idEmpleado){
        this.idEmpleado = idEmpleado;
    }
    
    public String getNombreEmp (){
        return NombreEmp;
    }

    public void setNombreEmp (String NombreEmp){
        this.NombreEmp = NombreEmp;
    }
    
    public String getCalleNumero (){
        return CalleNumero;
    }

    public void setCalleNumero(String CalleNumero){
        this.CalleNumero = CalleNumero;
    }
    
    public String getNombreUsuario (){
        return NombreUsuario;
    }

    public void setNombreUsuario(String NombreUsuario){
        this.NombreUsuario = NombreUsuario;
    }
    
    public String getNumeroSS (){
        return NumeroSS;
    }

    public void setNumeroSS(String NumeroSS){
        this.NumeroSS = NumeroSS;
    }
    
    public String getColonia (){
        return Colonia;
    }

    public void setColonia(String Colonia){
        this.Colonia = Colonia;
    }
    
    public String getPassword (){
        return Password;
    }

    public void setPassword(String Password){
        this.Password = Password;
    }
    
    public int getIdPuesto (){
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto){
        this.idPuesto = idPuesto;
    }
    
    public String getNombreP (){
        return NombreP;
    }

    public void setNombreP(String NombreP){
        this.NombreP = NombreP;
    }
}
