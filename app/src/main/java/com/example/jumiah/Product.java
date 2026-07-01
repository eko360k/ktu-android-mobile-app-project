package com.example.jumiah;

public class Product {
    private String name;
    private String price;
    private String discount;
    private String itemsLeft;
    private int progress;
    private int imageRes;

    public Product(String name, String price, String discount, String itemsLeft, int progress, int imageRes) {
        this.name = name;
        this.price = price;
        this.discount = discount;
        this.itemsLeft = itemsLeft;
        this.progress = progress;
        this.imageRes = imageRes;
    }

    public String getName() { return name; }
    public String getPrice() { return price; }
    public String getDiscount() { return discount; }
    public String getItemsLeft() { return itemsLeft; }
    public int getProgress() { return progress; }
    public int getImageRes() { return imageRes; }
}