package com.example.eyetrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Satturday extends AppCompatActivity {
    ImageView ims;

    TextView tvsat1, tvsat2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_satturday);
        ims = (ImageView) findViewById(R.id.ims);
        tvsat1 = findViewById(R.id.sat1);
        tvsat2 = findViewById(R.id.sat2);


    }
}