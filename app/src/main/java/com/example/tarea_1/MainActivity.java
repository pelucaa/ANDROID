package com.example.tarea_1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Toast;

import java.util.Timer;
import java.util.TimerTask;
public class MainActivity extends AppCompatActivity {
public ProgressBar jean;
RatingBar g ;
int pool=1;
EditText a,b,c,e;
Button ji;
RadioButton l;
Button plop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        jean = (ProgressBar) findViewById(R.id.Cargando);
        a = (EditText) findViewById(R.id.Nombre) ;
        b = (EditText) findViewById(R.id.Telefono);
        c = (EditText) findViewById(R.id.Gmail);
        e = (EditText) findViewById(R.id.Nesecitas);
        l = (RadioButton) findViewById(R.id.Chile);
        ji = (Button) findViewById(R.id.Enviar);
        Cargando();
        g = (RatingBar) findViewById(R.id.Estrella);

        plop = (Button) findViewById(R.id.Otro);
        Nombre();
        Chile();

    }
    public void Nombre(){
        plop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder b = new AlertDialog.Builder(this);
                b.setCancelable(true);
                b.setTitle("TOMA");
                b.setMessage(a.getText().toString()+b.getContext()+e.getText().toString()+c.getText().toString()+ g.getRating());

                b.show();
            }

        });

    }
    public void Cargando(){
        ji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final Timer t = new Timer();
                TimerTask tt = new TimerTask(){
                    @Override
                    public void run(){
                        pool++;
                        jean.setProgress(pool);
                        if(pool==100)
                            t.cancel();
                    }
                };
                t.schedule(tt,0,100);
            }
        });
    }
    public void Chile(){
        l.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "ERES CHILENO PÉ", Toast.LENGTH_SHORT).show();
            }

        });

    }


}