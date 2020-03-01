package com.moringaschool.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.shop) Button mShopButton;
    @BindView(R.id.cart) Button mCartButton;
    @BindView(R.id.home) Button mHomeButton;
    @BindView(R.id.search) EditText mSearch;
    @BindView(R.id.search_button) Button mSearch_Button;
//    private Button mShopButton;
//    private Button mCartButton;
//    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mSearch_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String searches = mSearch.getText().toString();
                Intent intent = new Intent(MainActivity.this, ShopActivity.class);
                intent.putExtra("searches", searches);
                startActivity(intent);
            }
        });


        mShopButton = (Button) findViewById(R.id.shop);
        mShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, ShopActivity.class);

                startActivity(intent);
            }
        });

        mCartButton = (Button) findViewById(R.id.cart);
        mCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CartActivity.class);
                startActivity(intent);
            }
        });

        mHomeButton = (Button) findViewById(R.id.home);
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, MainActivity.class);
            }
        });
    }
}

