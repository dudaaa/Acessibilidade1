package com.example.acessibilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void vaiparaCadastro (View v) {
        Intent intent = new Intent(this, CadastroActivity.class);
        startActivity(intent);
    }
    public void vaiparaEntrar (View v) {
        Intent intent = new Intent(this, EntreActivity.class);
        startActivity(intent);
    }
}
