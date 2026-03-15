/*
 OBJETIVO: Calcular e mostrar o fatorial de um número.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/02/2026
 */

package lista.repetição;

import javax.swing.*;

public class EstRep_Lt1_33 {

	public static void main (String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		
		double soma = 0;
		
		for (int i = 1; i <= n; i++) {
			
			soma = soma + (1.0/i);
		}
		
		JOptionPane.showMessageDialog(null, "A soma da série para o número " + n + " é: " + soma);
	}
}
