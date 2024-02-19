package br.com.fiap.joptionpane;

import javax.swing.*;

public class IdadeDoUsuario2 {

    public static void main(String[] args) {
        int anoAtual = 0, anoNascimento = 0;
        String aux;

        try {
            aux = JOptionPane.showInputDialog(null, "Digite o ano atual: ");
            anoAtual = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog(null, "Digite o ano de nascimento: ");
            anoNascimento = Integer.parseInt(aux);

            int idadeUsuario = anoAtual - anoNascimento;

            JOptionPane.showMessageDialog(null, "Ano atual registrado: " + anoAtual + "\nAno de nascimento registrado: " + anoNascimento + "\nA idade do usuário conforme a diferença entra o ano atual e o ano de nascimento: " + idadeUsuario);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O formato do número está errado: " + e);
        }
    }

}
