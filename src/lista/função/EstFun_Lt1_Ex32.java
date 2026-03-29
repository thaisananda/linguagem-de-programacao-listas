/*
 OBJETIVO:Receba um número inteiro. Calcule e mostre o seu fatorial.
 Utilizar função.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/02/2026
 */

package lista.função;

import javax.swing.JOptionPane;

public class EstFun_Lt1_Ex32 {
	
	public static void main(String[] args) {
	
		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
	
		int resultado = fatorial(n);
		
		JOptionPane.showMessageDialog(null, "O resultado do fatorial de " + n + " é: " + resultado);
	}
	
	public static int fatorial(int n) {
		
		int fat = 1;
		
		for (int i = n; i > 0; i--) {
			fat = fat * i;
		}
		
		return fat;
	}
}