package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class ShoppingFragment extends Fragment {


    public ShoppingFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.oz_mall), R.drawable.oz_mall));
        places.add(new Place(getString(R.string.sbs_megamall), R.drawable.sbs_megamall));
        places.add(new Place(getString(R.string.gallery_krasnodar), R.drawable.gallery_krasnodar));
        places.add(new Place(getString(R.string.krasnaya_ploshchad), R.drawable.krasnaya_ploshchad));
        places.add(new Place(getString(R.string.mega), R.drawable.mega));
        places.add(new Place(getString(R.string.galaktika), R.drawable.galaktika));
        places.add(new Place(getString(R.string.karnaval), R.drawable.karnaval));
        places.add(new Place(getString(R.string.crystal), R.drawable.crystal));
        places.add(new Place(getString(R.string.city_center), R.drawable.city_center));

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
