package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_12 {
	
	public static void main(String[] args) {
		
		int ano_Nascimento, ano_Atual, idade=0, mais17=0;
		
		ano_Nascimento = Integer.parseInt(JOptionPane.showInputDialog("Digite seu ano de nascimento: "));
		ano_Atual = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano atual: "));
		
		idade = ano_Atual - ano_Nascimento;
		
		mais17 = idade + 17;
		
		 JOptionPane.showMessageDialog(null, "A sua idade atual é: " + idade);
		 JOptionPane.showMessageDialog(null, "A sua idade daqui a 17 anos será: " + mais17);


	}

}
