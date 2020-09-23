package prog_sol_comp.java.semana3.aula4;

import javax.swing.JOptionPane;

public class ExercicioCinco {
    
    public static void main(String[] arr) {

        // 5. Fazer um programa que recebe três números inteiros, calcula e mostra a
        // soma desses números.

        double numero = 0.0;

        for (int i = 0; i < 3; i++) {

            numero += Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        
        } 

        JOptionPane.showMessageDialog(null, "Sua soma = " + numero);

    }
}
