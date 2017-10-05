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
public class L3Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner (System.in);
    double z;
    System.out.print("Enter two integer number:");
    double x=s.nextInt();
    double y=s.nextInt();
    System.out.print("Enter the operand:");
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
                    System.out.println("enter another operand");
                    break;
            }
    
        } 
    }
    
}

    
    

