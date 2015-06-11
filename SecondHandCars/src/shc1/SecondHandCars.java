/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shc1;

import javax.swing.JFrame;
import shc1.application.Controller;
import shc1.ui.gui.MainMenu;

/**
 *
 * @author Kristian
 */
public class SecondHandCars {
    
    public static void main(String[] args) {
        Controller ctr = new Controller();
        ctr.createCarsFromDB();                     //Stores cars from the database to the memory of the program.
        
        //Sets up the GUI with dispose closing and passing the controller to the GUI
        MainMenu mainPage = new MainMenu(ctr);
        mainPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainPage.setResizable(false);
        mainPage.setTitle("Main Menu");
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }
}
