/*
 OBJETIVO: Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
 Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. P. ex:
VT1|	1|	2|	3|	|VT2|	4|	5|	6|	|VT3|	1|	2|	3|	4|	5|	6

 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 26/03/2026
 */

package estvet_lt2_ex03.view;

import javax.swing.JOptionPane;

import estvet_lt2_ex03.controller.Controller03;

public class Main {
	
	public static void main(String[] args) {
		
		int VT1[] = new int[3], VT2[] = new int[3], opc = 0, VT3[] = new int[6],cta;
		
		
		while(opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Carrega vetores \n2 - Mostra vetores \n3 - Concatena vetores \n9 - Fim."));
			
			switch(opc)
			{
			
			case 1:
				Controller03.CarregaVetor(VT1, VT2);
				break;
			
			case 2:
				Controller03.MostraVetor(VT1, VT2);
				break;
				
			case 3:
				VT3 = Controller03.ConcatenaVetores(VT1, VT2);
				
				for(cta = 0; cta < 6; cta++) {
					
					System.out.println("Vet[" + cta + "] = " + VT3[cta]);
				}
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
