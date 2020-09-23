package prog_sol_comp.java.semana6.aula6.futebol;

public class Jogador {

    private String nome;
    private int numero;

    public Jogador (String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    public String toString() {
        return "Jogador " + nome + ", Numero " + numero;
    }

    public void chutou() {
        System.out.println(nome + " chutou!");
    }
}
