package com.example.joker.androidtest;

import android.graphics.Movie;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.List;


//TODO 11 implement ClickListner interface and override the methods and show toast of hero name clicked in it.
public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MovieAdapter movieAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerView);
        List<com.example.joker.androidtest.Movie> movieList;
        movieAdapter =new MovieAdapter (movieList);
        //TODO 2: Create class Hero having a constructor with fields as id,name and detail and create setters and getters respectively.

        //TODO 3: Get reference to recyclerVeiw and set its layout manager to Linear.
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager (getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator ());
        recyclerView.setAdapter(movieAdapter);

        prepareMovieData();
    }

    private void prepareMovieData() {

        Movie movie = new Movie ("superman", "2017:spider movie");
        movie.setImage(R.drawable.spiderman);
        movieList.add(movie );

        movie = new Movie ("iron_man","2016");
        movie.setImage(R.drawable.iron_man);

        movieList.add(movie);

        movie = new Movie ("batman","2016:American best film" );
        movie.setImage(R.drawable.batman);

        movieList.add(movie);
    }


        //


    }


    //TODO 12 Using shared preference find if user is new user or not. and show toast Welcome or Welcome again accordingly.


}
