/*
 OBJETIVO: Calcular e mostrar o fatorial de um número.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/02/2026
 */

package lista.repetição;

import javax.swing.*;

public class EstRep_Lt1_32 {

	public static void main (String[] args) {
		
		int fat = 1;
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		for (int i = n; i > 0; i--) {
			
			fat = fat * i;
		}
	
		JOptionPane.showMessageDialog(null, "O resultado do fatorial de " + n + " é: " + fat);
	}
}
