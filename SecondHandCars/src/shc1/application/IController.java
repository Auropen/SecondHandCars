/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shc1.application;

import java.util.Date;
import java.util.List;
import shc1.domain.Car;

/**
 *
 * @author Kristian
 */
public interface IController {
    //Car methods
    public List<Car> searchCars(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase);
    public List<Car> searchCars(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock);
    public void createCarsFromDB();
    public List<Car> getAllCars();
    public List<Car> getSoldCars();
    
    //Utilities methods
    public double stringToDouble(String s);
    public int stringToInt(String s);
}
