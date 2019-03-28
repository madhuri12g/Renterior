package com.example.renterior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

    }

    public void onClick3(View view)
    {
        Intent a = new Intent(this, contact.class);
        startActivity(a);
    }

    public void onClick4(View view)
    {
        Intent a = new Intent(this, Main3Activity.class);
        startActivity(a);
    }
}
