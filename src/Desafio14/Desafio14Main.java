package Desafio14;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio14Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String comNomesDuplicados[] = new String[20];

        System.out.print("O sistema irá ler 20 nomes. ");

        for (int aux = 0; aux < comNomesDuplicados.length; aux++) {
            System.out.println("Informe o nome: ");
            comNomesDuplicados[aux] = ler.nextLine();
        }

        String semNomesDuplicados[] = removerNomesDuplicados(comNomesDuplicados);
        System.out.println("Os nomes sem duplicação são: " + Arrays.toString(semNomesDuplicados));
    }

    private static String[] removerNomesDuplicados(String[] comNomesDuplicados){
        int tamanho = comNomesDuplicados.length;
        String[]semNomesDuplicados = Arrays.copyOf(comNomesDuplicados, tamanho);

        for(int i = 0; i< tamanho; i++){
            int auxRemocao = i + 1;
            int removidos = 0;
            for (int j = i + 1; j < tamanho; j++){
                if (semNomesDuplicados[j].equals(semNomesDuplicados[i])) {
                    removidos++;
                }else {
                    semNomesDuplicados[auxRemocao++] = semNomesDuplicados[j];
                }
            }
            tamanho = tamanho - removidos;
        }
        semNomesDuplicados = Arrays.copyOf(semNomesDuplicados, tamanho);
        return semNomesDuplicados;
    }
}