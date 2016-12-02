package com.example.android.newsreader;

/**
 * An {@link News} object contains a list of news items
 */

public class News {

    // The title of the news article
    private String mTitle;

    //The author of the news article
    private String mAuthor;

    //The date the article was published
    private String mDate;

    //The URL for the news article
    private String mURL;

    /**
     * This is the constructor for the news object
     * @param title
     * @param author
     * @param date
     * @param URL
     */

    public News(String title, String author, String date, String URL){
        mTitle= title;
        mAuthor= author;
        mDate = date;
        mURL = URL;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getAuthor(){
        return mAuthor;
    }

    public String getDate(){
        return mDate;
    }

    public String getURL(){
        return mURL;
    }

}
