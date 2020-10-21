/*import java.util.Scanner;

public class URI1046{
    public static void main(String args[]){
    Scanner teclado = new Scanner(System.in);

    int hoarioentrata,horariosaida,tempojogado,dia;

    hoarioentrata = teclado.nextInt();
    horariosaida = teclado.nextInt();
    dia = 24;
    

    if (hoarioentrata<horariosaida){
        tempojogado=horariosaida-hoarioentrata;
        System.out.println("O JOGO DUROU "+tempojogado+" HORA(S)");
    }
    else if (hoarioentrata==horariosaida){
        System.out.println("O JOGO DUROU 24 HORA(S)");
    }
   else if (hoarioentrata>horariosaida){
        tempojogado= (dia-hoarioentrata)+horariosaida;
        System.out.println("O JOGO DUROU "+tempojogado+"  HORA(S)");
    }
    
    }
}
*/
import java.util.Scanner; 
public class URI1046{ 
     public static void main(String args[]){ 
         Scanner teclado = new Scanner(System.in); 
         int hI, hF, dur; 
 
 
         hI = teclado.nextInt(); 
         hF = teclado.nextInt(); 
 
 
         dur = hF - hI; 
 
 
         if (dur <= 0){ 
             dur = dur + 24; 
         } 
         System.out.println("O JOGO DUROU "+dur+" HORA(S)"); 
         // System.out.printf("O JOGO DUROU %d HORA(S)\n",dur); 
 
 
     } 
 } 
