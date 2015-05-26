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
        StringTokenizer searchTokens = new StringTokenizer(description, ",");
        
        while (searchTokens.hasMoreTokens()) {
            String part = searchTokens.nextToken();
            
        }
        
        return result;
    }
}
