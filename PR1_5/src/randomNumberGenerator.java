/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Random;
/**
 * @discription Will take a random number (0<x<100) and test it against 25 other
 * random numbers.
 * @author rsexton17
 */
public class randomNumberGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random RNG = new Random();
        Random testRNG = new Random();
        int testInt = testRNG.nextInt(100);
        for (int i=0; i<25; i++) {
            int randomInt = RNG.nextInt(100);
            if (randomInt > testInt)
                System.out.printf("%d is greater than %d\n", randomInt, testInt);
            else if (randomInt < testInt)
                System.out.printf("%d is less than %d\n", randomInt, testInt);
            else
                System.out.printf("%d and %d are equal\n", randomInt, testInt);
        }
    }
    
}
