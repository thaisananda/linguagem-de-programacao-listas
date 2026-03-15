/*
 OBJETIVO: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0. Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.decisão;

import javax.swing.JOptionPane;

public class EstDec_Lt1_20 {
	
	public static void main(String[] args) {
		
		int a = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o coeficiente a: "));
		int b = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o coeficiente b: "));
		int c = Integer.parseInt(JOptionPane.showInputDialog("Insira um valor para o coeficiente c: "));
		
		int delta = (b*b) - 4 * a * c;
		
		System.out.println("Delta = " + delta);

        if (delta < 0) {
            System.out.println("Não há raízes reais.");
        } else {
            double x1 = (-b + Math.sqrt(delta)) / (2.0 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2.0 * a);

            System.out.println("x1: " + x1);
            System.out.println("x2: " + x2);
        }

    }
	
}
