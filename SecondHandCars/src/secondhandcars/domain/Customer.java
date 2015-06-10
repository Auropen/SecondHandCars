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
public class Customer {
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String email;
    private int customerID;

    public Customer(String firstName, String lastName, String phoneNumber, String address, String email, int customerID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.email = email;
        this.customerID = customerID;
    }

    //Accessor methods
    public String getFirstName()        {   return firstName;   }
    public String getLastName()         {   return lastName;    }
    public String getPhoneNumber()      {   return phoneNumber; }
    public String getAddress()          {   return address;     }
    public String getEmail()            {   return email;       }
    public int getCustomerID()          {   return customerID;  }

    //Metator methods
    public void setFirstName(String firstName)      {   this.firstName = firstName;     }
    public void setLastName(String lastName)        {   this.lastName = lastName;       }
    public void setPhoneNumber(String phoneNumber)  {   this.phoneNumber = phoneNumber; }
    public void setAddress(String address)          {   this.address = address;         }
    public void setEmail(String email)              {   this.email = email;             }
    public void setCustomerID(int customerID)       {   this.customerID = customerID;   }
}
