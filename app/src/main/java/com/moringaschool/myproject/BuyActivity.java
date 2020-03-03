package com.moringaschool.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class BuyActivity extends AppCompatActivity {

    @BindView(R.id.buyview)
    ListView mBuyView;

    private String[] buyables = new String[]{
            "jordans","Nikes 101","PS 4","Nintendo DS",
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        ButterKnife.bind(this);

       mBuyView = (ListView) findViewById(R.id.cartview);

        ArrayAdapter adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, buyables);
        mBuyView.setAdapter(adapter);
    }
}
