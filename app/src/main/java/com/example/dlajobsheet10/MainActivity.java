package com.example.dlajobsheet10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private EditText editTextName, editTextClass, editTextNIS;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextClass = findViewById(R.id.editTextClass);
        editTextNIS = findViewById(R.id.editTextNIS);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(v -> {
            String name = editTextName.getText().toString();
            String kelas = editTextClass.getText().toString();
            String nis = editTextNIS.getText().toString();

            Intent intent = new Intent(MainActivity.this, SecondActivty.class);
            intent.putExtra("NAME", name);
            intent.putExtra("CLASS", kelas);
            intent.putExtra("NIS", nis);
            startActivity(intent);
        });
    }
}
