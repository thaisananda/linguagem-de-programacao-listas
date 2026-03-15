/*
 OBJETIVO: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde:
Casa: 	1	2	3	4	...	64
Qdte:	1	2	4	8	...	N
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 12/03/2026
 */

package lista.repetição;


public class EstRep_Lt1_39 {
	
	public static void main(String[] args) {
		
		double graos = 1;
        double total = 0;
		
		for(int casa = 1; casa <= 64; casa++) {
			  System.out.printf("Casa %d: %.0f grãos%n", casa, graos);
	          total += graos;
	          graos *= 2;
			
		}
		

        System.out.printf("%nTotal de grãos no tabuleiro: %.0f%n", total);
        
	}

}
