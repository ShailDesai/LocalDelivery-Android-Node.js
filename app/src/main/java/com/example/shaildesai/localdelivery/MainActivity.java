package com.example.shaildesai.localdelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button deliver,sender,reciever,registration,login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initViews();
        initObjects();
    }

    private void initViews() {
        deliver = findViewById(R.id.deliver);
        sender = findViewById(R.id.sender);
        reciever = findViewById(R.id.reciever);
        registration = findViewById(R.id.registration);
        login = findViewById(R.id.login);
    }

    private void initObjects(){
        deliver.setOnClickListener(this);
        sender.setOnClickListener(this);
        reciever.setOnClickListener(this);
        registration.setOnClickListener(this);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.deliver:
                break;
            case R.id.sender:
               break;
            case R.id.reciever:
                break;
            case R.id.registration:
                break;
            case R.id.login:
                break;
        }

    }

    private void launchDeliver(){

    }

    private void launchSender(){

    }
    private void launcReciever(){

    }
    private void launchLogin(){

    }
    private void launchReigstration(){
        Intent intent = new Intent(this,Registration.class);
        startActivity(intent);

    }
}
