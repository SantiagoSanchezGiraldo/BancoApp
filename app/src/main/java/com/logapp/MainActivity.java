package com.logapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView inicioTit;
    EditText usuarioInput, claveInput;
    Button loginBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inicioTit = findViewById(R.id.titulo);
        usuarioInput = findViewById(R.id.usuario_input);
        claveInput = findViewById(R.id.clave_input);
        loginBtn = findViewById(R.id.login_btn);

        loginBtn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent loginBtn = new Intent(MainActivity.this, InicioBanc.class);
                startActivity(loginBtn);
            }
        });
        
    }
}