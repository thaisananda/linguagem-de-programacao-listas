/*
 OBJETIVO: Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. Calcular e exibir:
a.	A quantidade de cada produto vendido no mês;
b.	A quantidade de produtos vendidos por semana;
c.	O total de produtos vendidos no mês.

 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 29/03/2026
 */

package lista.matrizes.ex01.view;

import lista.matrizes.ex01.controller.Controller01;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		int mat[][] = new int[4][3], opc = 0;
		
		while(opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Carrega Matriz "
					+ "\n2 - Mostra matriz "
					+ "\n3 - Quantidade de cada produto vendido no mês"
					+ "\n4 - Quantidade de produtos vendidos por semana"
					+ "\n5 - Total de produtos vendidos no mês"
					+ "\n9 - Fim"));
		
		switch(opc)
		{
		case 1:
			mat = Controller01.CarregaMatriz(mat);
			break;
			
		case 2:
			Controller01.MostraMatriz(mat);
			break;
			
		case 3:
			Controller01.VendaProduto(mat);
			break;
			
		case 4:
			Controller01.TotalSemana(mat);
			break;
			
		case 5:
			Controller01.TotalMes(mat);
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
