/*
 OBJETIVO: Criar e carregar uma matriz [4][4] com valores aleatórios, 
 sendo que a diagonal principal terá seus dados carregados no programa segundo:
 1, 4, 16, 64
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 29/03/2026
 */

package lista.matrizes.ex02.view;

import javax.swing.JOptionPane;

import lista.matrizes.ex02.controller.Controller02;

public class Main {
	
	public static void main(String[] args) {

		int mat[][] = new int[4][4], opc = 0;
		
		while(opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Carrega Matriz "
					+ "\n2 - Mostra matriz "
					+ "\n9 - Fim"));
		
		switch(opc)
		{
		case 1:
			Controller02.CarregaMatriz(mat);
			JOptionPane.showMessageDialog(null, "Matriz carregada com sucesso!");
			break;
			
		case 2:
			Controller02.MostraMatriz(mat);
			break;
			
		case 9:
			JOptionPane.showMessageDialog(null, "Fim!");
			System.exit(0);
			break;
			
		default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
		}
		
		}
		
	}

}
