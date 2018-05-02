package com.example.cjcu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText lend = (EditText) findViewById(R.id.input_lend);
        EditText rate =findViewById(R.id.input_rate);
    }

}
