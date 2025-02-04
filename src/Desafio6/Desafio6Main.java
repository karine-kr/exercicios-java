package Desafio6;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Desafio6Main {

    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        Integer numero = new Integer(0);

        while (numero != 10) {
            System.out.println("Digite um número de 1 a 10: ");

            try {
                numero = numeros.nextInt();
                System.out.println("Número digitado: " + numero);
                if (numero < 1 || numero > 10) {
                    System.out.print("Número fora do intervalo de 1 a 10. ");
                }
            } catch (InputMismatchException e) {
                System.out.println("Número digitado: " + numeros.nextLine());
                System.out.print("Tipo do número inválido, digite novamente. ");
            }
        }

        System.out.println("Número 10!! Programa será encerrado!");
        numeros.close();
    }
}
