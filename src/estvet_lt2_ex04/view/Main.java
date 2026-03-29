package estvet_lt2_ex04.view;

import javax.swing.JOptionPane;

import estvet_lt2_ex04.controller.Controller04;

public class Main {
	
	public static void main(String[] args) {
		
		double vetor[] = new double[30], media = 0;
		
		int opc = 0, nt_acima;
		
		while(opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega vetor \n2 - Mostra vetor \n3 - Média do grupo \n4 - Notas acima da média \n5 - Posições dos valores abaixo da média \n9 - Fim."));
		
			switch(opc)
			{
			case 1:
				vetor = Controller04.CarregaVetor(vetor);
				break;
				
			case 2:
				Controller04.MostraVetor(vetor);
				break;
				
			case 3:
				media = Controller04.Media(vetor);
				JOptionPane.showMessageDialog(null, "A média do grupo é: " + media);
				System.out.println(media);
				break;
				
			case 4:
				nt_acima = Controller04.MediaAcima(vetor, media);
				JOptionPane.showMessageDialog(null, "A quantidade de notas acima da média é: " + nt_acima);
				break;
				
			case 5:
				Controller04.PosAbaixo(vetor, media);
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
