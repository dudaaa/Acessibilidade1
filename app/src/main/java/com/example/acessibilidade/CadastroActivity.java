package com.example.acessibilidade;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void mudarTela (View v) {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Bem vindo NOME");
        builder.setMessage("Seu cadastro foi efetuado com sucesso!");

        DialogInterface.OnClickListener btnOk = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences sp = getSharedPreferences("infos_login", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("email", email);
                editor.putString("nome", nome);
                Intent intent = new Intent(getApplicationContext(), TelaInicialActivity.class);
                startActivity(intent);
            }
        };
        builder.setPositiveButton("Ok", btnOk);
        builder.create().show();
    }

}


