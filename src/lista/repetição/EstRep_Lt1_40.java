/*
 OBJETIVO: Receba 2 números inteiros. 
 Verifique e mostre todos os números primos existentes entre eles.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

import javax.swing.JOptionPane;

public class EstRep_Lt1_40 {
	
	public static void main(String[] args) {
		
		int divisores = 0;
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		
		if (n1 > n2) {
			
			int aux = n2;
			n2 = n1;
			n1 = aux;
		}
		
		for (int i = n1 + 1; i < n2; i++) {
			
			divisores = 0;
			
			for (int j = 1; j <= i; j++) {
				
				if (i % j == 0) {
					divisores++;
				}
			}
			
			if (divisores == 2) {
				System.out.println("O número " + i + " é primo!");
			}
		}
	}
}