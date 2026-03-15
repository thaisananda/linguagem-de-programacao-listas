/*
 OBJETIVO: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_24 {
	
	public static void main(String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		
		if (n1 % 2 == 0 && n1 % 3 == 0) {
			
			System.out.println("O número " + n1 + " é divisível por 2 e por 3");
			
		} else {
			
			System.out.println("O número não é divisível por 2 e por 3");
			
		}
	}

}
