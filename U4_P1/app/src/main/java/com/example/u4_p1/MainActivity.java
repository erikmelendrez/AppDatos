package com.example.u4_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.u4_p1.entidades.conexionSQLiteHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conexionSQLiteHelper conn = new conexionSQLiteHelper(this,"bd_usuarios",null,1);

    }

    public void onClick(View view){
        Intent miIntent = null;
        switch (view.getId()){
            case R.id.btn_registrar:
                miIntent = new Intent(MainActivity.this,registrousuario.class);
                break;
        }
        if(miIntent!=null){
            startActivity(miIntent);
        }
    }
}