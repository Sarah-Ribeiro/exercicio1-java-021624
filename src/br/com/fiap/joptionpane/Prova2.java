package br.com.fiap.joptionpane;

import javax.swing.*;

public class Prova2 {

    public static void main(String[] args) {
        int prova1 = 0, prova2 = 0, prova3 = 0, prova4 = 0;
        String aux;

        try {
            aux = JOptionPane.showInputDialog("Digite a nota da prova 1:");
            prova1 = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite a nota da prova 2: ");
            prova2 = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite a nota da prova 3: ");
            prova3 = Integer.parseInt(aux);

            aux = JOptionPane.showInputDialog("Digite a nota da prova 4: ");
            prova4 = Integer.parseInt(aux);

            int media = (prova1 + prova2 + prova3 + prova4) / 4;

            JOptionPane.showMessageDialog(null, "Nota da prova 1: " + prova1 + "\nNota da prova 2: " + prova2 + "\nNota da prova 3: " + prova3 + "\nNota da prova 4: " + prova4 + "\nMédia da soma das notas das provas: " + media);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "O formato do número está errado: " + e);
        }
    }

}
