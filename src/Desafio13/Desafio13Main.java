package Desafio13;

import java.util.Scanner;

public class Desafio13Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        String nomes[] = new String[10];

        System.out.print("O sistema irá ler 10 nomes. ");

        for (int i = 0; i < nomes.length; i++) {
            System.out.println("Informe o nome: ");
            nomes[i] = ler.nextLine();
        }

        System.out.println("Digite o nome que deseja buscar: ");
        String buscaNome = ler.nextLine();
        Boolean achou = Boolean.FALSE;

        for (int j = 0; j < nomes.length; j++) {
            if (nomes[j].equalsIgnoreCase(buscaNome)) {
                achou = Boolean.TRUE;
                break;
            }
        }

        if (achou) {
            System.out.println("Achei!!");
        } else {
            System.out.println("Não achei!!");
        }
    }
}
