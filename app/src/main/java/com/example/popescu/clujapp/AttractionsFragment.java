package com.example.popescu.clujapp;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by POPESCU on 9/1/2017.
 */

public class AttractionsFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.banffy, R.string.banffy_desc, 20, 30948, R.drawable.banffy));
        places.add(new Place(R.string.ethnography_museum, R.string.ethnography_museum_desc, 5, 170984, R.drawable.ethnographicmuseumoftransylvania));
        places.add(new Place(R.string.dormition, R.string.dormition_desc, 10, 21433, R.drawable.dormitionofthetheotokos));
        places.add(new Place(R.string.matthias, R.string.matthias_desc, 2, 84732, R.drawable.matthiasorvinus));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}