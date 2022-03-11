package com.example.nextproject;

import androidx.appcompat.app.AppCompatActivity;

import android.media.audiofx.PresetReverb;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText Quizes = findViewById(R.id.Quizes);
        EditText Homework = findViewById(R.id.Homework);
        EditText Midterms = findViewById(R.id.Midterms);
        EditText Final = findViewById(R.id.Final);
        Button Calculate = findViewById(R.id.Calculate);
        Button Reset = findViewById(R.id.Reset);
        TextView Result = findViewById(R.id.Result);

        Calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                int n1 = Integer.parseInt(Quizes.getText().toString());
                int n2 = Integer.parseInt(Homework.getText().toString());
                int n3 = Integer.parseInt(Midterms.getText().toString());
                int n4 = Integer.parseInt(Final.getText().toString());

                Result.setText(Integer.toString(n1+n2+n3+n4));

        };

            });
            };
        }
