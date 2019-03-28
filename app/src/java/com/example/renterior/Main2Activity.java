package com.example.renterior;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.AuthResult;
import com.google.android.gms.tasks.Task;


public class Main2Activity extends AppCompatActivity {
    public FirebaseAuth auth;
    private EditText inputEmail, inputPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        auth = FirebaseAuth.getInstance();


        Button b=(Button)findViewById(R.id.button);
        inputEmail=(EditText) findViewById(R.id.editText);
        inputPassword=(EditText) findViewById(R.id.editText2);

        auth = FirebaseAuth.getInstance();


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = inputEmail.getText().toString();
                final String password = inputPassword.getText().toString();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }


                //authenticate user
                auth.signInWithEmailAndPassword(email, password)
                        .addOnCompleteListener(Main2Activity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {

                                if (!task.isSuccessful()) {
                                    // there was an error
                                    if (password.length() < 6) {
                                        inputPassword.setError("MINIMUM PASSWORD LENGTH IS 6");
                                    } else {
                                        Toast.makeText(Main2Activity.this, "LOGIN FAILED. PLEASE CHECK EMAIL OR PASSWORD", Toast.LENGTH_LONG).show();
                                    }
                                } else {
                                    Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
                                    startActivity(intent);
                                    Toast.makeText(Main2Activity.this, "LOGIN SUCCESSFUL", Toast.LENGTH_LONG).show();

                                    finish();
                                }
                            }
                        });

            }
        });
    }



    public void onclick1(View v)
    {
        TextView tv=(TextView)findViewById(R.id.textView5);
        Intent intent = new Intent("com.example.renterior.Main4Activity");
        startActivity(intent);

    }
}

