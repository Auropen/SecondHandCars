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
public class TireVacation extends Order{
    private TireSet tireSet;
    private Date endDate;

    public TireVacation(int orderID, Customer customer, double amountPayable, TireSet tireSet, Date startDate , Date endDate) {
        super(orderID, customer, amountPayable, startDate);
        this.tireSet = tireSet;
        this.endDate = endDate;
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
               "Description: Tire - " + ((tireSet != null) ? tireSet.getDescription() : "Not existent") + " \r\n" +
               "Duration: " + new SimpleDateFormat("dd-MM-yyyy").format(getOrderDate()) + " - " + new SimpleDateFormat("dd-MM-yyyy").format(endDate) + " \r\n" +
               "_______________________________________\r\n";
    }
    
    public Date getEndDate()        {   return endDate;         }
    public TireSet getTireSet()     {   return tireSet;         }

    public void setEndDate(Date endDate)   {   this.endDate = endDate;   }
    public void setTireSet(TireSet tireSet)         {   this.tireSet = tireSet;             }
}
