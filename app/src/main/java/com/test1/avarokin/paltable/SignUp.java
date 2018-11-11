package com.test1.avarokin.paltable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignUp extends AppCompatActivity {

    String[] majors = {"Computer Science", "CNIT", "Data Science", "Management","Mathematics"};
    String[] standings = {"Freshman", "Sophomore", "Junior", "Senior", "Graduate"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Spinner spin = findViewById(R.id.spinner);
        ArrayAdapter aa = new ArrayAdapter(this,android.R.layout.simple_spinner_item,majors);
        spin.setAdapter(aa);


        Spinner spin2 = findViewById(R.id.spinner2);
        ArrayAdapter aa2 = new ArrayAdapter(this,android.R.layout.simple_spinner_item,standings);
        spin.setAdapter(aa2);

    }


    public void crossButton(View view){

        startActivity(new Intent(this, MainActivity.class));

    }
}
