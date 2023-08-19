package com.example.questionliat;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView QuetionListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        QuetionListView=findViewById(R.id.questionListview);
         List<Question> questions= myListQuestion();
         QuestionAdapters adapters=new QuestionAdapters(this,questions);
         QuetionListView.setAdapter(adapters);

    }

    private List<Question> myListQuestion(){
        List<Question> questions=new ArrayList<>();
        questions.add(new Question("shahad",12345,"Java is a programming Language?","3","Yes","Enter"));
        questions.add(new Question("Saad Alrahbi",23456,"How old you?","3","--------","Enter"));
        questions.add(new Question("salim Alrahbi",34567,"What do you do?/ What’s your job?","3","--------","Enter"));
        questions.add(new Question("Ahmed Alrahbi",45678,"How many children do you have?","3","--------","Enter"));
        questions.add(new Question("Huda Alrahbi",56789,"Who do you live with?","3","--------","Enter"));
        questions.add(new Question("Maram Alrahbi",102345,"When do you do morning exercises?","3","--------","Enter"));
        return questions;
    }
}