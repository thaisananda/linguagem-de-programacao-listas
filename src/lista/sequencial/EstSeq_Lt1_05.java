package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_05 {

	public static void main (String [] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente b: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do coeficiente c: "));
		
		int delta = (b*b) - (4 * a * c);
		
		System.out.println("O valor de delta é: " + delta);
		
		double x1 = ((- b + Math.sqrt(delta)) / (2 * a)); 
		
		double x2 = ((- b - Math.sqrt(delta)) / (2 * a)); 

		
		System.out.println("O valor de x1 é: " + x1);
		System.out.println("O valor de x2 é: " + x2);


	}
}
