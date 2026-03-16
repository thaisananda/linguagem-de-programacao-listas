/*
 OBJETIVO: Calcule e mostre a série 1 – 2/4 + 3/9 – 4/16 + 5/25 + ... + 15/225
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

public class EstRep_Lt1_45 {

		public static void main(String[] args) {
			
			double soma = 1;
			
			for (int i = 2; i <= 15; i++) {
				
				if (i % 2 == 0) {
					
					soma = soma - ((double) i / (i * i));
					
				} else {
					
					soma = soma + ((double) i / (i * i));
					
				}
			}
			
			System.out.println("A soma da série é: " + soma);
			
		}
}
