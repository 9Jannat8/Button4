package com.example.button4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private Button loginButton, logoutButton;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loginButton = findViewById(R.id.loginid);
        logoutButton = findViewById(R.id.logoutid);
        textView = findViewById(R.id.textviewid);

    }

    public void showMessage (View v){
        if(v.getId() == R.id.loginid) {
            textView.setText("login");
        } else if(v.getId() == R.id.logoutid){
            textView.setText("logout");
        }
    }

}