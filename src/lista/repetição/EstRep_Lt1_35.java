/*
 OBJETIVO: Calcular e mostrar o resultado da somatória dos números ímpares entre esses valores.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/02/2026
 */

package lista.repetição;

import javax.swing.*;

public class EstRep_Lt1_35 {

	public static void main(String[] args) {
		
		int soma_impar = 0;
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		if (n1 > n2) {
			
			int aux = n1;
			n1 = n2;
			n2 = aux;
		}

		for (int i = n1 + 1; i < n2; i++) {
							
				if (i % 2 != 0) {
					
				soma_impar = soma_impar + i;
				
			    }
				

		
		}
		
		System.out.println("A somatória é: " + soma_impar);
			
	}
		
}

