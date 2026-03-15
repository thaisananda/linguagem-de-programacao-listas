/*
 OBJETIVO: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex26 {
	
	static int n1, n2, aux;
	
	public static void main(String[] args) {
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número inteiro: "));
		
		if (n1 > n2) {
			
			int aux = n1;
			n1 = n2;
			n2 = aux;
			
		} 
		
		ProcedureMultiplo();
	}
	
	static void ProcedureMultiplo() {
		
		if (n1 == 0) {
			JOptionPane.showMessageDialog(null, "Não é possível verificar múltiplo com zero.");
		} else if (n2 % n1 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + n2 + " é múltiplo de " + n1);
		} else {
			JOptionPane.showMessageDialog(null, "O número " + n2 + " não é múltiplo de " + n1);
		}
	}

}
