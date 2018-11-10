package com.test1.avarokin.paltable;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InApp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_in_app);
    }

    public void btnMenuScreen(View view){

        startActivity(new Intent(this, MenuScreen.class));


    }
}
