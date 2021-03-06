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

public class Level5 extends FragmentActivity  {
    EditText tv;
    ImageView i1,i2,i3,i4;
    Button eb,bb,pa,nextbutton;


    Map<String,List<String>> map;
    List<String> valSetOne,valSetFour,valSetFive ;
    Random r;
    List<String >valSetTwo,valSetThree ;
    List<String> keysAsArray;
    int result=-1,number=-1,n=1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level5);
        Intent caller = getIntent();
        map = new HashMap<String, List<String>>();
        valSetOne = new ArrayList<String>();
        valSetOne.add("R.drawable.combine1");
        valSetOne.add("R.drawable.combine2");
        valSetOne.add("R.drawable.combine3");
        valSetOne.add("R.drawable.combine4");
        valSetTwo = new ArrayList<String>();
        valSetTwo.add("R.drawable.dessert1");
        valSetTwo.add("R.drawable.dessert2");
        valSetTwo.add("R.drawable.dessert3");
        valSetTwo.add("R.drawable.dessert4");
        valSetThree = new ArrayList<String>();
        valSetThree.add("R.drawable.justice1");
        valSetThree.add("R.drawable.justice2");
        valSetThree.add("R.drawable.justice3");
        valSetThree.add("R.drawable.justice4");
        valSetFour = new ArrayList<String>();
        valSetFour.add("R.drawable.produce1");
        valSetFour.add("R.drawable.produce2");
        valSetFour.add("R.drawable.produce3");
        valSetFour.add("R.drawable.produce4");
        valSetFive = new ArrayList<String>();
        valSetFive.add("R.drawable.stretch1");
        valSetFive.add("R.drawable.stretch2");
        valSetFive.add("R.drawable.stretch3");
        valSetFive.add("R.drawable.stretch4");
        map.put("combine", valSetOne);
        map.put("dessert",valSetTwo);
        map.put("justice",valSetThree);
        map.put("produce",valSetFour);
        map.put("stretch",valSetFive);

        keysAsArray = new ArrayList<String>(map.keySet());
        Collections.sort(keysAsArray.subList(0, keysAsArray.size()));
        foo(0);


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
                Toast.makeText(getApplicationContext(), "You completed level 5", Toast.LENGTH_SHORT).show();
                bb = (Button) findViewById(R.id.backbutton);
                bb.setVisibility(View.VISIBLE);
                tv.setVisibility(View.INVISIBLE);
                eb.setVisibility(View.INVISIBLE);
                pa = (Button) findViewById(R.id.pabutton);
                pa.setVisibility(View.VISIBLE);
                pa.setOnClickListener(new Button.OnClickListener() {
                    public void onClick(View v) {
                        finish();
                        Intent intent = new Intent(Level5.this,
                                Level5.class);

                        startActivity(intent);
                    }
                });
            }
        }
        InputMethodManager mgr = (InputMethodManager)getSystemService(Context.INPUT_METHOD_SERVICE);
        mgr.hideSoftInputFromWindow(tv.getWindowToken(), 0);
    }


    public void next(View v)
    {
        foo(n++);
        nextbutton.setVisibility(View.INVISIBLE);
        enter(v);
    }

    private void foo(int number) {
        if(number==1)
        {
            result=1;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.dessert1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.dessert2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.dessert3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.dessert4);
        }
        //else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" sea")
        if(number==3)
        {
            result=3;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.produce1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.produce2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.produce3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.produce4);
        }
        //else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" owl")
        if(number==2)
        {
            result=2;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.justice1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.justice2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.justice3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.justice4);
        }
        //else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" tea")
        if(number==4)
        {
            result=4;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.stretch1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.stretch2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.stretch3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.stretch4);
        }
        // else if((result=keysAsArray.get(r.nextInt(keysAsArray.size())))==" bee")
        if(number==0)
        {
            result=0;
            i1=(ImageView)findViewById(R.id.iv1);
            i1.setImageResource(R.drawable.combine1);
            i2=(ImageView)findViewById(R.id.iv2);
            i2.setImageResource(R.drawable.combine2);
            i3=(ImageView)findViewById(R.id.iv3);
            i3.setImageResource(R.drawable.combine3);
            i4=(ImageView)findViewById(R.id.iv4);
            i4.setImageResource(R.drawable.combine4);
        }
    }

    public void back(View v)
    {
        Toast.makeText(getApplicationContext(),"Great you completed the game!",Toast.LENGTH_SHORT ).show();
        Toast.makeText(getApplicationContext(),"Rate the game please!",Toast.LENGTH_SHORT ).show();
        finish();
        onBackPressed();
    }
}

