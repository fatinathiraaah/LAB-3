
package lab3;

import java.util.Scanner;


public class L3Q1 {

    
    public static void main(String[] args) {
       
        Scanner s=new Scanner (System.in);
    double z;
    System.out.print("Enter two integer number:");
    double x=s.nextDouble();
    double y=s.nextDouble();
    System.out.print("Enter the operator:");
    char oper=s.next().charAt(0);{
    
            switch (oper) {
                case '+':
                    z=x+y;
                    System.out.println(x+" "+oper+" "+y+" = "+z);
                    break;
                case '-':
                    z=x-y;
                    System.out.println(x+" "+oper+" "+y+" = "+z);
                    break;
                case '*':
                    z=x*y;
                    System.out.println(x+" "+oper+" "+y+" = "+z);
                    break;
                case '/':
                    z=x/y;
                    System.out.println(x+" "+oper+" "+y+" = "+z);
                    break;
                case '%':
                    z=x%y;
                    System.out.println(x+" "+oper+" "+y+" = "+z);
                    break;
                default:
                    System.out.println("enter another operator please :)");
                    break;
            }
    
        } 
    }
    
}

    
    

