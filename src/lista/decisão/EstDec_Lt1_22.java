/*
 OBJETIVO: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_22 {

	public static void main(String[] args) {
		
		int valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		int valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		if (valor1 > valor2) {
			
			System.out.println(valor2 + ", " + valor1);
			
		} else {
			
			System.out.println(valor1 + ", " + valor2);
			
		}

	}
}
