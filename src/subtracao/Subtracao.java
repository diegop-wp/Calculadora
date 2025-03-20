package subtracao;

import java.util.Scanner;

public class Subtracao {
    Scanner teclado = new Scanner(System.in);

    public void adicao (){

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        int resultado = num1 + num2;
        System.out.println("Resultado da Adição: " + resultado);
        teclado.close();
    }

    public void subtracao (){

        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        int resultado = num1 - num2;
        System.out.println("Resultado da Adição: " + resultado);
        teclado.close();
    }
    public void multiplicacao(){
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        int resultado = num1 * num2;
        System.out.println("Resultado da Adição: " + resultado);
        teclado.close();
    }
    public void divisao(){
        System.out.print("Digite o primeiro número: ");
        int num1 = teclado.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = teclado.nextInt();

        if (num2 != 0) {
            int resultado = num1 / num2;
            System.out.println("Resultado da divisão: " + resultado);
        } else {
            System.out.println("Erro: Não é possível dividir por zero!");
        }
        teclado.close();
    }
}
