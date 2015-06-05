/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.util.List;

/**
 *
 * @author Baku
 */
public class TireVacation extends Order{
    private int durationDays;
    private TireSet tireSet;

    public TireVacation(int orderID, Customer customer, double amountPayable, int durationDays, TireSet tireSet) {
        super(orderID, customer, amountPayable);
        this.durationDays = durationDays;
        this.tireSet = tireSet;
    }

    public String toString() {
        return "_______________________________________\n" +
               "Customer: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() + "\n" +
               "CustomerID: " + getCustomer().getCustomerID() + "\n" +
               "Address: " + getCustomer().getAddress()+ "\n" +
               "E-mail: " + getCustomer().getEmail()+ "\n" +
               "PhoneNumber: " + getCustomer().getPhoneNumber()+ "\n" +
               "OrderID:" + getOrderID() + "\n" +
               "_______________________________________\n" +
               "Not implemented yet!" +
               "\n_______________________________________";
    }
    
    public int getDurationDays() {
        return durationDays;
    }

    public TireSet getTireSet() {
        return tireSet;
    }

    public void setDurationDays(int durationDays) {
        this.durationDays = durationDays;
    }

    public void setTireSet(TireSet tireSet) {
        this.tireSet = tireSet;
    }
}
