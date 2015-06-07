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

    @Override
    public String toString() {
        return "_______________________________________\r\n" +
               "Customer: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() + "\r\n" +
               "CustomerID: " + getCustomer().getCustomerID() + "\r\n" +
               "OrderID: " + getOrderID() + "\r\n" +
               "Order Type: Tire Vacation\r\n" +
               "_______________________________________\r\n" +
               "Price: " + getAmountPayable() + "kr\r\n" +
               "Description: " + 123456 + " \r\n" +
               "_______________________________________\r\n";
    }
    
    public int getDurationDays()    {   return durationDays;    }
    public TireSet getTireSet()     {   return tireSet;         }

    public void setDurationDays(int durationDays)   {   this.durationDays = durationDays;   }
    public void setTireSet(TireSet tireSet)         {   this.tireSet = tireSet;             }
}
