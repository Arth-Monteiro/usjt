package prog_sol_comp.java.semana3.aula4;

import javax.swing.JOptionPane;

public class ExercicioDez {
    
    public static void main(String[] args) {
        
        // 10. Fazer um programa que recebe o preço de um produto, calcula e mostra
        // o novo preço sabendo-se que este sofreu um desconto de 10%.

        double discount = 0.1; // 100% - 10%
        double porcentagemTotal = 1 - discount;
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Qual o preco antigo?"));

        JOptionPane.showMessageDialog(null, "Novo Preço = " + preco * porcentagemTotal);

    }

}
