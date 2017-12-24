package com.example.mohamed.egytour.CustomArrayAdapterContents;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mohamed.egytour.R;

import java.util.ArrayList;

/**
 * Created by mohamed on 11/23/2017.
 */

public class CustomArrayAdapter extends ArrayAdapter<Contents> {

    public CustomArrayAdapter(Context context, ArrayList<Contents> contents) {
        super(context, 0, contents);

    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

// Check if the existing view is being reused
        View listItemView = convertView;
        // if there is no view ro reuse, inflate (create) one from the List_item.xml layout
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);

        }

        // Get the {Contents.java} object's at the correct position in the list (0,1,2,..)
        final Contents currentview = getItem(position);

        TextView address = (TextView) listItemView.findViewById(R.id.address);
        if (currentview.getAddressResult()) {
            // to show the image
            address.setText(currentview.getAddress());

        } else {
// to hide the address
            address.setVisibility(View.GONE);
        }


        TextView phonenumber = (TextView) listItemView.findViewById(R.id.phonenumber);
        if(currentview.getPhoneNumberResault()){
            phonenumber.setText(currentview.getPhoneNumber());

        }else {

            phonenumber.setVisibility(View.GONE);

        }

        TextView description = (TextView) listItemView.findViewById(R.id.description);
        description.setText(currentview.getDescription());

        TextView location = (TextView) listItemView.findViewById(R.id.location);
        location.setText(currentview.getLocation());

        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentview.getImage());


        // Return the whole list item layout (containing 2 TextViews and an ImageView)
        // so that it can be shown in the ListView
        return listItemView;
    }
}