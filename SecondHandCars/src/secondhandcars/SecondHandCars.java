/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars;

import java.util.List;
import secondhandcars.application.Controller;
import secondhandcars.domain.Car;
import secondhandcars.ui.gui.Main;

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
        Controller ctr = new Controller();
        Main mainPage = new Main(ctr);
        ctr.createCarsFromDB();
        List<Car> list = ctr.searchCars("", -1, "", -1, "", "", "", "", -1, -1, "St.car", "", null);
        for(Car car : list){
            System.out.println(car.getLicensePlate());
        }
    }
}
