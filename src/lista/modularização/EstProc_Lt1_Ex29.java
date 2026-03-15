/*
 OBJETIVO: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
 Demais tipos não serão considerados.
 Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex29 {
	
	static int tipo;
	static double valor, valorCorrigido;
	
	public static void main(String[] args) {
		
		tipo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de investimento (1 = Poupança, 2 = Renda Fixa)"));
        valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        
        ProcedureInvestimento();
        
        System.out.println("Valor corrigido em 30 dias: " + valorCorrigido);
		
	}
	
	static void ProcedureInvestimento() {
		
		    if (tipo == 1) {
	            valorCorrigido = valor + (valor * 0.03);
	        } 
	         else if (tipo == 2) {
	            valorCorrigido = valor + (valor * 0.05);
	         } 
	          else {
	            System.out.println("Tipo de investimento inválido.");
	            return;
	        }
	}

}
