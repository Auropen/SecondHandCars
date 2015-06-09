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
import secondhandcars.domain.*;
import secondhandcars.technical.DBHandler;

/**
 *
 * @author Kristian
 */
public final class Controller implements IController {

    Company company;
    DBHandler dbHandler;

    public Controller() {
        this.company = Company.getInstance();
        dbHandler = new DBHandler();
        createCarsFromDB();                     //Stores cars from the database to the memory of the program.
        createCustomersFromDB();                //Stores customers from the database to the memory of the program.
        createTireSetFromDB();                  //Stores tire sets from the database to the memory of the program.
        createOrdersFromDB();                   //Stores orders from the database to the memory of the program.
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
    
    @Override
    public List<Repair> getAllRepairsFromDB() {
        List<Repair> repairs = new ArrayList();
        try {
            ResultSet rs = dbHandler.getAllRepairs();
            while (rs.next()) {
                Repair repair = new Repair(rs.getDate("RepairDate"), rs.getString("Description"), rs.getInt("Hours"), rs.getInt("RepairID"), getCustomerByID(rs.getInt("CustomerID")), rs.getDouble("Amount"));
                repairs.add(repair);
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            dbHandler.closeConnection();
        }
        return repairs;
    }
    
    @Override
    public List<ChipTuning> getAllChipTuningFromDB() {
        List<ChipTuning> chipTunings = new ArrayList();
        try {
            ResultSet rs = dbHandler.getChipTunings();
            while (rs.next()) {
                ChipTuning chipTuning = new ChipTuning(rs.getDate("TuningDate"), rs.getString("Description"), rs.getInt("Hours"), rs.getInt("ChipTuningID"), getCustomerByID(rs.getInt("CustomerID")), rs.getDouble("Amount"));
                chipTunings.add(chipTuning);
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            dbHandler.closeConnection();
        }
        return chipTunings;
    }

    @Override
    public List<TireVacation> getAllTireVacationFromDB() {
        List<TireVacation> tireVacations = new ArrayList();
        try {
            ResultSet rs = dbHandler.getTireVacations();
            while (rs.next()) {
                TireVacation tireVacation = new TireVacation(rs.getInt("TireVacationID"), getCustomerByID(rs.getInt("CustomerID")), rs.getDouble("Amount"), getTireSetByID(rs.getInt("TireSetID")), rs.getDate("StartDate"), rs.getDate("EndDate"));
                tireVacations.add(tireVacation);
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            dbHandler.closeConnection();
        }
        return tireVacations;
    }
    
    @Override
    public TireSet getTireSetByID(int id) {
        return company.getTireHotel().getTireSetByID(id);
    }
    
    @Override
    public void createTireSetFromDB() {
        try {
            ResultSet rs = dbHandler.getAllTireSets();
            while (rs.next()) {
                TireSet ts = new TireSet(rs.getInt("TireSetID"), rs.getString("Description"), rs.getInt("NumberOfTires"), getCustomerByID(rs.getInt("CustomerID")));
                company.getTireHotel().setTireSet(rs.getString("Location"), ts);
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            dbHandler.closeConnection();
        }
    }
    
    @Override
    public void createOrdersFromDB() {
        company.getOrders().addAll(getAllRepairsFromDB());
        company.getOrders().addAll(getAllChipTuningFromDB());
        company.getOrders().addAll(getAllTireVacationFromDB());
    }

    @Override
    public void createTransactionReport(List<Order> orders, String dest) {
        company.createTransactionReport(orders, dest);
    }
    
    @Override
    public void createTransactionReportBetweenDate(List<Order> orders, String dest, Date startDate, Date endDate) {
        company.createTransactionReportBetweenDate(orders, dest, startDate, endDate);
    }
    
    @Override
    public List<Order> getAllOrders() {
        return company.getOrders();
    }
    
    @Override
    public void createCustomersFromDB() {
        try {
            ResultSet rs = dbHandler.getAllCustomers();
            while (rs.next()) {
                Customer customer = new Customer(rs.getString("FirstName"), rs.getString("LastName"), rs.getString("PhoneNumber"), rs.getString("Address"), rs.getString("Email"), rs.getInt("CustomerID"));
                company.getCustomers().add(customer);
            }
        }
        catch (SQLException ex) {
            System.out.println("SQLException: " + ex.getMessage());
            System.out.println("SQLState: " + ex.getSQLState());
            System.out.println("VendorError: " + ex.getErrorCode());
        } finally {
            dbHandler.closeConnection();
        }
    }
    
    @Override
    public Customer getCustomerByID(int id) {
        Customer result = null;
        for (Customer c : company.getCustomers()) {
            if (c.getCustomerID() == id) {
                result = c;
                break;
            }
        }
        return result;
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
