/*
 OBJETIVO: Receba o preço atual e a média mensal de um produto. 
 Calcule e mostre o novo preço sabendo que:
Venda Mensal	  Preço Atual	  Preço Novo
< 500	           < 30	            + 10%
>= 500 e < 1000	 >= 30 e < 80	    +15%
>= 1000	           >= 80	        - 5%
Obs.: para outras condições, preço novo será igual ao preço atual.
PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_28 {
	
	public static void main(String[] args) {
		
		double precoAtual = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço atual do produto: "));
		double mediaMensal = Double.parseDouble(JOptionPane.showInputDialog("Digite a média mensal do produto: "));
		double precoNovo = 0;
		
		if (mediaMensal < 500 && precoAtual < 30) {
			
			precoNovo = (precoAtual * 0.10) + precoAtual;
			
		} else if (mediaMensal >= 500 && mediaMensal < 1000 && precoAtual >= 30 && precoAtual < 80) {
			
			precoNovo = (precoAtual * 0.15) + precoAtual;
			
		} else if(mediaMensal >= 1000 && precoAtual >= 80) {
			
			precoNovo = - (precoAtual * 0.05) + precoAtual;
			
		} else {
			
			precoNovo = precoAtual;
			
		}
		
		
		JOptionPane.showMessageDialog(null, "O novo preço será: " + precoNovo);
	}

}
