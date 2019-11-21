package com.example.acessibilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaLocal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_local);
    }
    public void irParaTelaAvaliar (View v){
        Intent intent = new Intent(getApplicationContext(), TelaAvaliarActivity.class);
        startActivity(intent);
    }
}
