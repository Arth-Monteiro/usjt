package semana4.aula5;

import java.util.Scanner;

public class ExercicioTres {

    // 3. Escreva um programa que calcula o fatorial de um valor natural digitado pelo
    // usuário.
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número para Calcularmos fatorial: ");
        int cont = sc.nextInt();
        sc.close();
        if (cont == 0) {
            System.out.println(1);
        } else {
            System.out.println(fatorial(cont));
        };
    
    }
    
    public static Integer fatorial(int cont) {

        if(cont <= 1) {
            return cont;
        } else {
            return cont * fatorial(cont - 1);
        }
        
    }
}
