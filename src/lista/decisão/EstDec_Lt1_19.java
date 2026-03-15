/*
 OBJETIVO: Receba 2 valores reais. Calcular e mostrar o maior deles.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.decisão;

import javax.swing.*;

public class EstDec_Lt1_19 {

    public static void main(String[] args) {

        double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));

        double valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));

        if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }

    }
}