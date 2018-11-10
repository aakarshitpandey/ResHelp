package com.test1.avarokin.paltable;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void btnSignUp(View view){

        startActivity(new Intent(this, SignUp.class));

    }

    public void btnSignIn(View view){

        startActivity(new Intent(this, InApp.class));

    }

}
