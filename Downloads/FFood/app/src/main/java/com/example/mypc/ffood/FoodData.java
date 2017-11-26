package com.example.mypc.ffood;

/**
 * Created by Dell on 11/25/2017.
 */

public class FoodData {
    int food_Image;
    String food_title;
    String food_Restaurant;
    String food_price;

    public FoodData(){}

    public FoodData(int food_Image, String food_title, String food_Restaurant, String food_price) {
        this.food_Image = food_Image;
        this.food_title = food_title;
        this.food_Restaurant = food_Restaurant;
        this.food_price = food_price;
    }

    public FoodData(String food_title, String food_Restaurant, String food_price) {
        this.food_title = food_title;
        this.food_Restaurant = food_Restaurant;
        this.food_price = food_price;
    }

    public int getFood_Image() {
        return food_Image;
    }

    public void setFood_Image(int food_Image) {
        this.food_Image = food_Image;
    }

    public String getFood_title() {
        return food_title;
    }

    public void setFood_title(String food_title) {
        this.food_title = food_title;
    }

    public String getFood_Restaurant() {
        return food_Restaurant;
    }

    public void setFood_Restaurant(String food_Restaurant) {
        this.food_Restaurant = food_Restaurant;
    }

    public String getFood_price() {
        return food_price;
    }

    public void setFood_price(String food_price) {
        this.food_price = food_price;
    }
}
