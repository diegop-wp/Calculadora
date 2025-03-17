package subtracao;

import java.util.Scanner;

public class Subtracao {
    Scanner teclado = new Scanner(System.in);
    int soma = 0;
    int num = 0;
    public void Soma (){

        for (int i = 0; i < 2; i++) {
            System.out.println("Digite o "+(i+1)+"° Número :");
            num = teclado.nextInt();
            soma += num;
        }
        System.out.println("Resultado Da Soma: "+soma);

    }
}
