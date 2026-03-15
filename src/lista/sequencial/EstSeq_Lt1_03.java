package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_03 {
	
	public static void main (String [] args) {
		
		double base, altura, area=0;
		
		base = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da base do triângulo: "));
		altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a medida da altura do triângulo: "));
	
		area = base*altura;
		
		System.out.println("A área do triângulo é: " + area);
		
	}

}
