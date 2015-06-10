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
import java.util.ArrayList;
import java.util.Date;
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
    private List<Customer> customers;
    private List<Order> orders;
    
    private Company(){
        this.companyName = "Second Hand Cars";
        this.address = "Ze Street 22, Ze Town";
        this.phoneNumber = "78862209";
        this.carStock = CarStock.getInstance();
        this.tireHotel = TireHotel.getInstance();
        customers = new ArrayList<Customer>();
        orders = new ArrayList<Order>();
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

    /**
     * Creates a transactions report in a file, with the given orders and name
     * 
     * @param orders - the orders to be written to the file
     * @param dest - the name of the file
     * @return a boolean whether the file was created successfully
     */
    public boolean createTransactionReport(List<Order> orders, String dest) {
        BufferedWriter writer = null;
        File f = new File(dest);
        if (f.exists())
            f.delete();
        try {
            writer = new BufferedWriter(new FileWriter(dest));

            double totalPrice = 0;
            for (Order o : orders) {
                writer.write(o.toString());
                totalPrice += o.getAmountPayable();
            }

            writer.write("\r\nTotal price: " + totalPrice + "kr");
        } 
        catch (IOException ex) {
            ex.getMessage();
            return false;
        } finally {
            try {
                writer.close();
            } catch (IOException ex) {
                ex.getMessage();
            }
        }
        return true;
    }
    
    /**
     * Creates a transactions report in a file, with the given orders and name
     * for between the given date
     * 
     * @param orders - the orders to be written to the file
     * @param dest - the name of the file
     * @param startDate - the start date for a period of time
     * @param endDate - the end date for a period of time
     * @return a boolean whether the file was created successfully
     */
    public boolean createTransactionReportBetweenDate(List<Order> orders, String dest, Date startDate, Date endDate) {
        for (Order o : orders) {
            if (!(o.getOrderDate().after(startDate) && o.getOrderDate().before(endDate)))
                orders.remove(o);
        }
        return createTransactionReport(orders, dest);
    }
    
    //Accesors method
    public String getCompanyName()          {   return companyName;     }
    public String getAddress()              {   return address;         }
    public String getPhoneNumber()          {   return phoneNumber;     }
    public CarStock getCarStock()           {   return carStock;        }
    public TireHotel getTireHotel()         {   return tireHotel;       }
    public List<Order> getOrders()          {   return orders;          }
    public List<Customer> getCustomers()    {   return customers;       }
    
    //Mutator methods
    public void setCompanyName(String companyName)      {   this.companyName = companyName;     }
    public void setAddress(String address)              {   this.address = address;             }
    public void setPhoneNumber(String phoneNumber)      {   this.phoneNumber = phoneNumber;     }
    public void setCarStock(CarStock carStock)          {   this.carStock = carStock;           }
    public void setTireHotel(TireHotel tireHotel)       {   this.tireHotel = tireHotel;         }
    public void setOrders(List<Order> orders)           {   this.orders = orders;               }
    public void setCustomers(List<Customer> customers)  {   this.customers = customers;         }
}