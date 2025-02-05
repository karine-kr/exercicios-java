package Desafio8;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio8Main {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Integer numero = new Integer(0);

        do {
            System.out.println("Digite um número inteira de 1 a 10 para imprimir a tabuada: ");

            try {
                numero = numeros.nextInt();

                if (numero < 1 || numero > 10) {
                    System.out.print("Número fora do intervalo de 1 a 10. ");
                } else {
                    System.out.println("Tabuada do " + numero);
                    for (int cont = 1; cont <= 10; cont++) {
                        System.out.println(numero + " X " + cont + " = " + cont * numero);
                    }
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Número digitado: " + numeros.nextLine());
                System.out.print("Tipo do número inválido, digite novamente. ");
            }
        } while (true);

        numeros.close();
    }
}
