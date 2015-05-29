/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars;

import javax.swing.JFrame;
import secondhandcars.application.Controller;
import secondhandcars.ui.gui.CarWindow;

/**
 *
 * @author Kristian
 */
public class SecondHandCars {
    
    public static void main(String[] args) {
        Controller ctr = new Controller();
        ctr.createCarsFromDB();                     //Stores cars from the database to the memory of the program.
        
        //Sets up the GUI with dispose closing and passing the controller to the GUI
        CarWindow mainPage = new CarWindow(ctr);
        mainPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainPage.setResizable(false);
        mainPage.setTitle("Car window");
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }
}
