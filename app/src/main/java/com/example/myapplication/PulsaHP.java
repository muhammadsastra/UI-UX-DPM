package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PulsaHP extends AppCompatActivity {
    Button pulsa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pulsa_hp2);
        pulsa = (Button) findViewById(R.id.btntambahpulsa);
    }
    public void pulsa(View view){
        Intent pulsahp = new Intent(this,IsiPulsa.class);
        startActivity(pulsahp);
    }
}