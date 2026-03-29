package lista.vetores.ex01;

import javax.swing.*;

public class Controller01 {
	
	public static int[] CarregaVetor(int vt[]) {
		
		int cta;
		
		for(cta = 0; cta < 4; cta++) {
			
			vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		}
		
		return vt;
	}
	
	public static void MostraVetor(int vt[]) {
		
		int cta;
		
		for(cta = 0; cta < 4; cta++) {
			
			System.out.println("Vet[" + cta + "] = " + vt[cta]);
		}
	}
	
	public static double Media(int[] vt) {
		
		int cta, cont = 0, soma = 0;

		
		for(cta = 0; cta < 4; cta++) {
			
			if (vt[cta] > 10 && vt[cta] < 200) {
			soma = soma + vt[cta];
			cont++;
			}
			
		}
		
		return (double) soma / cont;
		
	}
	
	public static int Soma(int[] vt) {
		
		int cta, soma = 0;
		
		for (cta = 0; cta < 4; cta++) {
			
			if (vt[cta] % 2 != 0) {
				
				soma = soma + vt[cta];
				
			}			
		}
		
		return soma;
		
	}
	

}
