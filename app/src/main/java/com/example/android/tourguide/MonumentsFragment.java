package com.example.android.tourguide;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


public class MonumentsFragment extends Fragment {


    public MonumentsFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        ArrayList<Place> places = new ArrayList<Place>();

        places.add(new Place(getString(R.string.monument_to_empress_catherine_ii),
                R.drawable.monument_to_empress_catherine_ii));
        places.add(new Place(getString(R.string.monument_to_shurik_and_lidochka),
                R.drawable.monument_to_shurik_and_lidochka));
        places.add(new Place(getString(R.string.monument_to_the_purse),
                R.drawable.monument_to_the_purse));
        places.add(new Place(getString(R.string.monument_sobachkina_stolica),
                R.drawable.monument_sobachkina_stolica));
        places.add(new Place(getString(R.string.monument_to_man_the_creator),
                R.drawable.monument_to_man_the_creator));
        places.add(new Place(getString(R.string.monument_to_suvorov), R.drawable.monument_to_suvorov));
        places.add(new Place(getString(R.string.monument_of_st_catherine_the_great_martyr),
                R.drawable.monument_of_st_catherine_the_great_martyr));
        places.add(new Place(getString(R.string.monument_to_the_cossacks),
                R.drawable.monument_to_the_cossacks));
        places.add(new Place(getString(R.string.generation_connection),
                R.drawable.generation_connection));

        View rootView = inflater.inflate(R.layout.places_list, container, false);

        PlaceAdapter placeAdapter = new PlaceAdapter(getActivity(), places);

        ListView listView = rootView.findViewById(R.id.list);
        listView.setAdapter(placeAdapter);

        return rootView;
    }
}
