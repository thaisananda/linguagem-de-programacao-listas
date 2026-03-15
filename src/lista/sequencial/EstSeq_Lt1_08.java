package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_08 {

	public static void main (String[] args) {
		
		double deposito, rendimento=0;
		
		deposito = Double.parseDouble(JOptionPane.showInputDialog("Insira o valor do depósito em poupança: "));
		
		rendimento = (deposito * 1.3)/100; 
		
		System.out.println("A aplicação de 1 mês, rendeu: " + rendimento);
			
		}
}
