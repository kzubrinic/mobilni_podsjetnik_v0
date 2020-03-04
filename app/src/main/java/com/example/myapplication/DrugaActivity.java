package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DrugaActivity extends AppCompatActivity {
    TextView tekst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_druga);
        tekst = findViewById(R.id.tekst);
        Intent x = getIntent();
        tekst.setText(x.getStringExtra("tekst"));
    }
}
