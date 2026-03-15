/*
 OBJETIVO: Receba 2 valores reais. Utilizando procedimento, calcular e mostre o maior deles.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex19 {
	
	static double valor1, valor2;
	
	public static void main(String[] args) {
		
		valor1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		valor2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		ProcedureMaior();
	}

	static void ProcedureMaior() {
		
		if (valor1 > valor2) {
            System.out.println("O maior valor é: " + valor1);
        } else {
            System.out.println("O maior valor é: " + valor2);
        }
	}
}
