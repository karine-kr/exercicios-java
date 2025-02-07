package Desafio14;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio14Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nomesComRepeticao[] = new String[5];

        System.out.print("O sistema irá ler 20 nomes. ");

        for (int i = 0; i < nomesComRepeticao.length; i++) {
            System.out.println("Informe o nome: ");
            nomesComRepeticao[i] = ler.nextLine();
        }

        String[] nomesSemRepeticao = removeNomesRepetidos(nomesComRepeticao);

        System.out.println("Vetor sem nomes duplicados: "+ Arrays.toString(nomesSemRepeticao));
    }

    private static String[] removeNomesRepetidos(String[] nomesComRepeticao) {
        String[] nomesSemRepeticao = new String[nomesComRepeticao.length];
        int novoTamanho = 0;

        for (int i = 0; i < nomesComRepeticao.length; i++) {
            for (int j = 0; j <= novoTamanho; j++) {
                if (!nomesComRepeticao[i].equals(nomesSemRepeticao[j])) {
                    nomesSemRepeticao[novoTamanho] = nomesComRepeticao[i];
                    novoTamanho++;
                    break;
                }
            }
        }

        return Arrays.copyOf(nomesSemRepeticao, novoTamanho);
    }
}
