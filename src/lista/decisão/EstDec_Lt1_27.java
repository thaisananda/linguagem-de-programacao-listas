/*
 OBJETIVO: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 Calcule e mostre a velocidade média em km/h.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_27 {
	
	public static void main(String[] args) {
		
		int nVoltas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de voltas: "));
	    double exCircuito = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito (em metros): "));
	    double duracao = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração (em minutos): "));

	    double vm = (nVoltas * exCircuito * 60.0) / (duracao * 1000.0);
	     
		System.out.println("A velocidade média é: " + vm + " km/h");
	}

}
