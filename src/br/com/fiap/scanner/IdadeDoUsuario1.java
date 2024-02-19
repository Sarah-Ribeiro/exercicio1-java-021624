package br.com.fiap.scanner;

import java.util.Scanner;

public class IdadeDoUsuario1 {

    public static void main(String[] args) {
        int anoAtual = 0, anoNascimento = 0;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite o ano atual e o seu ano de nascimento: ");
            anoAtual = scanner.nextInt();
            anoNascimento = scanner.nextInt();

            int idadeUsuario = anoAtual - anoNascimento;

            System.out.println("Ano atual: " + anoAtual + "\nAno de nascimento: " + anoNascimento);
            System.out.println("Essa é a idade do usuário: " + idadeUsuario + " anos de idade");
        } catch (Exception e) {
            System.out.println("O formato do número está inválido: " + e);
        }
    }

}
