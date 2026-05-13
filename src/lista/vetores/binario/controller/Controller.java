package lista.vetores.binario.controller;

public class Controller {

	public static int[] converteBinario(int n) {
		if (n == 0) {
			return new int[] {0};
		}

		int aux = n;
		int tamanho = 0;

		while (aux > 0) {
			aux = aux / 2;
			tamanho++;
		}

		int[] vetor = new int[tamanho];

		for (int i = tamanho - 1; i >= 0; i--) {
			vetor[i] = n % 2;
			n = n / 2;
		}

		return vetor;
	}
}