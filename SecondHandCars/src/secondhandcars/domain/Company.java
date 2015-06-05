/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
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
    private TireHotel tireHotel;
    
    private Company(){
        this.companyName = "Second Hand Cars";
        this.address = "Ze Street 22, Ze Town";
        this.phoneNumber = "78862209";
        this.carStock = CarStock.getInstance();
        this.tireHotel = TireHotel.getInstance();
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

    public void createTransactionReport(List<Order> orderList, String dest) {
        BufferedWriter writer = null;
        File f = new File(dest);
        if (f.exists()) {
            System.err.println("File exists already!");
        }
        else {
            try {
                writer = new BufferedWriter(new FileWriter(dest));

                for (Order o : orderList) {
                    writer.write("\n" + o.toString());
                }

            } catch (IOException ex) {
                ex.getMessage();
            } finally {
                try {
                    writer.close();
                } catch (IOException ex) {
                    ex.getMessage();
                }
            }
        }
    }
    
    //Accesors method
    public String getCompanyName()  {   return companyName;     }
    public String getAddress()      {   return address;         }
    public String getPhoneNumber()  {   return phoneNumber;     }
    public CarStock getCarStock()   {   return carStock;        }
    public TireHotel getTireHotel() {   return tireHotel;       }
    
    //Mutator methods
    public void setCompanyName(String companyName)  {   this.companyName = companyName;     }
    public void setAddress(String address)          {   this.address = address;             }
    public void setPhoneNumber(String phoneNumber)  {   this.phoneNumber = phoneNumber;     }
    public void setCarStock(CarStock carStock)      {   this.carStock = carStock;           }
    public void setTireHotel(TireHotel tireHotel)   {   this.tireHotel = tireHotel;         }
}