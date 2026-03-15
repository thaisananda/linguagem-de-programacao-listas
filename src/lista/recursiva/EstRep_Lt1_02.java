/*
 OBJETIVO: Utilizar função com passagem de parâmetro e recursiva para resolver a série:
 Serie2 = (N) + (N-1) + (N-2) + ... + (1) 
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 12/03/2026
 */

package lista.recursiva;

import javax.swing.JOptionPane;

public class EstRep_Lt1_02 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		int resultado = somaSerie2(n);
		
		System.out.println("Resultado da série: " + resultado);
	}
	
	static int somaSerie2(int n) {
		
		if (n == 1) {
			
			return 1;
			
		} else {
			
			return  n + somaSerie2(n - 1); 
		}
	}

}
