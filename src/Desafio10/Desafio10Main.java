package Desafio10;

import java.util.Scanner;

public class Desafio10Main {
    public static void main(String[] args) {
        int aux = 1;
        int novoCalculo;

        do {
            if (aux >= 1) {
                Scanner notas = new Scanner(System.in);
                System.out.println("Digite a primeira nota: ");
                float primeiraNota = notas.nextFloat();

                System.out.println("Digite a segunda nota: ");
                float segundaNota = notas.nextFloat();

                float somatorio = primeiraNota + segundaNota;
                float media = somatorio / 2;

                if (media >= 7) {
                    System.out.printf("Aprovado, a média final foi de %.2f. ", media);
                } else {
                    System.out.printf("Reprovado, a média final foi de %.2f. ", media);
                }

            }
            System.out.println("Deseja realizar um novo cálculo? Digite '1' para sim ou '2' para não: ");
            Scanner novo = new Scanner(System.in);
            novoCalculo = novo.nextInt();

        }
        while (novoCalculo <= 1);


    }
}


