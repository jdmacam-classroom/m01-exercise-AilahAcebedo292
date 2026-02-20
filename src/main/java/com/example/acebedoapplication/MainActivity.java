package com.example.acebedoapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    String[] Quotes = {"You have to believe in yourself when no one else does.",
    "When you have a dream, you’ve got to grab it and never let go.",
    "Spread love everywhere you go. Let no one ever come without leaving happier.",
    "Be yourself; everyone else is already taken.",
    "The biggest adventure you can take is to live the life of your dreams.",
    "The only thing we have to fear is fear itself.",
    "Some people want it to happen, some wish it would happen, others make it happen.",
    "It does not matter how slowly you go, as long as you do not stop.",
    "Find out who you are and do it on purpose.",
    "Do one thing every day that scares you."};

   int y=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void changeText(View view){
        TextView textView = (TextView) findViewById(R.id.quotes);
        textView.setText(Quotes[y]);
        y++;
    }
}