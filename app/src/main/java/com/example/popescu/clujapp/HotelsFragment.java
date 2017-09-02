package com.example.popescu.clujapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by POPESCU on 9/2/2017.
 */

public class HotelsFragment extends Fragment {

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.places_list, container, false);
        final ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(R.string.hotelcamino, R.string.hotelcamino_desc, 20, 30948, R.drawable.hotelcamino));
        places.add(new Place(R.string.grandhotelnapoca, R.string.grandhotelnapoca_desc, 5, 170984, R.drawable.grandhotelnapoca));
        places.add(new Place(R.string.westcityhotel, R.string.westcityhotel_desc, 10, 21433, R.drawable.westcityhotel));

        PlaceAdapter itemsAdapter = new PlaceAdapter(getActivity(), places);

        final ListView listView = (ListView) rootView.findViewById(R.id.places_list);

        listView.setAdapter(itemsAdapter);


        return rootView;
    }
}