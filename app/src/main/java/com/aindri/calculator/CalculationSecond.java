package com.aindri.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculationSecond extends AppCompatActivity {
    EditText edt_num1,edt_num2;
    Button bu_add,bu_sub,bu_multi,bu_div;
    TextView txt_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculation_second);
        edt_num1=findViewById(R.id.edt_num1);
        edt_num2=findViewById(R.id.edt_num2);
        bu_add=findViewById(R.id.bu_add);
        bu_sub=findViewById(R.id.bu_sub);
        bu_multi=findViewById(R.id.bu_multi);
        bu_div=findViewById(R.id.bu_div);
        txt_res=findViewById(R.id.txt_res);


        bu_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(edt_num1.getText().toString().trim().isEmpty()||edt_num2.getText().toString().trim().isEmpty()){
                    Toast.makeText(CalculationSecond.this,"Enter the number",Toast.LENGTH_LONG).show();
                }
                else if(edt_num1.getText().toString().trim().length()>4||edt_num2.getText().toString().trim().length()>4){
                    Toast.makeText(CalculationSecond.this,"Enter four digits only",Toast.LENGTH_LONG).show();
                }
                else{
                    double number1=Double.valueOf(edt_num1.getText().toString().trim());
                    double number2=Double.valueOf(edt_num2.getText().toString().trim());
                    double addition=number1+number2;
                    txt_res.setText(String.valueOf(addition));
                }

            }
        });
        bu_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_num1.getText().toString().trim().isEmpty() || edt_num2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(CalculationSecond.this, "Enter the number", Toast.LENGTH_LONG).show();
                } else if (edt_num1.getText().toString().trim().length() > 4 || edt_num2.getText().toString().trim().length() > 4) {
                    Toast.makeText(CalculationSecond.this, "Enter four digits only", Toast.LENGTH_LONG).show();
                } else {
                    double number1 = Double.valueOf(edt_num1.getText().toString().trim());
                    double number2 = Double.valueOf(edt_num2.getText().toString().trim());
                    double subtraction = number1 - number2;
                    txt_res.setText(String.valueOf(subtraction));
                }
            }
        });
        bu_multi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_num1.getText().toString().trim().isEmpty() || edt_num2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(CalculationSecond.this, "Enter the number", Toast.LENGTH_LONG).show();
                } else if (edt_num1.getText().toString().trim().length() > 4 || edt_num2.getText().toString().trim().length() > 4) {
                    Toast.makeText(CalculationSecond.this, "Enter four digits only", Toast.LENGTH_LONG).show();
                } else {
                    double number1 = Double.valueOf(edt_num1.getText().toString().trim());
                    double number2 = Double.valueOf(edt_num2.getText().toString().trim());
                    double multiplication = number1 * number2;
                    txt_res.setText(String.valueOf(multiplication));
                }
            }
        });
        bu_div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (edt_num1.getText().toString().trim().isEmpty() || edt_num2.getText().toString().trim().isEmpty()) {
                    Toast.makeText(CalculationSecond.this, "Enter the number", Toast.LENGTH_LONG).show();
                } else if (edt_num1.getText().toString().trim().length() > 4 || edt_num2.getText().toString().trim().length() > 4) {
                    Toast.makeText(CalculationSecond.this, "Enter four digits only", Toast.LENGTH_LONG).show();
                } else {
                    double number1 = Double.valueOf(edt_num1.getText().toString().trim());
                    double number2 = Double.valueOf(edt_num2.getText().toString().trim());
                    double divison = number1 / number2;
                    txt_res.setText(String.valueOf(divison));
                }
            }
        });
    }
}