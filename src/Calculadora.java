import subtracao.Subtracao;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Subtracao calculadora = new Subtracao();

        Scanner teclado = new Scanner(System.in);

        System.out.println("-----Calculadora-----");

        System.out.println(" 1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - multiplicação");


        switch (teclado.nextInt()){
            case 1:
                calculadora.adicao();
                break;
            case 2:
                calculadora.subtracao();
                break;
            case 3:
                calculadora.multiplicacao();
                break;
            default:
                break;
        }

    }
}
