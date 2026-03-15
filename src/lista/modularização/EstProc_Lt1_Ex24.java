/*
 OBJETIVO: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex24 {
	
	static int n1;
	
	public static void main(String[] args) {
		
		n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		
		ProcedureDivisivel();
	}
	
	static void ProcedureDivisivel() {
		
		if (n1 % 2 == 0 && n1 % 3 == 0) {
			
			System.out.println("O número " + n1 + " é divisível por 2 e por 3");
			
		} else {
			
			System.out.println("O número não é divisível por 2 e por 3");
			
		}
	}

}
