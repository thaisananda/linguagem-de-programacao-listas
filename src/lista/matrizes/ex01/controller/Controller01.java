package lista.matrizes.ex01.controller;

import javax.swing.JOptionPane;

public class Controller01 {
	
	public static int[][] CarregaMatriz(int[][] mt){
		
		int i, j;
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 3; j++) {
				
				mt[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Insira o valor: "));
				
			}
		}
		return mt;
	}
	
	public static void MostraMatriz(int[][] mt) {
		
		int i, j;
		
		System.out.println("Mat = ");
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 3; j++) {
				System.out.print(mt[i][j] + "\t");
			}
			System.out.println();
		}
	}

	public static void VendaProduto(int[][] mt) {
		
		int i, j, soma = 0;
		
		for(j = 0; j < 3; j++) {
			
			soma = 0;
			System.out.println("Produto " + j + " vendeu: ");
			
			for(i = 0; i < 4; i++) {
				
			    soma += mt[i][j];
			}
			
			System.out.println(soma);
		}
	}
	
	public static void TotalSemana(int[][] mt) {
		
		int i, j, soma = 0;
		
		for(i = 0; i < 4; i++) {
			soma = 0;
			System.out.println("Na semana " + i + " foram vendidos: ");
			
			for(j = 0; j < 3; j++) {
				
				soma += mt[i][j];
				
			}
			
			System.out.println(soma + " produtos");
		}
	}
	
	public static void TotalMes(int[][] mt) {
		
		int i, j, soma = 0;
		
		System.out.println("Total de produtos vendidos no mês: ");
		
		for(i = 0; i < 4; i++) {
			
			for(j = 0; j < 3; j++) {
				
				soma += mt[i][j];
				
			}
		}
		System.out.println(soma);
	}

}
