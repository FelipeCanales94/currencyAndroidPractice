package com.example.currencyconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public void convert(View v){

        EditText userInput = findViewById(R.id.currencyInput);
        Double poundsConversion = Double.parseDouble(userInput.getText().toString()) * .75;
        Toast.makeText(MainActivity.this, "£" + poundsConversion.toString(), Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
