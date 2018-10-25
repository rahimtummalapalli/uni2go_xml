package com.example.administrator.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner spinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner spinner3 = (Spinner) findViewById(R.id.spinner3);

        List<String> categories = new ArrayList<String>();
        categories.add("Bachelors");
        categories.add("dual Degreee PG");
        categories.add("Computers");
        categories.add("Masters");
        categories.add("PHD");

        ArrayAdapter<String> dataadpter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, categories);

        dataadpter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        spinner1.setAdapter(dataadpter);
        spinner2.setAdapter(dataadpter);
        spinner3.setAdapter(dataadpter);
    }
}
