package semana3.aula4;

import javax.swing.JOptionPane;

public class ExercicioSeis {
    
    public static void main(String[] arr) {

        // 6. Fazer um programa que recebe três notas, calcula e mostra a média
        // aritmética dessas notas.

        double numero = 0.0;
        int quant = 3;

        for (int i = 0; i < quant; i++) {

            numero += Double.parseDouble(JOptionPane.showInputDialog("Digite um numero"));
        
        } 

        JOptionPane.showMessageDialog(null, "Sua media = " + (numero/quant));

    }
}
