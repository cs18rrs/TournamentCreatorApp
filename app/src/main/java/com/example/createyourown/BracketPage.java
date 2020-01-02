package com.example.createyourown;

import android.app.ActionBar;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Point;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.text.Layout;
import android.transition.Transition;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BracketPage extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bracket_page);
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

        Rounds();


    }

   public int PlayerCount() {
        Intent in = getIntent();
        String str = in.getStringExtra("PlayerCount");
        int pn = Integer.parseInt(str);
        int RoundCount = pn / 2;
        return pn;
    }

    public int RoundCount() {
        Intent in = getIntent();
        String str = in.getStringExtra("PlayerCount");
        int pn = Integer.parseInt(str);
        int RoundCount = pn / 2;
        return RoundCount;
    }


    public void Rounds() {

        int Rounds = RoundCount();

        for (int j = 1; j <= Rounds; j++) {

            switch (j){
                case 1:
                    Round1();
                    break;
                case 2:
                    Round2();
                    break;
                case 3:
                    Round3();
                    break;
                case 4:
                    Round4();
                    break;
                case 5:
                    Round5();
                    break;
            }
        }
    }

    public ArrayList Round1(){
        int pn = PlayerCount();
        ArrayList<EditText> Bar1 = new ArrayList<EditText>();
        LinearLayout linearLayout1 = (findViewById(R.id.linearlayout));
        for (int i = 0; i < pn; i++) {

            Bar1.add(new EditText(BracketPage.this));
            linearLayout1.addView(Bar1.get(i));

        }
        return Bar1;
    }
    public ArrayList Round2(){
        ArrayList<EditText>  Bar2 = new ArrayList<EditText>();
        int pn = PlayerCount();
        LinearLayout linearLayout2 = (findViewById(R.id.linearlayout2));
        for (int i = 0; i < pn / 2; i++) {
            Bar2.add(new EditText(BracketPage.this));
            linearLayout2.addView(Bar2.get(i));
        }
      return Bar2;
    }

    public ArrayList Round3(){
        int pn = PlayerCount();
        ArrayList<EditText> Bar3 = new ArrayList<EditText>();
        ArrayList Bar2 = Round2();
        LinearLayout linearLayout3 = (findViewById(R.id.linearlayout3));
        if (Bar2.size() % 2 != 0) {
            Bar3.add(new EditText(BracketPage.this));

        }
        for (int i = 0; i < (pn / 4); i++) {

            Bar3.add(new EditText(BracketPage.this));
            linearLayout3.addView(Bar3.get(i));

        }
        return Bar3;
    }

    public ArrayList Round4(){
        int pn =PlayerCount();
        ArrayList<EditText> Bar4 = new ArrayList<EditText>();
    ArrayList Bar3 = Round3();
        LinearLayout  linearLayout4 = (findViewById(R.id.linearlayout4));
        for (int i = 0; i < pn / 8; i++) {

            Bar4.add(new EditText(BracketPage.this));
            linearLayout4.addView(Bar4.get(i));

        }
        if (Bar3.size() % 2 != 0) {
            Bar4.add(new EditText(BracketPage.this));

        }
        return Bar4;
    }

    public ArrayList Round5(){
        int pn =PlayerCount();
        ArrayList<EditText>  Bar5 = new ArrayList<EditText>();
        ArrayList Bar4 = Round4();
        LinearLayout linearLayout5 = (findViewById(R.id.linearlayout5));
        for (int i = 0; i < pn / 16; i++) {

            Bar5.add(new EditText(BracketPage.this));
            linearLayout5.addView(Bar5.get(i));
        }
        if (Bar4.size() % 2 != 0) {
            Bar5.add(new EditText(BracketPage.this));

        }
        return Bar5;

    }

}















































    //public void Rounds (int PlayerCount) {
//
//    ArrayList <EditText> PlayerList=  new ArrayList<EditText>();
//
//    LinearLayout layout = new LinearLayout(BracketPage.this);
//
//
//    for (int i = 0; i <= PlayerCount; i++) {
//        EditText PlayerBar = new EditText(BracketPage.this);
//        PlayerBar.setHeight(dpToPx(50));
//        PlayerList.add(PlayerBar);
//    }
//
//    for (int i = 1; i <= PlayerCount; i++) {
//LinearLayout linearLayout1 = findViewById(R.id.linearlayout);
//
//
//           linearLayout1 .addView(PlayerList.get(i));
//
//            for (int j = i; j <= PlayerCount / 2; j++) {
//                round2();
//                break;
//            }
//            for (int z = i; z <= PlayerCount / 4; z++) {
//                round3();
//                break;
//            }
//
//
//        }
//
//        ////Put a scroller to view remaining
//        //define the parameters of edittext
//
//
//
//
//    }
//
//
//
//
//
//
//
//
//
//public void round2() {
//
//        LinearLayout linearLayout2 = findViewById(R.id.linearlayout2);
//        EditText PlayerBar2;
//        PlayerBar2 = new EditText(BracketPage.this);
//        PlayerBar2.setHeight(dpToPx(90));
//        linearLayout2.addView(PlayerBar2);
//
//
//    }
//    public void round3(){
//
//        LinearLayout linearLayout3 = findViewById(R.id.linearlayout3);
//        EditText PlayerBar3;
//        PlayerBar3 = new EditText(BracketPage.this);
//        PlayerBar3.setHeight(dpToPx(155));
//        linearLayout3.addView(PlayerBar3);
//
//
//    }
//    public  int dpToPx(int dp) {
//        EditText pb  = new EditText(BracketPage.this);
//        DisplayMetrics displayMetrics = pb.getResources().getDisplayMetrics();
//        return Math.round(dp * (displayMetrics.xdpi / DisplayMetrics.DENSITY_DEFAULT));
//    }
//
//
