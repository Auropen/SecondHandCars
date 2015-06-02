/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

/**
 *
 * @author Baku
 */
public class CarStock {
    private static CarStock instance;
    private List<Car> cars;
    
    private CarStock(){
        this.cars = new ArrayList();
    }
    
    /**
     * Singleton creation method
     * @return Returns this instance of carStock
     */
    public static synchronized CarStock getInstance(){
        if(instance == null)
            instance = new CarStock();
        return instance;
    }
    
    /**
     * Search for a list of specific cars, using all data from the Car class except stock status. 
     * An empty String, -1 for numeric values or null for date will skip that criteria.
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
     * @return the list of cars that fulfills the search criteria.
     */
    public List<Car> searchCar(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase) {
        ArrayList<Car> result = new ArrayList<Car>();
        
        for (Car c : getCars()) {
            if (!fuelType.equals("") && !fuelType.equalsIgnoreCase(c.getFuelType()))
                continue;
            if (sellingPrice >= 0 && sellingPrice != c.getSellingPrice())
                continue;
            if (!licensePlate.equals("") && !licensePlate.equalsIgnoreCase(c.getLicensePlate()))
                continue;
            if (year >= 0 && year != c.getYear())
                continue;
            if (!mark.equals("") && !mark.equalsIgnoreCase(c.getMark()))
                continue;
            if (!model.equals("") && !model.equalsIgnoreCase(c.getModel()))
                continue;
            if (!version.equals("") && !version.equalsIgnoreCase(c.getVersion()))
                continue;
            if (!volumeOfEngine.equals("") && volumeOfEngine.equalsIgnoreCase(c.getVolumeOfEngine()))
                continue;
            if (odometer >= 0 && odometer != c.getOdometer())
                continue;
            if (priceOfPurchase >= 0 && priceOfPurchase != c.getPriceOfPurchase())
                continue;
            if (!type.equals("") && !type.equalsIgnoreCase(c.getType()))
                continue;
            if (!description.equals("")) {
                StringTokenizer searchTokens = new StringTokenizer(description, ",");
                boolean inDescription = true;
                
                while (searchTokens.hasMoreTokens()) {
                    String part = searchTokens.nextToken().trim();
                    if (!description.contains(part)) {
                        inDescription = false;
                        break;
                    }
                }
                if (!inDescription)
                    continue;
            }
            if (dateOfPurchase != null && !dateOfPurchase.equals(c.getDateOfPurchase()))
                continue;
            result.add(c);
        }
        
        return result;
    }
    
    /**
     * Search for a list of specific cars, using all data from the Car class including stock status. 
     * An empty String, -1 for numeric values or null for date will skip that criteria.
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
     * @return the list of cars that fulfills the search criteria.
     */
    public List<Car> searchCar(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, String volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock) {
        List<Car> result = searchCar(fuelType, sellingPrice, licensePlate, year, mark, model, version, volumeOfEngine, odometer, priceOfPurchase, type, description, dateOfPurchase);
        
        for (Car c : result) {
            if (inStock != c.getStockStatus())
                result.remove(c);
        }
        
        return result;
    }
    
    public List<Car> getSoldCarsBetweenDate(Date startDate, Date endDate) {
        List<Car> result = new ArrayList<Car>();
        
        for (Car c : cars) {
            if (c.getDateOfPurchase().after(startDate) && c.getDateOfPurchase().before(endDate)) {
                result.add(c);
            }
        }
        
        return result;
    }

    //Accessors methods
    public int getCarAmount()   {   return cars.size();     }
    public List<Car> getCars()  {   return cars;            }

    //Mutator methods
    public void setCars(List<Car> cars)         {   this.cars = cars;           }
}
