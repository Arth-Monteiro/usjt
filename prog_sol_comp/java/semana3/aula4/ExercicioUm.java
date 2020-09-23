package prog_sol_comp.java.semana3.aula4;

public class ExercicioUm {
    public static void main (String[] arr) {

        // 1. Sabendo que A=3, B=7 e C=4, informe se as expressões abaixo são
        // verdadeiras ou falsas.
        // a) (A+C) > B ( )
        // b) B >= (A + 2) ( )
        // c) C == (B –A) ( )
        // d) (B + A) <= C ( )
        // e) (C+A) > B ( )


        Integer A = 3, B = 7, C = 4;
        System.out.println((A+C) > B );
        System.out.println(B >= (A+2));
        System.out.println(C == (B-A));
        System.out.println((B+A) <= C);
        System.out.println((C+A) > B);
    } 
}