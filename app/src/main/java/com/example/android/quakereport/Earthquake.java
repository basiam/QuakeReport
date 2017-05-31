package com.example.android.quakereport;
import java.util.Date;



public class Earthquake {

    private String mLocation;
    private double mMagnitude;
    private long  mDate;

    public Earthquake(String eLocation, double eMagnitude, long eDate)
    {
        mLocation = eLocation;
        mMagnitude = eMagnitude;
        mDate = eDate;
    }

    /**
     * Get the name of location
     */

    public String getLocation() {
        return mLocation;
    }

    /**
     * Get the magnitude
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the date
     */
    public long getDate() {
        return mDate;
    }
}
