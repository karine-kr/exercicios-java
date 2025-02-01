package Desafio5;

import java.util.Scanner;

public class Desafio5Main {

    public static void main(String[] args) {
        Scanner venda = new Scanner(System.in);

        System.out.println("Digite o nome do vendedor: ");
        String vendedor = venda.nextLine().trim();

        System.out.println("Informe o valor do imóvel:");
        Float valor = venda.nextFloat();

        float comissao;
        float novoValor;

        if (valor < 30000.00) {
            comissao = valor * 10 / 100;
            novoValor = valor + comissao;
            System.out.println(vendedor+", O valor sem comissão é de R$ " + valor + ". O valor de 10% da comissão é de R$ " + comissao + ". Ficando um valor total do imóvel de R$ "+novoValor);
        }else if (valor < 50000.00) {
            comissao = valor * 15 / 100;
            novoValor = valor + comissao;
            System.out.println(vendedor+", O valor sem comissão é de R$ " + valor + ". O valor de 15% da comissão é de R$ " + comissao + ". Ficando um valor total do imóvel de R$ "+novoValor);
        } else {
            comissao = valor * 20 / 100;
            novoValor = valor + comissao;
            System.out.println(vendedor+", O valor sem comissão é de R$ " + valor + ". O valor de 20% da comissão é de R$ " + comissao + ". Ficando um valor total do imóvel de R$ "+novoValor);
        }
    }
}
