/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication2;
import java.util.Scanner;

/**
 *
 * @author rsexton17
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Pete";
        System.out.printf("Hello %s, what is your score?", name);
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        System.out.printf("Your score is %d\n", score);
    }
    
}
