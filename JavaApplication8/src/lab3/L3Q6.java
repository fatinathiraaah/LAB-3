
package lab3;

import java.util.Scanner;


public class L3Q6 {

  
    public static void main(String[] args) {
        
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

    
    

