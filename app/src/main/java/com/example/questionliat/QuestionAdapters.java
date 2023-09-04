package com.example.questionliat;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class QuestionAdapters extends BaseAdapter {
    private Context context;
    private List<Question> Questions;

    public QuestionAdapters(Context context, List<Question> questions) {
        this.context = context;
        Questions = questions;
    }

    @Override
    public int getCount() {
        return Questions.size();
    }

    @Override
    public Object getItem(int position) {
        return Questions.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if(convertView==null){
            convertView= LayoutInflater.from(context).inflate(R.layout.itemlist,parent,false);
        }

        TextView textName=convertView.findViewById(R.id.textName);
        TextView textId=convertView.findViewById(R.id.textId);
        TextView textQuestion=convertView.findViewById(R.id.textQuestion);
        RatingBar ratingBar=convertView.findViewById(R.id.ratingbar);
        EditText editAnswer=convertView.findViewById(R.id.answer);
        Button btnSend=convertView.findViewById(R.id.start);

        Question question=(Question) getItem(position);

        textName.setText(question.getName());
       textId.setText(question.getId() + "");
        textQuestion.setText(question.getQuestion());
        ratingBar.setNumStars(question.setRating(String.valueOf(3)));
        editAnswer.setText(question.getAnswer());
        return convertView;
    }
}
