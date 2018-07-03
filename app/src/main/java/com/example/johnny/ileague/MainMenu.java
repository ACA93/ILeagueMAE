package com.example.johnny.ileague;

import android.support.v7.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;
import android.view.View;



public class MainMenu extends AppCompatActivity {


    Button button1;
    Button button2;
    Button button3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);


        button1=(android.widget.Button)findViewById(R.id.button_startgame);
        button1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i = new Intent(getApplicationContext(),ChooseSport.class);
                startActivity(i);
            }
           /* public void onClick (View v)
            {
                Intent i = new Intent (getApplicationContext(),Einleitung.class )
                startActivity(i);
            }*/
        });
    }
}
