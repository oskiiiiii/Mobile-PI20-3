package com.example.eyetrainer;


import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Quiz extends AppCompatActivity {
    Button btn1, btn2;
    TextView tv1;
    ImageView fon, im1, iv_tick, iv_tick1;
    private Object view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_quiz);


        btn1 = findViewById(R.id.btn_one);
        btn2 = findViewById(R.id.btn_two);
        tv1 = findViewById(R.id.tv_question1);
        im1 = findViewById(R.id.imageView2);
        fon = findViewById(R.id.imageView3);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()) {
                    case R.id.btn_one:
                        iv_tick = (ImageView)findViewById(R.id.iv_tick);
                        int visibility = iv_tick.getVisibility();
                        if(visibility == View.VISIBLE)
                        {
                            iv_tick.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            iv_tick.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz.this, Quiz2.class);
                        startActivityForResult(intent, 1);
                        break;
                    case R.id.btn_two:
                        iv_tick1 = (ImageView)findViewById(R.id.iv_tick1);
                        int visibility1 = iv_tick1.getVisibility();
                        if(visibility1 == View.VISIBLE)
                        {
                            iv_tick1.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            iv_tick1.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz.this, Quiz2.class);
                        startActivityForResult(intent, 2);
                        break;
                }
            }
        };


        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);

    }
}
