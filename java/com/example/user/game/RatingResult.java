package com.example.user.game;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.widget.TextView;


public class RatingResult extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // display the GUI defined in the activity_second.xml file
        setContentView(R.layout.activity_rating_result);

        // get the Intent which caused the start of this activity
        Intent caller = getIntent();
        // get the rating passed by the first activity
        float rating = caller.getFloatExtra("nbStars", 0);

        // retrieve a reference to the View defined in the activity_second.xml
        TextView textView = (TextView) findViewById(R.id.textView);
        // set the text of the textView
        textView.setText("Welcome to the RatingSection!\nYour rating: " + rating+"\n"+"Thank You for Rating!\nPlease press the back button for continue playing...");
    }
}
