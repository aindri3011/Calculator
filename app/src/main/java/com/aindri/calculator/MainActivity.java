package com.aindri.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.provider.Telephony;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edit_num1, edit_num2;
    Button but_add, but_sub, but_multi, but_div;
    TextView text_resu;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declareView();
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            text_resu.setText(String.valueOf(bundle.getDouble("result")));
        }

        ViewClick();
    }


    private void declareView() {
        edit_num1 = findViewById(R.id.edit_num1);
        edit_num2 = findViewById(R.id.edit_num2);
        but_add = findViewById(R.id.but_add);
        but_sub = findViewById(R.id.but_sub);
        but_multi = findViewById(R.id.but_multi);
        but_div = findViewById(R.id.but_div);
        text_resu=findViewById(R.id.text_resu);
    }

    private void ViewClick() {
        but_add.setOnClickListener(this);
        but_sub.setOnClickListener(this);
        but_multi.setOnClickListener(this);
        but_div.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.but_add:
                if (validationRule()) {
                    double a = Double.valueOf(edit_num1.getText().toString().trim());
                    double b = Double.valueOf(edit_num2.getText().toString().trim());
                    Intent intent = new Intent(MainActivity.this, Calculatorpage2.class);
                    intent.putExtra("1st_num", a);
                    intent.putExtra("2nd_num", b);
                    intent.putExtra("sign", "+");
                    startActivity(intent);
                    finish();
                }
                break;
            case R.id.but_sub:
                if (validationRule()) {
                    double a = Double.valueOf(edit_num1.getText().toString().trim());
                    double b = Double.valueOf(edit_num2.getText().toString().trim());
                    Intent intent = new Intent(MainActivity.this, Calculatorpage2.class);
                    intent.putExtra("1st_num", a);
                    intent.putExtra("2nd_num", b);
                    intent.putExtra("sign", "-");
                    startActivity(intent);
                    finish();

                }
                break;
            case R.id.but_multi:
                if (validationRule()) {
                    double a = Double.valueOf(edit_num1.getText().toString().trim());
                    double b = Double.valueOf(edit_num2.getText().toString().trim());
                    Intent intent = new Intent(MainActivity.this, Calculatorpage2.class);
                    intent.putExtra("1st_num", a);
                    intent.putExtra("2nd_num", b);
                    intent.putExtra("sign", "*");
                    startActivity(intent);
                    finish();

                }
                break;
            case R.id.but_div:
                if (validationRule()) {
                    double a = Double.valueOf(edit_num1.getText().toString().trim());
                    double b = Double.valueOf(edit_num2.getText().toString().trim());
                    Intent intent = new Intent(MainActivity.this, Calculatorpage2.class);
                    intent.putExtra("1st_num", a);
                    intent.putExtra("2nd_num", b);
                    intent.putExtra("sign", "/");
                    startActivity(intent);
                    finish();

                }
                break;

        }
    }

    private boolean validationRule() {
        if (edit_num1.getText().toString().trim().isEmpty()) {
            Toast.makeText(MainActivity.this, "Enter the first number", Toast.LENGTH_LONG).show();
            return false;
        } else if (edit_num1.getText().toString().trim().length() > 4) {
            Toast.makeText(MainActivity.this, "Enter four digits only", Toast.LENGTH_LONG).show();
            return false;
        } else if (edit_num2.getText().toString().trim().isEmpty()) {
            Toast.makeText(MainActivity.this, "Enter the second number", Toast.LENGTH_LONG).show();
            return false;
        } else if (edit_num2.getText().toString().trim().length() > 4) {
            Toast.makeText(MainActivity.this, "Enter four digits only", Toast.LENGTH_LONG).show();
            return false;

        }
        return true;
    }
}
