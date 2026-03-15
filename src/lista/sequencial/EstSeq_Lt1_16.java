/*
 OBJETIVO: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
 Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
 A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.sequencial;

import javax.swing.*;

public class EstSeq_Lt1_16 {

    public static void main(String[] args) {

        int horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas trabalhadas: "));

        double valorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));

        double percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem do desconto: "));

        int dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));

        double salarioBruto = horasTrabalhadas * valorPorHora;
        double descontoEmReais = salarioBruto * (percentualDesconto / 100.0);
        double salarioLiquido = salarioBruto - descontoEmReais;
        double salarioReceber = salarioLiquido + (dependentes * 100.0);

        System.out.println("Salário bruto: R$ " + salarioBruto);
        System.out.println("Desconto: R$ " + descontoEmReais);
        System.out.println("Salário líquido: R$ " + salarioLiquido);
        System.out.println("Salário a receber: R$ " + salarioReceber);
   
    }
}