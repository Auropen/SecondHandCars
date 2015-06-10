/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars.domain;

import java.util.ArrayList;

/**
 *
 * @author Kristian
 */
public class TireHotel {
    private static TireHotel instance;
    private String address;
    private TireSet[][][] tireSets;
    private TireHotel(){
        address = "Ze Other Street 33, Ze Town";
        tireSets = new TireSet[25][3][2];
    }
    public static synchronized TireHotel getInstance(){
        if(instance == null)
            instance = new TireHotel();
        return instance;
    }
    
    /**
     * Get specific TireSet from a given location
     * 
     * @param binaryCode - The binary of 8 bits that contains the location of a TireSet
     * @return The TireSet in the given location
     */
    public TireSet getTireSetByLocation(String binaryCode) {
        byte x = Byte.parseByte(binaryCode.substring(0, 5), 2); //First 5 bits for the x (Columns)
        byte y = Byte.parseByte(binaryCode.substring(5, 7), 2); //Next 2 bits for the y (Rows)
        byte z = Byte.parseByte(binaryCode.substring(7), 2);    //Last bit for the z (Depths)
        
        return getTireSets()[x][y][z];                      //Gets the specific tireSet
    }
    
    
    /**
     * Sets the TireSet by the given location to the given TireSet
     * @param binaryCode - The binary of 8 bits that contains the location of a TireSet
     * @param ts The TireSet to set the variable
     */
    public void setTireSet(String binaryCode, TireSet ts) {
        byte x = Byte.parseByte(binaryCode.substring(0, 5), 2); //First 5 bits for the x (Columns)
        byte y = Byte.parseByte(binaryCode.substring(5, 7), 2); //Next 2 bits for the y (Rows)
        byte z = Byte.parseByte(binaryCode.substring(7), 2);    //Last bit for the z (Depths)
        
        setTireSet(x,y,z,ts);                               //Sets specified tireset in the tiresets
    }
    
    /**
     * Sets specified TireSet in the TireSets, by the given x, y and z
     * 
     * @param x - the row of the tires (Between the values 0 - 24)
     * @param y - the height/level of the TireSet (Between the value 0 - 2)
     * @param z - the depth/side of the TireSet (Between the value 0 - 1)
     * @param ts The TireSet to set the variable
     */
    public void setTireSet(byte x, byte y, byte z, TireSet ts) {
        getTireSets()[x][y][z] = ts;
    }
    
    /**
     * Gets the specific TireSet by the given x, y and z
     * 
     * @param x - the row of the tires (Between the values 0 - 24)
     * @param y - the height/level of the TireSet (Between the value 0 - 2)
     * @param z - the depth/side of the TireSet (Between the value 0 - 1)
     * @return The TireSet at the given location
     */
    public TireSet getTireSetByLocation(byte x, byte y, byte z) {
        return getTireSets()[x][y][z];                      //Gets the specific tireSet
    }
    
    /**
     * Gets a specific TireSet by the given ID
     * @param id - the ID to search by
     * @return The TireSet belonging to the given ID, null if non existent
     */
    public TireSet getTireSetByID(int id) {
        for(TireSet[][] tireSet : getTireSets()){
            for(TireSet[] tireSet2 : tireSet){
                for(TireSet tireSet3 : tireSet2){
                    if(tireSet3 != null && tireSet3.getTireSetID() == id){
                        return tireSet3;
                    }
                }
            }
        }
        return null;
    }
    
    /**
     * Gets all TireSet containing a bit of the Given description
     * @param description - the description to describe cars
     * @return The TireSet belonging to the given ID, null if non existent
     */
    public ArrayList<TireSet> getTireSetByDescription(String description) {
        ArrayList<TireSet> returnSet = new ArrayList();
        for(TireSet[][] tireSet : getTireSets()){
            for(TireSet[] tireSet2 : tireSet){
                for(TireSet tireSet3 : tireSet2){
                    if(tireSet3.getDescription().contains(description)){
                        returnSet.add(tireSet3);
                    }
                }
            }
        }
        return returnSet;
    }
    
    /**
     * Gets all TireSet owned by the given customer name
     * @param firstName - the customer first name
     * @param lastName - the customer last name
     * @return The TireSets belonging to the customer
     */
    public ArrayList<TireSet> getTireSetByCustomerName(String firstName, String lastName){
        ArrayList<TireSet> returnSet = new ArrayList();
        for(TireSet[][] tireSet : getTireSets()){
            for(TireSet[] tireSet2 : tireSet){
                for(TireSet tireSet3 : tireSet2){
                    if(tireSet3.getCustomer().getFirstName().equalsIgnoreCase(firstName) && tireSet3.getCustomer().getLastName().equalsIgnoreCase(lastName)){
                        returnSet.add(tireSet3);
                    }
                }
            }
        }
        return returnSet;
    }
    
    /**
     * Gets all TireSet owned by the given customer ID
     * @param customerID - the customer ID 
     * @return The TireSets belonging to the customer
     */
    public ArrayList<TireSet> getTireSetByCustomerID(int customerID){
        ArrayList<TireSet> returnSet = new ArrayList();
        for(TireSet[][] tireSet : getTireSets()){
            for(TireSet[] tireSet2 : tireSet){
                for(TireSet tireSet3 : tireSet2){
                    if(tireSet3.getCustomer().getCustomerID() == customerID){
                        returnSet.add(tireSet3);
                    }
                }
            }
        }
        return returnSet;
    }

    //Accessor methods
    public String getAddress()          {    return address;    }
    public TireSet[][][] getTireSets()  {   return tireSets;    }

    //Mutator methods
    public void setAddress(String address)          {   this.address = address;     }
    public void setTireSets(TireSet[][][] tireSets) {   this.tireSets = tireSets;   }
}
