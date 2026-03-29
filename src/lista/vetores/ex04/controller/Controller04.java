package lista.vetores.ex04.controller;

import javax.swing.JOptionPane;

public class Controller04 {
	
	public static double[] CarregaVetor(double[] vt) {
		
		int cta;
		
		for(cta = 0; cta < 10; cta++) {
			
			vt[cta] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "));
			
		}
		
		return vt;
	}
	
	public static void MostraVetor(double[] vt) {
		
		int cta;
		
		for(cta = 0; cta < 10; cta++) {
			
			System.out.println("Vet[" + cta + "] = " + vt[cta]);
		}
	}
	
	public static double Media(double[] vt) {
		
		int cta, cont = 0;
		
		double soma = 0;
		
		for (cta = 0; cta < 10; cta++) {
			
			soma = (soma + vt[cta]);
			cont++;
			
		}
		
		
		return soma / cont;
	}
	
	public static int MediaAcima(double[] vt, double media) {
		
		int cta, acima = 0;
		
		for (cta = 0; cta < 10; cta++) {
			
			if(vt[cta] > media) {
				
				acima++;
				
			}
		}
		
		return acima;
	}
	
	public static void PosAbaixo(double[] vt, double media) {
		
		int cta;
		
		System.out.println("As posições das notas abaixo da média são: ");
		
		for(cta = 0; cta < 10; cta++) {
			
			if (vt[cta] < media) {
				
				System.out.println(cta);
				
			}
		}		
		
	}

}
