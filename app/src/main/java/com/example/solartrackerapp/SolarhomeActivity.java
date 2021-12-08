package com.example.kitchengardenapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class SolarhomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solarhome);


    Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SolarhomeActivity.this, "Add to Cart Successfully", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(SolarhomeActivity.this, LocationActivity.class);
                startActivity(intent);
            }
        });




       TextView textView = findViewById(R.id.textView18);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SolarhomeActivity.this, "Add To Cart", Toast.LENGTH_SHORT).show();
            }
        });


        TextView textView1 = findViewById(R.id.textView15);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SolarhomeActivity.this, "Add To Cart", Toast.LENGTH_SHORT).show();
            }
        });
    }
}