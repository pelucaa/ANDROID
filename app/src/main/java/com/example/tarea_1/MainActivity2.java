package com.example.tarea_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    //Declaración de Botones para redirección
    Button redireccionCascos;
    Button redireccionBicicletas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //Definición de valores por ID
        redireccionBicicletas = (Button) findViewById(R.id.bici);
        redireccionCascos = (Button) findViewById(R.id.cascos);

        //On click listener para captar el evento de "Click" y definir redirección
        //Bicicletas
        redireccionBicicletas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redireccionBicicletas = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(redireccionBicicletas);
            }
        });

        //Cascos
        redireccionCascos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent redireccionCascos = new Intent(MainActivity2.this, MainActivity4.class);
                startActivity(redireccionCascos);
            }
        });
    }



    public void siguiente2(View v){
        Intent sig = new Intent(this,MainActivity3.class);
        startActivity(sig);




    }
    public void siguiente3(View v){
        Intent sig = new Intent(this,MainActivity4.class);
        startActivity(sig);




    }

}