package com.charles.model;

public class Product {
    private String produce;
    private String weight;
    private String price;

    public Product() {
    }

    public Product(String produce, String weight, String price) {
        this.produce = produce;
        this.weight = weight;
        this.price = price;
    }

    public String getProduce() {
        return produce;
    }

    public void setProduce(String produce) {
        this.produce = produce;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "produce='" + produce + '\'' +
                ", weight='" + weight + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
