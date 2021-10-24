package com.example.abdullah;

import android.os.Bundle;
import android.util.JsonReader;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

    public class MainActivity extends AppCompatActivity {

        String[] quest={"Linus Torvalds created Linux and Git",
                "The programming language Python is based off a modified version of JavaScript",
                "Pointers were not used in the original C programming language; they were added later on in C++.",
                "RAM stands for Random Access Memory",
                "HTML; stands for Hypertext Markup Language."};

        boolean[] answers={true,false,false,true,true};


        TextView question,win;
        Button ok,wrong;
        int score=0,i=0;
        JSONArray quiz= null;
        JSONObject temp=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        question=findViewById(R.id.textView);
        ok=findViewById(R.id.ok);
        wrong=findViewById(R.id.wrong);
        win=findViewById(R.id.textView3);
        question.setText(quest[i]);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<quest.length){
                    question.setText(quest[i]);
                    if(answers[i]){
                        score++;
                    }
                    i++;
                }
                if(i==quest.length){
                    win.setText("Your Score is: "+score);
                }
            }
        });
        wrong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(i<quest.length){
                    question.setText(quest[i]);
                    if(!answers[i]){
                        score++;
                    }
                    i++;
                }
                if(i==quest.length){
                    win.setText("Your Score is: "+score);
                }

            }
        });
    }
    }