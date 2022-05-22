
package com.example.u4_p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.u4_p1.entidades.conexionSQLiteHelper;
import com.example.u4_p1.utilidades.utilidades;

public class registrousuario extends AppCompatActivity {

    EditText campoID,campoNombre,campoTelefono;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrousuario);

        campoID=(EditText) findViewById(R.id.txt_id);
        campoNombre=(EditText) findViewById(R.id.txt_nombre);
        campoTelefono=(EditText) findViewById(R.id.txt_telefono);

    }

    public void onClick(View view){
        registrarusuario();
    }

    private void registrarusuario(){
        conexionSQLiteHelper conn = new conexionSQLiteHelper(this,"bd_usuarios",null,1);

        SQLiteDatabase db=conn.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put(utilidades.CAMPO_ID,campoID.getText().toString());
        values.put(utilidades.CAMPO_NOMBRE,campoNombre.getText().toString());
        values.put(utilidades.CAMPO_TELEFONO,campoTelefono.getText().toString());

        Long idResultante = db.insert(utilidades.TABLA_USUARIO,utilidades.CAMPO_ID,values);

        Toast.makeText(getApplicationContext(),"Id Regisstro: "+idResultante,Toast.LENGTH_SHORT).show();
        db.close();
    }
}