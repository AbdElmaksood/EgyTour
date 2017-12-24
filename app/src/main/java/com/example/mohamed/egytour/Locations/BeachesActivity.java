package com.example.mohamed.egytour.Locations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ListView;
import android.widget.TextView;

import com.example.mohamed.egytour.CustomArrayAdapterContents.Contents;
import com.example.mohamed.egytour.CustomArrayAdapterContents.CustomArrayAdapter;
import com.example.mohamed.egytour.R;

import java.util.ArrayList;

public class BeachesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.beaches);
        setContentView(R.layout.list_layout);


         ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents("1. Gouna",
                R.string.gouna,R.drawable.gouna));

        contents.add(new Contents("2. Taba",
                R.string.taba,R.drawable.taba));

        contents.add(new Contents("3. Marsa Allam",
                R.string.marsaallam,R.drawable.marsaalam));

        contents.add(new Contents("4. Ras Shitan",
                R.string.rasshitan,R.drawable.rasshetan));

        contents.add(new Contents("5. Sahl Hasheesh",
                R.string.sahlhashish,R.drawable.sahlhaseeshs));

        contents.add(new Contents("6. Marsa Matrouh",
                R.string.marsamatroh,R.drawable.marsamatrouh));

        contents.add(new Contents("7. Ain Al Sokhna",
                R.string.elsokhna,R.drawable.elsokhna));



        ListView listView = (ListView) findViewById(R.id.list);


        CustomArrayAdapter adapter = new CustomArrayAdapter(this,contents);

       listView.setAdapter(adapter);
    }

}
