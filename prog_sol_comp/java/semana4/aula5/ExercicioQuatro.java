package semana4.aula5;

import javax.swing.JOptionPane;

public class ExercicioQuatro {
    
    // 4. Escreva um programa que verifica se um número natural digitado pelo usuário é
    // primo.
    public static void main(String[] args) {

        int verifica = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor a ser verificado?"));
        if (primos(verifica)) {
            JOptionPane.showMessageDialog(null, "Primo!");
        } else {
            JOptionPane.showMessageDialog(null, "Nao Primo!");
        }

    }
    
    public static Boolean pares(int n) {

        if (n == 2) {
            return true;
        }
        return false;        
    }

    public static Boolean primos(int n) {

        if ((n == 1 ) || (n % 2 == 0)) {
            return pares(n);
        }
        int y = 3;
        while ((y * y) <= n) {
            if (n % y == 0) {
                return false;
            }
            y += 2;
        }
        return true;
    }
}