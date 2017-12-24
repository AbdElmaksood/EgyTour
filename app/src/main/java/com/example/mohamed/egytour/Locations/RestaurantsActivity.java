package com.example.mohamed.egytour.Locations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mohamed.egytour.CustomArrayAdapterContents.Contents;
import com.example.mohamed.egytour.CustomArrayAdapterContents.CustomArrayAdapter;
import com.example.mohamed.egytour.R;

import java.util.ArrayList;

public class RestaurantsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.restaurants);

        setContentView(R.layout.list_layout);

        setContentView(R.layout.list_layout);

        ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents("1. Zitouni",
                R.string.zitounidesc,R.drawable.zitouni,R.string.zitouni,R.string.zitouniphone));

        contents.add(new Contents("2. Le Pacha 1901",
                R.string.lepachadesc,R.drawable.lepacha,R.string.lepacha,R.string.lepachaphone));

        contents.add(new Contents("3. Sequoia",
                R.string.seqouiadesc,R.drawable.seqouia,R.string.seqouia,R.string.seqouiaphone));

        contents.add(new Contents("4. SACHI Restaurant",
                R.string.sachidesc,R.drawable.sachi,R.string.sachi,R.string.sachphone));

        contents.add(new Contents("5. Studio Masr",
                R.string.studiomasrdesc,R.drawable.studiomasr,R.string.studiomasr,R.string.studiomasrPhone));

        contents.add(new Contents("6. Rosini",
                R.string.rosinidesc,R.drawable.rosini,R.string.rosini,R.string.rosiniphone));

        ListView listView = (ListView) findViewById(R.id.list);


        CustomArrayAdapter adapter = new CustomArrayAdapter(this,contents);

        listView.setAdapter(adapter);

    }
}
