package com.fernandopaniagua.gestseries;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void validar(View v){
        EditText etId = (EditText)findViewById(R.id.etId);
        String identificador = etId.getText().toString();

        EditText etPwd = (EditText)findViewById(R.id.etPwd);
        String password = etId.getText().toString();

    }
}
