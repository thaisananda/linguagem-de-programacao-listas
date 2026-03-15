/*
 OBJETIVO: Utilizando procedimento, receba a quantidade de horas trabalhadas, o valor por hora, o percentual de desconto e o número de descendentes. 
 Calcule o salário que serão as horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário Bruto – desconto). 
 A cada dependente será acrescido R$ 100 no Salário Líquido. Exiba o salário a receber.
 PROGRAMADOR: THAIS ANANDA
 DATA DE CRIAÇÃO: 05/03/2026
 */

package lista.modularização;

import javax.swing.JOptionPane;

public class EstProc_Lt1_Ex16 {

    static int horasTrabalhadas;
    static double valorPorHora;
    static double percentualDesconto;
    static int dependentes;
    static double salarioReceber;

    public static void main(String[] args) {

        horasTrabalhadas = Integer.parseInt(JOptionPane.showInputDialog("Digite o total de horas trabalhadas: "));
        valorPorHora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por hora: "));
        percentualDesconto = Double.parseDouble(JOptionPane.showInputDialog("Insira a porcentagem do desconto: "));
        dependentes = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de dependentes: "));

        ProcedureSalario();

        JOptionPane.showMessageDialog(null, "Salário a receber = R$ " + salarioReceber);
    }

    static void ProcedureSalario() {
    	
        double salarioBruto = horasTrabalhadas * valorPorHora;
        double descontoEmReais = salarioBruto * (percentualDesconto / 100.0);
        double salarioLiquido = salarioBruto - descontoEmReais;

        salarioReceber = salarioLiquido + (dependentes * 100.0);
    }
}