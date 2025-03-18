package subtracao;

import java.util.Scanner;

public class Subtracao {
    Scanner teclado = new Scanner(System.in);

    public void soma (){

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        int resultado = num1 - num2;
        System.out.println("Resultado da subtração: " + resultado);
        teclado.close();
    }
}
