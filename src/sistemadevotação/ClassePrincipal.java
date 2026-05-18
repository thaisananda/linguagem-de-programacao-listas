package sistemadevotação;

import java.io.IOException;
import javax.swing.*;

public class ClassePrincipal {
	
	public static void main(String[] args) throws IOException {
		
		int OPC = 0;
		
		Votacao[] votacao = new Votacao[200];
		
		Votacao2021 m = new Votacao2021();
		
		while(OPC != 9) {
			
			OPC = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE VOTAÇÃO"
					+ "\n1 - Carregar Seção/Número eleitor"
					+ "\n2 - Classificar por seção"
					+ "\n3 - Gravar registros"
					+ "\n4 - Mostrar indicadores"
					+ "\n9 - Fim"));
			
			switch(OPC) {
			
			case 1:
				votacao = m.FCadastraVotacao(votacao);
				break;
				
			case 2:
				votacao = m.FClassificaSecao(votacao);
				break;
				
			case 3:
				votacao = m.FGravaVotacao(votacao);
				break;
				
			case 4:
				 m.MenuIndicadores(votacao);
				 break;
				    
			case 9:
				JOptionPane.showMessageDialog(null, "Fim do Programa!");
				System.exit(0);
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			
			}
		}
		
	}

}
