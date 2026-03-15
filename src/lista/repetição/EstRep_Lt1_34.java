/*
 OBJETIVO: Calcular e mostrar a tabuada de um número.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/02/2026
 */

package lista.repetição;

import javax.swing.*;

public class EstRep_Lt1_34 {
	
	public static void main (String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
				
		System.out.println("A tabuada do " + n + " é: ");

		for (int i = 1; i <= 10; i++) {
			
			int tab = n * i;
			
			System.out.println( n + " x " + i + " = " + tab);
			
		}
				
				
	}

}
