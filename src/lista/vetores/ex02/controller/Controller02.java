package lista.vetores.ex02.controller;

import javax.swing.JOptionPane;

public class Controller02 {
	
	public static int[] CarregaVetor(int[] vt) {
		
		int cta;
		
		for(cta = 0; cta < 5; cta++) {
			
			vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
			
		}
		
		return vt;
	}
	
	public static void MostraVetor(int[] vt) {
		
		int cta;
		
		for(cta = 0; cta < 5; cta++) {
			
			System.out.println("Vet[" + cta + "] = " + vt[cta]);
			
		}	
	}
	
	public static int Maior(int[] vt) {
		
		int cta, maior = 0;
		
		for(cta = 0; cta < 5; cta++) {
			
			if(cta == 0) {
				
				maior = vt[cta];
				
			} else {
				
				if(vt[cta] > maior) {
					
					maior = vt[cta];
					
				}
			}
		}
		
		return maior;
		
	}
	
	public static int Menor(int[] vt) {
		
		int cta, menor = 0;
		
		for(cta = 0; cta < 5; cta++) {
			
			if (cta == 0) {
				
				menor = vt[cta];
				
			} else {
				
				if(vt[cta] < menor) {
					
					menor = vt[cta];
					
				}
			}
		}
		
		return menor;
	}
	
	public static double Media(int[] vt) {
		
		int cta, soma = 0, cont = 0;
		
		for(cta = 0; cta < 5; cta++) {
			
			soma = soma + vt[cta];
			cont++;
			
		}
		
		return (double) soma / cont;
	}
	

}
