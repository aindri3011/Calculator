package com.aindri.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculatorpage2 extends AppCompatActivity {
    TextView num1_txt,num2_txt;
    double num1,num2;
    String sign;
    Button submit_bu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_calculatorpage2);

        num1_txt=findViewById(R.id.num1_txt);
        num2_txt=findViewById(R.id.num2_txt);
        submit_bu=findViewById(R.id.submit_bu);
        Bundle bundle=getIntent().getExtras();
        if(bundle!=null){
            num1=bundle.getDouble("1st_num");
            num2=bundle.getDouble("2nd_num");
            sign=bundle.getString("sign");
            num1_txt.setText(String.valueOf(num1));
            num2_txt.setText(String.valueOf(num2));
        }

        submit_bu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(sign.equalsIgnoreCase("+")){
                    double res=num1+num2;
                    Intent intent=new Intent(Calculatorpage2.this,MainActivity.class);
                    intent.putExtra("result",res);
                    startActivity(intent);
                    finish();

                }
                else if(sign.equalsIgnoreCase("-")){
                    double res=num1-num2;
                    Intent intent=new Intent(Calculatorpage2.this,MainActivity.class);
                    intent.putExtra("result",res);
                    startActivity(intent);
                    finish();

                }
                else if(sign.equalsIgnoreCase("*")){
                    double res=num1*num2;
                    Intent intent=new Intent(Calculatorpage2.this,MainActivity.class);
                    intent.putExtra("result",res);
                    startActivity(intent);
                    finish();
                }
                else if(sign.equalsIgnoreCase("/")){
                    double res=num1/num2;
                    Intent intent=new Intent(Calculatorpage2.this,MainActivity.class);
                    intent.putExtra("result",res);
                    startActivity(intent);
                    finish();
                }

            }
        });

    }
}