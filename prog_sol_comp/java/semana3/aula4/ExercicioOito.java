package prog_sol_comp.java.semana3.aula4;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import javax.swing.JOptionPane;

;public class ExercicioOito {
    
    public static void main(String[] args) {

        // 8. Fazer um programa que calcula e mostra a área de um círculo, sabendo
        // que:
        // área = pi * r2
        
        double raio = Double.parseDouble(JOptionPane.showInputDialog("Manda o raio, te mando a area!"));
        double resposta = PI * pow(raio, 2);

        JOptionPane.showMessageDialog(null, resposta);

    }

}
