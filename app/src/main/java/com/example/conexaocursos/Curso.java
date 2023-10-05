package com.example.conexaocursos;

public class Curso {
    private int id;
    private String name;
    private String valor;


    Curso(int id, String name, String valor) {
        this.id = id;
        this.name = name;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
