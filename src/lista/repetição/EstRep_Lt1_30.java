/*
 OBJETIVO: Receba a data de nascimento e atual em ano, mês e dia. 
 Calcule e mostre a idade em anos, meses e dias, considerando os anos bissextos.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.repetição;

import javax.swing.JOptionPane;

public class EstRep_Lt1_30 {
	
	public static void main (String[] args) {
		
		 int anoNasc, mesNasc, diaNasc;
	        int anoAtual, mesAtual, diaAtual;
	        int anos, meses, dias;
	        int diasMesAnterior = 0;

	        anoNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano de nascimento:"));
	        mesNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês de nascimento:"));
	        diaNasc = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia de nascimento:"));

	        anoAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual:"));
	        mesAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o mês atual:"));
	        diaAtual = Integer.parseInt(JOptionPane.showInputDialog("Digite o dia atual:"));

	        if (diaAtual < diaNasc) {
	            mesAtual = mesAtual - 1;

	            if (mesAtual == 0) {
	                mesAtual = 12;
	                anoAtual = anoAtual - 1;
	            }

	            if (mesAtual == 1 || mesAtual == 3 || mesAtual == 5 || mesAtual == 7 ||
	                mesAtual == 8 || mesAtual == 10 || mesAtual == 12) {
	                diasMesAnterior = 31;
	            } else if (mesAtual == 4 || mesAtual == 6 || mesAtual == 9 || mesAtual == 11) {
	                diasMesAnterior = 30;
	            } else if (mesAtual == 2) {
	                if ((anoAtual % 400 == 0) || (anoAtual % 4 == 0 && anoAtual % 100 != 0)) {
	                    diasMesAnterior = 29;
	                } else {
	                    diasMesAnterior = 28;
	                }
	            }

	            diaAtual = diaAtual + diasMesAnterior;
	        }

	        dias = diaAtual - diaNasc;

	        if (mesAtual < mesNasc) {
	            mesAtual = mesAtual + 12;
	            anoAtual = anoAtual - 1;
	        }

	        meses = mesAtual - mesNasc;
	        anos = anoAtual - anoNasc;

	        JOptionPane.showMessageDialog(null, "Idade: " + anos + " ano(s), " + meses + " mes(es) e " + dias + " dia(s).");
	}

}
