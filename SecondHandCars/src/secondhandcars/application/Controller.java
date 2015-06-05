/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.application;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import secondhandcars.domain.Car;
import secondhandcars.domain.ChipTuning;
import secondhandcars.domain.Company;
import secondhandcars.domain.Repair;
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

    /**
     * Search for a list of specific cars, using all data from the Car class
     * except stock status. An empty String, -1 for numeric values or null for
     * date will skip that criteria.
     *
     * @param fuelType - The fuel of the car.
     * @param sellingPrice - the sellingPrice of the car.
     * @param licensePlate - the licensePlate of the car.
     * @param year - the year the car was made.
     * @param mark - the mark of the car.
     * @param model - the model of the car.
     * @param version - the version of the car.
     * @param volumeOfEngine - the volume of the engine in the car.
     * @param odometer - the odometer of the car.
     * @param priceOfPurchase - the price of the purchase.
     * @param type - the type of the car.
     * @param description - the description of the car.
     * @param dateOfPurchase - the date of purchase of the car.
     * @return the list of cars that fulfils the search criteria.
     */
    @Override
    public List<Car> searchCars(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase) {
        return company.getCarStock().searchCar(fuelType, sellingPrice, licensePlate, year, mark, model, version, volumeOfEngine, odometer, priceOfPurchase, type, description, dateOfPurchase);
    }

    /**
     * Search for a list of specific cars, using all data from the Car class
     * including stock status. An empty String, -1 for numeric values or null
     * for date will skip that criteria.
     *
     * @param fuelType - The fuel of the car.
     * @param sellingPrice - the sellingPrice of the car.
     * @param licensePlate - the licensePlate of the car.
     * @param year - the year the car was made.
     * @param mark - the mark of the car.
     * @param model - the model of the car.
     * @param version - the version of the car.
     * @param volumeOfEngine - the volume of the engine in the car.
     * @param odometer - the odometer of the car.
     * @param priceOfPurchase - the price of the purchase.
     * @param type - the type of the car.
     * @param description - the description of the car.
     * @param dateOfPurchase - the date of purchase of the car.
     * @param inStock - if the car is in stock.
     * @return the list of cars that fulfils the search criteria.
     */
    @Override
    public List<Car> searchCars(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock) {
        return company.getCarStock().searchCar(fuelType, sellingPrice, licensePlate, year, mark, model, version, volumeOfEngine, odometer, priceOfPurchase, type, description, dateOfPurchase, inStock);
    }

    /**
     * Gets the all car from the dbHandler, and converts the data to car objects
     *
     * @return a list of cars
     */
    @Override
    public List<Car> getAllCars() {
        List<Car> cars;
        ResultSet rs = dbHandler.getAllCarsInStock();
        cars = getCarsFromResultSet(rs);
        return cars;
    }

    /**
     * Gets the sold car from the dbHandler, and converts the data to car
     * objects
     *
     * @return a list of cars
     */
    @Override
    public List<Car> getSoldCars() {
        List<Car> cars;
        ResultSet rs = dbHandler.getSoldCars();
        cars = getCarsFromResultSet(rs);
        return cars;
    }

    /**
     * Takes a ResultSet and creates cars from the data.
     *
     * @param rs - the ResultSet of cars
     * @return a list of car
     */
    private List<Car> getCarsFromResultSet(ResultSet rs) {
        List<Car> cars = new ArrayList();
        try {
            while (rs.next()) {
                Car car = new Car(rs.getString("fuelType"), rs.getDouble("sellingPrice"), rs.getString("licensePlate"),
                        rs.getInt("year"), rs.getString("mark"), rs.getString("model"), rs.getString("version"),
                        rs.getString("volumeOfEngine"), rs.getDouble("odometer"), rs.getDouble("priceOfPurchase"),
                        rs.getString("type"), rs.getString("description"), rs.getDate("dateOfPurchase"), rs.getBoolean("inStock"));
                cars.add(car);
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            dbHandler.closeConnection();
        }
        return cars;
    }

    /**
     * Stores the cars from the database to the CarStock
     */
    @Override
    public void createCarsFromDB() {
        company.getCarStock().getCars().addAll(getAllCars());
    }

    /**
     *
     * @param startDate
     * @param endDate
     * @return
     */
    @Override
    public List<Car> getSoldCarsBetweenDate(Date startDate, Date endDate) {
        return company.getCarStock().getSoldCarsBetweenDate(startDate, endDate);
    }

    /**
     *
     * @param fuelType
     * @param sellingPrice
     * @param licensePlate
     * @param year
     * @param mark
     * @param model
     * @param version
     * @param volumeOfEngine
     * @param odometer
     * @param priceOfPurchase
     * @param type
     * @param description
     * @param dateOfPurchase
     * @param inStock
     */
    @Override
    public void createCar(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param c
     * @param sellingPrice
     * @param licensePlate
     * @param odometer
     * @param description
     * @param inStock
     */
    @Override
    public void updateCar(Car c, double sellingPrice, String licensePlate, double odometer, String description, boolean inStock) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param c The car to be deleted
     */
    @Override
    public void deleteCar(Car c) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void createRepairService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void updateRepairService(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void deleteRepairService(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     */
    @Override
    public void createChipTuningService() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param id
     */
    @Override
    public void updateChipTuningService(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param id
     */
    @Override
    public void deleteChipTuningService(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param description
     */
    @Override
    public void createTireService(String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param id
     * @param description
     */
    @Override
    public void updateTireService(int id, String description) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @param id
     */
    @Override
    public void deleteTireService(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * Safely converts string to a double
     * @param s The string of the double
     * @return the converted double
     */
    @Override
    public double stringToDouble(String s) {
        try {
            return Double.parseDouble(s);
        } 
        catch (NumberFormatException ex) {}
        return -1;
    }

    /**
     * Safely converts string to an integer
     * @param s The string of the integer
     * @return the converted integer
     */
    @Override
    public int stringToInt(String s) {
        try {
            return Integer.parseInt(s);
        } 
        catch (NumberFormatException ex) {}
        return -1;
    }
}
