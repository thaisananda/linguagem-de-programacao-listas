/*
 OBJETIVO: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

public class EstRep_Lt1_41 {
	
	public static void main(String[] args) {
		
		int possibilidade = 1;
		
		for (int Dado1 = 1; Dado1 <= 6; Dado1++) {
			
			for (int Dado2 = 1; Dado2 <= 6; Dado2++) {
				
				if (Dado1 + Dado2 == 7) {
					
					System.out.println("Possibilidade " + possibilidade + ": " + Dado1 + " + " + Dado2 + " = 7");
					
					possibilidade++;
				}
			}
		}
	}
}