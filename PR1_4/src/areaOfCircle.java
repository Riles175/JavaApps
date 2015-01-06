/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 * @description Will take an inputed radius and calculate the volume of the
 * circle that it belonged to.
 * @author rsexton17
 */
public class areaOfCircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.print("Enteer the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = Math.PI*(radius*radius);
        System.out.printf("The circle is %f units big", area);
    }
    
}
