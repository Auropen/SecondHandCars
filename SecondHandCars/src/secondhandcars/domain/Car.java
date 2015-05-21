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

    public Car(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase) {
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
    }
    public Car(String fuelType, double sellingPrice, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, String description, Date dateOfPurchase) {
        this.fuelType = fuelType;
        this.sellingPrice = sellingPrice;
        this.licensePlate = "";
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
    }
    public Car(String fuelType, double sellingPrice, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, Date dateOfPurchase) {
        this.fuelType = fuelType;
        this.sellingPrice = sellingPrice;
        this.licensePlate = "";
        this.year = year;
        this.mark = mark;
        this.model = model;
        this.version = version;
        this.volumeOfEngine = volumeOfEngine;
        this.odometer = odometer;
        this.priceOfPurchase = priceOfPurchase;
        this.type = type;
        this.description = "";
        this.dateOfPurchase = dateOfPurchase;
    }
    public Car(String fuelType, double sellingPrice, String licensePlate, int year, String mark, String model, String version, double volumeOfEngine, double odometer, double priceOfPurchase, String type, Date dateOfPurchase) {
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
        this.description = "";
        this.dateOfPurchase = dateOfPurchase;
    }
    
    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public double getVolumeOfEngine() {
        return volumeOfEngine;
    }

    public void setVolumeOfEngine(double volumeOfEngine) {
        this.volumeOfEngine = volumeOfEngine;
    }

    public double getOdometer() {
        return odometer;
    }

    public void setOdometer(double odometer) {
        this.odometer = odometer;
    }

    public double getPriceOfPurchase() {
        return priceOfPurchase;
    }

    public void setPriceOfPurchase(double priceOfPurchase) {
        this.priceOfPurchase = priceOfPurchase;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateOfPurchase() {
        return dateOfPurchase;
    }

    public void setDateOfPurchase(Date dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }
}
