/*
 OBJETIVO: Calcular e mostrar o quadrados dos números entre 10 e 150. 
 Utilizar função.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/02/2026
 */

package lista.função;

public class EstFun_Lt1_Ex31 {

	public static void main(String[] args) {
		
		for (int i = 10; i <= 150; i++) {
			
			int resultado = quadrado(i);
			
			System.out.println("Quadrado de " + i + " = " + resultado);
		}
	}
	
	
	public static int quadrado(int numero) {
		
		return numero * numero;
		
	}
}