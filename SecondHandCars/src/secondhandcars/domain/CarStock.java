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
    private int carAmount;
    private List<Car> cars;
    
    private CarStock(){
        this.cars = new ArrayList();
        this.carAmount = cars.size();
    }
    public static synchronized CarStock getInstance(){
        if(instance == null){
            instance = new CarStock();
        }
        return instance;
    }
    
    public List<Car> searchCar(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock) {
        ArrayList<Car> result = new ArrayList<Car>();
        
        for (Car c : cars) {
            if (fuelType.equals("") && !fuelType.equalsIgnoreCase(c.getFuelType()))
                continue;
            if (sellingPrice < 0 && sellingPrice != c.getSellingPrice())
                continue;
            if (licensePlate.equals("") && !licensePlate.equalsIgnoreCase(c.getLicensePlate()))
                continue;
            if (year < 0 && year != c.getYear())
                continue;
            if (mark.equals("") && !mark.equalsIgnoreCase(c.getMark()))
                continue;
            if (model.equals("") && !model.equalsIgnoreCase(c.getModel()))
                continue;
            if (version.equals("") && !version.equalsIgnoreCase(c.getVersion()))
                continue;
            if (volumeOfEngine < 0 && volumeOfEngine != c.getVolumeOfEngine())
                continue;
            if (odometer < 0 && odometer != c.getOdometer())
                continue;
            if (priceOfPurchase < 0 && priceOfPurchase != c.getPriceOfPurchase())
                continue;
            if (type.equals("") && !type.equalsIgnoreCase(c.getType()))
                continue;
            if (description.equals("")) {
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
            if (inStock != (Boolean) null && inStock != c.getStockStatus())
                continue;
            result.add(c);
        }
        
        return result;
    }
}
