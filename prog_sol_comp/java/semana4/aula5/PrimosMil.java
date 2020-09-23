package prog_sol_comp.java.semana4.aula5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
//import javax.swing.JOptionPane;

public class PrimosMil {
    
    // 4. Escreva um programa que verifica se um número natural digitado pelo usuário é
    // primo.
    public static void main(String[] args) {

        List<Integer> lines = new ArrayList<>();;
        for (int i = 0; i <= 1000; i++) {
            lines.add(i);
        }

        List<Integer> result = lines.stream()    
                .filter(line -> primos(line))    
                .collect(Collectors.toList());   

        // result.forEach(System.out::println);  -> imprime um numero por linha
        // JOptionPane.showMessageDialog(null, result); -> teria que ajustar 
                                                         //janela e valores para caberem na tela 
                                                         // ou criar scrolls na janela
                                                         
        String msg = result.stream()
                .map(number -> number.toString())
                .collect(Collectors.joining(", "));
        
        msg += ".";
        System.out.println(msg);

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