package com.moringaschool.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {
//    @BindView(R.id.shop) Button mShopButton;
    private Button mShopButton;
    private Button mCartButton;
    private Button mHomeButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        ButterKnife.bind(this);

        mShopButton = (Button) findViewById(R.id.shop);
        mShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(MainActivity.this, ShopActivity.class);
//                startActivity(intent);
            }
        });

        mCartButton = (Button) findViewById(R.id.cart);
        mCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"caaaaaart", Toast.LENGTH_LONG).show();
            }
        });

        mHomeButton = (Button) findViewById(R.id.home);
        mHomeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Homeeeee", Toast.LENGTH_LONG).show();
            }
        });
    }
}

