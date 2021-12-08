package com.example.kitchengardenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class HelpdeskActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helpdesk);

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(HelpdeskActivity.this, "Add to Cart Successfully", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(HelpdeskActivity.this, com.example.kitchengardenapp.LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}