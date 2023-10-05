package com.example.conexaocursos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CursoAdapter extends RecyclerView.Adapter<CursoViewHolder> {
    private Context context;
    private ArrayList<Curso> cursos;
    CursoDAO cursoDAO;
    public CursoAdapter(Context context) {
        this.context = context;
        cursoDAO = new CursoDAO(context);
        update();
    }
    public void update() { cursos = cursoDAO.getList(); }
    public CursoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        ConstraintLayout v = (ConstraintLayout) LayoutInflater
                .from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);
        CursoViewHolder vh = new CursoViewHolder(v, context);
        return vh;
    }
    public void onBindViewHolder(CursoViewHolder holder, int position) {
        holder.nome.setText(cursos.get(position).getName());
        holder.valor.setText(cursos.get(position).getValor());
        holder.id = cursos.get(position).getId();
    }
    public int getItemCount() { return cursos.size(); }
}
