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
    
    public String toString() {
        return "_______________________________________\r\n" +
               "Customer: " + getCustomer().getFirstName() + " " + getCustomer().getLastName() + "\r\n" +
               "CustomerID: " + getCustomer().getCustomerID() + "\r\n" +
               "OrderID:" + getOrderID() + "\r\n" +
               "_______________________________________\r\n" +
               "Sale price: " + getAmountPayable() + "kr\r\n" +
               "Not implemented yet!\r\n" +
               "_______________________________________";
    }
}
