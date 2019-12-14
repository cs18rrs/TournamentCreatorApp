package com.example.createyourown;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //store the tournament name in database

    //method for individual type matches
   public static void Individual(){}

   //generate a method for team based matches
   public static void Team(){}

   public void next(View view){
        //go to next page

   }
   public void CreateNewGame(View view) {
       Intent in = new Intent(getApplicationContext(),CreateNewGame.class);
      startActivity(in);
    }
//    public void onRadioButtonClicked(View view) {
//        // Is the button now checked?
//        boolean checked = ((RadioButton) view).isChecked();
//
//        // Check which radio button was clicked
//        switch(view.getId()) {
//            case R.id.radioButton1:
//                if (checked)
//                    // Pirates are the best
//                    break;
//            case R.id.radioButton2:
//                if (checked)
//                    // Ninjas rule
//                    break;
//        }
//    }
}
