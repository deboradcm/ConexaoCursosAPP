package com.example.conexaocursos;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

public class CursoViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
    public Context context;
    public TextView nome, valor;
    public int id;
    public CursoViewHolder(ConstraintLayout v, Context context) {
        super(v);
        this.context = context;
        nome = v.findViewById(R.id.nome);
        valor = v.findViewById(R.id.valor);
        v.setOnClickListener(this);
    }
    public void onClick(View v) {
        Toast.makeText(context, "Curso " + this.nome.getText().toString(), Toast.LENGTH_LONG)
                .show();
    }
}