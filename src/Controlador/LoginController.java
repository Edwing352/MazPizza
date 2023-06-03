/*
Nombre: Edwing Ricardo Rochin López
Fecha:15/09/2022
Descripción: Clase controlador para el login
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Edwin
 */
public class LoginController {
    
    private ConectionController mysql = new ConectionController();
    
    public LoginController() {
    } 
    //Metodo loguear 
    public static int Loguear(String UserName, String Password) {
        Connection conexionn = ConectionController.getConection();
        int correct = 0;
        
        try{
            PreparedStatement ps;
            ResultSet res;
            
            ps = conexionn.prepareStatement("Select idEmpleado, NombreUsuario, Password, Puesto_IdPuesto From empleado where NombreUsuario ='"+UserName+"' limit 1");
            res = ps.executeQuery();
            
            if(res.next())
            {
                if(res.getString("Password").equals(Password))
                {
                    correct = res.getInt("idEmpleado");
                }
            }
            else
            {
                correct = 0;
            }
            
            conexionn.close();
            
        }catch(SQLException ex){
            correct = 0;            
        }
        
        return correct;
    }    
}