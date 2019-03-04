package com.example.shaildesai.localdelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

public class Registration extends AppCompatActivity implements View.OnClickListener {
    private TextView email,user_name,first_name,last_name,phone_number,birth_year,password,confirm_password;
    private Spinner gender;
    private Button register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
        initViews();
        initObjects();
    }

    private void initViews() {
        email = findViewById(R.id.email);
        user_name = findViewById(R.id.username);
        first_name = findViewById(R.id.firstname);
        last_name = findViewById(R.id.lastname);
        phone_number = findViewById(R.id.phonenumber);
        birth_year = findViewById(R.id.birthyear);
        gender = findViewById(R.id.gender);
        password = findViewById(R.id.password);
        confirm_password = findViewById(R.id.confirmpassword);
        register = findViewById(R.id.register);

    }

    private void initObjects(){
        register.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.register:
                
                break;

        }


    }

    private void launcRegistration(){

    }

}
