package com.example.acessibilidade;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Debug;
import android.util.DebugUtils;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class CadastroActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
    }

    public void mudarTela (View v) {
        String nome = ((TextView)findViewById(R.id.editTextNome)).getText().toString();
        String email = ((TextView)findViewById(R.id.editTextEmail)).getText().toString();
        String senha = ((TextView)findViewById(R.id.editTextSenha)).getText().toString();

        try {
            DBHelper.insertIntoDadosUsuario(nome, email, senha);
        } catch (IOException e) {}

        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle("Bem vindo");
        builder.setMessage("Seu cadastro foi efetuado com sucesso!");

        DialogInterface.OnClickListener btnOk = new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int which) {
                SharedPreferences sp = getSharedPreferences("infos_login", Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sp.edit();
                editor.putString("email", null);
                editor.putString("nome", null);
                Intent intent = new Intent(getApplicationContext(), TelaInicialActivity.class);
                startActivity(intent);
            }
        };

        builder.setPositiveButton("Ok", btnOk);
        builder.create().show();
    }
}


