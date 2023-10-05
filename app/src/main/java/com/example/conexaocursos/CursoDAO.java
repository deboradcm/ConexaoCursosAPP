package com.example.conexaocursos;

import android.content.Context;

import java.util.ArrayList;

public class CursoDAO {
    private Context context;
    private static ArrayList<Curso> cursoList = new ArrayList<>();

    public CursoDAO (Context context){
        this.context = context;
    }

    public ArrayList<Curso> getList(){
        if(cursoList.size() == 0) {
            cursoList.add(new Curso(0, "Introducao a Python", "R$120,00"));
            cursoList.add(new Curso(1, "Introducao a C", "R$160,00"));
            cursoList.add(new Curso(2, "Introducao a JAVA", "R$260,00"));
            cursoList.add(new Curso(3, "Introducao a KOTLIN", "R$200,00"));
        }
        return cursoList;
    }

}
