/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

/**
 *
 * @author Baku
 */
public class ChipTuning extends Order{

    public ChipTuning(int orderID, Customer customer, double amountPayable) {
        super(orderID, customer, amountPayable);
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
}
