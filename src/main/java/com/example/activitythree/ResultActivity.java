package com.example.activitythree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultActivity extends AppCompatActivity {

    TextView Hello;
    TextView Vpres;

    TextView Pres;
    String Pangalan;
    String President;
    String VicePresident;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Pres = findViewById(R.id.President);
         Vpres = findViewById(R.id.VicePresident);
         Hello = findViewById(R.id.Pangalan);
        Intent i = getIntent();
        Pangalan = getIntent().getStringExtra("pangalan");
        Hello.setText("Hello, " + Pangalan+"!");
        Vpres.setText(VicePresident);
        Pres.setText(President);

    }
}