package Desafio9;

import java.util.Scanner;

public class Desafio9Main {

    public static void main(String[] args) {
        Scanner divisao = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        float primeiroValor = divisao.nextFloat();

        System.out.println("Digite o segundo número, lembrando que ele deve ser diferente de zero: ");
        float segundoValor = divisao.nextFloat();

        while (true) {
            if (segundoValor != 0) {
                float quociente = primeiroValor / segundoValor;
                float resto = primeiroValor % segundoValor;
                System.out.printf("O resultado da divisão consiste em: Resto igual a %.1f e Quociente igual a %.1f ", resto, quociente);
                break;
            } else {
                System.out.println("Número igual a zero. Por favor, digite um novo número: ");
                segundoValor = divisao.nextFloat();
            }
        }
    }
}