package com.moringaschool.myproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @BindView(R.id.loginbutton) Button mLoginButton;
    @BindView(R.id.userName) EditText mUserName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        mLoginButton.setOnClickListener(this);}

        @Override
    public void onClick(View v) {
            if (v == mLoginButton) {
                String username = mUserName.getText().toString();
                Intent intent = new Intent(MainActivity.this, HomeActivity.class);

                intent.putExtra("username", username);
                startActivity(intent);
            }
        }


}



// if (v == mLoginButton) {
//                openHomeActivity();
//            }
//}
//    private void openHomeActivity() {

























//        mLoginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(MainActivity.this, HomeActivity.class);
//
//                startActivity(intent);
//            }
//        });
//
//    }