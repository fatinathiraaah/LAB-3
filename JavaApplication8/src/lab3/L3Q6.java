/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class L3Q6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Scanner s=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double rad=s.nextDouble();
        System.out.println("Enter value of x:");
        double x=s.nextDouble();
        System.out.println("Enter value of y:");
        double y=s.nextDouble();
        double z=Math.sqrt(Math.pow(y,2)+Math.pow(x,2));
        {
        
        if(rad>z)
                System.out.println("The point is inside the circle.");
        else if (rad<z)
                System.out.println("The point is outside the circle.");
        else
                System.out.println("The point is on the cicle.");
            }
        
    }
    
}

    
    

