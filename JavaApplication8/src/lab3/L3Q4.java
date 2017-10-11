
package lab3;

import java.util.Random;


public class L3Q4 {

    
    public static void main(String[] args) {
      
        Random r=new Random();
         String player1="Player 1", player2="Player 2";
         final int SIZE=6;
         int dice,j,totalp1=0,totalp2=0;
         
         for(j=1;j<3;j++){
         int i=1;
         while(true){
             dice=r.nextInt(SIZE)+1;
             
         if(i%2==1){
             totalp1+=dice;
             System.out.println("total for player 1 is "+totalp1);
                    
         }
         else{
             totalp2+=dice;
             System.out.println("total for player 2 "+totalp2);
         }
         i++;
         
         if(totalp1>totalp2){
                 System.out.println(player1+" wins the game!");
                 break;
         }
         else if (totalp1<totalp2){
                 System.out.println(player2+" wins the game!");
                 break;
         }
         }
         }
          
      }
}

    
    
