package lista.sequencial;

import javax.swing.JOptionPane;

public class EstSeq_Lt1_01 {
	
	public static void main (String[] args) {
		
		int A, lado=0;
		
		lado = Integer.parseInt(JOptionPane.showInputDialog("Para calcular a área do quadrado, digite a medida do lado: "));
		
		A = lado*lado;
		
		System.out.println("A área do quadrado é: " + A);
	
	}

}
