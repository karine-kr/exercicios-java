package Desafio1;

import java.util.Scanner;

public class Desafio1Main {
    public static void main(String[] args) {
        Scanner mercado = new Scanner(System.in);
        System.out.println("Bem vindo ao mercado! No momento temos somente três bebidas para venda: Cerveja, Refrigerante ou Água. Qual você deseja?");
        String bebida = mercado.nextLine().trim();

        if (bebida.equalsIgnoreCase(BebidasEnum.CERVEJA.name())) {
            System.out.println("Qual a sua idade?");
            int num = mercado.nextInt();
            if (num < BebidasEnum.CERVEJA.getIdadeMinima()) {
                System.out.println("Compra negada");
            } else {
                System.out.println("Compra efetuada com sucesso.");
            }
        } else if (bebida.equalsIgnoreCase(BebidasEnum.REFRIGERANTE.name()) || (bebida.equalsIgnoreCase(BebidasEnum.AGUA.name()))) {
            System.out.println("Compra efetuada com sucesso.");
        } else {
            System.out.println("Produto não existe no mercado. No momento só temos disponível: Cerveja, Refrigerante ou Água ");
        }
    }
}