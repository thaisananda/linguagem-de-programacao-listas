package lista.vetores.lt2.ex06.view;

import estvet_lt2_ex06.controller.Controller06;
import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String[] args) {
		
		int vetor[] = new int[20], opc = 0, valor, pos;
		
		while(opc != 9) {
			
			opc = Integer.parseInt(
				JOptionPane.showInputDialog(
					"1 - Carrega vetor \n2 - Mostra vetor \n3 - Classifica ordem crescente \n4 - Localiza valor \n9 - Fim"
				)
			);

			switch(opc) {
			case 1:
				vetor = Controller06.CarregaVetor(vetor);
				break;
				
			case 2:
				Controller06.MostraVetor(vetor);
				break;
				
			case 3:
				Controller06.OrdenaVetor(vetor);
				break;
			
			case 4:
				valor = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor que deseja buscar: "));
				pos = Controller06.BuscaBinaria(vetor, valor);
				
				if (pos >= 0) {
					JOptionPane.showMessageDialog(null, "Valor encontrado na posição: " + pos);
				} else {
					JOptionPane.showMessageDialog(null, "Valor não encontrado no vetor.");
				}
				break;
				
			case 9:
				JOptionPane.showMessageDialog(null, "Fim!");
				System.exit(0);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			}
		}
	}
}