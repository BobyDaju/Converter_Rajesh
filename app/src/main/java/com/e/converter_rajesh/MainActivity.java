package com.e.converter_rajesh;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etNumber, etWords;
    Button btnConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNumber= findViewById(R.id.etNumber);
        etWords= findViewById(R.id.etWords);
        btnConvert= findViewById(R.id.btnConvert);

        btnConvert.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {


                int num;
                num= Integer.parseInt(etNumber.getText().toString());

                NumbertoWord numbertoWords = new NumbertoWord(num);
                etWords.setText(numbertoWords.NumbertoWord());

            }
        });
    }
}

