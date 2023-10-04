package com.example.conexaocursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Button cadAluno = findViewById(R.id.cadAluno);
        Button cadInstrutor = findViewById(R.id.cadInstrutor);
        cadAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrparaTelacadastroAluno();
            }
        });

        cadInstrutor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrparaTelaCadastroInstrutor();
            }
        });
    }

    private void IrparaTelacadastroAluno(){
        Intent telaCadastroAluno = new Intent(this, cadastroAluno.class);
        startActivity(telaCadastroAluno);
    }

    private void IrparaTelaCadastroInstrutor(){
        Intent telaCadastroInstrutor = new Intent(this, cadastroInstrutor.class);
        startActivity(telaCadastroInstrutor);
    }
}