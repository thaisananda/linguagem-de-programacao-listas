package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_04 {
	
	public static void main (String [] args) {
		
		int C, F=0;
		
		C = Integer.parseInt(JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: "));
		
		F = ((9*C) + 160)/5;
		
		JOptionPane.showMessageDialog(null, "A temperatura em Farenheit é: " + F);
		
	}

}
