package com.alarm;

import android.view.LayoutInflater;
import android.view.ViewGroup; // Import ViewGroup

import com.skydoves.elasticviews.ElasticButton;

public class ActivityMainBinding {
    public ElasticButton.Builder selectTime;
    public ElasticButton.Builder setAlarm;
    public ElasticButton.Builder cancelAlarm;

    public static ActivityMainBinding inflate(LayoutInflater layoutInflater, ViewGroup root, boolean b) {
        // Inflate the layout and return the binding
        // You can use the provided root as the parent view
        // (or pass null if you don't want to attach it immediately)
        // Example: return ActivityMainBinding.inflate(layoutInflater, root, false);
        // ...
        return null; // Replace with the actual binding
    }

    public int getRoot() {
        // Return the root view if needed
        // Example: return rootView.getId();
        return 0; // Replace with the actual root view ID
    }
}
