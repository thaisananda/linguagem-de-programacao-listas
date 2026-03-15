/*
 OBJETIVO: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos). 
 Calcule e mostre a velocidade média em km/h.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex27 {
	
	static int nVoltas;
	static double exCircuito, duracao, vm;
	
	public static void main(String[] args) {
		
		nVoltas = Integer.parseInt(JOptionPane.showInputDialog("Insira o número de voltas: "));
	    exCircuito = Double.parseDouble(JOptionPane.showInputDialog("Insira a extensão do circuito (em metros): "));
	    duracao = Double.parseDouble(JOptionPane.showInputDialog("Insira o tempo de duração (em minutos): "));

	    ProcedureVM();
	    
		System.out.println("A velocidade média é: " + vm + " km/h");
	}

	static void ProcedureVM() {
		
	    vm = (nVoltas * exCircuito * 60.0) / (duracao * 1000.0);

	}
}
