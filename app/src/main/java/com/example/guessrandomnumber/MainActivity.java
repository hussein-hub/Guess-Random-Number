package com.example.guessrandomnumber;

import androidx.appcompat.app.AppCompatActivity;
import java.util.*;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int randomNumber;

    public void GuessNumber(View view) {

        EditText number = (EditText) findViewById(R.id.number);
        int n = Integer.parseInt(number.getText().toString());
        if(n > randomNumber && n <= 20)
        {
            Toast.makeText(MainActivity.this, "Guess Lower", Toast.LENGTH_SHORT).show();
        }
        else if(n < randomNumber && n>=0)
        {
            Toast.makeText(MainActivity.this, "Guess Higher", Toast.LENGTH_SHORT).show();
        }
        else if(n == randomNumber)
        {
            Toast.makeText(MainActivity.this, "Guessed the number correctly", Toast.LENGTH_LONG).show();
            Random rand = new Random();
            randomNumber = rand.nextInt(20) + 1;
        }
        else {
            Toast.makeText(MainActivity.this, "Please Enter Number 1-20", Toast.LENGTH_LONG).show();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random();
        randomNumber = rand.nextInt(20) + 1;
    }
}