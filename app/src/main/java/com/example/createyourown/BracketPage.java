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

            switch (j) {
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

    //some issue in the loop fix it

    public void Round1() {

        LinearLayout linearLayout1 = (findViewById(R.id.linearlayout));

        ArrayList<EditText> Players = addplayers(1);
        for (int i = 0; i < Players.size()-1; i++){
            linearLayout1.addView(Players.get(i));
    }


    }

    public void Round2() {
        LinearLayout linearLayout2 = (findViewById(R.id.linearlayout2));

        ArrayList<EditText> Players = addplayers(2);
        if(Players.size()%2!=0)
        {
            Players.get(Players.size()-1);
        }
        for (int i = 0; i < Players.size()-1; i++){

            linearLayout2.addView(Players.get(i));
        }
//        if(Players.size()%2!=0){
//            linearLayout2.addView(new EditText(BracketPage.this));
//        }
    }

    public void Round3() {
        LinearLayout linearLayout3 = (findViewById(R.id.linearlayout3));

        ArrayList<EditText> Players = addplayers(3);
        for (int i = 0; i < Players.size()-1; i++){
            linearLayout3.addView(Players.get(i));
        }
//        if (Bar2.size() % 2 != 0) {
//            Bar3.add(new EditText(BracketPage.this));
//
//        }
//        return Bar3;
    }

    public void Round4() {
        LinearLayout linearLayout4 = (findViewById(R.id.linearlayout4));

        ArrayList<EditText> Players = addplayers(4);
        for (int i = 0; i < Players.size()-1; i++){
            linearLayout4.addView(Players.get(i));
        }
//        if (Bar3.size() % 2 != 0) {
//            Bar4.add(new EditText(BracketPage.this));
//
//        }
//        return Bar4;
    }

    public void Round5() {
        LinearLayout linearLayout5 = (findViewById(R.id.linearlayout5));

        ArrayList<EditText> Players = addplayers(5);
        for (int i = 0; i < Players.size()-1; i++){
            linearLayout5.addView(Players.get(i));
        }
//        if (Bar4.size() % 2 != 0) {
//            Bar5.add(new EditText(BracketPage.this));
//
//        }
//        return Bar5;

    }


    public ArrayList addplayers(int round) {
ArrayList <EditText> arr = new ArrayList<EditText>();
int pc =PlayerCount();
    switch(round){
        case 1:
            for(int i = 0;i<=pc;i++){
                arr.add(new EditText(BracketPage.this));
            }
            break;
        case 2:
            for(int i = 0;i<=pc/2;i++){
                arr.add(new EditText(BracketPage.this));
            }
            if(arr.size()%2!=0){

            }
            break;
        case 3:
            for(int i = 0;i<=pc/4;i++){
                arr.add(new EditText(BracketPage.this));
            }
            break;
        case 4:
            for(int i = 0;i<=pc/8;i++){
                arr.add(new EditText(BracketPage.this));
            }
            break;
        case 5:
            for(int i = 0;i<=pc/16;i++){
                arr.add(new EditText(BracketPage.this));
            }
            break;
            default:break;

}
return arr;
    }

//    public class BinaryTree{
//
//   Node root;
//
//   public void addNode(ArrayList key,View view){
//       Node newNode = new Node(key,view);
//       if(root == null){
//           root=newNode;
//       }
//       else{
//           Node focusNode  = root;
//
//           Node parent;
//           while(true){
//               parent = focusNode;
//               if(key.indexOf(key)< focusNode.key){
//                   focusNode = focusNode.leftchild;
//
//                   if(focusNode==null){
//                       parent.leftchild = newNode;
//                       return;
//                   }
//               }
//               else{
//                   focusNode =focusNode.rightchild;
//                   if(focusNode==null){
//                       parent.rightchild=newNode;
//                       return;
//                   }
//               }
//
//
//           }
       }


//   }
//
//
//    }


//    class Node{
//        ArrayList key;
//      View view;
//
//        Node leftchild;
//        Node rightchild;
//
//
//        Node(ArrayList key, View view){
//            this.key =key;
//            this.view=view;
//        }
//
//        public String toString(){
//            return view + "has a key"+ key;
//        }
//    }













































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
