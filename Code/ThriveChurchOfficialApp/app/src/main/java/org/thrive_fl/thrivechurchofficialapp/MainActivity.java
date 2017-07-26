package org.thrive_fl.thrivechurchofficialapp;

import android.app.Application;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Adding elements that are found on the screen
    Button incrementButton;
    Button decrementButton;
    Button clearButton;
    Button sqrtButton;
    TextView number;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        incrementButton = (Button)findViewById(R.id.button);
        decrementButton = (Button)findViewById(R.id.button2);
        clearButton = (Button)findViewById(R.id.button3);
        sqrtButton = (Button)findViewById(R.id.button4);
        number = (TextView) findViewById(R.id.Number);


        incrementButton.setOnClickListener(new View.OnClickListener() {

            //button pressed
            @Override
            public void onClick(View v) {


                Double currentValue = Double.parseDouble(number.getText().toString());

                currentValue++;
                number.setText(String.valueOf(currentValue));

            }
        });


        decrementButton.setOnClickListener(new View.OnClickListener() {

            //button pressed
            @Override
            public void onClick(View v) {

                Double currentValue = Double.parseDouble(number.getText().toString());

                currentValue = currentValue - 1;
                number.setText(String.valueOf(currentValue));

            }
        });

        clearButton.setOnClickListener(new View.OnClickListener() {

            //button pressed
            @Override
            public void onClick(View v) {

                Double currentValue = Double.parseDouble(number.getText().toString());

                currentValue = 0.0;
                number.setText(String.valueOf(currentValue));

            }
        });

        sqrtButton.setOnClickListener(new View.OnClickListener() {

            //button pressed
            @Override
            public void onClick(View v) {

                Double currentValue = Double.parseDouble(number.getText().toString());

                currentValue = Math.sqrt(currentValue);
                number.setText(String.valueOf(currentValue));

            }
        });

    }
}
