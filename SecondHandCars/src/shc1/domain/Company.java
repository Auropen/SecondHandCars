/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shc1.domain;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Kritian
 */
public class Company {
    private static Company instance;
    private String companyName;
    private String address;
    private String phoneNumber;
    private CarStock carStock;
    
    private Company(){
        this.companyName = "Second Hand Cars";
        this.address = "Ze Street 22, Ze Town";
        this.phoneNumber = "78862209";
        this.carStock = CarStock.getInstance();
    }
    
    /**
     * Singleton creation/accessing method
     * @return this instance of company
     */
    public static synchronized Company getInstance(){
        if(instance == null)
            instance = new Company();
        return instance;
    }

    //Accesors method
    public String getCompanyName()  {   return companyName;     }
    public String getAddress()      {   return address;         }
    public String getPhoneNumber()  {   return phoneNumber;     }
    public CarStock getCarStock()   {   return carStock;        }
    
    //Mutator methods
    public void setCompanyName(String companyName)  {   this.companyName = companyName;     }
    public void setAddress(String address)          {   this.address = address;             }
    public void setPhoneNumber(String phoneNumber)  {   this.phoneNumber = phoneNumber;     }
    public void setCarStock(CarStock carStock)      {   this.carStock = carStock;           }
}