/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.util.Date;

/**
 *
 * @author Baku
 */
public abstract class Order {
    private int orderID;
    private Customer customer;
    private double amountPayable;
    private Date orderDate;

    public Order(int orderID, Customer customer, double amountPayable, Date orderDate) {
        this.orderID = orderID;
        this.customer = customer;
        this.amountPayable = amountPayable;
        this.orderDate = orderDate;
    }
    
    public Customer getCustomer()       {   return customer;        }
    public double getAmountPayable()    {   return amountPayable;   }
    public int getOrderID()             {   return orderID;         }
    public Date getOrderDate()          {   return orderDate;       }

    public void setCustomer(Customer customer)          {   this.customer = customer;           }
    public void setAmountPayable(double amountPayable)  {   this.amountPayable = amountPayable; }
    public void setOrderID(int orderID)                 {   this.orderID = orderID;             }
    public void setOrderDate(Date orderDate)            {   this.orderDate = orderDate;         }
}
