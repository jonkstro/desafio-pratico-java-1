package com.example.models;

public class Disciplina {
    private String nome;
    private Double nota1;
    private Double nota2;
    private Double nota3;
    private Double nota4;
    
    public Disciplina(String nome, Double nota1, Double nota2, Double nota3, Double nota4) {
        this.nome = nome;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.nota4 = nota4;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getNota1() {
        return nota1;
    }
    public void setNota1(Double nota1) {
        this.nota1 = nota1;
    }
    public Double getNota2() {
        return nota2;
    }
    public void setNota2(Double nota2) {
        this.nota2 = nota2;
    }
    public Double getNota3() {
        return nota3;
    }
    public void setNota3(Double nota3) {
        this.nota3 = nota3;
    }
    public Double getNota4() {
        return nota4;
    }
    public void setNota4(Double nota4) {
        this.nota4 = nota4;
    }

    public Double getMediaNotas() {
        return (nota1+nota2+nota3+nota4)/4;
    }
}
