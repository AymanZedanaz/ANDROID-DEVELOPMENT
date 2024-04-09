package com.example.adapterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.main_lv_main);


        // Setup the data source
        ArrayList<Item> itemsArrayList = new ArrayList<>(); // calls function to get items list

        itemsArrayList.add(new Item("Ayman","Zedan"));
        itemsArrayList.add(new Item("Eman","Aljaour"));
        itemsArrayList.add(new Item("Mohamed","Zedan"));
        itemsArrayList.add(new Item("Nour","Ali"));
        itemsArrayList.add(new Item("Zena","Morad"));
        itemsArrayList.add(new Item("Malik","Essa"));
        itemsArrayList.add(new Item("Rama","Mohamed"));
        itemsArrayList.add(new Item("Ali","Ali"));
        itemsArrayList.add(new Item("Keo","Abas"));
        itemsArrayList.add(new Item("Shahed","Zedan"));

        // instantiate the custom list adapter
        CustomListAdapter adapter = new CustomListAdapter(this, itemsArrayList);

        // get the ListView and attach the adapter
        lv.setAdapter(adapter);

    }
}