/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_2;

/**
 * @date 1-5-2015
 * @author rsexton17
 */
public class PR1_2 {

    /**
     * @param args array of strings.
     * @return no value.
     * @exception no exceptions.
     */
    public static void main(String[] args) {
        //PT: Since you're expecting 3 arguments, it'd be good to check
        //if (args.length < 3) System.out.println("Please enter three arguments");
        //else { ...
        for (int i=0; i<3; i++) {
            System.out.println(args[i]);
        }
    }
    
}
