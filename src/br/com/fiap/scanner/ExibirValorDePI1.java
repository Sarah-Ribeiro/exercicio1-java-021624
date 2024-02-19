package br.com.fiap.scanner;

import java.util.Scanner;

public class ExibirValorDePI1 {

    public static void main(String[] args) {
        int valorDoRaio = 0;
        Scanner scanner;

        try {
            scanner = new Scanner(System.in);
            System.out.println("Digite aqui o valor do raio: ");
            valorDoRaio = scanner.nextInt();

            double area = 3.14 * valorDoRaio * valorDoRaio;

            System.out.println("Valor do raio: " + valorDoRaio + "\nValor da área do círculo: " + area);
        } catch (Exception e) {
            System.out.println("O formato do número está errado: " + e);
        }
    }

}
