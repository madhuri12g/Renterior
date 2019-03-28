package com.example.renterior;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        String a = getIntent().getStringExtra("occasion");
        String b = getIntent().getStringExtra("position");
        ImageView iv = (ImageView) findViewById(R.id.iv);
        TextView name = (TextView) findViewById(R.id.item);
        TextView cost = (TextView) findViewById(R.id.cost);
        TextView type = (TextView) findViewById(R.id.type);
        TextView color = (TextView) findViewById(R.id.c);
        TextView itemid = (TextView) findViewById(R.id.itemid);
        TextView dimension = (TextView) findViewById(R.id.d);

        Spinner spinner = (Spinner) findViewById(R.id.planets_spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.quantity, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);


        if (a.equals("Birthday Celebration")) {
            switch (b) {
                case "1":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday1));
                    name.setText("Helium Balloons Decor");
                    cost.setText("699");
                    type.setText("Helium Balloons");
                    color.setText("Multicolor");
                    itemid.setText("57080");
                    dimension.setText("100x100");

                    break;

                case "2":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday2));
                    name.setText("Ice-cream Cones Decor");
                    cost.setText("899");
                    type.setText("Ice-Cream Cones");
                    color.setText("Multicolor");
                    itemid.setText("57081");
                    dimension.setText("170x90");
                    break;

                case "3":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday3));
                    name.setText("Transparent Balloons with Glitter Decor");
                    cost.setText("1099");
                    type.setText("Helium Balloons");
                    color.setText("Multicolor");
                    itemid.setText("57082");
                    dimension.setText("100x100");

                    break;

                case "4":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday4));
                    name.setText("Colorful Streamers Decor");
                    cost.setText("599");
                    type.setText("Paper Streamers");
                    color.setText("Multicolor");
                    itemid.setText("57083");
                    dimension.setText("100x100");
                    break;

                case "5":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday5));
                    name.setText("Pink Lawn Chairs");
                    cost.setText("1299");
                    type.setText("Wooden Lawn chairs ");
                    color.setText("Pink color");
                    itemid.setText("57084");
                    dimension.setText("1800x1000");
                    break;

                case "6":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday6));
                    name.setText("Neon Seats Furniture");
                    cost.setText("999");
                    type.setText("Upholstery");
                    color.setText("Neon color");
                    itemid.setText("57085");
                    dimension.setText("1800x1000");
                    break;


                case "7":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday7));
                    name.setText("Faux Grass Sofa");
                    cost.setText("799");
                    type.setText("Sofa");
                    color.setText("Green color");
                    itemid.setText("57086");
                    dimension.setText("100x100");
                    break;

                case "8":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday8));
                    name.setText("Elegant Birthday Furniture");
                    cost.setText("1199");
                    type.setText("Furniture");
                    color.setText(" Wood color");
                    itemid.setText("57087");
                    dimension.setText("1090x1078");
                    break;


                case "9":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday9));
                    name.setText("Science Themed Furniture");
                    cost.setText("699");
                    type.setText("Set of Furniture");
                    color.setText("Multicolor");
                    itemid.setText("57088");
                    dimension.setText("1008x1090");
                    break;


                case "10":
                    iv.setImageDrawable(getResources().getDrawable(R.drawable.birthday10));
                    name.setText("Space Themed Decor");
                    cost.setText("1099");
                    type.setText("Set of Furniture");
                    color.setText("Multicolor");
                    itemid.setText("57089");
                    dimension.setText("1000x1700");
                    break;
            }
        }


        if (a.equals("Corporate Event")) {
            switch (b) {
                case "1":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.aa));
                    name.setText("Monotone Vases Decor");
                    cost.setText("899");
                    type.setText("Wooden Vases");
                    color.setText("Multicolor");
                    itemid.setText("57090");
                    dimension.setText("100x100");
                    break;

                case "2":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.bb));
                    name.setText("Gray Elegant Furniture");
                    cost.setText("899");
                    type.setText("Upholstery");
                    color.setText("Gray color");
                    itemid.setText("57091");
                    dimension.setText("1080x1090");
                    break;

                case "3":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.cc));
                    name.setText("Black Leather Sofas");
                    cost.setText("1099");
                    type.setText("Leather Sofa");
                    color.setText("Black color");
                    itemid.setText("57092");
                    dimension.setText("800x700");
                    break;

                case "4":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.dd));
                    name.setText("Teak Wood Desks");
                    cost.setText("599");
                    type.setText("Desks");
                    color.setText("Wood color");
                    itemid.setText("57093");
                    dimension.setText("1080x1090");
                    break;

                case "5":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.ee));
                    name.setText("Historical Chinese Vase");
                    cost.setText("1299");
                    type.setText("Glass Vase");
                    color.setText("Multicolor");
                    itemid.setText("57094");
                    dimension.setText("50x109");
                    break;

                case "6":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.ff));
                    name.setText("Hourglass Shaped Tables");
                    cost.setText("999");
                    type.setText("Tables");
                    color.setText("Wood color");
                    itemid.setText("57095");
                    dimension.setText("1800x700");
                    break;


                case "7":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.gg));
                    name.setText("White Round Lanterns");
                    cost.setText("799");
                    type.setText("Round Lanterns");
                    color.setText(" white color");
                    itemid.setText("57096");
                    dimension.setText("1070x800");
                    break;

                case "8":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.hh));
                    name.setText("Elegant White Decor");
                    cost.setText("1199");
                    type.setText("White Decor");
                    color.setText("White color");
                    itemid.setText("57097");
                    dimension.setText("180x800");
                    break;


                case "9":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.ii));
                    name.setText("Black and Red Sofa");
                    cost.setText("699");
                    type.setText("Sofa");
                    color.setText("Black and Red");
                    itemid.setText("57098");
                    dimension.setText("890x6000");
                    break;


                case "10":

                    iv.setImageDrawable(getResources().getDrawable(R.drawable.jj));
                    name.setText("Corporate Fence Decor");
                    cost.setText("1099");
                    type.setText("Fencing");
                    color.setText("Multicolor");
                    itemid.setText("57099");
                    dimension.setText("2000x50");
                    break;
            }
        }
    }
        public void onClick(View v)
    {
        TextView c=(TextView) findViewById(R.id.cost);
        TextView i=(TextView) findViewById(R.id.item);
        TextView p=(TextView) findViewById(R.id.pin);
        Spinner q=(Spinner) findViewById(R.id.planets_spinner);


        String  cost=c.getText().toString();
        String item=i.getText().toString();
        String pincode=p.getText().toString();
        String quantity=q.getSelectedItem().toString();


        Intent a;
              a = new Intent(this, Main7Activity.class);
        a.putExtra("cost", cost);
        a.putExtra("item",item);
        a.putExtra("pincode", pincode);
        a.putExtra("quantity", quantity);
        startActivity(a);

    }
}
