package br.com.fiap;

import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite dois números inteiros: ");
            num1 = scanner.nextInt();
            num2 = scanner.nextInt();
            System.out.println("Valor 1: " + num1 + "\nValor 2: " + num2);
            System.out.println("Essa é a soma dos valores: " + (num1 + num2));
        } catch (Exception e) {
            System.out.println("O formato do número está invalido.");
        }

    }

}
