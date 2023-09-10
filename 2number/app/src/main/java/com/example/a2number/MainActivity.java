package com.example.a2number;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClick(View view) {
        EditText eta = findViewById(R.id.numA);
        EditText etb = findViewById(R.id.numB);
        TextView tvSum = findViewById(R.id.sum);
        String strA = eta.getText().toString();
        String strB = etb.getText().toString();
        double a = Double.parseDouble(strA);
        double b = Double.parseDouble(strB);
        String sum = Double.toString(a + b);
        tvSum.setText(sum);
    }
}