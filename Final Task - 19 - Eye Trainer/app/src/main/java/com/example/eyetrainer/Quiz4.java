package com.example.eyetrainer;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Quiz4 extends AppCompatActivity {
    Button btn1, btn2;
    TextView tv1;
    ImageView fon, im1, on4, of4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_quiz4);


        btn1 = findViewById(R.id.btn_one4);
        btn2 = findViewById(R.id.btn_two4);
        tv1 = findViewById(R.id.tv_question4);
        im1 = findViewById(R.id.imageView24);
        fon = findViewById(R.id.imageView3);

        View.OnClickListener clickListener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent;
                switch (view.getId()){
                    case R.id.btn_one4:
                        on4 = (ImageView)findViewById(R.id.on4);
                        int visibility = on4.getVisibility();
                        if(visibility == View.VISIBLE)
                        {
                            on4.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            on4.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz4.this, MainActivity.class);
                        startActivityForResult(intent, 1);
                        break;
                    case R.id.btn_two4:
                        of4 = (ImageView)findViewById(R.id.of4);
                        int visibility1 = of4.getVisibility();
                        if(visibility1 == View.VISIBLE)
                        {
                            of4.setVisibility(View.INVISIBLE);
                        }
                        else
                        {
                            of4.setVisibility(View.VISIBLE);
                        }
                        intent = new Intent(Quiz4.this, MainActivity.class);
                        startActivityForResult(intent, 2);
                        break;
                }
            }
        };
        btn1.setOnClickListener(clickListener);
        btn2.setOnClickListener(clickListener);

    }
}
