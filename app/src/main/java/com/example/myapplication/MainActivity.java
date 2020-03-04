package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private String baza = "";
    private EditText datum, tekst;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datum=findViewById(R.id.datum);
        tekst=findViewById(R.id.tekst);
    }

    public void radi(View view) {
        String pomDatum = datum.getText().toString();
        String pomTekst = tekst.getText().toString();
        String novi = pomDatum + " : " + pomTekst;
        if (baza.indexOf(novi)<0){
            baza = baza + novi + "\n";
        }
        Intent poziv = new Intent(this, DrugaActivity.class);
        poziv.putExtra("tekst", baza);
        startActivity(poziv);
    }
}
