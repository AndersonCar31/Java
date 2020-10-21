//Exercicio2C.java


import java.util.Scanner;
public class Exercicio2C{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);

        float area, altura, base;
        float divisao=2;


//entrada
    System.out.println("Por Favor Digite o altura");
    altura = teclado.nextFloat();

    System.out.println("Por Favor a Base");
    base = teclado.nextFloat();
//processamento
    area = (base*altura)/divisao;

//saida
   System.out.println("Por Favor "+area);
    }
}
