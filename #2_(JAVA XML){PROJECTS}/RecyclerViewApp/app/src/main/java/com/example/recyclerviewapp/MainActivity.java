package com.example.recyclerviewapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;
    List<Movie> movieList = new ArrayList<>();
    MyAdapter myAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);

        myAdapter = new MyAdapter(movieList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setItemAnimator(new DefaultItemAnimator());

        recyclerView.setAdapter(myAdapter);

        InsertData();

    }

    @SuppressLint("NotifyDataSetChanged")
    private void InsertData() {
        Movie movie = new Movie("Fast & Furious 1", "Action", "2000");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 2", "Action", "2003");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 3", "Action", "2005");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 4", "Action", "2007");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 5", "Action", "2009");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 6", "Action", "2011");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 7", "Action", "2013");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 8", "Action", "2015");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 9", "Action", "2017");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 10", "Action", "2019");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 11", "Action", "2021");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 12", "Action", "2023");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 13", "Action", "2024");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 14", "Action", "2025");
        movieList.add(movie);
        movie = new Movie("Fast & Furious 15", "Action", "2026");
        movieList.add(movie);
        movie = new Movie("Fast & Furious 16", "Action", "2027");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 17", "Action", "2028");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 18", "Action", "2029");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 19", "Action", "2030");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 20", "Action", "2031");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 21", "Action", "2032");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 22", "Action", "2033");
        movieList.add(movie);

        movie = new Movie("Fast & Furious 23", "Action", "2034");
        movieList.add(movie);

        


        myAdapter.notifyDataSetChanged();
    }
}