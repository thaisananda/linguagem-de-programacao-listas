/* OBJETIVO: Criar uma matriz [8][8] inteiro e o programa irá carregar segundo: 
  1 1 1 1 1 1 1 1 
  1 2 2 2 2 2 2 1 
  1 2 3 3 3 3 2 1 
  1 2 3 4 4 3 2 1 
  1 2 3 4 4 3 2 1 
  1 2 3 3 3 3 2 1 
  1 2 2 2 2 2 2 1 
  1 1 1 1 1 1 1 1 
  PROGRAMADOR: THAIS ANANDA 
  DATA DE CRIAÇÃO: 29/03/2026 
 */

package lista.matrizes.ex04.view;

import javax.swing.JOptionPane;
import lista.matrizes.ex04.controller.Controller04;

public class Main {
	
	public static void main(String[] args) {
		
		int[][] mat = new int[8][8];
		int opc = 0;
		
		while (opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Carrega matriz\n"
					+ "2 - Mostra matriz\n"
					+ "9 - Fim"));
			
			switch (opc) {
			case 1:
				Controller04.CarregaMatriz(mat);
				JOptionPane.showMessageDialog(null, "Matriz carregada com sucesso!");
				break;
				
			case 2:
				Controller04.MostraMatriz(mat);
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Fim!");
				System.exit(0);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!");
			}
		}
	}
}