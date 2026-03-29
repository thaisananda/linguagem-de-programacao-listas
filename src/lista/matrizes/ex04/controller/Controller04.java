package lista.matrizes.ex04.controller;

public class Controller04 {
	
	public static void CarregaMatriz(int[][] mt) {
	    
	    int i, j;
	    
	    for (i = 0; i < 8; i++) {
	        for (j = 0; j < 8; j++) {
	            
	            int topo = i;
	            int esquerda = j;
	            int baixo = 7 - i;
	            int direita = 7 - j;
	            
	            int menor = topo;
	            
	            if (esquerda < menor) {
	                menor = esquerda;
	            }
	            if (baixo < menor) {
	                menor = baixo;
	            }
	            if (direita < menor) {
	                menor = direita;
	            }
	            
	            mt[i][j] = menor + 1;
	        }
	    }
	}
	
	public static void MostraMatriz(int[][] mt) {
	    
	    int i, j;
	    
	    for (i = 0; i < 8; i++) {
	        for (j = 0; j < 8; j++) {
	            System.out.print(mt[i][j] + " ");
	        }
	        System.out.println();
	    }
	}

}
