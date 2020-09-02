package semana3.aula4;

import java.util.Scanner;

public class ExercicioSete {

    public static void main (String[] arr) {
        
        // 7. Fazer um programa que calcula e mostra a área de um triângulo,
        // sabendo que:
        // área = (base * altura) / 2.
         
        Scanner sc = new Scanner(System.in);

        System.out.print("Base: ");
        float base = sc.nextFloat();

        System.out.print("Altura: ");
        float alt = sc.nextFloat();

        sc.close();

        double resposta = (base * alt) / 2;
        System.out.print("Area do triangulo = ");
        System.out.println(resposta);

    }
    
}
