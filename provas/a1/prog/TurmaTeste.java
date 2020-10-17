package provas.a1.prog;

import java.util.Scanner;

public class TurmaTeste {
    
    // variavel matricula definida como string para o caso de ser um identificador alfanumérico
    
    public static void main(String[] args) {
        String nomeTurma, nomeAluno, matricula, aprovados = "", reprovados = "";
        int qntdAlunos;
        double nota1, nota2, media;
        Turma turmaTeste;

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Qual o nome da turma? ");
        nomeTurma = scan.nextLine();
        
        System.out.print("Quantos alunos há nesta turma? ");
        qntdAlunos = scan.nextInt();

        turmaTeste = new Turma(nomeTurma, qntdAlunos);

        for (int i = 0; i < qntdAlunos; i++) {
            System.out.print("\n");
            System.out.printf("Digite o nome do %dº aluno: ", i+1);
            nomeAluno = scan.next();

            System.out.printf("Digite a matricula do %dº aluno: ", i+1);
            matricula = scan.next();

            System.out.printf("Digite a nota 1 do %dº aluno: ", i+1);
            nota1 = scan.nextDouble();

            System.out.printf("Digite a nota 2 do %dº aluno: ", i+1);
            nota2 = scan.nextDouble();

            turmaTeste.getAlunos()[i] = new Aluno(nomeAluno, matricula, nota1, nota2);

            media = CalcularMedia(nota1, nota2);
            if (media >= 7) {
                aprovados += nomeAluno + '\n' ;
            } else {
                reprovados += nomeAluno + '\n';
            }

        }

        System.out.print("\n");
        System.out.println("LISTA DOS APROVADOS:\n" + aprovados);
        System.out.println("LISTA DOS REPROVADOS:\n" + reprovados);

        scan.close();
        System.out.println("Até a próxima!");
    }

    public static double CalcularMedia(double nota1, double nota2) {
        double media = (nota1 + nota2)/2;
        return media;
    }
}
