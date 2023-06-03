/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase modelo para los insumos
Fecha: 15/09/2022
 */
package Modelo;

/**
 *
 * @author Edwin
 */
public class SuppliesModel {
    //Declaración de los objetos de los campos de la tabla insumos
    public int idInsumos = 0;
    public String NombreInsumo = "";
    public String PrecioI = "";
    public String descripcionI = "";
    public double PrecioPorcion = 0;
    public boolean EsIngrediente = false;
    
    //Métdos set y get de los objetos
     public int getIdInsumos (){
        return idInsumos;
    }
     
    public void setidInsumos (int idInsumos){
        this.idInsumos = idInsumos;
    }
    
    public String getNombreInsumo (){
        return NombreInsumo;
    }

    public void setNombreInsumo (String NombreInsumo){
        this.NombreInsumo = NombreInsumo;
    }
    
    public String getPrecioI (){
        return PrecioI;
    }

    public void setPrecioI(String PrecioI){
        this.PrecioI = PrecioI;
    }
    
    public String getDescripcionI (){
        return descripcionI;
    }

    public void setDescripcionI(String descripcionI){
        this.descripcionI = descripcionI;
    }
    
    public double getPrecioPorcion (){
        return PrecioPorcion;
    }

    public void setPrecioPorcion(double PrecioPorcion){
        this.PrecioPorcion = PrecioPorcion;
    }
    
    public boolean getEsIngrediente (){
        return EsIngrediente;
    }

    public void setEsIngrediente(boolean EsIngrediente){
        this.EsIngrediente = EsIngrediente;
    }
    
}
