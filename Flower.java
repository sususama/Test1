package edu.xatu;

public class Flower {
    private String name;
    private int price;
    private int number;

    public Flower(String name, int price, int number) {
        this.name = name;
        this.price = price;
        this.number = number;
    }
    @Override
    public String toString() {
        return "Flower{" + "name='" + name + '\'' + ", price=" + price + ", number=" + number + '}';
    }
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
    public int getNumber() {
        return number;
    }
}
