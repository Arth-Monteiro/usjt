package provas.a1.prog;


public class Turma {
    private String nomeTurma;
    private Aluno[] alunos;

    public Turma(String nomeTurma, int qtdeAlunos) {
        this.nomeTurma = nomeTurma;
        this.alunos = new Aluno[qtdeAlunos];
    }

    public Aluno[] getAlunos() {
		return alunos;
	}
}
