/*
 OBJETIVO: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex22 {

	static int valor1, valor2;
	
	public static void main(String[] args) {
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		ProcedureCrescente();
	}
	
	static void ProcedureCrescente() {
		
		if (valor1 > valor2) {
			
			System.out.println(valor2 + ", " + valor1);
			
		} else {
			
			System.out.println(valor1 + ", " + valor2);
			
		}
		
	}
}
