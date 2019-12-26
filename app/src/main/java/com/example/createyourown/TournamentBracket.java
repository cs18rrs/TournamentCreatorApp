package com.example.createyourown;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class TournamentBracket extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tournament_bracket);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        Button GenerateBrackets = findViewById(R.id.button10);
        GenerateBrackets.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText PlayerNumber = findViewById(R.id.editText11);
                String str = PlayerNumber.getText().toString();

                    int pn =Integer.parseInt(str);
                    if(pn%2==0){
                        Context context = getApplicationContext();
                        Intent in = new Intent(context,BracketPage.class);
                        in.putExtra("PlayerCount",str);
                        startActivity(in);
                    }
else {
                        Context context = getApplicationContext();
                        CharSequence text = "Enter Even Number of Players!";
                        int duration = Toast.LENGTH_SHORT;
                        Toast toast = Toast.makeText(context, text, duration);
                        toast.show();
                    }

            }
        } );
    }



}
