package com.example.fragapp;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Arrays;

public class fragment2 extends ListFragment {

    String[] AndroidApps = new String[] {
      "Master Android App",
      "Master Android Pro App",
      "Master Flutter",
      "Master Kotlin",
      "Subscribe to our channel",
      "Rate our app 5 stars"
    };

    String[] Descriptions = new String[] {
      "Over 900,00 users with 4.7 rating",
      "Support us by buying this app with 0.99",
      "Learn Flutter from zero by this app(4.8 rating)",
      "Learn Kotlin from zero to hero",
      "Get tutorials & source code AndroidMasterApp Channel",
      "rate Master Android App 5 stars on play store"
    };

    public fragment2() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_fragment2, container, false);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, AndroidApps);
        setListAdapter(adapter);
        return view;
    }

    @Override
    public void onListItemClick( ListView l,  View v, int position, long id) {
        assert getParentFragmentManager() != null;
        fragment1 txt = (fragment1)
                getParentFragmentManager().findFragmentById(R.id.fragment1);
        assert txt != null;
        txt.change(AndroidApps[position], "Version : " + Descriptions[position]);
        getListView().setSelector(android.R.color.holo_blue_dark);
    }
}