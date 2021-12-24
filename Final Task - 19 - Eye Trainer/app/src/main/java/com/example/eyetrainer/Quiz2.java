package com.example.eyetrainer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Quiz2 extends AppCompatActivity {
    Button btn1, btn2;
    TextView tv1;
    ImageView fon, im1, on2, of2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_quiz2);


        btn1 = findViewById(R.id.btn_one2);
        btn2 = findViewById(R.id.btn_two2);
        tv1 = findViewById(R.id.tv_question2);
        im1 = findViewById(R.id.imageView22);
        fon = findViewById(R.id.imageView3);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()){
                    case R.id.btn_one2:
                        on2 = (ImageView)findViewById(R.id.on2);
                        int visibility = on2.getVisibility();
                        if(visibility == View.VISIBLE)
                        {
                            on2.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            on2.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz2.this, Quiz3.class);
                        startActivityForResult(intent, 1);
                        break;
                    case R.id.btn_two2:
                        of2 = (ImageView)findViewById(R.id.of2);
                        int visibility2 = of2.getVisibility();
                        if(visibility2 == View.VISIBLE)
                        {
                            of2.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            of2.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz2.this, Quiz3.class);
                        startActivityForResult(intent, 2);
                        break;
                }
            }
        };
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);

    }
}
