/*
 OBJETIVO: Receba a hora de início e de final de um jogo (HH,MM), 
 sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_25 {
	
	public static void main(String[] args) {
		
		  int hIni = Integer.parseInt(JOptionPane.showInputDialog("Hora de início: "));
	      int mIni = Integer.parseInt(JOptionPane.showInputDialog("Minuto de início: "));
	      int hFim = Integer.parseInt(JOptionPane.showInputDialog("Hora de fim: "));
	      int mFim = Integer.parseInt(JOptionPane.showInputDialog("Minuto de fim: "));
	      
	      int inicio = hIni * 60 + mIni;
	      int fim = hFim * 60 + mFim;
	      int duracao;

	      if (inicio == fim) {
	    	  
	            duracao = 24 * 60;
	            
	        } else if (fim > inicio) {
	        	
	            duracao = fim - inicio;
	            
	        } else {
	        	
	            duracao = (24 * 60 - inicio) + fim;
	        }
	      

	        int horas = duracao / 60;
	        int minutos = duracao % 60;

	        JOptionPane.showMessageDialog(null, "Duração do jogo: " + horas + " hora(s) e " + minutos + " minuto(s).");

	}

}
