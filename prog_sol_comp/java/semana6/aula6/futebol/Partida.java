package prog_sol_comp.java.semana6.aula6.futebol;

public class Partida {
    
    private Time local;
    private Time visitante;
    private int golsLocal;
    private int golsVisitante;

    public Partida(Time local, Time visitante, int golsLocal, int golsVisitante) {
        this.local = local;
        this.visitante = visitante;
        this.golsLocal = golsLocal;
        this.golsVisitante = golsVisitante;
    }

    public String toString() {
        String loc = "De um lado:\n" + local + "\nFizeram " + golsLocal + " gols.\n";
        String vis = "Do outro:\n" + visitante + "\nFizeram " + golsVisitante + " gols.";

        return loc + vis;
    }
}
