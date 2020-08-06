package com.example.gridandlistview;

public class Items {
    String fruitName;
    int fruitImage;
    String fruitPrice;

    public Items(String fruitName,int fruitImage,String fruitPrice)
    {
        this.fruitImage=fruitImage;
        this.fruitName=fruitName;
        this.fruitPrice= fruitPrice;
    }
    public String getFruitName()
    {

        return fruitName;
    }
    public int getFruitImage()
    {

        return fruitImage;
    }
    public String getFruitPrice()
    {
        return fruitPrice;
    }

}

