package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import com.example.models.Aluno;
import com.example.models.Disciplina;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Aluno> alunos = new ArrayList<>();
        Aluno aluno;

        System.out.println("===== PROGRAMA DE INSERÇÃO DE ALUNOS =====");
        System.out.print("Quantos alunos deseja cadastrar? ");
        int n = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.print("\nInsira o nome do aluno " + (i + 1) + ": ");
            String nome = sc.nextLine();
            System.out.print("Insira a matricula do aluno: ");
            int matricula = sc.nextInt();
            sc.nextLine();
            aluno = new Aluno(matricula, nome);
            alunos.add(aluno);
            System.out.println();
            System.out.print("Quantas disciplinas deseja adicionar para esse aluno? ");
            int qtd = sc.nextInt();
            sc.nextLine();
            for (int j = 0; j < qtd; j++) {
                System.out.print("\nInsira o nome da disciplina: ");
                String nomeDisciplina = sc.nextLine();
                System.out.print("Insira a primeira nota do aluno nessa disciplina: ");
                double nota1 = sc.nextDouble();
                sc.nextLine();
                System.out.print("Insira a segunda nota do aluno nessa disciplina: ");
                double nota2 = sc.nextDouble();
                sc.nextLine();
                System.out.print("Insira a terceira nota do aluno nessa disciplina: ");
                double nota3 = sc.nextDouble();
                sc.nextLine();
                System.out.print("Insira a quarta nota do aluno nessa disciplina: ");
                double nota4 = sc.nextDouble();
                sc.nextLine();
                Disciplina disciplina = new Disciplina(nomeDisciplina, nota1, nota2, nota3, nota4);
                aluno.addDisciplina(disciplina);
            }
        }

        System.out.println("\n===== LISTA DE TODOS OS ALUNOS E SUAS NOTAS: ======");
        for (Aluno a : alunos) {
            System.out.println("Matrícula: " + a.getMatricula() + "- Nome: " + a.getNome());
            System.out.println("Notas das disciplinas do aluno " + a.getNome());
            for (Disciplina d : a.getDisciplina()) {
                System.out.println("Disciplina: " + d.getNome());
                System.out.println("Nota 1: " + d.getNota1());
                System.out.println("Nota 2: " + d.getNota2());
                System.out.println("Nota 3: " + d.getNota3());
                System.out.println("Nota 4: " + d.getNota4());
                System.out.println("Média das notas: " + String.format("%.2f", d.getMediaNotas()));
            }
        }

        sc.close();
    }
}
