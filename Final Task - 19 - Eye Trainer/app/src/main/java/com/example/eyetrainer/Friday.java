package com.example.eyetrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Friday extends AppCompatActivity {
    ImageView im;
    TextView tvF1, tvF2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_friday);
        im = (ImageView) findViewById(R.id.imF);
        tvF2 = findViewById(R.id.tvFr2);


    }
}