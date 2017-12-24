package com.example.mohamed.egytour.CustomArrayAdapterContents;

/**
 * Created by mohamed on 11/23/2017.
 */

public class Contents {

    private String mdescription;
    private int mLocation;
    private int mimage;

    private int mphoneNumber = mnoPhoneNumber;
    private static final int mnoPhoneNumber = -1;

    private int maddress = mnoAddressFound;
    private static final int mnoAddressFound = -1;

    public Contents(String description, int location, int image, int address, int phoneNumber) {

        maddress = address;
        mdescription = description;
        mLocation = location;
        mimage = image;
        mphoneNumber = phoneNumber;
    }


    public Contents(String description, int location, int image) {

        mdescription = description;
        mLocation = location;
        mimage = image;

    }

    public boolean getAddressResult() {
// this should return true in case of there is an address
        return maddress != mnoAddressFound;

    }

    public boolean getPhoneNumberResault(){

        return mphoneNumber != mnoPhoneNumber;

    }

    public String getDescription() {

        return mdescription;

    }

    public int getLocation() {

        return mLocation;
    }

    public int getImage() {

        return mimage;
    }

    public int getAddress() {

        return maddress;
    }

    public int getPhoneNumber(){

        return mphoneNumber;
    }

}
