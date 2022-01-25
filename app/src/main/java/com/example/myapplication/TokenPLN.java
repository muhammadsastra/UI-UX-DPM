package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TokenPLN extends AppCompatActivity {
    Button token;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_token_pln2);
        token = (Button) findViewById(R.id.btntoken);
    }
    public void token (View view){
        Intent tokenpln = new Intent(this,IsiPulsa.class);
        startActivity(tokenpln);
    }
}