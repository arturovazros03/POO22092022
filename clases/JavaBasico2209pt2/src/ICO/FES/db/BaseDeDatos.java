/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ICO.FES.db;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author luisyuyots
 */
public class BaseDeDatos {
    
    String dbPath;
    private Connection conexion;
    private static BaseDeDatos instanciaUnica;
 
    private BaseDeDatos() {
        try {
            String url = "jdbc:sqlite:" + System.getProperty("user.dir") + "/poo2022.db";
            conexion = DriverManager.getConnection(url);
            System.out.println("Conexión establecida...");
 
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
 
    public static BaseDeDatos getInstance(){
        if(instanciaUnica == null){
            instanciaUnica = new BaseDeDatos(); // llamada al constructor
        }else{
            System.out.println("El ejemplar ya existe!");
        }
        return instanciaUnica;
    }
 
    public Connection getConexion() {
        return conexion;
    }
 
    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }
    
    public static void main(String[] args) {
        
        try {
            Statement stm = BaseDeDatos.getInstance().getConexion().createStatement();
            ResultSet rst = stm.executeQuery("SELECT * FROM prueba1;");//guarda el registro de una consulta
            
            while(rst.next()){
                System.out.print("Nombre: " + rst.getString(1));
                System.out.println(" Telefono: " + rst.getNString(2));
            }
        
        } catch (SQLException ex) {
            
        }
    }
}
