package com.example.acessibilidade;

import android.os.Build;
import android.os.StrictMode;
import android.widget.TextView;

import org.json.JSONException;
import org.w3c.dom.Text;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DBHelper {

    private static String WEB_SERVICE_URL =  "http://10.21.80.171/web_service/";

    private static void checkThreadPolicy(){
        int version = Build.VERSION.SDK_INT;
        if(version > 8){
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }

    }

    public static int insertIntoDadosUsuario (String nome, String email, String senha) throws IOException {
        checkThreadPolicy();
        String values = "nome=" +nome+ "&" + "email=" +  email + "&" + "senha=" + senha;
        URL url = new URL (WEB_SERVICE_URL + "ws_insert/ws_insert_usuarios.php?" + values);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(con.getInputStream()));
        String response = bufferedReader.readLine();
        if (response.equals("true")){
            return 1;
        } else {
            return 0;
        }
    }
}
