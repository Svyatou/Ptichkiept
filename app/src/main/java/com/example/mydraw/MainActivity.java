package com.example.mydraw;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

//!!!    protected void onDraw(Canvas canvas){
//!!!       Paint a = new Paint();
//!!!        canvas.drawARGB(0, 250, 250, 0);
//!!!     a = setColor(Color.BLACK);
//!!!    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main);
        setContentView(new GameView(this));

        Intent intent = new Intent(this, GameView.class);
        startActivity(intent);
    }

}
