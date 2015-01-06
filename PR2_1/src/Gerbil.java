/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rsexton17
 */
public class Gerbil {

    public int gerbilNumber;
    private int arrayList;
    /**
     * Constructor
     */
    Gerbil(int g) { gerbilNumber = g; }
    /**
     * causes a gerbil to hop
     */
    void hop() {
        System.out.printf("Gerbil number %d is hopping", gerbilNumber);
    }
    /**
     * 
     * @return the number which the gerbil owns
     */
    int getGerbilNumber() {
        return gerbilNumber;
    }
    
    public static void main(String[] args) {
        int array[];
    }
    
}
