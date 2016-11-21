package com.example.user.game;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RatingBar;

public class RateActivity extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rate);
        Intent caller = getIntent();
    }

    /**
     * called when the button from activity_first.xml is clicked
     * start the second activity and pass the rating to it
     * @param v the View which triggered the method call: should refer to the button "enter"
     */
    public void enter(View v) {
        // retrieve a reference to the View defined in the activity_first.xml
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);
        // get the rating set by the user
        float rating = ratingBar.getRating();
        // create an Intent to launch the second activity
        Intent goToSecond = new Intent();
        goToSecond.setClass(this, RatingResult.class);
        // pass the rating value to the second activity
        goToSecond.putExtra("nbStars", rating);
        // start the second activity
        startActivity(goToSecond);
        // remove this current activity
        finish();
    }
}

