package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_11 {
	
	public static void main(String[] args) {
		
		double raio, c=0, pi=3.14;
		
		raio = Double.parseDouble(JOptionPane.showInputDialog("Digite o raio da circunferência: "));
		
		c = 2*pi*raio;
		
		System.out.println("O comprimento da circunferência é: " + c);
	}

}
