/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.swing.JFrame;
import secondhandcars.application.Controller;
import secondhandcars.domain.ChipTuning;
import secondhandcars.domain.Company;
import secondhandcars.domain.Customer;
import secondhandcars.domain.Order;
import secondhandcars.domain.Repair;
import secondhandcars.domain.TireSet;
import secondhandcars.domain.TireVacation;
import secondhandcars.ui.gui.MainMenu;

/**
 *
 * @author Kristian
 */
public class SecondHandCars {
    
    public static void main(String[] args) {
        Controller ctr = new Controller();
        
        //Sets up the GUI with dispose closing and passing the controller to the GUI
        MainMenu mainPage = new MainMenu(ctr);
        mainPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainPage.setResizable(false);
        mainPage.setTitle("Main Menu");
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }
}
