package com.example.khalessi.gretas_vokabeltrainer;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DesignChoiceActivity extends AppCompatActivity {

    Button btn_katzenDesign;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_design_choice);

        btn_katzenDesign = (Button) findViewById(R.id.btn_katzenDesign);
        btn_katzenDesign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent unitIntent = new Intent(getApplicationContext(), UnitActivity.class);
                startActivity(unitIntent);
            }
        });

        Button btn_testListView = (Button) findViewById(R.id.btn_testListView);
        btn_testListView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_testListView = new Intent(getApplicationContext(),UnitListActivity.class);
                startActivity(intent_testListView);
            }
        });
    }
}
