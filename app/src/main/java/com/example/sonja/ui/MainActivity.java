package com.example.sonja.ui;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button btn_logIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_logIn = (Button) findViewById(R.id.btn_login);
        btn_logIn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        //ruft Screen2 auf
        Intent intent = new Intent(this, Screen2.class);
        startActivity(intent);
        this.finish();
    }
}