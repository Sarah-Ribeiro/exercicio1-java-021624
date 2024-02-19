package br.com.fiap.scanner;

import java.util.Scanner;

public class Prova1 {

    public static void main(String[] args) {
        int prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite aqui as notas de todas as 4 provas: ");
            prova1 = scanner.nextInt();
            prova2 = scanner.nextInt();
            prova3 = scanner.nextInt();
            prova4 = scanner.nextInt();

            int media = (prova1 + prova2 + prova3 + prova4) / 4;

            System.out.println("Nota da prova 1: " + prova1 + "\nNota da prova 2: " + prova2 + "\nNota da prova 3: " + prova3 + "\nNota da prova 4: " + prova4);
            System.out.println("Essa é a média da nota de todas as provas: " + media);
        } catch (Exception e) {
            System.out.println("O formato do número está errado: " + e);
        }
    }



}
