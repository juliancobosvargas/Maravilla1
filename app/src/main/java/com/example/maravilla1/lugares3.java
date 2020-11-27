package com.example.maravilla1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lugares3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares3);
    }

    private  void enMapa(String grupo, String objeto){
        Intent intento1 = new Intent(this, Mimapa.class);
        //mandar parametros
        intento1.putExtra("grupo",grupo);
        intento1.putExtra("objeto",objeto);
        startActivity(intento1);
    }

    public void maravillaC1(View view) {
        enMapa("3","1");
    }

    public void maravillaC2(View view) {
        enMapa("3","2");
    }

    public void maravillaC3(View view) {
        enMapa("3","3");
    }

    public void maravillaC4(View view) {
        enMapa("3","4");
    }

    public void maravillaC5(View view) {
        enMapa("3","5");
    }

    public void maravillaC6(View view) {
        enMapa("3","6");
    }

    public void maravillaC7(View view) {
        enMapa("3","7");
    }

    public void cRegresar(View view) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
        finish();
    }
}