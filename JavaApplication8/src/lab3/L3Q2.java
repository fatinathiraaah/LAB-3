
package lab3;

import java.util.Random;


public class L3Q2 {

   
    public static void main(String[] args) {
       
         Random rand=new Random();
         final int SIZE=6;
         int num=rand.nextInt(SIZE);
         switch(num){
             case 0:
                 System.out.println("0 is zero");
                 break;
             case 1:
                 System.out.println("1 is one");
                 break;
             case 2:
                 System.out.println("2 is two");
                 break;
             case 3:
                 System.out.println("3 is three");
                 break;
             case 4:
                 System.out.println("4 is four");
                 break;
             case 5:
                 System.out.println("5 is five");
                 break;
             default:
                 System.out.println("others");
         }
     }
    
}

    
    

