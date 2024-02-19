package br.com.fiap.joptionpane;

import javax.swing.*;

public class ExibirValorDePI2 {

    public static void main(String[] args) {
        int valorDoRaio = 0;
        String aux;

        try {
            aux = JOptionPane.showInputDialog(null, "Digite aqui o valor do raio: ");
            valorDoRaio = Integer.parseInt(aux);

            double area = 3.14 * valorDoRaio * valorDoRaio;

            JOptionPane.showMessageDialog(null, "O valor do raio: " + valorDoRaio + "\nÁrea do circulo: " + area);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O formato do número está inválido: " + e);
        }
    }

}
