
package lab3;

import java.util.Scanner;


public class L3Q3 {

    
    public static void main(String[] args) {
        
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
    


    
    

