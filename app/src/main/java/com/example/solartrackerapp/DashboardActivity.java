package com.example.kitchengardenapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class DashboardActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();

        mDrawerLayout = findViewById(R.id.drawerMain);
        mToggle = new ActionBarDrawerToggle(this,mDrawerLayout, R.string.navigation_drawer_open, R.string.navigation_drawer_close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        NavigationView nav_view = findViewById(R.id.nav_view);

        nav_view.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int id = item.getItemId();

                return false;
            }
        });


        TextView textView = findViewById(R.id.textView3);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Move to Solar Home page", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(DashboardActivity.this, com.example.kitchengardenapp.SolarhomeActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView = findViewById(R.id.CFSeed);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "FlowerSeeds", Toast.LENGTH_SHORT).show();
            }
        });


        TextView textView1 = findViewById(R.id.textView4);
        textView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Move to Latest Model Page", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(DashboardActivity.this, com.example.kitchengardenapp.ModelActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView1 = findViewById(R.id.CGermiSeed);
        cardView1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "GerminationSeeds", Toast.LENGTH_SHORT).show();
            }
        });


        TextView textView2 = findViewById(R.id.textView6);
        textView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Move to Service Policy page", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(DashboardActivity.this, com.example.kitchengardenapp.CustomerActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView2 = findViewById(R.id.CAmbar);
        cardView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "AmberStand", Toast.LENGTH_SHORT).show();
            }
        });

        TextView textView3 = findViewById(R.id.textView7);
        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Move to Customer Support page", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(DashboardActivity.this, com.example.kitchengardenapp.SupportActivity.class);
                startActivity(intent);
            }
        });

        CardView cardView3 = findViewById(R.id.Cdaisy);
        cardView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "DaisySeeds", Toast.LENGTH_SHORT).show();
            }
        });



        TextView textView5 = findViewById(R.id.textView9);
        textView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "Move to Logout page", Toast.LENGTH_SHORT).show();
                Intent intent= new Intent(DashboardActivity.this, com.example.kitchengardenapp.HelpdeskActivity.class);
                startActivity(intent);
            }
        });
        CardView cardView5 = findViewById(R.id.ChdBag);
        cardView5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DashboardActivity.this, "HDGrowBag", Toast.LENGTH_SHORT).show();
            }
        });
    }
}