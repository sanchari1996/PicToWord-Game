package com.example.user.game;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class HelpActivity extends FragmentActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        Intent caller = getIntent();

        EditText t = (EditText) findViewById(R.id.text);
        t.setFocusable(false);
        t.setText("** View the pictures. Once you start  the game, you will be shown a screen with four photographs.\n\n These four photographs each have something in common. Sometimes it will be obvious, while other times, it can actually be fairly hard to guess. \n\n  This is especially true of later levels.\n\n"
                +"** The answer to the puzzle is the common theme between the four photographs.\n\n" +
                "** When you give the answer of the question , it can show you 'Right answer' if the answer is right ,\n\n if wrong, give you the right answer and you can progress to the next level.\n\n"
               );
        Button back=(Button)findViewById(R.id.back);
        back.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        onBackPressed();
    }
}
