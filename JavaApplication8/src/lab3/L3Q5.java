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
public class L3Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
          double x,y;
          System.out.println("Enter the value of a,b,c,d,e,f:");
          double a=s.nextInt();
          double b=s.nextInt();
          double c=s.nextInt();
          double d=s.nextInt();
          double e=s.nextInt();
          double f=s.nextInt();
          double z=(a*d)-(b*c);{
          if (z==0)
              System.out.println("The equation has no solution.");
          else{
              x=(e*d-b*f)/(a*d-b*c);
              y=(a*f-e*c)/(a*d-b*c);
              System.out.println("x is "+x);
              System.out.println("y is "+y);
          }
      }
      }
}

    
    

