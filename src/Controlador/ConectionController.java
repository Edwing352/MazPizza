/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase controlador para la conección con base de datos
Fecha: 15/09/2022
 */
package Controlador;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

//Conección
public class ConectionController{
    public static final String URL = "jdbc:mysql://localhost:3306/mazpizza"; //Dirección de la base de datos
    public static final String USERNAME = "rinrinUser2";
    public static final String PASSWORD = "intro.123"; 
    
    /**
     *
     */
    public ConectionController() {
    }
    //Conección con la base de datos
    public static Connection getConection()
    {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = (Connection)DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            return con;
            
        } catch (Exception ex) {
            System.out.println(ex);
            return con;
        }        
    }
}

