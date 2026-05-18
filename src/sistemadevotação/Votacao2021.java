package sistemadevotação;

import java.io.*;
import javax.swing.*;

public class Votacao2021 {
	
	public Votacao[] FCadastraVotacao(Votacao[] votacao) {
		
		for(int i = 0; i < 200; i++) {
			
			votacao[i] = new Votacao();
			
			votacao[i].NumeroSeçao = (int) (Math.random() * 11);
			votacao[i].NumeroCandidato = (int) (Math.random() * 301);
		}
		
		JOptionPane.showMessageDialog(null, "Dados carregados com sucesso!");
		
		return votacao;
	}

	public Votacao[] FClassificaSecao(Votacao[] votacao) {
		
		Votacao aux;
		
		for(int i = 0; i < 199; i++) {
			for(int j = i + 1; j < 200; j++) {
				if(votacao[i].NumeroSeçao > votacao[j].NumeroSeçao) {
					aux = votacao[i];
					votacao[i] = votacao[j];
					votacao[j] = aux;
					
				}
			}
		}
		
		JOptionPane.showMessageDialog(null, "Dados classificados");
		
		return votacao;
	}
	
	public Votacao[] FGravaVotacao(Votacao[] votacao) throws IOException {
		
		String fileName = "Votação2021.txt";
		
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
		
		for(int i = 0; i < votacao.length; i++) {
			
			gravar.write(Integer.toString(votacao[i].NumeroSeçao));
			gravar.newLine();
			
			gravar.write(Integer.toString(votacao[i].NumeroCandidato));
			gravar.newLine();
		}
		
		gravar.close();
		
		JOptionPane.showMessageDialog(null, "Arquivo gerado!");
		
		return votacao;
	}
	
	public void MenuIndicadores(Votacao[] votacao) {
	    
	    int opc = 0;
	    
	    while (opc != 9) {
	        
	        opc = Integer.parseInt(JOptionPane.showInputDialog(
	                "Mostrar Indicadores"
	                + "\nEstatísticas de Votação em 2021"
	                + "\n1 - Quantidade Eleitores por Seção"
	                + "\n2 - Seção com Maior e Menor número de Eleitores"
	                + "\n3 - Quantidade de votos por candidato"
	                + "\n4 - 10 primeiros colocados"
	                + "\n9 - Finaliza consulta"
	        ));
	        
	        switch (opc) {
	            
	            case 1:
	                PQuantidadeEleitoresSecao(votacao);
	                break;
	                
	            case 2:
	              //  PMaiorMenorSecao(votacao);
	                break;
	                
	            case 3:
	               // PQuantidadeVotosCandidato(votacao);
	                break;
	                
	            case 4:
	              //  PDezMaisVotados(votacao);
	                break;
	                
	            case 9:
	                JOptionPane.showMessageDialog(null, "Voltando ao menu principal...");
	                break;
	                
	            default:
	                JOptionPane.showMessageDialog(null, "Opção inválida!");
	        }
	    }
	}
	
	public void PQuantidadeEleitoresSecao(Votacao[] votacao) {
		
		int[] qtdSecao = new int[11];
		
		 for (int i = 0; i < 200; i++) {
		        qtdSecao[votacao[i].NumeroSeçao]++;
		    }
		 
		 String saida = "QUANTIDADE DE ELEITORES POR SEÇÃO\n\n";
		    
		 for (int i = 0; i < 11; i++) {
			 saida += "Seção " + i + ": " + qtdSecao[i] + " eleitor(es)\n";
		    }
		    
		 JOptionPane.showMessageDialog(null, saida);
	}
}
