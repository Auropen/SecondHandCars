/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

/**
 *
 * @author Kristian
 */
public class TireSet {
    private int tireSetID;
    private String description;
    private int tireAmount;
    private Customer customer;

    public TireSet(int tireSetID, String description, int tireAmount, Customer customer) {
        this.tireSetID = tireSetID;
        this.description = description;
        this.tireAmount = tireAmount;
        this.customer = customer;
    }

    public String getDescription()  {   return description;     }
    public Customer getCustomer()   {   return customer;        }
    public int getTireAmount()      {   return tireAmount;      }
    public int getTireSetID()       {   return tireSetID;       }

    public void setDescription(String description)  {   this.description = description;     }
    public void setCustomer(Customer customer)      {   this.customer = customer;           }
    public void setTireAmount(int tireAmount)       {   this.tireAmount = tireAmount;       }
    public void setTireSetID(int tireSetID)         {   this.tireSetID = tireSetID;         }
}