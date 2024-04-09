package com.example.listviewexample;

import android.app.Activity;
import android.content.Context;
import android.inputmethodservice.Keyboard;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

public class MyListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] mainTitle;
    private final String[] descraiption;
    private final Integer[] images;

    public MyListAdapter(@NonNull Activity context1, String[] mainTitle, String[] descraiption, Integer[] images) {
        super(context1, R.layout.item_custom_layout, mainTitle);
        this.context = context1;
        this.mainTitle = mainTitle;
        this.descraiption = descraiption;
        this.images = images;
    }

    public View getView (int postion, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View Rowview = inflater.inflate(R.layout.item_custom_layout, null, true);

        TextView titleText = Rowview.findViewById(R.id.title);
        TextView subTitle = Rowview.findViewById(R.id.subtitle);
        ImageView imageView = Rowview.findViewById(R.id.icon);

        titleText.setText(mainTitle[postion]);
        subTitle.setText(descraiption[postion]);
        imageView.setImageResource(images[postion]);

        return Rowview;
    }

}
