package com.example.noidmerchant;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import com.example.noidmerchant.gui.HelpsActivity;
import com.example.noidmerchant.gui.InformationsActivity;
import com.example.noidmerchant.gui.OrdersActivity;
import com.example.noidmerchant.gui.ProductsActivity;
import com.example.noidmerchant.gui.SettingsActivity;
import com.example.noidmerchant.gui.StatisticsActivity;

public class MainActivity extends AppCompatActivity {
    private CardView products,orders,statistics,helps,info,settings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        products = findViewById(R.id.productCard);
        orders = findViewById(R.id.ordersCard);
        statistics = findViewById(R.id.statisticsCard);
        helps = findViewById(R.id.helpCard);
        info = findViewById(R.id.informationCard);
        settings = findViewById(R.id.settingsCard);
        //Bat su kien Product
        products.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProductsActivity.class));
            }
        });
        //Bat su kien Order
        orders.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, OrdersActivity.class));
            }
        });

        statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, StatisticsActivity.class));
            }
        });
        helps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HelpsActivity.class));
            }
        });
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, InformationsActivity.class));
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SettingsActivity.class));
            }
        });
    }
}
