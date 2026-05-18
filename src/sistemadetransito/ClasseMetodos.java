package sistemadetransito;

import java.io.*;

import javax.swing.*;

public class ClasseMetodos {
	
	public Estatistica[] CadastraEstatistica(Estatistica[] estatistica) throws IOException {
		
		String fileName = "ArquivoEstatistica.txt";
		
		BufferedWriter gravar = new BufferedWriter(new FileWriter(fileName));
		
		for (int i = 0; i < 10; i++) {
			
			estatistica[i] = new Estatistica();
			
		}
		
		for (int i = 0; i < 10; i++) {
			
			estatistica[i].CodigoCidade = Integer.parseInt(JOptionPane.showInputDialog("Insira o código da cidade: "));
			gravar.write(Integer.toString(estatistica[i].CodigoCidade));
			gravar.newLine();
			
			estatistica[i].NomeCidade = JOptionPane.showInputDialog("Insira o nome da cidade: ");
			gravar.write(estatistica[i].NomeCidade);
			gravar.newLine();
			
			estatistica[i].PQtdAcidentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de acidentes: "));
			gravar.write(Integer.toString(estatistica[i].PQtdAcidentes));
			gravar.newLine();
		}
		
		System.out.println("GRAVAÇÃO FEITA COM SUCESSO!");
		gravar.close();
		
		return estatistica;
	}
	
	public Estatistica[] LerArquivo(Estatistica[] estatistica) throws IOException {
		
		String fileName = "ArquivoEstatistica.txt";
		
		BufferedReader ler = new BufferedReader(new FileReader(fileName));
		
		for(int i = 0; i < 10; i++) {
			
			estatistica[i] = new Estatistica();
			
			 estatistica[i].CodigoCidade = Integer.parseInt(ler.readLine());
		     estatistica[i].NomeCidade = ler.readLine();
		     estatistica[i].PQtdAcidentes = Integer.parseInt(ler.readLine());
			
		}
		
		ler.close();
		return estatistica;
		
	}
	
	public void PQtdAcidentes(Estatistica[] estatistica) throws IOException {
		
		estatistica = LerArquivo(estatistica);
		
		String saida = "CIDADES COM ACIDENTES MAIOR QUE 100 E MENOR QUE 500\n\n";
		
		for(int i = 0; i < 10; i++) {
			
			if(estatistica[i].PQtdAcidentes > 100 && estatistica[i].PQtdAcidentes < 500) {
				
				saida += "Código da cidade: " + estatistica[i].CodigoCidade + "\n";
				saida += "Nome da cidade: " + estatistica[i].NomeCidade + "\n";
				saida += "Quantidade de acidentes: " + estatistica[i].PQtdAcidentes + "\n";
				saida += "--------------------------------------\n";
				
			}
		}
		
		JOptionPane.showMessageDialog(null, saida);
		
	}
	
	public void PMaiorMenor(Estatistica[] estatistica) throws IOException {
	    
	    estatistica = LerArquivo(estatistica);
	    
	    String menor = "";
	    String maior = "";
	    
	    int qtdMenor = 0;
	    int qtdMaior = 0;
	    
	    for (int i = 0; i < estatistica.length; i++) {
	        
	        if (i == 0) {
	            
	            qtdMenor = estatistica[i].PQtdAcidentes;
	            qtdMaior = estatistica[i].PQtdAcidentes;
	            
	            menor = "CIDADE COM MENOR NÚMERO DE ACIDENTES\n\n";
	            menor += "Código da cidade: " + estatistica[i].CodigoCidade + "\n";
	            menor += "Nome da cidade: " + estatistica[i].NomeCidade + "\n";
	            menor += "Quantidade de acidentes: " + estatistica[i].PQtdAcidentes + "\n";
	            menor += "--------------------------------------\n";
	            
	            maior = "CIDADE COM MAIOR NÚMERO DE ACIDENTES\n\n";
	            maior += "Código da cidade: " + estatistica[i].CodigoCidade + "\n";
	            maior += "Nome da cidade: " + estatistica[i].NomeCidade + "\n";
	            maior += "Quantidade de acidentes: " + estatistica[i].PQtdAcidentes + "\n";
	            maior += "--------------------------------------\n";
	            
	        } else {
	            
	            if (estatistica[i].PQtdAcidentes < qtdMenor) {
	                
	                qtdMenor = estatistica[i].PQtdAcidentes;
	                
	                menor = "CIDADE COM MENOR NÚMERO DE ACIDENTES\n\n";
	                menor += "Código da cidade: " + estatistica[i].CodigoCidade + "\n";
	                menor += "Nome da cidade: " + estatistica[i].NomeCidade + "\n";
	                menor += "Quantidade de acidentes: " + estatistica[i].PQtdAcidentes + "\n";
	                menor += "--------------------------------------\n";
	            }
	            
	            if (estatistica[i].PQtdAcidentes > qtdMaior) {
	                
	                qtdMaior = estatistica[i].PQtdAcidentes;
	                
	                maior = "CIDADE COM MAIOR NÚMERO DE ACIDENTES\n\n";
	                maior += "Código da cidade: " + estatistica[i].CodigoCidade + "\n";
	                maior += "Nome da cidade: " + estatistica[i].NomeCidade + "\n";
	                maior += "Quantidade de acidentes: " + estatistica[i].PQtdAcidentes + "\n";
	                maior += "--------------------------------------\n";
	            }
	        }
	    }
	    
	    JOptionPane.showMessageDialog(null, menor + "\n" + maior);
	}
	
	public void PAcima (Estatistica [] estatistica) throws IOException {
		
		estatistica = LerArquivo(estatistica);
		
		double soma = 0;
		double media = 0;
		
		String acima = "CIDADES COM ACIDENTES ACIMA DA MÉDIA\n\n";
		
		for(int i = 0; i < estatistica.length; i ++) {
			
			soma += estatistica[i].PQtdAcidentes;
			
		}
		
		media = soma / estatistica.length;
		
	    acima += "Média de acidentes: " + media + "\n\n";
		    
		    for (int i = 0; i < estatistica.length; i++) {
		        
		        if (estatistica[i].PQtdAcidentes > media) {
		            
		            acima += "Código da cidade: " + estatistica[i].CodigoCidade + "\n";
		            acima += "Nome da cidade: " + estatistica[i].NomeCidade + "\n";
		            acima += "Quantidade de acidentes: " + estatistica[i].PQtdAcidentes + "\n";
		            acima += "--------------------------------------\n";
		        }
		    }
		    
		    JOptionPane.showMessageDialog(null, acima);
	}
}
