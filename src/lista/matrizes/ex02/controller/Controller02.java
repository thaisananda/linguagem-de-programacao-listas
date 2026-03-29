package lista.matrizes.ex02.controller;

import java.util.Random;

public class Controller02 {
	
	public static void CarregaMatriz(int[][] mt) {
		
		Random rand = new Random();
		
		int valorDiagonal = 1;
		
		mt[1][1] = 1;
		
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				
				if(i == j) {
					
					mt[i][j] = valorDiagonal;
					valorDiagonal *= 4;
					
				} else { 
						
				mt[i][j] = rand.nextInt(100); // números de 0 até 99
				
				}
		    }	
		}
	}

	public static void MostraMatriz(int[][] mt) {
		
		int i, j;
		
		System.out.println("Mat = ");
		
		for(i = 0; i < 4; i++) {
			for(j = 0; j < 4; j++) {
				System.out.print(mt[i][j] + "\t");
			}
			System.out.println();
		}
		
	}
	
}

