/*
 OBJETIVO: Criar uma matriz [8][8] onde o programa irá carregar segundo:
 casa  1 2 3 4 *exibir soma dos valores
 valor 1 2 4 8
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 29/03/2026
 */

package lista.matrizes.ex03.view;

import java.math.BigInteger;
import javax.swing.JOptionPane;
import lista.matrizes.ex03.controller.Controller03;

public class Main {

	public static void main(String[] args) {
		
		BigInteger[][] mat = new BigInteger[8][8];
		int opc = 0;
		
		while (opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog(
					"1 - Carrega matriz\n"
					+ "2 - Mostra matriz\n"
					+ "3 - Soma dos valores\n"
					+ "9 - Fim"));
			
			switch (opc) {
			case 1:
				Controller03.CarregaMatriz(mat);
				JOptionPane.showMessageDialog(null, "Matriz carregada com sucesso!");
				break;
				
			case 2:
				Controller03.MostraMatriz(mat);
				break;
				
			case 3:
				BigInteger soma = Controller03.SomaMatriz(mat);
				JOptionPane.showMessageDialog(null, "Soma = " + soma);
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