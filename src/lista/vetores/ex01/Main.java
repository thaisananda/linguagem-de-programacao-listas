package lista.vetores.ex01;

import javax.swing.JOptionPane;

public class Main {
	
	public static void main(String [] args) {
		
		int opc = 0, soma;
		double media;
		
		int vetor [] = new int [4];
				
		while (opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega vetor \n2 - Mostra vetor \n3 - Média dos valores entre 10 e 200 \n4 - Soma dos números ímpares \n9 - Fim."));
			
			switch(opc)
			
			{
			
			case 1:
				
				vetor = Controller01.CarregaVetor(vetor);
				break;
				
			case 2:
				
				Controller01.MostraVetor(vetor);
				break;
			
			case 3: 
				
				media = Controller01.Media(vetor);
				JOptionPane.showMessageDialog(null, "A média dos valores entre 10 e 200 é: " + media);
				break;
				
			case 4: 
				
				soma = Controller01.Soma(vetor);
				JOptionPane.showMessageDialog(null, "A soma dos números ímpares é: " + soma);
				break;

				
			case 9:
				
				JOptionPane.showMessageDialog(null,"Fim!");
				System.exit(0);
				break;
				
			default: JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			
			}
		}
	}



}
