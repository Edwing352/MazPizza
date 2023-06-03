/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase para la posición del usuario
Fecha: 15/09/2022
 */
package Modelo;

/**
 *
 * @author Edwin
 */
public class PositionModel {
    //Declaración de los objetos de los campos de la tabla puesto
    public int idPuesto = 0;
    public String NombreP = "";
    public int Salario = 0;
    
    //Métdos set y get de los objetos
     public int getIdPuesto (){
        return idPuesto;
    }
     
    public void setIdPuesto (int idPuesto){
        this.idPuesto = idPuesto;
    }
    
    public String getNombreP (){
        return NombreP;
    }

    public void setNombreP (String NombreP){
        this.NombreP = NombreP;
    }
    
    public int getSalario (){
        return Salario;
    }

    public void setSalario(int Salario){
        this.Salario = Salario;
    }
}
