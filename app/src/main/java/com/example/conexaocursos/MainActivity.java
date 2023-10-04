package com.example.conexaocursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btEntrar = findViewById(R.id.btEntrar);
        Button btCadastrar = findViewById(R.id.btCadastrar);
        btEntrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrparaTelaLogin();
            }
        });

        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                IrparaTelaCadastro();
            }
        });

    }
    private void IrparaTelaLogin(){
        Intent telaLogin = new Intent(this, login.class);
        startActivity(telaLogin);
    }

    private void IrparaTelaCadastro(){
        Intent telaCadastro = new Intent(this, cadastro.class);
        startActivity(telaCadastro);
    }
}