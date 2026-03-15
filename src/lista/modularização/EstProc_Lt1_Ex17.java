/*
 OBJETIVO: Utilizando procedimento, calcular a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 Receber o tempo de percurso e a velocidade média.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex17 {
	
	static double tempo, velocidade, distancia, litros;
	
	public static void main (String[] args) {
		
		 tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo da viagem (em horas): "));

	     velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média (km/h): "));

	     ProcedureLitros();
	     
	     System.out.println("Distância percorrida: " + distancia + " km");
	     System.out.println("Litros gastos: " + litros + " L");
	}

	static void ProcedureLitros() {
		
		   distancia = tempo * velocidade;
	        
	       litros = distancia / 12.0;
	}
}
