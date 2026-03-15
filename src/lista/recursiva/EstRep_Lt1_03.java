/*
 OBJETIVO: Utilizar função com passagem de parâmetro e recursiva para resolver a série:
 Serie3 = (1/1) + (1/2) + (1/3) + ....+ (1/N) 
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 12/03/2026
 */

package lista.recursiva;

import javax.swing.JOptionPane;

public class EstRep_Lt1_03 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		double resultado = somaSerie3(n);
		
		System.out.println("Resultado da série: " + resultado);
		
	}
	static double somaSerie3(double n) {
		
		if (n == 1) {
			
			return 1.0;
			
		} else {
			
			return 1.0/n + somaSerie3(n - 1); 
			
		}
	}
}
