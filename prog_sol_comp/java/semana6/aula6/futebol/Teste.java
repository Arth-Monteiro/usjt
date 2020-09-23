package prog_sol_comp.java.semana6.aula6.futebol;

public class Teste {
    public static void main(String[] args) {
        Jogador pele = new Jogador("Pele", 10);
        Jogador neymar = new Jogador("Neymar", 9);
        Jogador[] jogadoresAzul = new Jogador[2];
        jogadoresAzul[0] = pele;
        jogadoresAzul[1] = neymar;
        Time azul = new Time("Azul", jogadoresAzul);
    
        Jogador ronaldo = new Jogador("Ronaldo", 10);
        Jogador romario = new Jogador("Romario", 9);
        Jogador[] jogadoresVermelho = new Jogador[2];
        jogadoresVermelho[0] = ronaldo;
        jogadoresVermelho[1] = romario;
        Time vermelho = new Time("Vermelho", jogadoresVermelho);

        Partida jogo = new Partida(azul, vermelho, 3, 2);
        System.out.println(jogo);
    }
}
