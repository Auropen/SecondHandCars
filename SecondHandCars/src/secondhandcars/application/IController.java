/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.application;

import java.util.Date;
import java.util.List;
import secondhandcars.domain.Car;
import secondhandcars.domain.ChipTuning;
import secondhandcars.domain.Repair;

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
    public void createCar(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock);
    public void updateCar(Car c, double sellingPrice, String licensePlate, double odometer, String description, boolean inStock);
    public void deleteCar(Car c);
    
    //Services methods
    public void createRepairService();
    public void updateRepairService(int id);
    public void deleteRepairService(int id);
    public void createChipTuningService();
    public void updateChipTuningService(int id);
    public void deleteChipTuningService(int id);
    public void createTireService(String description);
    public void updateTireService(int id, String description);
    public void deleteTireService(int id);
    
    //Utilities methods
    public double stringToDouble(String s);
    public int stringToInt(String s);
}
