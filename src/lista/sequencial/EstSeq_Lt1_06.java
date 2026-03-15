package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_06 {
	
	public static void main (String[] arcs) {
		
		int x, y, aux;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para y: "));
		
		aux = x;
		x = y;
		y = aux;
		
		System.out.println("O valor de x é: " + x);
		System.out.println("O valor de y é: " + y);

	}

}
