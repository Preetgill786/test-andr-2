package com.example.AndroidTest;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.Dharamtest.R;

public class LoginActivity extends AppCompatActivity {

    EditText et_usrName,et_passwd;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_usrName = findViewById(R.id.et_usrName);
        et_passwd = findViewById(R.id.et_passwd);
        btn_login = findViewById(R.id.btn_login);

        final Credentials credentials = new Credentials();
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if(et_usrName.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(LoginActivity.this, "Please Enter UserName ", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(et_passwd.getText().toString().equalsIgnoreCase("")){
                    Toast.makeText(LoginActivity.this, "Please Enter Password ", Toast.LENGTH_SHORT).show();
                    return;
                }

                if(!(et_usrName.getText().toString().equalsIgnoreCase(credentials.getUsewrname()))){
                    Toast.makeText(LoginActivity.this, "Invaild UserName Try Again! ", Toast.LENGTH_SHORT).show();
                    return;
                }
                if(!(et_passwd.getText().toString().equalsIgnoreCase(credentials.getPassword()))){
                    Toast.makeText(LoginActivity.this, "Invaild Password ", Toast.LENGTH_SHORT).show();
                    return;
                }
                Intent i = new Intent(LoginActivity.this,MainActivity.class);

                startActivity(i);
                finish();
            }
        });
    }
}
