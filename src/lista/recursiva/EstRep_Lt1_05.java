/*
 OBJETIVO: Utilizar função com passagem de parâmetro e recursiva para resolver a série:
 Serie5 = (N)! + (N-1)! + (N-2)! + ... + (1)!  
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 12/03/2026
 */

package lista.recursiva;

import javax.swing.JOptionPane;

public class EstRep_Lt1_05 {
	
	public static void main(String[] args) {
		
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		
	    int resultado = somaSerie5(n);

	    System.out.println("Resultado da série: " + resultado);
	}

	static int somaSerie5(int n) {
		
		if (n == 1) {
            return fatorial(1);
        } else {
            return fatorial(n) + somaSerie5(n - 1);
        }
	}
	
	static int fatorial(int n) {
		
		if (n == 0 || n == 1) {
			return 1;
		} else {
			
			return n * fatorial(n - 1);
			
		}
	}
}
