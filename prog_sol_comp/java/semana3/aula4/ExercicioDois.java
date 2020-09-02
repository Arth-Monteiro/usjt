package semana3.aula4;

public class ExercicioDois {
    public static void main (String[] arr) {

        // 2. Sabendo que A=5, B=4, C=3 e D=6, informe se as expressões abaixo são
        // verdadeiras ou falsas.
        // a) (A > C) && (C <= D) ( )
        // b) (A+B) > 10 || (A+B) == (C+D) ( )
        // c) (A>=C) && (D >= C) ( )

        Integer A = 5, B = 4, C = 3, D = 6;
        Boolean condUm = (A > C) && (C <= D);
        Boolean condDois = (A + B) > 10 || (A + B) == (C + D);
        Boolean condTres = (A >= C) && (D >= C);
        
        System.out.println(condUm + "; " + condDois + "; " + condTres);
    }
}
