package com.example.eyetrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class Wednesday extends AppCompatActivity {

    ImageView im;

    TextView tvMonday1, tvMonday2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wednesday);
        im = (ImageView) findViewById(R.id.im3);
        tvMonday1 = findViewById(R.id.t31);
        tvMonday2 = findViewById(R.id.t32);


    }
}