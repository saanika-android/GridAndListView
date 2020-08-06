package com.example.gridandlistview;

public class MyListData {
    private String news;
    private String description;
    private int image;

    public MyListData(String news, String description, int image) {
        this.news = news;
        this.description = description;
        this.image = image;
    }
    public String getNews(){
        return news;
    }
    public String getDescription(){
        return description;
    }
    public int getImage(){
        return image;
    }
    public void setImage(int image){
        this.image=image;
    }
}