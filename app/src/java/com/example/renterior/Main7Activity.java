package com.example.renterior;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toolbar;

import static com.example.renterior.Main3Activity.MyPREFERENCES;

public class Main7Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);



        String date = getIntent().getStringExtra("date");
        String days = getIntent().getStringExtra("days");
        String item = getIntent().getStringExtra("item");
        String cost = getIntent().getStringExtra("cost");
        String pincode = getIntent().getStringExtra("pincode");
        String quantity = getIntent().getStringExtra("quantity");

        TextView t_day=(TextView) findViewById(R.id.t_day);
        t_day.setText("Three");
        TextView t_date=(TextView) findViewById(R.id.t_date);
        t_date.setText("01/04/19");


        TextView t_item=(TextView) findViewById(R.id.t_item);
        t_item.setText(item);
        TextView t_quan=(TextView) findViewById(R.id.t_quan);
        t_quan.setText(quantity);
        TextView t_pin=(TextView) findViewById(R.id.t_pin);
        t_pin.setText(pincode);
        TextView t_cost=(TextView) findViewById(R.id.t_cost);
        t_cost.setText(cost);


        int c=0;
        c = Integer.parseInt(t_cost.getText().toString());
        int q=0;
        q = Integer.parseInt(t_quan.getText().toString());
        int cq=c*q;
        String c_q=String.valueOf(cq);
        TextView t_q=(TextView) findViewById(R.id.t_q);
        t_q.setText(c_q);

        int ctax=(9*cq)/100;
        int stax=ctax;
        int sd=200;
        int tot1;
        int ship;
        int tot=cq+sd+stax+ctax;

        if(tot>1000)
        {
            ship=0;
            tot1=tot;
        }

        else
        {
            ship=500;
           tot1=tot+ship;
        }

        String tots=String.valueOf(tot1);
        TextView t_tot=(TextView) findViewById(R.id.c_tot);
        t_tot.setText(tots);

        String c_c=String.valueOf(ctax);
        TextView t_cgst=(TextView) findViewById(R.id.t_cgst);
        t_cgst.setText(c_c);
        TextView t_sgst=(TextView) findViewById(R.id.c_sgst);
        t_sgst.setText(c_c);
        TextView t_sd=(TextView) findViewById(R.id.c_sd);
        t_sd.setText("200");
        String shipp=String.valueOf(ship);
        TextView t_ship=(TextView) findViewById(R.id.c_ship);
        t_ship.setText(shipp);

    }

    public void onClick1(View view)
    {
        Intent a = new Intent(this, Main8Activity.class);
        startActivity(a);
    }
}
