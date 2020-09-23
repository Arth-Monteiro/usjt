package prog_sol_comp.java.semana3.aula4;

import java.lang.Math;
import java.util.Scanner;

public class ExercicioNove {

    public static void main(String[] args) {
        
        // 9. Fazer um programa que recebe um número positivo, calcula e mostra:
        // a) O número digitado ao quadrado;
        // b) O número digitado ao cubo;
        // c) A raiz quadrada do número digitado.

        Scanner sc = new Scanner(System.in);
        double num;

        while (true) {
            
            System.err.print("Digite um numero positivo: ");
            num = sc.nextDouble();
            
            if (num >= 0) {

                sc.close();
                break;

            }

        }

        double quadrado = Math.pow(num, 2);
        double cubo = Math.pow(num, 3);
        double raiz = Math.sqrt(num);

        System.out.println("Quadrado: " + quadrado);
        System.out.println("Cubo: " + cubo);
        System.out.println("Raiz Quadrada: " + raiz);

    }
}