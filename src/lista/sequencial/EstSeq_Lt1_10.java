package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_10 {
	
	public static void main (String[] args) {
		
		double n1, n2, dif=0;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));

		dif = n1 - n2;
		
		System.out.println("A diferença entre os valores é: " + dif);
	}

}
