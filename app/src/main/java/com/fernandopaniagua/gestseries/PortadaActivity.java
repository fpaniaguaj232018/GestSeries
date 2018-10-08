package com.fernandopaniagua.gestseries;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class PortadaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);
    }

    public void cambiarPantalla(View v){
        Intent i = new Intent(this, LoginActivity.class);
        startActivity(i);
    }
}
