/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.technical;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 *
 * @author Kristian
 */
public class DBHandler {
    Properties dbProp = new Properties();   
    private Connection conn;
    final private String connectorURL;
    private Statement stmt;
    private final String databaseName = "SecondhandCars";
    
    public DBHandler(){
        try{
            FileInputStream in = new FileInputStream("DB.properties");
            dbProp.load(in);
        }
        catch(IOException io){
            System.out.println("No Properties file found.");
        }
        connectorURL = "jdbc:sqlserver://localhost;instanceName="+dbProp.getProperty("instanceName")+";user="+dbProp.getProperty("user")+";password="+dbProp.getProperty("password");
    }
    
    public void connectToCarDatabase(){
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
    
    public void closeConnection(){
        try{
            conn.close();
        }
        catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
    
    public void createStatement(){
        try{
            stmt = conn.createStatement();
        }
        catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
    
    public ResultSet getAllCarsInStock() throws SQLException{
        connectToCarDatabase();
        createStatement();
        ResultSet rs = stmt.executeQuery("USE " + databaseName + " SELECT * FROM getCarsInStock");
        return rs;
    }
    
    public ResultSet getSoldCars() throws SQLException{
        connectToCarDatabase();
        createStatement();
        ResultSet rs = stmt.executeQuery("USE " + databaseName + " SELECT * FROM getSoldCars");
        return rs;
    }
}