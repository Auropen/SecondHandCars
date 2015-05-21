/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.util.ArrayList;
import java.util.List;

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
    public Car search
}
