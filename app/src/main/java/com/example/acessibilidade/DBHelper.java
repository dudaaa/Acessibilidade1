package com.example.acessibilidade;

import android.os.Build;
import android.os.StrictMode;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DBHelper {

    public static int insertIntoDadosUsuario (String nome, String email) throws IOException{
        checkThreadPolicy();
        String values = "nome=" +nome+ "&" + "email=" +  email;
        URL url = new URL (WEB_SERVICE_URL + "ws_insert/ws_insert_usuarios.php" + values);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        BufferedReader bufferedReader = new BufferedReader (new InputStreamReader(con.getInputStream()));
        String response = bufferedReader.readLine();
        if (response.equals("False")){
            return 0;
        } else {
            return 1;
        }
    }
    private static void checkThreadPolicy(){
        int SDK_INT = Build.VERSION.SDK_INT;
        if (SDK_INT > 8) {
            StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
            StrictMode.setThreadPolicy(policy);
        }
    }
}
