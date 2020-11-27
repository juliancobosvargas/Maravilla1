package com.example.maravilla1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class lugares2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lugares2);
    }

    private  void enMapa(String grupo, String objeto){
        Intent intento1 = new Intent(this, Mimapa.class);
        //mandar parametros
        intento1.putExtra("grupo",grupo);
        intento1.putExtra("objeto",objeto);
        startActivity(intento1);
    }

    public void maravillaB1(View view) {
        enMapa("2","1");
    }

    public void maravillaB2(View view) {
        enMapa("2","2");
    }

    public void maravillaB3(View view) {
        enMapa("2","3");
    }

    public void maravillaB4(View view) {
        enMapa("2","4");
    }

    public void maravillaB5(View view) {
        enMapa("2","5");
    }

    public void maravillaB6(View view) {
        enMapa("2","6");
    }

    public void maravillaB7(View view) {
        enMapa("2","7");
    }

    public void bRegresar(View view) {
        Intent intento = new Intent(this, MainActivity.class);
        startActivity(intento);
        finish();
    }
}