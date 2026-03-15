/*
 OBJETIVO: Calcular e mostrar o resultado da diferença do maior pelo menos valor.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_18 {
	
	public static void main (String[] args) {
		
		int dif = 0;
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite outro valor inteiro: "));
		
		if (n2 > n1) {
			
			dif = n2 - n1;
			
		} else {
			
			dif = n1 - n2;
			
		}
		
		JOptionPane.showMessageDialog(null, "A diferença é: " + dif);
	}

}
