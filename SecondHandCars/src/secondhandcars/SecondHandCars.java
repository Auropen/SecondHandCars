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
}
