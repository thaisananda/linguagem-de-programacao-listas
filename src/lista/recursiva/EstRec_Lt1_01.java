/*
 OBJETIVO: Utilizar função com passagem de parâmetro e recursiva para resolver a série:
 Serie1 = (1+2+3+...+100)
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 12/03/2026
 */

package lista.recursiva;

public class EstRec_Lt1_01 {
	
	public static void main(String[] args) {
		
		int resultado = somaSerie1(100);

        System.out.println("Resultado da série: " + resultado);
			
		}
	
	static int somaSerie1(int n) {
		
		if (n == 1) {
			
			return 1;
			
		} else {
			
			return n + somaSerie1(n - 1);
					
		}
		
	}
}				
