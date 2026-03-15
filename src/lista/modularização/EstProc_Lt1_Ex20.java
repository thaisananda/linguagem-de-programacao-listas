/*
 OBJETIVO: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. 
 Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 Utilizar procedimento.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex20 {
	
	static int a, b, c, delta;
	static double x1,x2;
	
	public static void main(String[] args) {
		
		a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o coeficiente a: "));
		b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o coeficiente b: "));
		c = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o coeficiente c: "));
		
		ProcedureEquacao2Grau();
		
		System.out.println("Delta = " + delta);
		System.out.println("x1: " + x1);
        System.out.println("x2: " + x2);

	}

	static void ProcedureEquacao2Grau() {
		
		delta = (b*b) - 4 * a * c;
		x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
        x2 = (-b - Math.sqrt(delta)) / (2.0 * a);
	
	}
}
