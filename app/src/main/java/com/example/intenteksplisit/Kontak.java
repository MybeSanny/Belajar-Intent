package com.example.intenteksplisit;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.color.HarmonizedColorAttributes;

public class Kontak extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Andi(View view) {
        Intent page1 = new Intent(Kontak.this, Kontak.class);
        //page1.putExtra(PENERIMA,"Roy");
        startActivity(page1);
    }

    public void Ridho(View view) {
        Intent page1 = new Intent(Kontak.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Raya");
        startActivity(page1);
    }

    public void Iwan(View view) {
        Intent page1 = new Intent(Kontak.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Toni");
        startActivity(page1);
    }

    public void Alya(View view) {
        Intent page1 = new Intent(Kontak.this, SecondActivity.class);
        //page1.putExtra(PENERIMA,"Andi");
        startActivity(page1);
    }

}