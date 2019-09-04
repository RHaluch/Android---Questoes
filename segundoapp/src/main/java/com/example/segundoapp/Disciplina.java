package com.example.segundoapp;

public class Disciplina {
    private String materia, dia;
    private double nota;

    public Disciplina(String materia, double nota, String dia) {
        this.materia = materia;
        this.nota = nota;
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
