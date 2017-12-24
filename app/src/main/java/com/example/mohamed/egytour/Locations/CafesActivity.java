package com.example.mohamed.egytour.Locations;

import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mohamed.egytour.CustomArrayAdapterContents.Contents;
import com.example.mohamed.egytour.CustomArrayAdapterContents.CustomArrayAdapter;
import com.example.mohamed.egytour.R;

import java.util.ArrayList;

public class CafesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.cafe);
        setContentView(R.layout.list_layout);

        

        ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents("1. El Fishawi ",
                R.string.elfishawy,R.drawable.elfishawy));

        contents.add(new Contents("2. Naguib Mahfouz Cafe ",
                R.string.naguibmahfouz,R.drawable.naguibmahfouz));

        contents.add(new Contents("3. Left Bank",
                R.string.leftbank,R.drawable.leftbank));

        contents.add(new Contents("4. Cake cafe",
                R.string.cakecafe,R.drawable.cakecafe));

        contents.add(new Contents("5. Beanos",
                R.string.beanos,R.drawable.beanos));



        ListView listView = (ListView) findViewById(R.id.list);


        CustomArrayAdapter adapter = new CustomArrayAdapter(this,contents);

        listView.setAdapter(adapter);

    }
}
