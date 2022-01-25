package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class DashbordActivity extends AppCompatActivity {
    Button pulsa,pln,data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
        pulsa = (Button) findViewById(R.id.btnpulsa);
        pln = (Button) findViewById(R.id.btnpln);
        data = (Button) findViewById(R.id.btndata);
    }
    public void pulsa (View view){
        Intent pulsahp = new Intent(this,PulsaHP.class);
        startActivity(pulsahp);
    }
    public void pln (View view){
        Intent tokenpln = new Intent(this,TokenPLN.class);
        startActivity(tokenpln);
    }
    public void data (View view){
        Intent paketdata = new Intent(this,PaketDATA.class);
        startActivity(paketdata);
    }
    public void onLoginClick(View view){
        startActivity(new Intent(this,LoginActivity.class));
        overridePendingTransition(R.anim.slide_in_left,android.R.anim.slide_out_right);

    }
}