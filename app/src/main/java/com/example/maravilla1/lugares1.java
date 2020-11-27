package com.example.maravilla1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lugares1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares1);
    }

    private  void enMapa(String grupo, String objeto){
        Intent intento1 = new Intent(this, Mimapa.class);
        //mandar parametros
        intento1.putExtra("grupo",grupo);
        intento1.putExtra("objeto",objeto);
        startActivity(intento1);
    }

    public void maravillaA1(View view) {
        enMapa("1","1");
    }

    public void maravillaA2(View view) {
        enMapa("1","2");
    }

    public void maravillaA3(View view) {
        enMapa("1","3");
    }

    public void maravillaA4(View view) {
        enMapa("1","4");
    }

    public void maravillaA5(View view) {
        enMapa("1","5");
    }

    public void maravillaA6(View view) {
        enMapa("1","6");
    }

    public void maravillaA7(View view) {
        enMapa("1","7");
    }

    public void aRegresar(View view) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
        finish();
    }
}