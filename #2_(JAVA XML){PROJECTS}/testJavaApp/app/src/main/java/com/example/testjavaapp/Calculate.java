package com.example.testjavaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate);

        EditText et_first = findViewById(R.id.calculate_et_firstNumber);
        EditText et_second = findViewById(R.id.calculate_et_secondNumber);
        TextView tv_result = findViewById(R.id.calculate_tx_resoult);
        Button btn_sum = findViewById(R.id.calculate_btn_sum);

        btn_sum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String num1 = et_first.getText().toString();
                String num2 = et_second.getText().toString();

                int number_1 = Integer.parseInt(num1);
                int number_2 = Integer.parseInt(num2);

                int result = number_1 + number_2;
                tv_result.setText( "Result: " + result);
            }
        });
    }
}