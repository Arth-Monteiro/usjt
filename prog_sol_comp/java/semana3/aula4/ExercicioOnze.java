package prog_sol_comp.java.semana3.aula4;

import javax.swing.JOptionPane;

public class ExercicioOnze {
    
    // 11. Fazer um programa que recebe o salário-base de um funcionário, calcula
    // e mostra o salário a receber, sabendo-se que esse funcionário tem
    // gratificação de 5% sobre o salário-base e paga imposto de 7% sobre o
    // salário-base.

    public static void main(String[] args) {
        
        Double taxaImposto = 0.07;
        Double taxaGratificacao = 0.05;
        Double salarioBase = Double.parseDouble(JOptionPane.showInputDialog("Insira seu salario Base abaixo."));

        Double imposto = calculaImposto(salarioBase, taxaImposto);
        Double gratificacao = calculaGratificacao(salarioBase, taxaGratificacao);
        Double salarioReceber = salarioBase + gratificacao - imposto;

        String msg = "";
        msg += "Imposto: R$" + imposto + "\n";
        msg += "Gratificacao: R$"  + gratificacao + "\n";
        msg += "Salario a receber: R$" + salarioReceber;
        JOptionPane.showMessageDialog(null, msg);

    }
    
    public static Double calculaImposto(Double salarioBase, Double taxaImposto) {

        Double imposto = salarioBase * taxaImposto;
        return imposto;
        
    }

    public static Double calculaGratificacao(Double salarioBase, Double taxaGratificacao) {

        Double gratificacao = salarioBase * taxaGratificacao;
        return gratificacao;
    }


}
