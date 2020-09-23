package prog_sol_comp.java.semana4.aula5;

public class ExercicioDois {

    //2. Reimplemente o exercício 1, fazendo com que os valores sejam exibidos em ordem
    //reversa.
     public static void main(String[] args) {
        String msg = "";
        int i = 99;
        do {
            if (i == 0) {
                msg += i + ".";
            } else {
                msg += i + ", ";
            }
        } while (i-- > 0);
        System.out.println(msg);
    }
}
