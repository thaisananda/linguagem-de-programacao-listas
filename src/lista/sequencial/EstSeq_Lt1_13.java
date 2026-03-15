package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_13 {
	
	public static void main(String[] args) {
		
		double quant_alimentos, duracao=0;
		
		quant_alimentos = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de alimento em kgs: "));
		
		duracao = (quant_alimentos * 1000)/50;
		
		System.out.println("Este alimento durará " + duracao + " dias.");
	}

}
