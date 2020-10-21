/* import java.util.Scanner;

public class URI1041{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        float X,Y;

        X = teclado.nextFloat();
        Y = teclado.nextFloat();

        if (X>0 && Y>0){
            System.out.println("Q1");
        }

        else if (X>0 && Y!=0){
            System.out.println("Q4");
        }

        else if (X < 0 && Y < 0){
            System.out.println("Q3");

        }

        else if (X==0 && Y ==0){
            System.out.println("Origem");
        }

        else if (Y>0 && X !=0){
            System.out.println("Q2");
        }
        
       }
}
*/

 import java.util.Scanner; 
 public class URI1041{ 
     public static void main(String args[]){ 
         Scanner teclado = new Scanner(System.in); 
 
 
         float x, y; 
         x = teclado.nextFloat(); 
         y = teclado.nextFloat(); 
 
 
         if (x > 0 && y > 0){ 
             System.out.println("Q1"); 
         } 
         else if (x < 0 && y > 0){ 
             System.out.println("Q2"); 
         } 
         else if (x < 0 && y < 0){ 
             System.out.println("Q3"); 
         } 
        else if (x > 0 && y < 0){ 
             System.out.println("Q4"); 
         } 
         else if (x == 0 && y != 0){ 
             System.out.println("Eixo Y"); 
         } 
         else if (x != 0 && y == 0){ 
             System.out.println("Eixo X"); 
         } 
         else{ 
             System.out.println("Origem"); 
        } 
     } 
 } 
