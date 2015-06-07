/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import secondhandcars.domain.Order;

/**
 *
 * @author Baku
 */
public class Sale extends Order{

    public Sale(int orderID, Customer customer, double amountPayable) {
        super(orderID, customer, amountPayable);
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
               "Description: " + 123456 + " \r\n" +
               "_______________________________________\r\n";
    }
}
