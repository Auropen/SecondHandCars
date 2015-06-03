/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import secondhandcars.domain.Order;
import java.util.Date;

/**
 *
 * @author Baku
 */
public class Invoice {
    private String invoiceID;
    private int orderID;
    private double amount;
    private Date datePayable;

    public Invoice(Order order,Date datePayable) {
        this.invoiceID = "I"+order.getOrderID();
        this.orderID = orderID;
        this.amount = amount;
        this.datePayable = datePayable;
    }
}
