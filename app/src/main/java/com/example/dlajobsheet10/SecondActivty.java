package com.example.dlajobsheet10;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivty extends AppCompatActivity {
    private TextView textViewName, textViewClass, textViewNIS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_activty);

        textViewName = findViewById(R.id.textViewName);
        textViewClass = findViewById(R.id.textViewClass);
        textViewNIS = findViewById(R.id.textViewNIS);

        // Get data from intent
        String name = getIntent().getStringExtra("NAME");
        String kelas = getIntent().getStringExtra("CLASS");
        String nis = getIntent().getStringExtra("NIS");

        // Set data to TextViews
        textViewName.setText("Nama: " + name);
        textViewClass.setText("Kelas: " + kelas);
        textViewNIS.setText("NIS: " + nis);
    }
}
