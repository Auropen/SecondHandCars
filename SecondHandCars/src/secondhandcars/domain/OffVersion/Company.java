/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain.OffVersion;
import secondhandcars.domain.TireHotel;
import java.util.ArrayList;
import java.util.List;
import secondhandcars.domain.CarStock;

/**
 *
 * @author Baku
 */
public class Company {
    private static Company instance;
    private String companyName;
    private String address;
    private String phoneNumber;
    private List<Employee> employees;
    private TireHotel tireHotel;
    private CarStock carStock;
    private List<Order> orders;
    
    private Company(){
        this.companyName = "Second Hand Cars";
        this.address = "Ze Street 22, Ze Town";
        this.phoneNumber = "78862209";
        this.employees = new ArrayList();
        this.tireHotel = TireHotel.getInstance();
        this.carStock = CarStock.getInstance();
        this.orders = new ArrayList();
    }
    public static synchronized Company getInstance(){
        if(instance == null){
            instance = new Company();
        }
        return instance;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}