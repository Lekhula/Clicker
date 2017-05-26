package com.pabi.clicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnClick;
    Button btnReset;
    Button btnAdd;

    TextView txtCount;
    TextView txtCounter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick= (Button) findViewById(R.id.buttonClick);
        btnReset=(Button)findViewById(R.id.buttonReset);
        btnAdd=(Button)findViewById(R.id.buttonAdd);

        txtCount= (TextView)findViewById(R.id.textViewCount);
        txtCounter= (TextView) findViewById(R.id.textCounter);

        btnClick.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String countValue;
                countValue=txtCount.getText().toString();

                int intCountvalue=Integer.parseInt(countValue);
                intCountvalue++;

                txtCount.setText(String.valueOf(intCountvalue));

            }
        });

        btnAdd.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                String addValues;
                addValues= txtCounter.getText().toString();

                int intCountvalue=Integer.parseInt(addValues);
                intCountvalue++;

                txtCounter.setText(String.valueOf(intCountvalue));
            }
        });

        btnReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtCount.setText(String.valueOf(0));
                txtCounter.setText(String.valueOf(0));

            }
        });
    }
}
