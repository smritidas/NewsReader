package com.example.android.newsreader;

/**
 * An {@link News} object contains a list of news items
 */

public class News {

    // The title of the news article
    private String mTitle;

    //The author of the news article
    private String mType;

    //The URL for the news article
    private String mURL;

    /**
     * This is the constructor for the news object
     * @param title
     * @param type
     *@param URL
     */

    public News(String title, String type, String URL){
        mTitle= title;
        mType= type;
        mURL = URL;
    }

    public String getTitle(){
        return mTitle;
    }

    public String getType(){
        return mType;
    }

    public String getUrl() {
        return mURL;
    }
}
