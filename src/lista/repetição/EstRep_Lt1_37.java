/*
 OBJETIVO: Receba um número inteiro. Calcule e mostre a série de Fibonacci até o seu N’nésimo termo.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

import javax.swing.JOptionPane;

public class EstRep_Lt1_37 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro: "));
		
		int a = 0, b = 1, c;
		
		for(int i = 1; i <= n; i++) {
			
			 c = a + b;
	         System.out.println(c);
	         a = b;
	         b = c;

		}
	}

}
