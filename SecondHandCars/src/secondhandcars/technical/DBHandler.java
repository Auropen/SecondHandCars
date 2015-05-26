/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.technical;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Kristian
 */
public class DBHandler {
    private static Connection conn;
    final private static String connectorURL = "jdbc:sqlserver://localhost;instanceName=JDBCSERVER;user=BakuBoisen;password=Blackguard3";
    private static Statement stmt;
    private static final String databaseName = "SecondhandCars";
    
    public static void connectToCarDatabase(){
        try{
            conn = DriverManager.getConnection(connectorURL);
            System.out.println("Connection SUCCESS");
        }
        catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
        try{
            conn.setAutoCommit(true);
        }
        catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
    
    public static void closeConnection(){
        try{
            conn.close();
        }
        catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
    
    public static void createStatement(){
        try{
            stmt = conn.createStatement();
        }
        catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
    
    public static ResultSet getAllCarsInStock() throws SQLException{
        connectToCarDatabase();
        createStatement();
        ResultSet rs = stmt.executeQuery("USE " + databaseName + " SELECT * FROM getCarsInStock");
        return rs;
    }
}