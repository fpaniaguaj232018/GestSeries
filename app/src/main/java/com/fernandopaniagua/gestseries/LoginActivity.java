package com.fernandopaniagua.gestseries;

import android.content.Intent;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.fernandopaniagua.gestseries.domain.GestorUsuarios;
import com.fernandopaniagua.gestseries.domain.Usuario;

public class LoginActivity extends AppCompatActivity {
    int x=10;//La x no vale para nada pero sirve de ejemplo

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        x = savedInstanceState.getInt("numeroPulsaciones");
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putInt("numeroPulsaciones", x);

    }

    public void validar(View v){
        EditText etId = (EditText)findViewById(R.id.etId);
        String identificador = etId.getText().toString();

        EditText etPwd = (EditText)findViewById(R.id.etPwd);
        String password = etId.getText().toString();

        Usuario usuario = new Usuario(identificador, password);
        GestorUsuarios gu = new GestorUsuarios();
        if (gu.estaValidado(usuario)){
            //Cambiar de pantalla
            Intent i = new Intent(this, ConsultaSeriesActivity.class);
            i.putExtra("id",identificador);
            //startActivity(i);
            startActivityForResult(i,5);
        } else {
            //Mostrar mensaje de error
            /*
            Toast.LENGTH_LONG
            Toast.LENGTH_SHORT;
             */
            startActivityForResult(new Intent(this, PortadaActivity.class),10);
            Toast.makeText(this, "Impostor", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

    }
}
