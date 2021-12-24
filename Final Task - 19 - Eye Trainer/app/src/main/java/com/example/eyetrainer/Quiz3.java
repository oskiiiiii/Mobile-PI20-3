package com.example.eyetrainer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Quiz3 extends AppCompatActivity {
    Button btn1, btn2;
    TextView tv1;
    ImageView fon, im1, on3, of3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_quiz3);


        btn1 = findViewById(R.id.btn_one3);
        btn2 = findViewById(R.id.btn_two3);
        tv1 = findViewById(R.id.tv_question3);
        im1 = findViewById(R.id.imageView23);
        fon = findViewById(R.id.imageView3);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()){
                    case R.id.btn_one3:
                        on3 = (ImageView)findViewById(R.id.on3);
                        int visibility = on3.getVisibility();
                        if(visibility == View.VISIBLE)
                        {
                            on3.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            on3.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz3.this, Quiz4.class);
                        startActivityForResult(intent, 1);
                        break;
                    case R.id.btn_two3:
                        of3 = (ImageView)findViewById(R.id.of3);
                        int visibility1 = of3.getVisibility();
                        if(visibility1 == View.VISIBLE)
                        {
                            of3.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            of3.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz3.this, Quiz4.class);
                        startActivityForResult(intent, 2);
                        break;
                }
            }
        };
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);

    }
}
