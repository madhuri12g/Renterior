package com.example.renterior;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;

import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    private EditText editTextEmail;
    private EditText editTextPassword;
    private EditText editTextName;
    String z;
    private FirebaseDatabase firebasedata;
    private FirebaseAuth auth;
    private FirebaseAuth.AuthStateListener mAuthListener;
    private DatabaseReference myref;
    private FirebaseUser inputEmail;
    private Button buttonSignUp;
    private ProgressDialog progressDialog;
    private FirebaseAuth firebaseAuth;
    String TAG;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);
        firebaseAuth = FirebaseAuth.getInstance();

        editTextEmail = (EditText) findViewById(R.id.editText4);
        editTextPassword = (EditText) findViewById(R.id.editText5);
        editTextName = (EditText) findViewById(R.id.editText3);

        /*FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference  = database.getReference();*/

        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.gender, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setPrompt("Gender");
        spinner.setAdapter(adapter);



        buttonSignUp = (Button)findViewById(R.id.button3);

        progressDialog = new ProgressDialog(this);
        buttonSignUp.setOnClickListener(this);

        auth = FirebaseAuth.getInstance();
        firebasedata = FirebaseDatabase.getInstance();
        myref = firebasedata.getReference();


        myref.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                // This method is called once with the initial value and again
                // whenever data at this location is updated.
/*
                String value = dataSnapshot.getValue(String.class);


*/
                Object value = dataSnapshot.getValue();
                Log.d(TAG, "Value is: " + value);
            }

            @Override
            public void onCancelled(DatabaseError error) {
                // Failed to read value
                Log.w(TAG, "Failed to read value.", error.toException());
            }
        });

    }
    public void registerUser(){


        final String email = editTextEmail.getText().toString().trim();
        String password  = editTextPassword.getText().toString().trim();


        if(TextUtils.isEmpty(email)){
            Toast.makeText(this,"Please enter email",Toast.LENGTH_LONG).show();
            return;
        }

        if(TextUtils.isEmpty(password)){
            Toast.makeText(this,"Please enter password",Toast.LENGTH_LONG).show();
            return;
        }



        progressDialog.setMessage("Registering Please Wait...");
        progressDialog.show();


        firebaseAuth.createUserWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if(task.isSuccessful()){

                            Toast.makeText(Main4Activity.this,"Successfully registered",Toast.LENGTH_LONG).show();
                            String name = editTextName.getText().toString();

                            if(!name.equals("")){

                                FirebaseUser user = auth.getCurrentUser();
                                String userID = user.getUid();
                                myref.child("user").child(userID).child("name").setValue(name);
                                editTextName.setText("");

                            }
                            if(!email.equals("")){

                                FirebaseUser user = auth.getCurrentUser();
                                String userID = user.getUid();
                                myref.child("user").child(userID).child("email").setValue(email);
                                editTextEmail.setText("");

                            }
                            z = "0";
                            Intent intent = new Intent(Main4Activity.this,Main2Activity.class);
                            intent.putExtra("value",z);
                            startActivity(intent);

                        }else{

                            Toast.makeText(Main4Activity.this,"Registration Error",Toast.LENGTH_LONG).show();
                        }
                        progressDialog.dismiss();
                    }
                });


    }

    @Override
    public void onClick(View view) {
        CheckBox ch=(CheckBox) findViewById(R.id.checkBox);
        if (ch.isChecked()) {
            registerUser();
        }

    }



    public void ONclick(View v)
    {
        LayoutInflater inflater = (LayoutInflater)
                getSystemService(LAYOUT_INFLATER_SERVICE);
        View popupView = inflater.inflate(R.layout.activity_terms, null);

        // create the popup window
        int width = LinearLayout.LayoutParams.WRAP_CONTENT;
        int height = LinearLayout.LayoutParams.WRAP_CONTENT;
        boolean focusable = true; // lets taps outside the popup also dismiss it
        final PopupWindow popupWindow = new PopupWindow(popupView, width, height, focusable);

        // show the popup window
        // which view you pass in doesn't matter, it is only used for the window tolken
        popupWindow.showAtLocation(v, Gravity.CENTER, 0, 0);

        // dismiss the popup window when touched
        popupView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                popupWindow.dismiss();
                return true;
            }
        });
    }
}