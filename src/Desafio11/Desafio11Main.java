package Desafio11;

import java.util.Scanner;

public class Desafio11Main {
    public static void main(String[] args) {
        int aux = 1;
        String usuario;
        String senha;

        while (true) {
            if (aux <= 3) {
                Scanner usuarios = new Scanner(System.in);
                System.out.println("Digite o usuário: ");
                usuario = usuarios.nextLine();

                System.out.println("Digite a senha: ");
                senha = usuarios.nextLine();

                if (usuario.equals("aluno") && senha.equals("segredo")) {
                    System.out.println("Bem vindo!!");
                    break;
                } else {
                    System.out.println("Login não efetuado!!");
                    aux++;
                }
            } else {
                System.out.println("Usuário bloqueado!!!");
                break;
            }
        }
    }
}
