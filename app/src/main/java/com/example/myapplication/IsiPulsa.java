package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class IsiPulsa extends AppCompatActivity {
    Button utama;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi_pulsa);
        utama = (Button) findViewById(R.id.btnutama);
    }
    public void utama (View view){
        Intent halamanutama = new Intent(this,DashbordActivity.class);
        startActivity(halamanutama);
    }
}