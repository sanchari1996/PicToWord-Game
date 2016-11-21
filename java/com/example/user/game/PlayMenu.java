package com.example.user.game;

import android.content.Intent;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class PlayMenu extends FragmentActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_menu);

    ListView list = (ListView) findViewById(R.id.listView);


    final ArrayAdapter<CharSequence> adapterList = ArrayAdapter.createFromResource(this,
            R.array.TestArray,
            android.R.layout.simple_list_item_1);

        list.setAdapter(adapterList);

    list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
        @Override
        public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            if(position==0)
            {
                Intent level1 = new Intent();
                level1.setClass(PlayMenu.this, PlayActivity.class);
                startActivity(level1);
            }
            if(position==1)
            {
                Intent level2 = new Intent();
                level2.setClass(PlayMenu.this, Level2.class);
                startActivity(level2);
            }
            if(position==2)
            {
                Intent level3 = new Intent();
                level3.setClass(PlayMenu.this, Level3.class);
                startActivity(level3);
            }
            if(position==3)
            {
                Intent level4 = new Intent();
                level4.setClass(PlayMenu.this, Level4.class);
                startActivity(level4);
            }
            if(position==4)
            {
                Intent level5 = new Intent();
                level5.setClass(PlayMenu.this, Level5.class);
                startActivity(level5);
            }
        }
    });
}
}

