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
        ctr.createCarsFromDB();                     //Stores cars from the database to the memory of the program.
        
        //Sets up the GUI with dispose closing and passing the controller to the GUI
        MainMenu mainPage = new MainMenu(ctr);
        mainPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainPage.setResizable(false);
        mainPage.setTitle("Main Menu");
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
        
        //Testing
        Customer customer = new Customer("Bo", "Børgensen", "12345678", "Somewhere", "bbørgensen@something.com", 1);
        Repair r1 = new Repair(Calendar.getInstance().getTime(), "Engine broken", 129, 1, customer, 5025);
        Repair r2 = new Repair(Calendar.getInstance().getTime(), "Hull damage", 46, 2, customer, 1552);
        ChipTuning ct = new ChipTuning(Calendar.getInstance().getTime(), "New chip tuning", 12, 3, customer, 500);
        TireVacation tv = new TireVacation(4, customer, 200, new TireSet(1, "Continental Winter 205/65 R16\"", 4, customer), Calendar.getInstance().getTime(), new Date(System.currentTimeMillis() + 604800000L));
        
        List<Order> orders = new ArrayList();
        orders.add(r1);
        orders.add(r2);
        orders.add(ct);
        orders.add(tv);
        
        Company c = Company.getInstance();
        
        c.createTransactionReport(orders, "transactions.txt");
    }
}
