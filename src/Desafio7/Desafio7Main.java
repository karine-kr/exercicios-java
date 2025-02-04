package Desafio7;

public class Desafio7Main {
    public static void main(String[] args) {
        int primeiroValor = 1;
        int segundoValor = 100;
        int novoValor = primeiroValor;
        int somatorio = 0;

        while (primeiroValor <= segundoValor) {
            somatorio = somatorio + primeiroValor;
            primeiroValor += 1;
        }

        System.out.println("A soma dos números de 1 a 100 é: " + somatorio);

    }
}
