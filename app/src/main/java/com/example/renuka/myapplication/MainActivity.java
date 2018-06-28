package com.example.renuka.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etEmail;
    EditText etPassword;
    Button btnLogin;
    TextView tvForgetYourPassword;







    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        etEmail=findViewById(R.id.et_email);
        etPassword=findViewById(R.id.et_password);
        btnLogin=findViewById(R.id.btn_login);
        tvForgetYourPassword=findViewById(R.id.tv_forgotpassword);


        final String email= etEmail.getText().toString().trim();
        final String password= etPassword.getText().toString().trim();
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.out.println("username" + email + "password=" + password);
                Toast.makeText(MainActivity.this, "username" + email + "password=" +password, Toast.LENGTH_SHORT).show();


            }
        });
    }
}
