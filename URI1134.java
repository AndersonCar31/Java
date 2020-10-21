import java.util.Scanner;
public class URI1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

            int numero,alcool,gasolina,diesel;
            alcool=0;
            gasolina=0;
            diesel=0;
        
        do{
             numero = teclado.nextInt();
             
            if (numero ==1 ){
                alcool++; 
         } 
         else if (numero ==2){ 
             gasolina++;
         } 

         else if (numero == 3){ 
             diesel++; 
         } 
        
        }
        while (numero!=4);
        {
            System.out.println("MUITO OBRIGADO"); 
            System.out.println("Alcool: "+alcool); 
            System.out.println("Gasolina: "+gasolina); 
            System.out.println("Diesel: "+diesel); 

        }
        
    }
}