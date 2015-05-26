/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import secondhandcars.domain.Car;
import secondhandcars.domain.Company;
import secondhandcars.technical.DBHandler;

/**
 *
 * @author Kristian
 */
public class Controller implements IController {
    Company company;
    DBHandler dbHandler;

    public Controller() {
        this.company = Company.getInstance();
        dbHandler = new DBHandler();
    }
    
    @Override
    public List<Car> searchCars(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock) {
        return company.getCarStock().searchCar(fuelType, sellingPrice, licensePlate, year, mark, model, version, volumeOfEngine, odometer, priceOfPurchase, type, description, dateOfPurchase, inStock);
    }

    @Override
    public void createCarsFromDB() {
        try {
            ResultSet rs = dbHandler.getAllCarsInStock();
            while (rs.next()) {
                Car car = new Car(rs.getString("fuelType"), rs.getDouble("sellingPrice"), rs.getString("licensePlate"), 
                        rs.getInt("year"), rs.getString("mark"), rs.getString("model"), rs.getString("version"), 
                        rs.getDouble("volumeOfEngine"), rs.getDouble("odometer"), rs.getDouble("priceOfPurchase"), 
                        rs.getString("type"), rs.getString("description"), rs.getDate("dateOfPurchase"), rs.getBoolean("inStock"));
                company.getCarStock().getCars().add(car);
            }
        } catch (SQLException ex) {
            ex.getMessage();
        }
        System.out.print("Debug This");
    }
}
