package com.example.acessibilidade;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class TelaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);
    }

    public boolean onCreateOptionsMenu (Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void irParaLocais (View v){
        Intent intent = new Intent(getApplicationContext(), locaisPasta.class);
        startActivity(intent);
    }
    public boolean onOptionsItemSelected ( MenuItem item) {
        switch (item.getItemId()) {
            case R.id.meuperfilId:

                Intent intentPerfil = new Intent(getApplicationContext(), MeuPerfil.class);
                startActivity(intentPerfil);

                break;

            case R.id.minhasavalId:

                Intent intentMinhasAval = new Intent(getApplicationContext(), MinhasavalActivity.class);
                startActivity(intentMinhasAval);

                break;

            case R.id.sobreId:

                Intent intentSobre = new Intent(getApplicationContext(), SobreoappActivity.class);
                startActivity(intentSobre);

                break;

            case R.id.sairId:

                Intent intentSair = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intentSair);

                break;
        }
        return true;
    }
    }


