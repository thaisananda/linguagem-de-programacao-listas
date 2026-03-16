/*
 OBJETIVO: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

import javax.swing.JOptionPane;

public class EstRep_Lt1_44 {
	
	public static void main(String[] args) {
		
		int base = Integer.parseInt(JOptionPane.showInputDialog("Digite o número da base: "));
		int expoente = Integer.parseInt(JOptionPane.showInputDialog("Digite o número do expoente: "));
		
		int potencia = 1;
		
		for (int i = 1; i <= expoente; i++) {
			potencia = potencia * base;
		}

		System.out.println("O resultado da potência é: " + potencia);
	}
}