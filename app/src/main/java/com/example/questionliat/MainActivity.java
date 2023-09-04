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
        questions.add(new Question("shahd Alrahbi",12345,"Java is a programming Language?","3","Yes","Enter"));
        questions.add(new Question("Saad Alhadi",23456,"C++ is a programming Language?","3"," ","Enter"));
        questions.add(new Question("salim Alamri",34567,"Python is a programming Language?","3"," ","Enter"));
        questions.add(new Question("Ali Albulashi",45678,"Dart is a programming Language?","3"," ","Enter"));
        questions.add(new Question("Huda Ahmed ",56789,"C# is a programming Language?","3"," ","Enter"));
        questions.add(new Question("Muna Mohammed",102345,"What is Object-Oriented Programming language","3"," ","Enter"));
        return questions;
    }
}