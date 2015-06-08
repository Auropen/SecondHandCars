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
public class Sale extends Order{
    private Car car;
    
    public Sale(Car car, int orderID, Customer customer, double amountPayable, Date orderDate) {
        super(orderID, customer, amountPayable, orderDate);
        this.car = car;
    }
    
    @Override
    public String toString() {
        return "_______________________________________\r\n" +
               "Customer: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() + "\r\n" +
               "CustomerID: " + getCustomer().getCustomerID() + "\r\n" +
               "OrderID: " + getOrderID() + "\r\n" +
               "Order Type: Sale\r\n" +
               "_______________________________________\r\n" +
               "Price: " + getAmountPayable() + "kr\r\n" +
               "Description: " + getCar().getModel() + " " + getCar().getDescription() + " \r\n" +
               "Date purchased: " + new SimpleDateFormat("dd-MM-yyyy").format(getOrderDate()) + " \r\n" +
               "_______________________________________\r\n";
    }

    
    public Car getCar()     {   return car; }

    public void setCar(Car car)     {   this.car = car;     }
}
