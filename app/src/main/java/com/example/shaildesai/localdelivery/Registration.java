package com.example.shaildesai.localdelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.json.JSONException;
import org.json.JSONObject;

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


    private void executeGetpub() throws JSONException {

        requestQueue = Volley.newRequestQueue(this);

        String executeGetpub_url = "https://ptsv2.com/t/dh09i-1551809020/post";




        // Initialize a new JsonObjectRequest instance
        JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.GET, executeGetpub_url,doInBackground() , new Response.Listener<JSONObject>() {
            @Override
            public void onResponse(JSONObject response) {
                try {
                    response.getString("status");
                    Log.i("Here is the response",String.valueOf(response.getString("status")));
                    finish();
                } catch (JSONException e1) {
                    e1.printStackTrace();
                }
            }


        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                // Do something when error occurred

                Log.i("error in getpub ", String.valueOf(error));

            }
            // Add JsonObjectRequest to the RequestQueue

        });
        requestQueue.add(jsonObjectRequest);
    }


}
