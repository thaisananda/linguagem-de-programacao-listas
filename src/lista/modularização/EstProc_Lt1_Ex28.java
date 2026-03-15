/*
 OBJETIVO: Receba o preço atual e a média mensal de um produto. 
 Calcule e mostre o novo preço sabendo que:
Venda Mensal	  Preço Atual	  Preço Novo
< 500	           < 30	            + 10%
>= 500 e < 1000	 >= 30 e < 80	    +15%
>= 1000	           >= 80	        - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex28 {
	
	static double precoAtual, mediaMensal, precoNovo;
	
	public static void main(String[] args) {
		
		precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto: "));
		
		ProcedurePreco();
		
		JOptionPane.showMessageDialog(null, "O novo preço será: " + precoNovo);

	}

	static void ProcedurePreco() {
		
		if (mediaMensal < 500 && precoAtual < 30) {
			
			precoNovo = (precoAtual * 0.10) + precoAtual;
			
		} else if (mediaMensal >= 500 && mediaMensal < 1000 && precoAtual >= 30 && precoAtual < 80) {
			
			precoNovo = (precoAtual * 0.15) + precoAtual;
			
		  } else if(mediaMensal >= 1000 && precoAtual >= 80) {
			
			precoNovo = - (precoAtual * 0.05) + precoAtual;
			
		    } else {
			
			precoNovo = precoAtual;
			
		      }
	}
}
