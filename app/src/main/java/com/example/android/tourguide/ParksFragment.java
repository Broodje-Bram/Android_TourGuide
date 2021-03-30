package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class ParksFragment extends Fragment {


    public ParksFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.gorky_park), R.drawable.gorky_park));
        places.add(new Place(getString(R.string.chistiakovskaya_grove), R.drawable.chistiakovskaya_grove));
        places.add(new Place(getString(R.string.catherine_square), R.drawable.catherine_square));
        places.add(new Place(getString(R.string.square_of_friendship_of_peoples),
                             R.drawable.square_of_friendship_of_peoples));
        places.add(new Place(getString(R.string.sunny_island), R.drawable.sunny_island));
        places.add(new Place(getString(R.string.park_krasnodar), R.drawable.park_krasnodar));
        places.add(new Place(getString(R.string.botanical_garden), R.drawable.botanical_garden));
        places.add(new Place(getString(R.string.seafront), R.drawable.seafront));

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
