package com.example.khalessi.gretas_vokabeltrainer;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.khalessi.gretas_vokabeltrainer.database_vocabulary.Units;
import com.example.khalessi.gretas_vokabeltrainer.database_vocabulary.DroidDatabaseHelper;

import java.util.ArrayList;

public class UnitListActivity extends AppCompatActivity {


    UnitCustomAdapter myCustomAdapter = null;
    ListView listView = null;
    DroidDatabaseHelper db = null;
    ArrayList<Units> cars = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_unit_list);


        db = new DroidDatabaseHelper(this);
        db.recreateDatabase();
        db.insertSomeUnits();
        cars = db.getData();
        myCustomAdapter = new UnitCustomAdapter(this, R.layout.unit_details, cars);

        listView = (ListView) findViewById(R.id.simpleListView);
        listView.setAdapter(myCustomAdapter);


    }
}
