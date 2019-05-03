package com.example.waleed.sum;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    EditText num1,num2;
    TextView textView;
    Button sumbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sumbtn = findViewById(R.id.sumbtn);
        textView = findViewById(R.id.result);
         num1 = findViewById(R.id.one);
         num2 = findViewById(R.id.two);


        sumbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double number1 = Double.parseDouble(num1.getText().toString());
                double number2 = Double.parseDouble(num2.getText().toString());
                double sum = number1 + number2;
                textView.setText("The result = "+String.valueOf(sum));
            }
        });

    }
}
