/*
 OBJETIVO: Criar e coletar um vetor [100] inteiro e exibir:
a.	O maior e o menor valor;
b.	A média dos valores.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/03/2026
 */

package lista.vetores.ex02.view;

import javax.swing.*;

import lista.vetores.ex02.controller.Controller02;

public class Main {
	
	public static void main(String[] args) {
		
		int vetor [] = new int[5];
		
		int opc = 0, maior, menor;
		
		double media;
				
		while(opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega vetor \n2 - Mostra vetor \n3 - Maior valor \n4 - Menor valor \n5 - Média dos valores \n9 - Fim!"));
			
			switch(opc) 
			{
			case 1:
				vetor = Controller02.CarregaVetor(vetor);
				break;
				
			case 2:
				Controller02.MostraVetor(vetor);
				break;
				
			case 3:
				maior = Controller02.Maior(vetor);
				JOptionPane.showMessageDialog(null,"O maior número é: " + maior);
				break;
				
			case 4:
				menor = Controller02.Menor(vetor);
				JOptionPane.showMessageDialog(null, "O menor número é: " + menor);
				break;
				
			case 5:
				media = Controller02.Media(vetor);
				JOptionPane.showMessageDialog(null, "A média dos números é: " + media);
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
