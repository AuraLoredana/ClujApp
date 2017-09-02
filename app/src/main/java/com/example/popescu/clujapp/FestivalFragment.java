package com.example.popescu.clujapp;

import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by POPESCU on 9/1/2017.
 */

public class  FestivalFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);

        final ArrayList<Place> bars = new ArrayList<>();
        bars.add(new Place(R.string.electric_castle, R.string.electric_desc, 12, 30948, R.drawable.electriccastle));
        bars.add(new Place(R.string.untold, R.string.untold_desc, 9, 170984, R.drawable.untold));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), bars);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                /*
                *
                * //TODO: Call related methods e.g
                * Start Intent to DetailsPage (contains details,Booking redirection)
                * depending on Item clicked
                * Place selectedBar = (Place) parent.getItemAtPosition(position);
                * callBooking(selectedBar);
                */
            }
        });


        return rootView;
    }
}