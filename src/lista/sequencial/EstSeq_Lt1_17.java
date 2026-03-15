/*
 OBJETIVO: Calcular a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l. 
 Receber o tempo de percurso e a velocidade média.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_17 {

    public static void main(String[] args) {

        double tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo da viagem (em horas): "));

        double velocidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a velocidade média (km/h): "));

        double distancia = tempo * velocidade;
        
        double litros = distancia / 12.0;

        System.out.println("Distância percorrida: " + distancia + " km");
        System.out.println("Litros gastos: " + litros + " L");

        JOptionPane.showMessageDialog(null, "Litros gastos: " + litros + " L");
    }
}