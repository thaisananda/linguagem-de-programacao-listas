/*
 OBJETIVO: Receba 100 números inteiros reais. Verifique e mostre o maior e o menor valor. 
 Obs.: somente valores positivos.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

import java.util.Random;

public class EstRep_Lt1_38 {
	
	public static void main(String[] args) {
		
		Random random = new Random();
		
		int maior = 0, menor = 0;
		
		for (int i = 0; i < 100; i++) {
			
			int numero = random.nextInt(100) + 1;
			
			if (i == 0) {
				
				maior = numero;
				menor = numero;
				
			} else if (numero > maior){
				
				maior = numero;
				
				
			} else if (numero < menor) {
				
				menor = numero;
				
			}
			
		}
		
		System.out.println("O maior número é: " + maior);
		System.out.println("O menor número é: " + menor);
		
	}

}
