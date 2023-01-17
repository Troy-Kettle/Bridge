package com.MobileApp.Troy.Coursework;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class AddActivity extends AppCompatActivity {

    EditText bridge_input, condition_input, date_input;
    Button add_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);

        bridge_input = findViewById(R.id.bridge_input);
        condition_input = findViewById(R.id.condition_input);
        date_input = findViewById(R.id.date_input);
        add_button = findViewById(R.id.add_button);
        add_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MyDatabaseHelper myDB = new MyDatabaseHelper(AddActivity.this);
                myDB.addBook(bridge_input.getText().toString().trim(),
                        condition_input.getText().toString().trim(),
                        Integer.valueOf(date_input.getText().toString().trim()));
            }
        });
    }
}