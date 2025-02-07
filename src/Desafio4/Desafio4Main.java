package Desafio4;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Desafio4Main {

    public static void main(String[] args) {
        Scanner calculadora = new Scanner(System.in);

        System.out.println("Qual operação deseja fazer, digitando um dos seguintes operadores:  + , - , / * ");
        String operacao = calculadora.nextLine().trim();

        System.out.println("Informe o primeiro número:");
        Float primeiroNumero = calculadora.nextFloat();

        System.out.println("Informe o segundo número:");
        Float segundoNumero = calculadora.nextFloat();

        float calculo = 0;
        DecimalFormat df = new DecimalFormat("0.00");

        switch (operacao) {
            case "+":
                calculo = (primeiroNumero + segundoNumero);
                System.out.println("O valor do cálculo desejado foi de " + df.format(calculo));
                break;
            case "/":
                if (segundoNumero != 0){
                    calculo = (primeiroNumero / segundoNumero);
                    System.out.println("O valor do cálculo desejado foi de " + df.format(calculo));
                } else {
                    System.out.println("Não é possível efetuar divisão informando número zero!");
                }
                break;
            case "-":
                calculo = (primeiroNumero - segundoNumero);
                System.out.println("O valor do cálculo desejado foi de " + df.format(calculo));
                break;
            case "*":
                calculo = (primeiroNumero * segundoNumero);
                System.out.println("O valor do cálculo desejado foi de " + df.format(calculo));
                break;

        }
    }
}
