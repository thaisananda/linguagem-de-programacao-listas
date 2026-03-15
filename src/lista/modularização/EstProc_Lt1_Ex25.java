/*
 OBJETIVO: Receba a hora de início e de final de um jogo (HH,MM), 
 sabendo que o tempo máximo é de 24 horas e pode começar num dia e terminar noutro.
Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex25 {
	
	  static int hIni, mIni, hFim, mFim, duracao, horas, minutos, inicio, fim;
	  
	  public static void main(String[] args) {
		  
		  hIni = Integer.parseInt(JOptionPane.showInputDialog("Hora de início: "));
	      mIni = Integer.parseInt(JOptionPane.showInputDialog("Minuto de início: "));
	      hFim = Integer.parseInt(JOptionPane.showInputDialog("Hora de fim: "));
	      mFim = Integer.parseInt(JOptionPane.showInputDialog("Minuto de fim: "));
	      
	      inicio = hIni * 60 + mIni;
	      fim = hFim * 60 + mFim;
	      
	      ProcedureDuracao();
	      
	      JOptionPane.showMessageDialog(null, "Duração do jogo: " + horas + " hora(s) e " + minutos + " minuto(s).");

	  }
	  
	  static void ProcedureDuracao() {
		  
	      if (inicio == fim) {
	    	  
	            duracao = 24 * 60;
	            
	      } else if (fim > inicio) {
	        	
	            duracao = fim - inicio;
	            
	        } else {
	        	
	            duracao = (24 * 60 - inicio) + fim;
	        }
	     
	     horas = duracao / 60;
	     minutos = duracao % 60;
		  
	  }

}
