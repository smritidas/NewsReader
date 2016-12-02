package com.example.android.newsreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NewsActivity extends AppCompatActivity {

    public static final String LOG_TAG = NewsActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news_main);

        //Creating a fake list of news items
        ArrayList<String> news = new ArrayList<>();
        news.add("Main");
        news.add("Entertainment");
        news.add("Politics");
        news.add("Sports");
        news.add("World");
        news.add("Business");

        //Find a reference to the listview in the layout
        ListView newsListView = (ListView) findViewById(R.id.list);

        //Create a new list of news items
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_1, news
        );

        //Set the adapter so the list can be populated in the user interface
        newsListView.setAdapter(adapter);
    }
}
