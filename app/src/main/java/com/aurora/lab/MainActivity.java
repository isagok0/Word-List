package com.aurora.lab;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> metinler = new ArrayList<>();

    private EditText editText;
    private Button addButton;
    private Button showButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.editText);
        addButton = findViewById(R.id.addButton);
        showButton = findViewById(R.id.showButton);

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String metin = editText.getText().toString().trim();
                if (!metin.isEmpty()) {
                    metinler.add(metin);
                    editText.setText("");
                    Toast.makeText(MainActivity.this, "Metin eklendi", Toast.LENGTH_SHORT).show();
                } else {
                    Toast.makeText(MainActivity.this, "Lütfen metin girin", Toast.LENGTH_SHORT).show();
                }
            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (metinler.size() > 0) {
                    Intent intent = new Intent(MainActivity.this, tablo_ekran.class);
                    intent.putStringArrayListExtra("metinler", metinler);
                    startActivity(intent);
                } else {
                    Toast.makeText(MainActivity.this, "Liste boş", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}