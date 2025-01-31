package Desafio3;

import java.util.Scanner;

public class Desafio3Main {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.println("Informe a primeira nota:");
        Float primeiraNota = notas.nextFloat();

        System.out.println("Informe a segunda nota:");
        Float segundaNota = notas.nextFloat();

        System.out.println("Informe a terceira nota:");
        Float terceiraNota = notas.nextFloat();

        float media = (primeiraNota + segundaNota + terceiraNota) / 3;

        if (media < MediaEnum.MEDIA_REPROVADO.getNota()) {
            System.out.println("Reprovado");
        }
        else if(media < MediaEnum.MEDIA_RECUPERACAO.getNota()) {
            System.out.println("Recuperação");
        }else{
            System.out.println("Aprovado");
        }
    }
}
