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
public class L3Q3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s=new Scanner(System.in);
        double comm,sale;
        System.out.println("Enter the sales volume:");
        sale=s.nextDouble();
        if (sale<=100){
            comm=0.05*sale;
            System.out.printf("your total commision is "+"%.2f\n", comm);
        }
        else if((sale>100) && (sale<=500)){
            comm=0.075*sale;
            System.out.printf("your total commision is "+ "%.2f\n",comm);
        }
        else if((sale>500) && (sale <=1000)){
            comm=0.1*sale;
            System.out.printf("your total commision is "+ "%.2f\n",comm);
        }
        else{
        comm=0.125*sale;
        System.out.printf("your total commision is "+"%.2f\n", comm);
    }
    }
}
    


    
    

