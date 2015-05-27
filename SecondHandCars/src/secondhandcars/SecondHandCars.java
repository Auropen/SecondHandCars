/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars;

import java.util.List;
import secondhandcars.application.Controller;
import secondhandcars.domain.Car;

/**
 *
 * @author Kristian
 */
public class SecondHandCars {
    private static byte tires = 0;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Controller cont = new Controller();
        cont.createCarsFromDB();
        List<Car> list = cont.searchCars("", -1, "", -1, "", "", "", "", -1, -1, "St.car", "");
        for(Car car : list){
            System.out.println(car.getLicensePlate());
        }
    }
}
