package com.example.listviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    String[] title = {
            "Master Android Pro App",
            "Master Flutter App",
            "Master Android App",
            "Youtube Channel",
            "Rate Us"
    };
    String[] descraption = {
            "Learn Android App development from zero to hero",
            "Learn Flutter from scratch",
            "Helping more than 780,000 Developers to learn android",
            "AndroidMasterApp is our official channel",
            "Keep us making new tutorials, Rate us 5 stars on Udemy"
    };

    Integer[] imgs = {
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background,
            R.drawable.ic_launcher_foreground,
            R.drawable.ic_launcher_background,
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter = new MyListAdapter(
                this,
                title,
                descraption,
                imgs
        );

        listView = findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                for (int i = 0; i < 1000000; i++) {
                    if (position == i){
                        Toast.makeText(MainActivity.this, "Item "+(i+1)+" Selected", Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}