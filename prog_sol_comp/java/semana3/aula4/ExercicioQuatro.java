package semana3.aula4;

import java.util.Scanner;

public class ExercicioQuatro {
    
    public static void main(String[] arr) {

        // 4. Tendo como dados de entrada a altura (h) e o sexo de uma pessoa (um
        // caracter m ou f), construir um programa que calcula seu peso ideal,
        // utilizando as seguintes fórmulas:
        // Para homens: (72.7*h) - 58
        // Para mulheres: (62.1*h) - 44.7

        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Genero [M|F]: ");
        String gen = entrada.nextLine();
        
        System.out.println("Altura:" );
        float alt = entrada.nextFloat();
        
        entrada.close();

        double resposta;

        if (gen.equals(String.valueOf("M")) || gen.equals(String.valueOf("m"))) {
          
            resposta = (72.7 * alt) - 58;
        
        } else {

            resposta = (62.1 * alt) - 44.7;

        }

        System.out.println("Seu peso ideal: " + resposta);

    }

}
