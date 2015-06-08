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
        if(instance == null){
            instance = new TireHotel();
        }
        return instance;
    }
    
    public TireSet getTireSetByLocation(byte binaryCode) {
        //Takes a byte and converts it to binary as a 32 bit (Integer), and removes the unsigned bits which results in a 8 bits (1 Byte) long binary
        String binary = String.format("%8s", Integer.toBinaryString(binaryCode & 0xFF)).replace(' ', '0');
        
        byte x = Byte.parseByte(binary.substring(0, 5), 2); //First 5 bits for the x (Columns)
        byte y = Byte.parseByte(binary.substring(5, 7), 2); //Next 2 bits for the y (Rows)
        byte z = Byte.parseByte(binary.substring(7), 2);    //Last bit for the z (Depths)
        
        return getTireSets()[x][y][z];                      //Gets the specific tireSet
    }
    
    public void setTireSet(byte binaryCode, TireSet ts) {
        //Takes a byte and converts it to binary as a 32 bit (Integer), and removes the unsigned bits which results in a 8 bits (1 Byte) long binary
        String binary = String.format("%8s", Integer.toBinaryString(binaryCode & 0xFF)).replace(' ', '0');
        
        byte x = Byte.parseByte(binary.substring(0, 5), 2); //First 5 bits for the x (Columns)
        byte y = Byte.parseByte(binary.substring(5, 7), 2); //Next 2 bits for the y (Rows)
        byte z = Byte.parseByte(binary.substring(7), 2);    //Last bit for the z (Depths)
        
        setTireSet(x,y,z,ts);                               //Sets specified tireset in the tiresets
    }
    
    public void setTireSet(byte x, byte y, byte z, TireSet ts) {
        getTireSets()[x][y][z] = ts;                        //Sets specified tireset in the tiresets
    }
    
    public TireSet getTireSetByLocation(byte x, byte y, byte z) {
        return getTireSets()[x][y][z];                      //Gets the specific tireSet
    }
    
    public TireSet getTireSetByID(int id) {
        for(TireSet[][] tireSet : getTireSets()){
            for(TireSet[] tireSet2 : tireSet){
                for(TireSet tireSet3 : tireSet2){
                    if(tireSet3.getTireSetID() == id){
                        return tireSet3;
                    }
                }
            }
        }
        return null;
    }
    
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
