package estvet_lt2_ex03.controller;

import javax.swing.JOptionPane;

public class Controller03 {
	
	public static void CarregaVetor(int[] vt1, int[] vt2) {
		
		int cta;
		
		for(cta = 0; cta < 3; cta++) {
			
			vt1[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para o vetor 1: "));
			
		}
		
		for(cta = 0; cta < 3; cta++) {
			
			vt2[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro para o vetor 2: "));
			
		}
		
	}
	
	public static void MostraVetor(int[] vt1, int[] vt2) {
		
		int cta;
		
		for(cta = 0; cta < 3; cta++) {
			
			System.out.println("Vet[" + cta + "] = " + vt1[cta]);
		}
		
		for(cta = 0; cta < 3; cta++) {
			
			System.out.println("Vet[" + cta + "] = " + vt2[cta]);
		}
	}
	
	public static int[] ConcatenaVetores(int[] vt1, int[] vt2) {
	    int[] vt3 = new int[6];
	    int i;

	    for (i = 0; i < 3; i++) {
	        vt3[i] = vt1[i];
	    }

	    for (i = 0; i < 3; i++) {
	        vt3[i + 3] = vt2[i];
	    }

	    return vt3;
	}

}
