package prog_sol_comp.java.semana6.aula6.futebol;

public class Time {
    
    private String nome;
    private Jogador[] jogadores;

    public Time(String nome, Jogador[] jogadores) {
        this.nome = nome;
        this.jogadores = jogadores;
    }

    public String toString() {
        StringBuilder resposta = new StringBuilder();
        resposta.append("Escalacao do time " + nome + ":");
        for (int i = 0; i < jogadores.length; i++) {
            resposta.append("\n\t" + jogadores[i]);
        }
        return resposta.toString();
    }
    
}
