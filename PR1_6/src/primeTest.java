/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 * @description Will test to see if a number is prime and give all numbers up
 * to a selected value.
 * @author rsexton17
 */
public class primeTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Up to what integer would you like to test for primes?");
        Scanner input = new Scanner(System.in);
        int testMax = input.nextInt();
        for (int i=1; i<testMax; i++) {
            boolean isPrime = true;
            for (int j=2; j<i; j++) {
                if (i%j==0) {
                    isPrime = false;
            }
        }
        if (isPrime == true)
            System.out.printf(" %d ", i);
    }  
}
}
