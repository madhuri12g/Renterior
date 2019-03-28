package com.example.renterior;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class profile extends AppCompatActivity {
    private DatabaseReference myref;
    private FirebaseAuth auth;
    private FirebaseDatabase database;
    TextView myname,myemail;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        auth = FirebaseAuth.getInstance();
        FirebaseUser user = auth.getCurrentUser();
        final String userID = user.getUid();
        myref = FirebaseDatabase.getInstance().getReference();
        myname=(TextView) findViewById(R.id.nnn);
        myemail=(TextView) findViewById(R.id.eee);

        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {

                String name = dataSnapshot.child(userID).child("Users").child("Name").getValue(String.class);
                String number = dataSnapshot.child(userID).child("Users").child("Email").getValue(String.class);
                myname.setText(name);
                myemail.setText(number);
            }

            @Override
            public void onCancelled (@NonNull DatabaseError databaseError){
            }

        });
    }
}
