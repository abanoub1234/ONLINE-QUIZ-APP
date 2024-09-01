package com.example.onlinequizapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;
import android.widget.TextView;

public class QuizResult extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        final TextView score = findViewById(R.id.scoreTV);
        final TextView totalScoreTV = findViewById(R.id.totalScoreTV);
        final TextView correctTV = findViewById(R.id.correctTV);
        final TextView incorrectTV = findViewById(R.id.inCorrectTV);
        final AppCompatButton shareBtn = findViewById(R.id.shareBtn);
        final AppCompatButton reTakeBtn = findViewById(R.id.reTakeQuizBtn);

        

    }
}