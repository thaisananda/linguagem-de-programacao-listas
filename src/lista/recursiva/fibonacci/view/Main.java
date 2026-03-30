package lista.recursiva.fibonacci.view;

import javax.swing.JOptionPane;
import lista.recursiva.fibonacci.controller.Controller;

public class Main {
	
	public static void main(String[] args) {
		
		int n;
		
		n = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor inteiro: "));
		
		for (int i = 0; i <= n; i++) {
			System.out.println("Fibonacci de " + i + " = " + Controller.CalcFibonacci(i));
		}
	}
}