package com.example.user.game;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class PlayActivity extends FragmentActivity {

    EditText tv;
    ImageView i1,i2,i3,i4;
    Button eb,nb,bb,pa,nextbutton;
    int n=1;


    Map<String,List<String>> map;
    List<String> valSetOne,valSetFour,valSetFive ;
    Random r;
    List<String >valSetTwo,valSetThree ;
    List<String> keysAsArray;
    int result=-1,number=-1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        Intent caller = getIntent();
         map = new HashMap<String, List<String>>();
        valSetOne = new ArrayList<String>();
        valSetOne.add("R.drawable.sample_0");
        valSetOne.add("R.drawable.sample_1");
        valSetOne.add("R.drawable.sample_2");
        valSetOne.add("R.drawable.sample_3");
        valSetTwo = new ArrayList<String>();
        valSetTwo.add("R.drawable.sea");
        valSetTwo.add("R.drawable.sea1");
        valSetTwo.add("R.drawable.sea2");
        valSetTwo.add("R.drawable.sea3");
        valSetThree = new ArrayList<String>();
        valSetThree.add("R.drawable.owl");
        valSetThree.add("R.drawable.images");
        valSetThree.add("R.drawable.search");
        valSetThree.add("R.drawable.imgres");
        valSetFour = new ArrayList<String>();
        valSetFour.add("R.drawable.tea1");
        valSetFour.add("R.drawable.tea2");
        valSetFour.add("R.drawable.tea3");
        valSetFour.add("R.drawable.tea4");
        valSetFive = new ArrayList<String>();
        valSetFive.add("R.drawable.bee1");
        valSetFive.add("R.drawable.bee2");
        valSetFive.add("R.drawable.bee3");
        valSetFive.add("R.drawable.bee4");
        map.put("dog", valSetOne);
        map.put("sea", valSetTwo);
        map.put("owl",valSetThree);
        map.put("tea",valSetFour);
        map.put("bee",valSetFive);

        keysAsArray = new ArrayList<String>(map.keySet());
        Collections.sort(keysAsArray.subList(0, keysAsArray.size()));
        foo(0);


    }

    private void foo(int number) {
        if (number == 1) {
            result = 1;
            i1 = (ImageView) findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.sample_0);
            i2 = (ImageView) findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.sample_1);
            i3 = (ImageView) findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.sample_2);
            i4 = (ImageView) findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.sample_3);
        }
        if (number == 3) {
            result = 3;
            i1 = (ImageView) findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.sea);
            i2 = (ImageView) findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.sea1);
            i3 = (ImageView) findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.sea2);
            i4 = (ImageView) findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.sea3);
        }

        if (number == 2) {
            result = 2;
            i1 = (ImageView) findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.owl);
            i2 = (ImageView) findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.images);
            i3 = (ImageView) findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.imgres);
            i4 = (ImageView) findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.search);
        }

        if (number == 4) {
            result = 4;
            i1 = (ImageView) findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.tea1);
            i2 = (ImageView) findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.tea2);
            i3 = (ImageView) findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.tea3);
            i4 = (ImageView) findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.tea4);
        }

        if (number == 0) {
            result = 0;
            i1 = (ImageView) findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.bee1);
            i2 = (ImageView) findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.bee2);
            i3 = (ImageView) findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.bee3);
            i4 = (ImageView) findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.bee4);
        }

    }

    public void enter(View v) {
         tv = (EditText) findViewById(R.id.text);

        tv.setVisibility(View.VISIBLE);
       // tv.setOnClickListener(this);
        eb = (Button) findViewById(R.id.ebutton);
        eb.setVisibility(View.VISIBLE);
        //eb.setEnabled(false);
        //eb.setOnClickListener(this);
        Button b=(Button)findViewById(R.id.gbutton);
        b.setVisibility(View.INVISIBLE);

        Toast.makeText(getApplicationContext(),"Enter your answer ",Toast.LENGTH_SHORT ).show();
    }



    public void play(View v) {

        if((tv.getText().toString().length() == 0)) {
            Log.d("TAG", "dhuckche");
            Toast.makeText(getApplicationContext() , "Please enter the word first" , Toast.LENGTH_SHORT).show();

        }
        else if(map.keySet().toString().contains((tv.getText().toString()).toLowerCase()))
        {

            Toast.makeText(getApplicationContext(),"Right Answer",Toast.LENGTH_SHORT ).show();
            Log.d("value" , tv.getText().toString().length() + "");

        }
        else {
            Toast.makeText(getApplicationContext(), "Sorry wrong answer!! Right answer is: " + keysAsArray.get(result), Toast.LENGTH_SHORT).show();
        }

        if((tv.getText().toString().length() != 0)) {

            if (n < 5) {
                nextbutton = (Button) findViewById(R.id.nextbutton);
                nextbutton.setVisibility(View.VISIBLE);
                eb.setVisibility(View.INVISIBLE);
                tv.setText("");
                tv.setVisibility(View.INVISIBLE);
            } else {
                Toast.makeText(getApplicationContext(), "You completed level 1", Toast.LENGTH_SHORT).show();
                nb = (Button) findViewById(R.id.nbutton);
                nb.setVisibility(View.VISIBLE);
                bb = (Button) findViewById(R.id.backbutton);
                bb.setVisibility(View.VISIBLE);
                tv.setVisibility(View.INVISIBLE);
                eb.setVisibility(View.INVISIBLE);
                pa = (Button) findViewById(R.id.pabutton);
                pa.setVisibility(View.VISIBLE);
                pa.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        finish();
                        Intent intent = new Intent(PlayActivity.this,
                                PlayActivity.class);

                        startActivity(intent);
                    }
                });
            }
        }
        InputMethodManager mgr = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(tv.getWindowToken(), 0);
    }
    public void enterNext(View v)
    {
        Intent goToEasy = new Intent();
        goToEasy.setClass(this, Level2.class);
        startActivity(goToEasy);
        finish();
    }
    public void next(View v)
    {
        foo(n++);
        nextbutton.setVisibility(View.INVISIBLE);
        enter(v);
    }
    public void back(View v)
    {
        finish();
        onBackPressed();
    }
}
