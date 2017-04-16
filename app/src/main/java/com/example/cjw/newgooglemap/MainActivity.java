package com.example.cjw.newgooglemap;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static AppCompatActivity mainActivity = null;
    public static TextView mLatitudeText = null;
    public static TextView mLongitudeText = null;
    public static TextView mLastUpdateTimeText = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mainActivity = this;

        mLatitudeText = (TextView) findViewById(R.id.mLatitudeText);
        mLongitudeText = (TextView) findViewById(R.id.mLongitudeText);
        mLastUpdateTimeText = (TextView) findViewById(R.id.mLastUpdateTimeText);

        // google map fragment setting
        Fragment googleMapFragment = new GoogleMapFragment();
        getSupportFragmentManager().beginTransaction().replace(R.id.container, googleMapFragment).commit();
    }
}
