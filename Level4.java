package com.example.user.game;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
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

public class Level4 extends FragmentActivity  {
    EditText tv;
    ImageView i1,i2,i3,i4;
    Button eb,nb,bb,pa,nextbutton;


    Map<String,List<String>> map;
    List<String> valSetOne,valSetFour,valSetFive ;
    Random r;
    List<String >valSetTwo,valSetThree ;
    List<String> keysAsArray;
    int result=-1,number=-1,n=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level4);
        Intent caller = getIntent();
        map = new HashMap<String, List<String>>();
        valSetOne = new ArrayList<String>();
        valSetOne.add("R.drawable.ballet1");
        valSetOne.add("R.drawable.ballet2");
        valSetOne.add("R.drawable.ballet3");
        valSetOne.add("R.drawable.ballet4");
        valSetTwo = new ArrayList<String>();
        valSetTwo.add("R.drawable.icicle1");
        valSetTwo.add("R.drawable.icicle2");
        valSetTwo.add("R.drawable.icicle3");
        valSetTwo.add("R.drawable.icicle4");
        valSetThree = new ArrayList<String>();
        valSetThree.add("R.drawable.island1");
        valSetThree.add("R.drawable.island2");
        valSetThree.add("R.drawable.island3");
        valSetThree.add("R.drawable.island4");
        valSetFour = new ArrayList<String>();
        valSetFour.add("R.drawable.square");
        valSetFour.add("R.drawable.square1");
        valSetFour.add("R.drawable.square2");
        valSetFour.add("R.drawable.square3");
        valSetFive = new ArrayList<String>();
        valSetFive.add("R.drawable.velvet1");
        valSetFive.add("R.drawable.velvet2");
        valSetFive.add("R.drawable.velvet3");
        valSetFive.add("R.drawable.velvet4");
        map.put("ballet", valSetOne);
        map.put("icicle",valSetTwo);
        map.put("island",valSetThree);
        map.put("square",valSetFour);
        map.put("velvet",valSetFive);

        keysAsArray = new ArrayList<String>(map.keySet());
        Collections.sort(keysAsArray.subList(0, keysAsArray.size()));
        foo(0);
    }

    private void foo(int number) {
        if(number==0)
        {
            result=0;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.ballet1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.ballet2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.ballet3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.ballet4);
        }
        //else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" sea")
        if(number==1)
        {
            result=1;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.icicle1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.icicle2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.icicle3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.icicle4);
        }
        //else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" owl")
        if(number==2)
        {
            result=2;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.island1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.island2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.island3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.island4);
        }
        //else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" tea")
        if(number==3)
        {
            result=3;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.square);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.square1);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.square2);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.square3);
        }
        // else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" bee")
        if(number==4)
        {
            result=4;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.velvet1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.velvet2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.velvet3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.velvet4);
        }

    }

    public void enter(View v) {
        tv = (EditText) findViewById(R.id.text);

        tv.setVisibility(View.VISIBLE);


        eb = (Button) findViewById(R.id.ebutton);
        eb.setVisibility(View.VISIBLE);
        Button b=(Button)findViewById(R.id.gbutton);
        b.setVisibility(View.INVISIBLE);

        Toast.makeText(getApplicationContext(), "Enter your answer ", Toast.LENGTH_SHORT).show();
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
                Toast.makeText(getApplicationContext(), "You completed level 4", Toast.LENGTH_SHORT).show();
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
                        Intent intent = new Intent(Level4.this,
                                Level4.class);

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
        goToEasy.setClass(this, Level5.class);
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

