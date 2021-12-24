package com.example.eyetrainer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Monday extends AppCompatActivity {
    ImageView im;
    TextView tvMonday1, tvMonday2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_monday);
        im = (ImageView) findViewById(R.id.imageView2);
        tvMonday1 = (TextView) findViewById(R.id.monu1);
        tvMonday2 = (TextView) findViewById(R.id.mont1);




    }
}