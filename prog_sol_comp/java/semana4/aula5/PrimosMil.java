package semana4.aula5;

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

        List<Integer> result = lines.stream()                // convert list to stream
                .filter(line -> primos(line))     // we dont like mkyong
                .collect(Collectors.toList());              // collect the output and convert streams to a List

        result.forEach(System.out::println);  

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