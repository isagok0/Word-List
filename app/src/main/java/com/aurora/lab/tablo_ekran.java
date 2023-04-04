package com.aurora.lab;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class tablo_ekran extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablo_ekran);

        ArrayList<String> metinler = getIntent().getStringArrayListExtra("metinler");

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, metinler);

        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
    }
    }





