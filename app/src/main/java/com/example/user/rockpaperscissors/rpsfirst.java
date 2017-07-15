package com.example.user.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class rpsfirst extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rpsfirst);
    }
    public void first(View view){
        Intent i=new Intent(rpsfirst.this,rpssecond.class);
        startActivity(i);
    }
}
