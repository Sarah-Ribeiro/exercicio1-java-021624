package br.com.fiap;

import javax.swing.*;

public class EntradaDeDados1 {

    public static void main(String[] args) {
        int num1 = 0, num2 = 0;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite um número: ");
            num1 = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite um outro número: ");
            num2 = Integer.parseInt(aux);

            int somaDosNumeros = num1 + num2;

            JOptionPane.showMessageDialog(null, "Valor 1: " + num1 + "\nValor 2: " + num2 + "\nEsse é o valor total da soma dos dois números: " + somaDosNumeros);
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null,"Formato de número errado!");
        }
    }

}
