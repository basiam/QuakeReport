package com.example.android.quakereport;



public class Earthquake {

    private String mLocation;
    private double mMagnitude;
    private long  mDate;
    private String mUrl;

    public Earthquake(String eLocation, double eMagnitude, long eDate, String eUrl)
    {
        mLocation = eLocation;
        mMagnitude = eMagnitude;
        mDate = eDate;
        mUrl = eUrl;
    }

    public String getLocation() {
        return mLocation;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public long getDate() {
        return mDate;
    }

    public String getUrl() {
        return mUrl;
    }

    @Override
    public String toString() {
        return mLocation;
    }
}
