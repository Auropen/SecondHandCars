/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain.OffVersion;

/**
 *
 * @author Kristian
 */
public class TireSet {
    private String description;
    private int tireAmount;
    private Customer customer;

    public TireSet(String description, int tireAmount, Customer customer) {
        this.description = description;
        this.tireAmount = tireAmount;
        this.customer = customer;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}