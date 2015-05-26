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
public class Car {
    private String fuelType;
    private double sellingPrice;
    private String licensePlate;
    private int year;
    private String mark;
    private String model;
    private String version;
    private double volumeOfEngine;
    private double odometer;
    private double priceOfPurchase;
    private String type;
    private String description;
    private Date dateOfPurchase;
    private boolean inStock;

    public Car(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock) {
        this.fuelType = fuelType;
        this.sellingPrice = sellingPrice;
        this.licensePlate = licensePlate;
        this.year = year;
        this.mark = mark;
        this.model = model;
        this.version = version;
        this.volumeOfEngine = volumeOfEngine;
        this.odometer = odometer;
        this.priceOfPurchase = priceOfPurchase;
        this.type = type;
        this.description = description;
        this.dateOfPurchase = dateOfPurchase;
        this.inStock = inStock;
    }
    
    public Car(String fuelType, double sellingPrice, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, Date dateOfPurchase, boolean inStock) {
        this(fuelType, sellingPrice, "", year, mark, model, version, volumeOfEngine, odometer, priceOfPurchase, type, "", dateOfPurchase, inStock);
    }
    
    public Car(String fuelType, double sellingPrice, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase, boolean inStock) {
        this(fuelType, sellingPrice, "", year, mark, model, version, volumeOfEngine, odometer, priceOfPurchase, type, description, dateOfPurchase, inStock);
    }
    
    public Car(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, Date dateOfPurchase, boolean inStock) {
        this(fuelType, sellingPrice, licensePlate, year, mark, model, version, volumeOfEngine, odometer, priceOfPurchase, type, "", dateOfPurchase, inStock);
    }

    //Accessor methods
    public String getFuelType()         {   return fuelType;        }
    public double getSellingPrice()     {   return sellingPrice;    }
    public String getLicensePlate()     {   return licensePlate;    }
    public int getYear()                {   return year;            }
    public String getMark()             {   return mark;            }
    public String getModel()            {   return model;           }
    public String getVersion()          {   return version;         }
    public double getVolumeOfEngine()   {   return volumeOfEngine;  }
    public double getOdometer()         {   return odometer;        }
    public double getPriceOfPurchase()  {   return priceOfPurchase; }
    public String getType()             {   return type;            }
    public String getDescription()      {   return description;     }
    public Date getDateOfPurchase()     {   return dateOfPurchase;  }
    public boolean getStockStatus()     {   return inStock;         }
    
    //Mutator methods
    public void setFuelType(String fuelType)                {   this.fuelType = fuelType;               }
    public void setSellingPrice(double sellingPrice)        {   this.sellingPrice = sellingPrice;       }
    public void setLicensePlate(String licensePlate)        {   this.licensePlate = licensePlate;       }
    public void setYear(int year)                           {   this.year = year;                       }
    public void setMark(String mark)                        {   this.mark = mark;                       }
    public void setModel(String model)                      {   this.model = model;                     }
    public void setVersion(String version)                  {   this.version = version;                 }
    public void setVolumeOfEngine(double volumeOfEngine)    {   this.volumeOfEngine = volumeOfEngine;   }
    public void setOdometer(double odometer)                {   this.odometer = odometer;               }
    public void setPriceOfPurchase(double priceOfPurchase)  {   this.priceOfPurchase = priceOfPurchase; }
    public void setType(String type)                        {   this.type = type;                       }
    public void setDescription(String description)          {   this.description = description;         }
    public void setDateOfPurchase(Date dateOfPurchase)      {   this.dateOfPurchase = dateOfPurchase;   }
    public void setStockStatus(boolean inStock)             {   this.inStock = inStock;                 }
}
