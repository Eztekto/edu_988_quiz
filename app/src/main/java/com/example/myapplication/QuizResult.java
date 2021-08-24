package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import java.util.ArrayList;

public class QuizResult extends AppCompatActivity {
    private TextView userQuestionsAnswersView;
    private TextView score;
    private ArrayList<String> userQuestionsAnswers = new ArrayList<>();
    private String tempQA = "";
    private int quantityCorrectAnswers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_result);

        userQuestionsAnswersView = findViewById(R.id.userQuestionsAnswers);
        score = findViewById(R.id.score);
        userQuestionsAnswers = getIntent().getStringArrayListExtra("userQuestionsAnswers");
        quantityCorrectAnswers = getIntent().getIntExtra("quantityCorrectAnswers", 0);


        for (String uQA: userQuestionsAnswers) {
            tempQA = tempQA + uQA+"\n";
        }
        userQuestionsAnswersView.setText(tempQA);



        score.setText(quantityCorrectAnswers + " из 5 правильных ответов");



    }
}