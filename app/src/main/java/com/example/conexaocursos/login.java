package com.example.conexaocursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class login extends AppCompatActivity {

    private EditText usernameEditText;
    private EditText passwordEditText;
    private Button loginButtonAluno;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        usernameEditText = findViewById(R.id.usernameEmail);
        passwordEditText = findViewById(R.id.password);
        loginButtonAluno = findViewById(R.id.buttonAluno);

        loginButtonAluno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = usernameEditText.getText().toString();

                String password = passwordEditText.getText().toString();

                if (username.equals("aluno@aluno.com") && password.equals("123456")) {

                    Toast.makeText(login.this, "Login bem-sucedido", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(login.this, alunoHome.class);
                    startActivity(intent);

                } else {
                    Toast.makeText(login.this, "Nome de usuário ou senha incorretos", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}