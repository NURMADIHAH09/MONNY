package com.example.monny;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logintonextpage(View view) {
        Intent intent = new Intent(MainActivity.this,loginpage.class);
        startActivity(intent);
    }

    public void signuptonextpage(View view) {
        Intent intent = new Intent(MainActivity.this,signuppage.class);
        startActivity(intent);
    }
}