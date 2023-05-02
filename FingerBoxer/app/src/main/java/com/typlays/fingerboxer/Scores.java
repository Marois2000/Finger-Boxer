package com.typlays.fingerboxer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

public class Scores extends AppCompatActivity {

    private SharedPreferences highscores = getSharedPreferences(MainActivity.PREF_NAME, MODE_PRIVATE);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scores);
    }
}