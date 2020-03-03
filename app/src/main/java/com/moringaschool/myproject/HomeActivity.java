package com.moringaschool.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;

public class HomeActivity extends AppCompatActivity {
    @BindView(R.id.shop)
    Button mShopButton;
    @BindView(R.id.cart)
    Button mCartButton;
    @BindView(R.id.home)
    Button mHomeButton;
    @BindView(R.id.search)
    EditText mSearch;
    @BindView(R.id.search_button)
    Button mSearch_Button;
    @BindView(R.id.userView)
    TextView mUserView;


@Override
    protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_home);
    ButterKnife.bind(this);

        Intent intent = getIntent();
        String username = intent.getStringExtra("username");
    mUserView.setText("Welcome " + username);


    mShopButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(HomeActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, CartActivity.class);
            startActivity(intent);
        }
    });


    mCartButton.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(HomeActivity.this, "Hello World!", Toast.LENGTH_LONG).show();
            Intent intent = new Intent(HomeActivity.this, CartActivity.class);
            startActivity(intent);
        }
    });

    mSearch_Button = (Button) findViewById(R.id.search_button);
    mSearch_Button.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent = new Intent(HomeActivity.this, CartActivity.class);
            startActivity(intent);
        }
    });
}
}







































































