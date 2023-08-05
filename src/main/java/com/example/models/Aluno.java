package com.example.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Aluno implements Serializable {
    private Integer matricula;
    private String nome;
    private List<Disciplina> disciplina = new ArrayList<>();

    public Aluno() {
    }

    public Aluno(Integer matricula, String nome) {
        this.matricula = matricula;
        this.nome = nome;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplina() {
        return disciplina;
    }

    public void addDisciplina(Disciplina d) {
        disciplina.add(d);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((matricula == null) ? 0 : matricula.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Aluno other = (Aluno) obj;
        if (matricula == null) {
            if (other.matricula != null)
                return false;
        } else if (!matricula.equals(other.matricula))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", disciplina=" + disciplina + "]";
    }

}
