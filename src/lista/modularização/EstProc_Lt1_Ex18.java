/*
 OBJETIVO: Utilizando procedimento, calcular e mostrar o resultado da diferença do maior pelo menos valor.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex18 {
	
	static int dif, n1, n2;
	
	public static void main (String[] args) {
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		
		ProcedureDiferenca();
		
		JOptionPane.showMessageDialog(null, "A diferença é: " + dif);

	}

	static void ProcedureDiferenca() {
		
		if (n2 > n1) {
			
			dif = n2 - n1;
			
		} else {
			
			dif = n1 - n2;
			
		}
	}
}
