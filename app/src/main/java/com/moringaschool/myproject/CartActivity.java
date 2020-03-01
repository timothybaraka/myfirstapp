package com.moringaschool.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class CartActivity extends AppCompatActivity {

    private ListView mCartView;
    private String[] selectedItems = new String[]{
      "Yeezy","Nikes 101","PS 4","Nintendo DS",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);

        mCartView = (ListView) findViewById(R.id.cartview);
        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, selectedItems);
        mCartView.setAdapter(adapter);
    }
}
