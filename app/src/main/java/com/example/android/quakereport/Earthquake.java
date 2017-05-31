package com.example.android.quakereport;
import java.util.Date;



public class Earthquake {

    private String mLocation;
    private Double mMagnitude;
    private Date  mDate;

    public Earthquake(String eLocation, Double eMagnitude, Date eDate)
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
    public Double getMagnitude() {
        return mMagnitude;
    }

    /**
     * Get the date
     */
    public Date getDate() {
        return mDate;
    }
}
