/*
Nombre: Edwing Ricardo Rochin López
Descripción: Clase controlador para empleados
Fecha: 15/09/2022
 */
package Controlador;

import Modelo.EmployeeModel;
import Modelo.PositionModel;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Edwin
 */
public class EmployeesController extends PositionModel{
    private ConectionController mysql = new ConectionController();
    
    public EmployeesController() {
    }  
    //Método para obtener los datos de los empleados
    public static ArrayList<EmployeeModel> GetEmployees(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<EmployeeModel> employeeList = new ArrayList();
        String sql = "SELECT * FROM empleado AS E INNER JOIN puesto AS P ON E.Puesto_idPuesto = idPuesto where Estatus != 'Eliminado' order by E.idEmpleado asc";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                EmployeeModel employee = new EmployeeModel();
                
                employee.idEmpleado = rs.getInt("idEmpleado"); 
                employee.NombreEmp = rs.getString("NombreEmp");
                employee.CalleNumero = rs.getString("CalleNumero");
                employee.NumeroSS = rs.getString("NumeroSS");
                employee.Colonia = rs.getString("Colonia");
                employee.NombreUsuario = rs.getString("NombreUsuario");
                employee.Password = rs.getString("Password");
                employee.idPuesto = rs.getInt("idPuesto");
                employee.NombreP = rs.getString("NombreP");

                employeeList.add(employee);
            }
            
            return employeeList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Metodo para comprobar la existencia de los empleados
    public static EmployeeModel existsEmployees(int idEmployee){
        Connection conexionn = ConectionController.getConection();
        String sql = "SELECT * FROM empleado AS E INNER JOIN puesto AS P ON E.Puesto_idPuesto = idPuesto WHERE Estatus != 'Eliminado' AND idEmpleado = ? limit 1;";
        EmployeeModel employee = new EmployeeModel();
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setInt(1,idEmployee);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                employee.idEmpleado = rs.getInt("idEmpleado"); 
                employee.NombreEmp = rs.getString("NombreEmp");
                employee.CalleNumero = rs.getString("CalleNumero");
                employee.NumeroSS = rs.getString("NombreUsuario");
                employee.Colonia = rs.getString("Colonia");
                employee.Password = rs.getString("Password");
                employee.NombreUsuario = rs.getString("NombreUsuario");
                employee. idPuesto = rs.getInt("idPuesto");
                employee.NombreP = rs.getString("NombreP");
            }
            
            return employee;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Metodo para obtener los datos de las posiciones(puestos)
    public static ArrayList<PositionModel> GetPositions(){
        Connection conexionn = ConectionController.getConection();
        ArrayList<PositionModel> positionList = new ArrayList();
        String sql = "SELECT * FROM puesto";
        
        try{
            PreparedStatement pst = conexionn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            
            while (rs.next()) {
                PositionModel position = new PositionModel();
                
                position.idPuesto = rs.getInt("idPuesto"); 
                position.NombreP = rs.getString("NombreP");
                position.Salario = rs.getInt("Salario");

                positionList.add(position);
            }
            
            return positionList;
        }catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
    //Método para insertar datos a los empleados
    public static boolean InsertEmployees(EmployeeModel employee, boolean editing){        
        boolean result = false;
        String sql = "INSERT INTO empleado(NombreEmp, CalleNumero, NumeroSS, Colonia, FechaContrato, NombreUsuario, Password, Puesto_IdPuesto) VALUES (?,?,?,?,?,?,?,?)";
        
        if(editing){
            sql = "UPDATE empleado SET NombreEmp = ?, CalleNumero = ?, NumeroSS = ? , Colonia = ?, FechaContrato = ?, NombreUsuario = ?, Password =?, Puesto_IdPuesto = ? WHERE idEmpleado = ?";
        }
        
        Connection conexionn = ConectionController.getConection();
        Calendar calendar = Calendar.getInstance();
        Date dateObj = calendar.getTime();
        
        try{
            Date date = new Date();
            long timeInMilliSeconds = date.getTime();
            java.sql.Date date1 = new java.sql.Date(timeInMilliSeconds);
            
            PreparedStatement pst = conexionn.prepareStatement(sql);
            pst.setString(1,employee.NombreEmp);
            pst.setString(2,employee.CalleNumero);
            pst.setString(3,employee.NumeroSS);
            pst.setString(4,employee.Colonia);
            pst.setDate(5, date1);
            pst.setString(6,employee.NombreUsuario);
            pst.setString(7,employee.Password);
            pst.setInt(8, employee.idPuesto);
            
            if(editing)
            {
                pst.setInt(9,employee.idEmpleado);
            }            
            
            pst.execute();
            result = true;
        }catch(SQLException e){
            System.err.println(e);
            result = false;
        }
    
        return result;
    }
    //Método para eliminar datos de los empleados
    public static boolean DeleteEmployees(int idEmployee){
        boolean result = false;
        
        String sql = "Update empleado SET Estatus = 'Eliminado' WHERE idEmpleado = ?;";
        Connection conexionn = ConectionController.getConection();
        EmployeeModel employee = existsEmployees(idEmployee);
        
        if(idEmployee > 0 && employee.idEmpleado > 0)
        {
            try{
                PreparedStatement pst = conexionn.prepareStatement(sql);
                pst.setInt(1,idEmployee);
                pst.execute();
                pst.close();
                result = true;
            }catch(SQLException e){
                System.err.println(e);
                result = false;
            }
        }        
        
        return result;        
    }
}
