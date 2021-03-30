package com.example.android.tourguide;

public class Place {
    private String mPlaceName;
    private int mImageResourceID;

    public Place(String placeName, int imageResourceID) {
        mPlaceName = placeName;
        mImageResourceID = imageResourceID;
    }

    public String getPlaceName() {
        return mPlaceName;
    }

    public  int getImageResourceID() {
        return mImageResourceID;
    }
}
