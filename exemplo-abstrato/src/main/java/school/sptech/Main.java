package school.sptech;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();

        AlunoPos alunoPos = new AlunoPos("Vitor","ra123", 5.8, 8.5, 9.3);
        AlunoGraduacao alunoGraduacao = new AlunoGraduacao("Luiz","ra321", 6.9,8.0,2.4,2.5);
        AlunoDoutorado alunoDoutorado = new AlunoDoutorado("Felipe" , "ra987" , 3.6, 5.6 , 4.5);

        alunos.add(alunoGraduacao);
        alunos.add(alunoPos);
        alunos.add(alunoDoutorado);

        for (Aluno aluno : alunos) {
            System.out.println("Nome " + aluno.getNome() + " - Nota:" + aluno.calcularNota());
        }


    }
}