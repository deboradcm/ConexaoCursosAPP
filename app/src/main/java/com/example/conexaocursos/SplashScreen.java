package com.example.conexaocursos;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashScreen extends AppCompatActivity {

    static int TEMPO_SPLASH_SCREEN = 2000; //ms

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                irParaProximoActivity();
            }

            private void irParaProximoActivity() {
                Intent intent = new Intent(SplashScreen.this, login.class);
                startActivity(intent);
                finish(); //finaliza o activity
            }
        }, TEMPO_SPLASH_SCREEN);
    }
}