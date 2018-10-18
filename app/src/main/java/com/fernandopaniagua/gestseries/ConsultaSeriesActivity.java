package com.fernandopaniagua.gestseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.lang.reflect.GenericArrayType;

public class ConsultaSeriesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta_series);


        String idUsuario = getIntent().getStringExtra("id");
        setResult(0,getIntent().putExtra("nombre","pedrito"));
    }
}
