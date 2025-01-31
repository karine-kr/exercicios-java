package Desafio2;

//import Desafio1.BebidasEnum;

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
        String porcentageMensagem = new String();
        float valorTotal;

        if (quantidade <= 10) {
            valorTotal = calcularDesconto(preco, 0, quantidade);
        } else if (quantidade <= TabelaDescontosEnum.DESCONTO_10.getLimiteUnidades()) {
            valorTotal = calcularDesconto(preco, TabelaDescontosEnum.DESCONTO_10.getPorcentagemDesconto(), quantidade);
            porcentageMensagem = " com " + TabelaDescontosEnum.DESCONTO_10.getMensagem() + " de desconto";
        } else if (quantidade <= TabelaDescontosEnum.DESCONTO_20.getLimiteUnidades()) {
            valorTotal = calcularDesconto(preco, TabelaDescontosEnum.DESCONTO_20.getPorcentagemDesconto(), quantidade);
            porcentageMensagem = " com " + TabelaDescontosEnum.DESCONTO_20.getMensagem() + " de desconto";
        } else {
            valorTotal = calcularDesconto(preco, TabelaDescontosEnum.DESCONTO_25.getPorcentagemDesconto(), quantidade);
            porcentageMensagem = " com " + TabelaDescontosEnum.DESCONTO_25.getMensagem() + " de desconto";
        }

        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("O preço total" + porcentageMensagem + " é de R$ " + df.format(valorTotal));
    }

    private static Float calcularDesconto(Float preco, Integer porcentagem, Integer quantidade) {
        return quantidade * (preco - (preco * porcentagem / 100));
    }
}