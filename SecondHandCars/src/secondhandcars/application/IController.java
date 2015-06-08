/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.application;

import java.util.Date;
import java.util.List;
import secondhandcars.domain.*;

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
    public List<Car> getSoldCarsBetweenDate(Date startDate, Date endDate);
    
    //Services methods
    public List<Repair> getAllRepairsFromDB();
    public List<ChipTuning> getAllChipTuningFromDB();
    public List<TireVacation> getAllTireVacationFromDB();
    public void createOrdersFromDB();
    public void createTireSetFromDB();
    public TireSet getTireSetByID(int id);
    
    //Sales methods
    public void createTransactionReport(List<Order> orders, String dest);
    public void createTransactionReportBetweenDate(List<Order> orders, String dest, Date startDate, Date endDate);
    public List<Order> getAllOrders();
    
    //Customer methods
    public void createCustomersFromDB();
    public Customer getCustomerByID(int id);
    
    //Utilities methods
    public double stringToDouble(String s);
    public int stringToInt(String s);
}
