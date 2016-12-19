package com.example.slafuente.practica2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.util.Locale;

public class Actividad2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad_2);

        TextView saludo = (TextView)findViewById(R.id.saludoInicial);
        TextView saludoIdioma = (TextView) findViewById(R.id.saludoTraducido);

        saludo.setText("Te voy a saludar en " + Locale.getDefault().getDisplayLanguage());

        saludoIdioma.setText(R.string.sayHola);
    }
}
