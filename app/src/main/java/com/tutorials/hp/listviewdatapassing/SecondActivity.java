package com.tutorials.hp.listviewdatapassing;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SecondActivity extends AppCompatActivity {

    //SECOND LISTVIEW
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv= (ListView) findViewById(R.id.secondLV);

        receiveData();
    }

    /*
    RECEIVE DATA FROM FIRST ACTIVITY
     */
    private void receiveData()
    {
        Intent i=this.getIntent();
        SpacecraftsCollection spacecraftsCollection= (SpacecraftsCollection) i.getSerializableExtra("SPACECRAFTS");

        lv.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,spacecraftsCollection.getSpacecrafts()));
    }
}
