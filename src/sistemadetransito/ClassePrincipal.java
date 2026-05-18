package sistemadetransito;

import java.io.IOException;

import javax.swing.*;

public class ClassePrincipal {
	
	public static void main(String[] args) throws IOException {
		
		int opc = 0;
		
		Estatistica[] estatistica = new Estatistica[10];
		
		ClasseMetodos m = new ClasseMetodos();
		
		
		while(opc != 9) {
			
			opc = Integer.parseInt(JOptionPane.showInputDialog("Estatísticas de acidentes em 2020"
					+ "\n 1 - Cadastro Estatística "
					+ "\n 2 - Consulta por quantidade de acidentes"
					+ "\n 3 - Consulta por estatísticas de acidentes"
					+ "\n 4 - Acidentes acima da média das 10 cidades"
					+ "\n 9 - Finaliza"));
			
			switch(opc) {
			
			case 1:
				estatistica = m.CadastraEstatistica(estatistica);
				break;
				
			case 2:
				m.PQtdAcidentes(estatistica);
				break;
				
			case 3:
				m.PMaiorMenor(estatistica);
				break;
			
			case 9:
				JOptionPane.showMessageDialog(null, "Fim do programa!");
				break;
				
			default:
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!" );
			}
		}
	}

}
