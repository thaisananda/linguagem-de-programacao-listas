/*
 OBJETIVO:Receba 3 valores obrigatoriamente em ordem crescente e um 4º valor não necessariamente em ordem. 
 Mostre os 4 números em ordem crescente.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex23 {
	
	static int valor1, valor2, valor3, valor4;
	
	public static void main(String[] args) {
		
		JOptionPane.showMessageDialog(null,"Insira 3 valores OBRIGATORIAMENTE em ordem crescente: ");
		
		valor1 = Integer.parseInt(JOptionPane.showInputDialog("Primeiro valor: "));
		valor2 = Integer.parseInt(JOptionPane.showInputDialog("Segundo valor: "));
		valor3 = Integer.parseInt(JOptionPane.showInputDialog("Terceiro valor: "));
		valor4 = Integer.parseInt(JOptionPane.showInputDialog("Insira um quarto valor NÃO NECESSARIAMENTE EM ORDEM: "));

		ProcedureCrescente();
	}

	static void ProcedureCrescente() {
		
		 	if (valor4 <= valor1) {
			 
	            System.out.println(valor4 + " " + valor1 + " " + valor2 + " " + valor3);
	            
	        } else if (valor4 <= valor2) {
	        	
	            System.out.println(valor1 + " " + valor4 + " " + valor2 + " " + valor3);
	            
	        } else if (valor4 <= valor3) {
	        	
	            System.out.println(valor1 + " " + valor2 + " " + valor4 + " " + valor3);
	            
	        } else {
	        	
	            System.out.println(valor1 + " " + valor2 + " " + valor3 + " " + valor4);
	            
	        }
	}
}
