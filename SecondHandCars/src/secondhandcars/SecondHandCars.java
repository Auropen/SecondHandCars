/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars;

import javax.swing.JFrame;
import secondhandcars.application.Controller;
import secondhandcars.application.IController;
import secondhandcars.ui.gui.MainMenu;

/**
 *
 * @author Kristian
 */
public class SecondHandCars {
    
    public static void main(String[] args) {
        //Creates the controller (Application) for the MVC pattern
        IController ctr = new Controller();
        
        //Sets up the GUI with dispose closing and passing the controller to the GUI
        MainMenu mainPage = new MainMenu(ctr);
        mainPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainPage.setResizable(false);
        mainPage.setTitle("Main Menu");
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }
}
