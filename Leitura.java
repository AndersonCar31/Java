//Leitura.java

import java.util.Scanner;
public class Leitura{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        int valorInteiro;
        double valorReal;

        System.out.println("Por favor digite um valor inteiro");
        valorInteiro = teclado.nextInt();
        System.out.println("Por favor digite um valor inteiro"+valorInteiro);

        System.out.println("Por favor digite um valor Real");
        valorReal = teclado.nextDouble();
        System.out.println("Por favor digite um valor inteiro"+valorReal);

    }

}