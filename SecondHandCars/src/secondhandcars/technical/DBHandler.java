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
import java.sql.ResultSet;
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
    
    /**
     * Attempts creating a connection to the database.
     */
    public void connectToCarDatabase(){
        try{
            conn = DriverManager.getConnection(connectorURL);
            System.out.println("Connection SUCCESS");
            conn.setAutoCommit(true);
        }
        catch(SQLException e){
            System.out.println("SQLException: " + e.getMessage());
            System.out.println("SQLState: " + e.getSQLState());
            System.out.println("VendorError: " + e.getErrorCode());
        }
    }
    
    /**
     * Attempts closing the connection to the database
     */
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
    
    /**
     * Creates a statement for the database
     */
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
    
    /**
     * Gets all the cars that are in stock from the database
     * @return a ResultSet of the cars in stock
     */
    public ResultSet getAllCarsInStock() {
        connectToCarDatabase();
        createStatement();
        ResultSet rs = null;
        
        try {
            rs = stmt.executeQuery("USE " + databaseName + " SELECT * FROM getCarsInStock");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return rs;
    }
    
    /**
     * Gets all sold cars from the database
     * @return a ResultSet of the sold cars
     */
    public ResultSet getSoldCars() {
        connectToCarDatabase();
        createStatement();
        ResultSet rs = null;
        
        try {
            rs = stmt.executeQuery("USE " + databaseName + " SELECT * FROM getSoldCars");
        } catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        }
        
        return rs;
    }
}