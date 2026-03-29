package estvet_lt2_ex06.controller;

import javax.swing.JOptionPane;

public class Controller06 {
	
	public static int[] CarregaVetor(int[] vt) {
	
		int cta;
		
		for(cta = 0; cta < vt.length; cta++) {
			vt[cta] = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}
		
		return vt;
	}
	
	public static void MostraVetor(int[] vt) {
		
		int cta;
		
		for(cta = 0; cta < vt.length; cta++) {
			System.out.println("Vet[" + cta + "] = " + vt[cta]);
		}
	}
	
	public static void OrdenaVetor(int[] vt) {
		
		int i, j, aux;
		
		for(i = 0; i < vt.length - 1; i++) {
			
			for(j = i + 1; j < vt.length; j++) {
				
				if(vt[i] > vt[j]) {
					
					aux = vt[i];
					vt[i] = vt[j];
					vt[j] = aux;
				}
			}
		}
		
		System.out.println("O vetor ordenado é: ");
		
		for(i = 0; i < vt.length; i++) {
			System.out.println("Vet[" + i + "] = " + vt[i]);
		}
	}
	
	public static int BuscaBinaria(int[] vt, int valor) {
		
		int inicio = 0;
		int fim = vt.length - 1;
		
		while (inicio <= fim) {
			
			int meio = (inicio + fim) / 2;
			
			if (vt[meio] == valor) {
				return meio;
			}
			else if (valor < vt[meio]) {
				fim = meio - 1;
			}
			else {
				inicio = meio + 1;
			}
		}
		
		return -1;
	}
}