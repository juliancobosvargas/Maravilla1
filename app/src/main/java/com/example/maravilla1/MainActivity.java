package com.example.maravilla1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Lugar1(View view) {
        Intent intento1 = new Intent(this, lugares1.class);
        startActivity(intento1);
    }

    public void Lugar2(View view) {
        Intent intento2 = new Intent(this, lugares2.class);
        startActivity(intento2);
    }

    public void Lugar3(View view) {
        Intent intento3 = new Intent(this, lugares3.class);
        startActivity(intento3);
    }
}