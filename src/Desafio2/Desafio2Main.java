package Desafio2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Desafio2Main {
    public static void main(String[] args) {
        Scanner mercado = new Scanner(System.in);
        System.out.println("Informe o nome do produto desejado:");
        String produto = mercado.nextLine().trim();

        System.out.println("Informe o valor do produto desejado:");
        Float preco = mercado.nextFloat();

        System.out.println("Informe a quantidade que deseja comprar:");
        int quantidade = mercado.nextInt();
        String porcentageMensagem;
        float valorTotal;

        if ((quantidade > 0) &&  (preco > 0)) {
            if (quantidade <= 10) {
                valorTotal = calcularDesconto(preco, 0, quantidade);
                porcentageMensagem = " sem desconto.";
            } else if (quantidade <= 20) {
                valorTotal = calcularDesconto(preco, 10, quantidade);
                porcentageMensagem = " com 10% de desconto.";
            } else if (quantidade <= 50) {
                valorTotal = calcularDesconto(preco, 20, quantidade);
                porcentageMensagem = " com 20% de desconto.";
            } else {
                valorTotal = calcularDesconto(preco, 25, quantidade);
                porcentageMensagem = " com 25% de desconto.";
            }

            DecimalFormat df = new DecimalFormat("0.00");
            System.out.println("O valor total do produto " + produto + " é de R$ " + df.format(valorTotal) + porcentageMensagem);
        }else {
            System.out.println("Preço ou quantidade não pode ser zero!!!");
        }
    }

    private static Float calcularDesconto(Float preco, Integer porcentagem, Integer quantidade) {
        return quantidade * (preco - (preco * porcentagem / 100));
    }
}