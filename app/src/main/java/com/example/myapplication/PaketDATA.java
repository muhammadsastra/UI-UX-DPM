package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaketDATA extends AppCompatActivity {
    Button isidata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paket_data);
        isidata = (Button) findViewById(R.id.btnisidata);
    }
    public void isidata (View view){
        Intent paketdata = new Intent(this,IsiPulsa.class);
        startActivity(paketdata);
    }
}