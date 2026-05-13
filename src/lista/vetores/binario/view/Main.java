package lista.vetores.binario.view;

import javax.swing.JOptionPane;

import lista.vetores.binario.controller.Controller;

public class Main {

	public static void main(String[] args) {

		int n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		int[] vetor = Controller.converteBinario(n);

		String saida = "";

		for (int i = 0; i < vetor.length; i++) {
			saida += vetor[i];
		}

		JOptionPane.showMessageDialog(null, "Binário: " + saida);
	}
}