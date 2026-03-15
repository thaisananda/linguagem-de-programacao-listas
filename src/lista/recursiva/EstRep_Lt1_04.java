/*
 OBJETIVO: Utilizar função com passagem de parâmetro e recursiva para resolver a série:
 Serie4 = (N/1) +(N-1 / 2 ) + (N-2 / 3) + .... + (1/N)  
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 12/03/2026
 */

package lista.recursiva;

import javax.swing.JOptionPane;

public class EstRep_Lt1_04 {
	
	public static void main(String [] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro:"));
		
        double resultado = somaSerie4(n, 1);
        
        System.out.println("Resultado da série: " + resultado);
	}
	
	static double somaSerie4(int numerador, int denominador) {
		
		if (numerador == 1) {
            return 1.0 / denominador;
        } else {
        	
        	  return (double) numerador / denominador + somaSerie4(numerador - 1, denominador + 1);
        	  
        }
	}
}
