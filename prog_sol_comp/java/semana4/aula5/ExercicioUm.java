package semana4.aula5;

public class ExercicioUm {

    // 1. Escreva um programa que exibe os primeiros 100 números naturais. Faça versões
    // usando for, while e do/while.
     public static void main(String[] args) {
        String msg = "";
        String fim;
        for (int i = 0; i < 100; i++) {

            if (i == 99) {
                fim = ".";
            } else {
                fim = ", ";
            }
            msg += i + fim;

        }
        System.out.println(msg);
    }
}
