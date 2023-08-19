package com.example.questionliat;

import android.view.View;

public class Question {

    private String Name;
    private int Id;
    private String Question;
    private String rating;
    private String answer;
    private String send;

    public Question(String name, int id, String question, String rating, String answer, String send) {
        Name = name;
        Id = id;
        Question = question;
        this.rating = rating;
        this.answer = answer;
        this.send = send;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public String getRating() {
        return rating;
    }

    public int setRating(String rating) {
        this.rating = rating;
        return 0;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public CharSequence getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }
}
