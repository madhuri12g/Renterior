package com.example.renterior;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.Spinner;

public class Main3Activity extends AppCompatActivity
{

    public static final String MyPREFERENCES = "MyPrefs" ;
    public static final String Days1 = "daysKey";
    public static final String Date1 = "dateKey";
    SharedPreferences sharedpreferences;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        sharedpreferences = getSharedPreferences(MyPREFERENCES, Context.MODE_PRIVATE);


        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.days, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);

        Spinner spinner1 = (Spinner) findViewById(R.id._dynamic);
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
                R.array.occasion, android.R.layout.simple_spinner_item);
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner1.setAdapter(adapter1);




    }

    public void onclick3(View v) {
        Button b = (Button) findViewById(R.id.button2);
        Spinner spinner1 = (Spinner) findViewById(R.id._dynamic);
        Spinner spinner2=(Spinner) findViewById(R.id.planets_spinner);
        CalendarView cal= (CalendarView) findViewById(R.id.calendarView2);
        long x=cal.getDate();
        String date=Long.toString(x);


        String text = spinner1.getSelectedItem().toString();
        String days= spinner2.getSelectedItem().toString();

        SharedPreferences.Editor editor = sharedpreferences.edit();

        editor.putString(Days1, days);
        editor.putString(Date1, date);
        editor.apply();


        Intent intent = new Intent("com.example.renterior.Main5Activity");
        intent.putExtra("event",text);
        intent.putExtra("date",date);
        intent.putExtra("day",days);
        startActivity(intent);
    }
}

