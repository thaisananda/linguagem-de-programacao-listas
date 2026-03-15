/*
 OBJETIVO: Calcular e mostrar o quadrados dos números entre 10 e 150.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/02/2026
 */

package lista.repetição;

public class EstRep_Lt1_31 {

	public static void main (String[] args) {
		
		for (int i = 11; i < 150; i++) {
			
			int quadrado = i*i;
			System.out.println("O quadrado de " + i + " é: " + quadrado);
		}
	}
}
