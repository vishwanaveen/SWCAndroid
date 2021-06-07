package com.example.myfirstapphello.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity
{
    private TextView FColour;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        FColour=(TextView)findViewById(R.id.Cview);
        String Colour=getIntent().getStringExtra("keyFColour");
        FColour.setText(Colour);

    }
}