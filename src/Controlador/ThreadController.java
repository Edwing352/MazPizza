/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase controlador para metodo de hilos
Fecha: 15/09/2022
 */
package Controlador;

import static Controlador.OrderController.GetOrdes;
import Modelo.OrderModel;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Edwin
 */
//Implementación
public class ThreadController implements Runnable {
    
    public static void ThreadController() {
        ThreadController h1 = new ThreadController();
        
        Thread t1 = new Thread(h1, "UpdateComanda");
        
        t1.start();
    }

    @Override
    public void run() {   
        while(true)
        {
            try{
                Thread.sleep(40000);//Asignación del tiempo para los estatus
                ArrayList<OrderModel> om = GetOrdes();
                String newStatus = "Nuevo";

                for(OrderModel o : om)
                {                    
                    switch (o.Estatus) {
                        case "Nuevo":
                            newStatus = "Cocinando";
                            break;
                        case "Cocinando":
                            newStatus = "Entregado";
                            break;
                        case "Entregado":
                            newStatus = "Vendido";
                            break;
                        default:
                            newStatus = "Terminado";
                            break;
                    }
                    
                    String sql = "UPDATE comanda SET Estatus = ? WHERE idComanda = ?";

                    java.sql.Connection conexionn = ConectionController.getConection();

                    try{
                        PreparedStatement pst = conexionn.prepareStatement(sql);
                        pst.setString(1,newStatus);
                        pst.setInt(2,o.idComanda);        

                        pst.execute();

                    }catch(SQLException e){
                        System.err.println(e);
                    }
                    
                }
            }
            catch(InterruptedException e){
                System.out.println("Ocurrio un error");
            } 
        }
    }
    
}
