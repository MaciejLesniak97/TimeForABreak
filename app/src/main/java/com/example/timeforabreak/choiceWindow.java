package com.example.timeforabreak;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class choiceWindow extends AppCompatActivity {


    public void snakeStart (View view) {
        ImageView snakeGame = (ImageView) findViewById(R.id.snakeGame);
        snakeGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(choiceWindow.this, SnakeActivity.class));
            }
        });
    }

    public void breakoutStart (View view) {
        ImageView breakoutGame = (ImageView) findViewById(R.id.breakoutGame);
        breakoutGame.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(choiceWindow.this, Arkanoid.class));
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choice_window);
    }
}
