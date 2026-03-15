package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_14 {
	
	public static void main(String[] args) {
		
		double a=0, b, c;
		
		b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo: "));
		c = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do ângulo: "));
		
		a = Math.sqrt((Math.pow(b, 2)) + (Math.pow(c, 2)));
		
		System.out.println("O valor do 3º ângulo é: " + a);
		
	}

}
