package com.moringaschool.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ShopActivity extends AppCompatActivity {
    @BindView(R.id.shopView) ListView mShopView;


    private String[] items = new String[]{"Televisions", "Fridges",
            "Cameras", "Phones", "Laptops", "Clothes",
            "Shoes", "Bags", "Miss Delta's", "Andina",
            "Lardo", "Portland City Grill", "Fat Head's Brewery",
            "Chipotle", "Subway"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop);
        ButterKnife.bind(this);

        mShopView = (ListView) findViewById(R.id.cartview);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, items);
        mShopView.setAdapter(adapter);
    }
}

