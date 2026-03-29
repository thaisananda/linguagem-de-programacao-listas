package lista.matrizes.ex03.controller;

import java.math.BigInteger;

public class Controller03 {
	
	public static void CarregaMatriz(BigInteger[][] mt) {
		
		BigInteger valor = BigInteger.ONE;
		
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				mt[i][j] = valor;
				valor = valor.multiply(BigInteger.valueOf(2));
			}
		}
	}
	
	public static void MostraMatriz(BigInteger[][] mt) {
		
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				System.out.print(mt[i][j] + "\t");
			}
			System.out.println();
		}
	}
	
	public static BigInteger SomaMatriz(BigInteger[][] mt) {
		
		BigInteger soma = BigInteger.ZERO;
		
		for (int i = 0; i < mt.length; i++) {
			for (int j = 0; j < mt[i].length; j++) {
				soma = soma.add(mt[i][j]);
			}
		}
		
		return soma;
	}
}