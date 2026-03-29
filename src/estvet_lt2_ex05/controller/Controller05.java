package estvet_lt2_ex05.controller;

import javax.swing.JOptionPane;

public class Controller05 {
	
	public static int[] CarregaVetor(int[] vt) {
		
		int cta;
		
		for(cta = 0; cta < 20; cta++) {
			
			vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		}
		
		return vt;
	}
	
	public static void MostraVetor(int[] vt) {
		
		int cta;
		
		for(cta = 0; cta < 20; cta++) {
			
			System.out.println("vt[" + cta + "] = " + vt[cta]);
		}
	}
	
	public static void Calculo(int[] A) {
		
		int cta, soma = 0;
		
		for(cta = 0; cta < 10; cta++) {
			
			soma += A[cta] - A[19 - cta];
		}
		
		System.out.println("\nO resultado da soma é: " + soma);
	}

}
