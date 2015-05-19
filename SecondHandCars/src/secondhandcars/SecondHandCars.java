/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package secondhandcars;

/**
 *
 * @author Kristian
 */
public class SecondHandCars {
    private static byte tires = 0;
    private static TireSet[][][] tireSet = new TireSet[25][3][2];
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addBit(1);
        addBit(5);
        addBit(7);
        System.out.println(Integer.toBinaryString(tires).substring(24));
    }
    
    
    public static void addBit(int bitLocation) {
        if (bitLocation < 0 || bitLocation > 7)
            throw new IllegalArgumentException("There is only 8 bits, represented by 0 to 7.");
        tires += 1 << bitLocation;
    }
    
    public static TireSet getTireSet(byte binaryCode) {
        //Takes 8 byte and converts it to binary as a 32 bit (Integer), and removes the unsigned bits which results in a 8 bits (1 Byte) long binary
        String binary = String.format("%8s", Integer.toBinaryString(binaryCode & 0xFF)).replace(' ', '0');
        
        byte x = Byte.parseByte(binary.substring(0, 5), 2); //First 5 bits for the x (Columns)
        byte y = Byte.parseByte(binary.substring(5, 7), 2); //Next 2 bits for the y (Rows)
        byte z = Byte.parseByte(binary.substring(7), 2);    //Last bit for the z (Depths)
        
        return tireSet[x][y][z];                            //Gets the specific tireSet
    }
    
    
    private class TireSet {
        private String description;
    }
}
