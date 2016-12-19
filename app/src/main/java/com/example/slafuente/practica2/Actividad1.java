package com.example.slafuente.practica2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Actividad1 extends AppCompatActivity {

    private Button botonAct1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        botonAct1 = (Button) findViewById(R.id.botact1);

        botonAct1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent irAOtraActividad = new Intent(getApplicationContext(), Actividad2.class);
                startActivity(irAOtraActividad);

            }
        });
    }
}
