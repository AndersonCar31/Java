import java.util.Scanner;
public class URI1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float numero;
        int qtdPositivos = 0;
        float media, soma;

        soma = 0; 
            for (int cont=1; cont <= 6 ; cont++){  
            numero = teclado.nextFloat(); 
            if (numero > 0){     
                qtdPositivos++; 
                soma = soma + numero;
            }
        }

        media = soma / qtdPositivos;
        System.out.println(qtdPositivos + " valores positivos");
        System.out.printf("%.1f\n",media);
    }
}