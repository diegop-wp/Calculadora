import subtracao.Subtracao;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Subtracao calculadora = new Subtracao();

        Scanner teclado = new Scanner(System.in);

        System.out.println("-----Calculadora-----");

        System.out.println(" 1: Subtração");

        switch (teclado.nextInt()){
            case 1:
                calculadora.Soma();
        }

    }
}
