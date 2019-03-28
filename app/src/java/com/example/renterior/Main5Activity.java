package com.example.renterior;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import android.support.v7.widget.Toolbar;
import android.widget.Toast;

public class Main5Activity extends AppCompatActivity implements  View.OnClickListener {

DrawerLayout dl;
ActionBarDrawerToggle toggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        ActionBar bar = getSupportActionBar();
        bar.setBackgroundDrawable(new ColorDrawable(Color.parseColor("#fbd4d2")));
        dl = (DrawerLayout)findViewById(R.id.activity_main5);
        toggle = new ActionBarDrawerToggle(this, dl, R.string.open, R.string.close);
        dl.addDrawerListener(toggle);
        toggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nv);

        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(MenuItem menuItem) {
                int id = menuItem.getItemId();
                switch (id) {
                    case R.id.ome:
                        Intent ome = new Intent(Main5Activity.this,Main3Activity.class);
                        startActivity(ome);
                        break;
                    case R.id.log:
                        Intent log = new Intent(Main5Activity.this,Main2Activity.class);
                        startActivity(log);
                        break;
                    case R.id.contact:
                        Intent con = new Intent(Main5Activity.this,contact.class);
                        startActivity(con);
                        break;
                    case R.id.about:
                        Intent ab = new Intent(Main5Activity.this,about.class);
                        startActivity(ab);

                        break;
                }
                return false;
            }
        });



        String a=getIntent().getStringExtra("event");

        CardView c1=(CardView) findViewById(R.id.c1);
        ImageView i1=(ImageView) findViewById(R.id.i1);
        TextView t1= (TextView) findViewById(R.id.t1);
        CardView c2=(CardView) findViewById(R.id.c2);
        ImageView i2=(ImageView) findViewById(R.id.i2);
        TextView t2= (TextView) findViewById(R.id.t2);
        CardView c3=(CardView) findViewById(R.id.c3);
        ImageView i3=(ImageView) findViewById(R.id.i3);
        TextView t3= (TextView) findViewById(R.id.t3);
        CardView c4=(CardView) findViewById(R.id.c4);
        ImageView i4=(ImageView) findViewById(R.id.i4);
        TextView t4= (TextView) findViewById(R.id.t4);
        CardView c5=(CardView) findViewById(R.id.c5);
        ImageView i5=(ImageView) findViewById(R.id.i5);
        TextView t5= (TextView) findViewById(R.id.t5);
        CardView c6=(CardView) findViewById(R.id.c6);
        ImageView i6=(ImageView) findViewById(R.id.i6);
        TextView t6= (TextView) findViewById(R.id.t6);
        CardView c7=(CardView) findViewById(R.id.c7);
        ImageView i7=(ImageView) findViewById(R.id.i7);
        TextView t7= (TextView) findViewById(R.id.t7);
        CardView c8=(CardView) findViewById(R.id.c8);
        ImageView i8=(ImageView) findViewById(R.id.i8);
        TextView t8= (TextView) findViewById(R.id.t8);
        CardView c9=(CardView) findViewById(R.id.c9);
        ImageView i9=(ImageView) findViewById(R.id.i9);
        TextView t9= (TextView) findViewById(R.id.t9);
        CardView c10=(CardView) findViewById(R.id.c10);
        ImageView i10=(ImageView) findViewById(R.id.i10);
        TextView t10= (TextView) findViewById(R.id.t10);

        c1.setOnClickListener(this);
        c2.setOnClickListener(this);
        c3.setOnClickListener(this);
        c4.setOnClickListener(this);
        c5.setOnClickListener(this);
        c6.setOnClickListener(this);
        c7.setOnClickListener(this);
        c8.setOnClickListener(this);
        c9.setOnClickListener(this);
        c10.setOnClickListener(this);




        if (a.equals("Birthday Celebration"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.birthday1));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.birthday2));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.birthday3));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.birthday4));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.birthday5));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.birthday6));
            t6.setText("₹999");
            i7.setImageDrawable(getResources().getDrawable(R.drawable.birthday7));
            t7.setText("₹799");
            i8.setImageDrawable(getResources().getDrawable(R.drawable.birthday8));
            t8.setText("₹1199");
            i9.setImageDrawable(getResources().getDrawable(R.drawable.birthday9));
            t9.setText("₹699");
            i10.setImageDrawable(getResources().getDrawable(R.drawable.birthday10));
            t10.setText("₹1099");

        }
         else if(a.equals("Christmas Special"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.a));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.b));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.c));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.d));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.e));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.f));
            t6.setText("₹999");
        }

        else if(a.equals("Cocktail Party"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.cocktail1));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.cocktail2));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.cocktail3));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.cocktail4));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.cocktail5));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.cocktail6));
            t6.setText("₹999");

        }

        else if(a.equals("Concert Show/Festival"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.concert1));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.concert2));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.concert3));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.concert4));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.concert5));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.concert6));
            t6.setText("₹999");

        }


        else if(a.equals("Corporate Event"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.aa));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.bb));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.cc));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.dd));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.ee));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.ff));
            t6.setText("₹999");
            i7.setImageDrawable(getResources().getDrawable(R.drawable.gg));
            t7.setText("₹799");
            i8.setImageDrawable(getResources().getDrawable(R.drawable.hh));
            t8.setText("₹1199");
            i9.setImageDrawable(getResources().getDrawable(R.drawable.ii));
            t9.setText("₹699");
            i10.setImageDrawable(getResources().getDrawable(R.drawable.jj));
            t10.setText("₹1099");
        }

        else if(a.equals("Diwali Special"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.d1));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.d2));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.d3));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.d4));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.d5));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.d6));
            t6.setText("₹999");

        }

        else if(a.equals("Garden Party"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.g1));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.g2));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.g3));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.g4));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.g5));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.g6));
            t6.setText("₹999");

        }

        else if(a.equals("Valentine\'s Day"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.valentines1));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.valentines2));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.valentines3));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.valentines4));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.valentines5));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.valentines6));
            t6.setText("₹999");

        }
        else if(a.equals("Wedding"))
        {
            i1.setImageDrawable(getResources().getDrawable(R.drawable.wedding1));
            t1.setText("₹699");
            i2.setImageDrawable(getResources().getDrawable(R.drawable.wedding2));
            t2.setText("₹899");
            i3.setImageDrawable(getResources().getDrawable(R.drawable.wedding3));
            t3.setText("₹1099");
            i4.setImageDrawable(getResources().getDrawable(R.drawable.wedding4));
            t4.setText("₹599");
            i5.setImageDrawable(getResources().getDrawable(R.drawable.wedding5));
            t5.setText("₹1299");
            i6.setImageDrawable(getResources().getDrawable(R.drawable.wedding6));
            t6.setText("₹999");

        }


    }


    @Override
    public void onClick(View v)
    {
        String x;
        Intent a;
        String event=getIntent().getStringExtra("event");


        if(event.equals("Birthday Celebration")) {
            switch (v.getId()) {
                case R.id.c1:
                    x = "1";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;


                case R.id.c2:
                    x = "2";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c3:
                    x = "3";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c4:
                    x = "4";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c5:
                    x = "5";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c6:
                    x = "6";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c7:
                    x = "7";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c8:
                    x = "8";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c9:
                    x = "9";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c10:
                    x = "10";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;
            }
        }

        else  if(event.equals("Corporate Event")) {
            switch (v.getId()) {
                case R.id.c1:
                    x = "1";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;


                case R.id.c2:
                    x = "2";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c3:
                    x = "3";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c4:
                    x = "4";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c5:
                    x = "5";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c6:
                    x = "6";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c7:
                    x = "7";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c8:
                    x = "8";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c9:
                    x = "9";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;

                case R.id.c10:
                    x = "10";
                    a = new Intent(this, Main6Activity.class);
                    a.putExtra("position", x);
                    a.putExtra("occasion",event);
                    startActivity(a);
                    break;
            }
        }
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        if(toggle.onOptionsItemSelected(item)) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}

