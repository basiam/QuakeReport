package com.example.android.quakereport;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {

    private static final String LOG_TAG = EarthquakeAdapter.class.getSimpleName();


    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> Earthquakes) {
        super(context, 0, Earthquakes);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        Earthquake currentEarthquake = getItem(position);

        TextView locationTextView = (TextView) listItemView.findViewById(R.id.location);
        locationTextView.setText(currentEarthquake.getLocation());

        TextView magnitudeTextView = (TextView) listItemView.findViewById(R.id.magnitude);
        magnitudeTextView.setText(currentEarthquake.getMagnitude().toString());

        TextView dateTextView = (TextView) listItemView.findViewById(R.id.date);
        dateTextView.setText(currentEarthquake.getDate().toString());

        return listItemView;
    }

}