/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Baku
 */
public class Repair extends Order {
    private String description;
    private int hours;

    public Repair(Date orderDate, String description, int hours, int orderID, Customer customer, double amountPayable) {
        super(orderID, customer, amountPayable, orderDate);
        this.description = description;
        this.hours = hours;
    }
    
    @Override
    public String toString() {
        return "_______________________________________\r\n" +
               "Customer: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() + "\r\n" +
               "CustomerID: " + getCustomer().getCustomerID() + "\r\n" +
               "OrderID: " + getOrderID() + "\r\n" +
               "Order Type: Repair\r\n" +
               "_______________________________________\r\n" +
               "Price: " + getAmountPayable() + "kr\r\n" +
               "Description: " + description + " \r\n" +
               "hours: " + hours + " \r\n" +
               "Date: " + new SimpleDateFormat("dd-MM-yyyy").format(getOrderDate()) + " \r\n" +
               "_______________________________________\r\n";
    }

    public String getDescription()  {   return description; }
    public int getHours()           {   return hours;       }

    public void setDescription(String description)  {   this.description = description; }
    public void setHours(int hours)                 {   this.hours = hours;             }
}
