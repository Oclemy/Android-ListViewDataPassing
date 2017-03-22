package com.tutorials.hp.listviewdatapassing;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //FIRST LISTVIEW
    ListView lv;
    ArrayList spacecrafts=new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lv= (ListView) findViewById(R.id.firstLV);
        populateData();
        lv.setAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,spacecrafts));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                lv.setAdapter(new ArrayAdapter<String>(MainActivity.this,android.R.layout.simple_list_item_1,new ArrayList<String>()));
                sendData();
            }
        });
    }

    //POPULATE SPACECRAFTS ARRAYLIST
    private void populateData()
    {
        spacecrafts.add("Casini");
        spacecrafts.add("Enterprise");
        spacecrafts.add("Spitzer");
        spacecrafts.add("Huygens");
        spacecrafts.add("WMAP");
        spacecrafts.add("Juno");
        spacecrafts.add("Kepler");
        spacecrafts.add("Apollo 15");
        spacecrafts.add("Challenger");
        spacecrafts.add("Discovery");
    }

    /*
    SET ARRAYLIST TO SPACECRAFTS COLLECTION CLASS
     */
    private SpacecraftsCollection getData()
    {
        SpacecraftsCollection spacecraftsCollection=new SpacecraftsCollection();
        spacecraftsCollection.setSpacecrafts(spacecrafts);

        return spacecraftsCollection;
    }

    /*
    SEND DATA TO SECOND ACTIVITY
     */
    private void sendData()
    {
        Intent i=new Intent(this,SecondActivity.class);
        i.putExtra("SPACECRAFTS",this.getData());
        startActivity(i);
    }
}
