package com.example.activitythree;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class VotingActivity extends AppCompatActivity {

    TextView hello;
    String Pangalan;

    EditText President;
String presi;
String vice;
    EditText VicePresident;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_voting);
        President = findViewById(R.id.President);
        VicePresident = findViewById(R.id.VicePresident);
        hello = findViewById(R.id.hello);
        Intent i = getIntent();
        Pangalan = getIntent().getStringExtra("pangalan");
        hello.setText("Hello, " + Pangalan+"!");
    }


    public void ResultActivity(View view) {
        presi = President.getText().toString();
        vice = VicePresident.getText().toString();
        Intent i = new Intent(this, ResultActivity.class);
        i.putExtra("name", Pangalan);
        i.putExtra("President", presi);
        i.putExtra("Vice", vice);
        startActivity(i);
        finish();
    }
}