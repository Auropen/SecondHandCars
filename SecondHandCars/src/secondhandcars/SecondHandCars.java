/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars;

import java.util.List;
import javax.swing.JFrame;
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
        mainPage.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        mainPage.setResizable(false);
        mainPage.setTitle("CarStock");
        mainPage.setVisible(true);
        mainPage.setLocationRelativeTo(null);
    }
}
