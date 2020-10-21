import java.util.Scanner;
public class URI1066{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qdtdaPares = 0;
        int qtdaImpares = 0;
        int qtdaPositivo = 0;
        int qtdaNegativos = 0;


        

        for (int cont=1; cont <= 5 ; cont++){  
            numero = teclado.nextInt();

            if (numero % 2 == 0){     
                qdtdaPares++;
            }

            else {
                qtdaImpares++;
            }
                
            if (numero > 0 ){
                    qtdaPositivo ++;
                }

                else if (numero < 0 ){
                    qtdaNegativos++;
                }


                
        
        }

        System.out.println(qdtdaPares+" valor(es) par(es)");
        System.out.println(qtdaImpares+" valor(es) impar(es)");
        System.out.println(qtdaPositivo+" valor(es) positivo(s)");
        System.out.println(qtdaNegativos+" valor(es) negativo(s)");

    }
}