package com.example.myfirstapphello.myapplication;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity
{
    private EditText Name;
    private EditText Rollno;
    private EditText College;
    private EditText FColour;
    private Button Enter;
    private ImageView logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Name = (EditText) findViewById(R.id.etName);
        Rollno = (EditText) findViewById(R.id.etRollno);
        College = (EditText) findViewById(R.id.etCollege);
        FColour = (EditText) findViewById(R.id.etFColour);
        Enter = (Button) findViewById(R.id.btnEnter);
        logo = (ImageView) findViewById(R.id.logo);
        Enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                String Colour=FColour.getText().toString();
                Intent intent=new Intent(MainActivity.this,Activity2.class);
                intent.putExtra("keyColour",Colour);
                startActivity(intent);


            }
        });

    }
}
