package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_02 {

	public static void main (String [] args) {
		
		double salario, reajuste=0;
		
		salario = Integer.parseInt(JOptionPane.showInputDialog("Insira o seu salário atual: "));
		
		reajuste = (salario * 0.15) + salario;
		
		JOptionPane.showMessageDialog(null, "O novo salário é: " + reajuste);
	}
}
