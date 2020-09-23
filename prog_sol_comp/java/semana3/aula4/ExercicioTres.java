package prog_sol_comp.java.semana3.aula4;

import javax.swing.JOptionPane;

public class ExercicioTres {
    
    public static void main(String[] arr) {

        // 3. Ler um número e verificar se ele é par ou ímpar.
        
        Integer num = Integer.parseInt(JOptionPane.showInputDialog("Digite um numero"));
        Integer cond = num % 2;
        if (cond == 0) {

            JOptionPane.showMessageDialog(null, "Par!");

        } else {

            JOptionPane.showMessageDialog(null, "Impar!");

        }

    }
}
