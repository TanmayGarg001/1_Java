package com.company;

public class AC {
    private String manufacturer;
    private int starRating;
    private int price;

    public AC(String manufacturer, int starRating, int price) {
        this.manufacturer = manufacturer;
        this.starRating = starRating;
        this.price = price;
    }

    public void powerUp() {
        System.out.println("AC " + manufacturer + " is being powered up!");
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public int getStarRating() {
        return starRating;
    }

    public int getPrice() {
        return price;
    }
}
