/*
 OBJETIVO: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
 sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 15/03/2026
 */

package lista.repetição;

public class EstRep_Lt1_43 {
	
	public static void main(String[] args) {
		
		int ana = 110;
		int maria = 150;
		int anos = 0;
		
		while (ana <= maria) {
			
			ana = ana + 3;
			maria = maria + 2;
			
			anos++;
		}
		
		System.out.println("Serão necessários " + anos + " anos para Ana ser maior que Maria.");
	}

}
