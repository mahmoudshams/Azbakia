package com.example.it_4.azbakia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public void exch(View view){
        Intent i=new Intent(this,Login.class);
        startActivity(i);
    }
    public void sale(View view){
        Intent i=new Intent(this,Sale.class);
        startActivity(i);
    }
}
