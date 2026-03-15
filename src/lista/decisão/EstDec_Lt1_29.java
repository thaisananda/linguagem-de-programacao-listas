/*
 OBJETIVO: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor do investimento. 
 Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3% e a renda fixa = 5%. 
 Demais tipos não serão considerados.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 08/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_29 {
	
	public static void main(String[] args) {
		
		int tipo = Integer.parseInt(JOptionPane.showInputDialog("Insira o tipo de investimento (1 = Poupança, 2 = Renda Fixa)"));
        double valor = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do investimento: "));
        
        double valorCorrigido = 0;

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

        System.out.println("Valor corrigido em 30 dias: " + valorCorrigido);
		
	}

}
