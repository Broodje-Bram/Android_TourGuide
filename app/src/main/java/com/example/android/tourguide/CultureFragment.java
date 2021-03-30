package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class CultureFragment extends Fragment {


    public CultureFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.musical_theater), R.drawable.musical_theater));
        places.add(new Place(getString(R.string.organ_hall), R.drawable.organ_hall));
        places.add(new Place(getString(R.string.philharmonic_hall), R.drawable.philharmonic_hall));
        places.add(new Place(getString(R.string.central_concert_hall), R.drawable.central_concert_hall));
        places.add(new Place(getString(R.string.puppet_theater), R.drawable.puppet_theater));
        places.add(new Place(getString(R.string.central_exhibition_hall), R.drawable.central_exhibition_hall));
        places.add(new Place(getString(R.string.regional_art_museum), R.drawable.regional_art_museum));
        places.add(new Place(getString(R.string.state_historical_and_archaeological_museum_reserve),
                             R.drawable.state_historical_and_archaeological_museum_reserve));
        places.add(new Place(getString(R.string.pushkin_regional_universal_scientific_library),
                              R.drawable.pushkin_regional_universal_scientific_library));

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
