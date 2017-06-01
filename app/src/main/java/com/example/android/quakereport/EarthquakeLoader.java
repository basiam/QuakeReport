package com.example.android.quakereport;

import android.content.AsyncTaskLoader;
import android.content.Context;
import android.util.Log;

import java.util.List;

public class EarthquakeLoader extends AsyncTaskLoader<List<Earthquake>> {
    private static final String LOG_TAG = EarthquakeLoader.class.getSimpleName();
    private String mUrl;


    public EarthquakeLoader(Context context, String url) {
        super(context);
        mUrl = url;
    }

    @Override
    protected void onStartLoading() {
        forceLoad();
    }

    @Override
    public List<Earthquake> loadInBackground() {
        if (mUrl == null) {
            return null;
        }
        // Extract relevant fields from the JSON response and create an {@link Event} object
        Log.d(LOG_TAG, mUrl);
        List<Earthquake> earthquakes = QueryUtils.extractEarthquakes(mUrl);

        // Return the {@link Earthquake} object as the result fo the {@link EarthquakeAsyncTask}
        return earthquakes;
    }
}