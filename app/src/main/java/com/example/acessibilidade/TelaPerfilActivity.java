package com.example.acessibilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaPerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_perfil);
    }
    public void irParaAddInfos (View v){
        Intent intent = new Intent(getApplicationContext(), AddInfoActivity.class);
        startActivity(intent);
    }
    public void irParaTelaInicial (View v){
        Intent intent = new Intent(getApplicationContext(), TelaInicialActivity.class);
        startActivity(intent);
    }
}
