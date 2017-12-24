package com.example.mohamed.egytour.Locations;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.mohamed.egytour.CustomArrayAdapterContents.Contents;
import com.example.mohamed.egytour.CustomArrayAdapterContents.CustomArrayAdapter;
import com.example.mohamed.egytour.R;

import java.util.ArrayList;

public class MonumentsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(R.string.monuments);

        setContentView(R.layout.list_layout);

        ArrayList<Contents> contents = new ArrayList<Contents>();

        contents.add(new Contents("1. Pyramids of Giza",
                R.string.PyramidsofGiza,R.drawable.gizanecropolis));

        contents.add(new Contents("2. Karnak",
                R.string.Karnak,R.drawable.karnak));

        contents.add(new Contents("3. Abu Simbel",
                R.string.AbuSimbel,R.drawable.abusimbel));

        contents.add(new Contents("4. Valley of the Kings",
                R.string.ValleyoftheKings,R.drawable.valleyofthekings));

        contents.add(new Contents("5. Red Pyramid",
                R.string.RedPyramid,R.drawable.redpyramid));

        contents.add(new Contents("6. Great Sphinx",
                R.string.GreatSphinx,R.drawable.greatsphinx));

        contents.add(new Contents("7. Luxor Temple",
                R.string.LuxorTemple,R.drawable.luxortemple));


        contents.add(new Contents("8. Step Pyramid of Djoser",
                R.string.StepPyramidofDjoser,R.drawable.steppyramidofdjoser));


        contents.add(new Contents("9. Bent Pyramid",
                R.string.BentPyramid,R.drawable.bentpyramid));

        contents.add(new Contents("10. Temple of Hatshepsut",
                R.string.TempleofHatshepsut,R.drawable.templeofhatshepsut));

        ListView listView = (ListView) findViewById(R.id.list);


        CustomArrayAdapter adapter = new CustomArrayAdapter(this,contents);

        listView.setAdapter(adapter);
    }
}
