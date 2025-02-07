package Desafio12;

public class Desafio12Main {

    public static void main(String[] args) {
        int numeros[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int i;
        int impar = 0;

        System.out.print("Os números ímpares na coleção sâo: ");

        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 != 0) {
                System.out.print(numeros[i] + ", ");
                impar++;
            }
        }
        System.out.print("totalizando " + impar + " números ímpares.");
    }
}