
package lab3;

import java.util.Scanner;


public class L3Q5 {

   
    public static void main(String[] args) {
        
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

    
    

