package com.example.android.quakereport;

public class List {
    //variable for magnitude
    private double mMagnitude;

    //variable for place
    private String mPlace;

    //variable for date
    private long mDate;

    //variable for url
    private String mUrl;

    //create List object to take values of variables
    public List(double magnitude, String place, long date,String url){
        mMagnitude = magnitude;
        mPlace = place;
        mDate = date;
        mUrl = url;
    }

    //define getter methods

    //get magnitude
    public double getmMagnitude() {
        return mMagnitude;
    }

    //get place
    public String getmPlace() {
        return mPlace;
    }

    //get date
    public long getmDate() {
        return mDate;
    }

    //get url
    public String getmUrl(){ return mUrl; }
}
