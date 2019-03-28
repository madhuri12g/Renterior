package com.example.renterior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class contact extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);
    }

    public void onClick5(View view)
    {
        Toast.makeText(contact.this,"Sucessfully Submitted",Toast.LENGTH_SHORT).show();
    }
}
