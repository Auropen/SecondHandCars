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
public class Foreman extends Employee{
    private String garage;

    public Foreman(String garage, int employeeID, String firstName, String lastName, String address, String phoneNumber, String email, String qualification) {
        super(employeeID, firstName, lastName, address, phoneNumber, email, qualification);
        this.garage = garage;
    }

    public String getGarage() {
        return garage;
    }

    public void setGarage(String garage) {
        this.garage = garage;
    }
}
