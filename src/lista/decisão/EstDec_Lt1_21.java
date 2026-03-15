/*
 OBJETIVO: 21.	Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
 Mostre a mensagem de acordo com a média:
a.	Se a média for >= 6,0 exibir “APROVADO”;
b.	Se a média for >= 3,0 ou < 6,0 exibir “EXAME”;
c.	Se a média for < 3,0 exibir “RETIDO”.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.decisão;

import javax.swing.*;

public class EstDec_Lt1_21 {
	
	public static void main (String[] args) {
		
		int n1 = Integer.parseInt(JOptionPane.showInputDialog("Insira a primeira nota: "));
		int n2 = Integer.parseInt(JOptionPane.showInputDialog("Insira a segunda nota: "));
		int n3 = Integer.parseInt(JOptionPane.showInputDialog("Insira a terceira nota: "));
		int n4 = Integer.parseInt(JOptionPane.showInputDialog("Insira a quarta nota: "));
		
		double media = (n1 + n2 + n3 + n4)/4.0;
		
		if (media >= 6) {
			
			System.out.println("APROVADO!");
			
		} else if (media >= 3) {
			
			System.out.println("EXAME");
			
		} else {
			
			System.out.println("RETIDO");
		}

	}

}
