package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_07 {
	
	public static void main(String[] args) {
		
		int v=0, a, b, c;
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do comprimento do paralelepípedo: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da largura do paralelepípedo: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da altura do paralelepípedo: "));

		v = a*b*c;
		
		System.out.println("O volume do paralelepípedo é: " + v);
	
	
	}

}
