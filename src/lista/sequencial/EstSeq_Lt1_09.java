package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_09 {

	public static void main (String[] args) {
		
		double n1, n2, soma=0;
		
		n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));
		n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número real: "));

		soma = Math.pow(n1, n1) + Math.pow(n2, n2);
		
		System.out.println("A soma dos quadrados é: " + soma);
	}
}
