/*
 OBJETIVO: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

import javax.swing.JOptionPane;

public class EstRep_Lt1_36 {
	
	public static void main(String[] args) {
		
		int fat = 1;
		
		double soma = 1;
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		for (int i = 1; i <= n; i++) {
			
			fat = fat * i;
			
			soma = soma + (1.0 / fat);
			
		}
		
		System.out.println("A soma é: " + soma);
	}

}
