package com.example.u4_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.u4_p1.entidades.conexionSQLiteHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        conexionSQLiteHelper conn = new conexionSQLiteHelper(this,"bd_usuarios",null,1);

    }
}