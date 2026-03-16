/*
 OBJETIVO: Calcule e mostre a série 1 + 2/3 + 3/5 + ... + 50/99.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

public class EstRep_Lt1_42 {
	
	public static void main(String[] args) {
		
		int impar = 3;
		double soma = 1;
	
		for (int i = 2; i <= 50; i++) {
			
			soma = soma + (double) i / impar;
			impar = impar + 2;
		}
		
		System.out.println("A soma é: " + soma);
	}
}