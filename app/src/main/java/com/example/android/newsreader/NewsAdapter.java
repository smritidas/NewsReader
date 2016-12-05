package com.example.android.newsreader;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, List<News> news){
        super(context, 0, news);
    }

    @Override
    public View getView(int position, View convertview, ViewGroup parent){
        View listItemView = convertview;
        if (listItemView == null){
        listItemView = LayoutInflater.from(getContext()).inflate(
                R.layout.news_list_item, parent, false);

    }
        News currentNews = getItem(position);
        TextView titleView = (TextView) listItemView.findViewById(R.id.title);
        titleView.setText(currentNews.getTitle());

        TextView typeView = (TextView) listItemView.findViewById(R.id.type);
        typeView.setText(currentNews.getType());

        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentNews.getDate());


        return listItemView;
}}
