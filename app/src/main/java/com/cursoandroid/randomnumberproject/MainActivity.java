package com.cursoandroid.randomnumberproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void changeText(View view){

        TextView text = findViewById(R.id.textResult);

        int random = new Random().nextInt(11); //11 is not included

        text.setText(""+ random);
    }
}
