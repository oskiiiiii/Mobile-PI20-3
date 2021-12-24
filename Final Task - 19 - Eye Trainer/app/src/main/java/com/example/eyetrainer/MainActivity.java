package com.example.eyetrainer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.eyetrainer.R;

public class MainActivity extends AppCompatActivity {
    Button btnMonday, btnTuesday, btnWednesday, btnThursday, btnFriday, btnSatturday, Quiz;
    TextView tvMonday, tvTuesday, tvWednesday, tvThursday, tvFriday, tvSatturday;
    ImageView fon;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnMonday = findViewById(R.id.btnDay1);
        btnTuesday = findViewById(R.id.btnDay2);
        btnWednesday = findViewById(R.id.btnDay3);
        btnThursday = findViewById(R.id.btnDay4);
        btnFriday = findViewById(R.id.btnDay5);
        btnSatturday = findViewById(R.id.btnDay6);
        Quiz = findViewById(R.id.quiz);
        tvMonday = findViewById(R.id.tvDay1);
        tvTuesday = findViewById(R.id.tvDay2);
        tvWednesday = findViewById(R.id.tvDay3);
        tvThursday = findViewById(R.id.tvDay4);
        tvFriday = findViewById(R.id.tvDay5);
        tvSatturday = findViewById(R.id.tvDay6);
        fon = findViewById(R.id.imageView3);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()){
                    case R.id.btnDay1:
                        intent = new Intent(MainActivity.this, Monday.class);
                        startActivityForResult(intent, 1);
                        break;
                    case R.id.btnDay2:
                        intent = new Intent(MainActivity.this, Tuesday.class);
                        startActivityForResult(intent, 2);
                        break;
                    case R.id.btnDay3:
                        intent = new Intent(MainActivity.this, Wednesday.class);
                        startActivityForResult(intent, 3);
                        break;
                    case R.id.btnDay4:
                        intent = new Intent(MainActivity.this, Thursday.class);
                        startActivityForResult(intent, 4);
                        break;
                    case R.id.btnDay5:
                        intent = new Intent(MainActivity.this, Friday.class);
                        startActivityForResult(intent, 5);
                        break;
                    case R.id.btnDay6:
                        intent = new Intent(MainActivity.this, Satturday.class);
                        startActivityForResult(intent, 6);
                        break;
                    case R.id.quiz:
                        intent = new Intent(MainActivity.this, Quiz.class);
                        startActivityForResult(intent, 7);
                        break;
                }
            }
        };
        btnMonday.setOnClickListener(clickListener);
        btnTuesday.setOnClickListener(clickListener);
        btnWednesday.setOnClickListener(clickListener);
        btnThursday.setOnClickListener(clickListener);
        btnFriday.setOnClickListener(clickListener);
        btnSatturday.setOnClickListener(clickListener);
        Quiz.setOnClickListener(clickListener);
    }


}