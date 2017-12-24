package com.example.mohamed.egytour;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.mohamed.egytour.Locations.BeachesActivity;
import com.example.mohamed.egytour.Locations.CafesActivity;
import com.example.mohamed.egytour.Locations.MonumentsActivity;
import com.example.mohamed.egytour.Locations.RestaurantsActivity;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Choose From");
        setContentView(R.layout.activity_main2);

        Button restaurants = (Button) findViewById(R.id.restaurants_button);
        Button beaches = (Button) findViewById(R.id.beaches_button);
        Button monuments = (Button) findViewById(R.id.monuments_button);
        Button cafes = (Button) findViewById(R.id.cafes_button);

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantIntent = new Intent(MainActivity2.this, RestaurantsActivity.class);
                startActivity(restaurantIntent);

            }
        });

        beaches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent beachesIntent = new Intent(MainActivity2.this, BeachesActivity.class);
                startActivity(beachesIntent);
            }
        });

        monuments.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monumentsIntent = new Intent(MainActivity2.this, MonumentsActivity.class);
                startActivity(monumentsIntent);

            }
        });

        cafes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent cafesIntent = new Intent(MainActivity2.this, CafesActivity.class);
                startActivity(cafesIntent);

            }
        });

    }
}
