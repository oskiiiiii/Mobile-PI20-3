package com.example.eyetrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Tuesday extends AppCompatActivity {
    ImageView im;
    TextView tvT1, tvT2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuesday);

        im = (ImageView) findViewById(R.id.ims2);
        tvT1 = findViewById(R.id.tvT1);
        tvT2 = findViewById(R.id.tvT2);


    }
}