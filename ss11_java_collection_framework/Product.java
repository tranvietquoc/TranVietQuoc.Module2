package ss11_java_collection_framework;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;

    private static Scanner sc = new Scanner(System.in);

    public Product() {
    }

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void inputValue() {
        System.out.print("ID: ");
        setId(sc.nextInt());
        sc.nextLine();

        System.out.print("Name: ");
        setName(sc.nextLine());

        System.out.print("Price: ");
        setPrice(sc.nextDouble());
        sc.nextLine();
    }

    @Override
    public String toString() {
        return "ID: " + id + "\tName: " + name + "\tPrice: " + price;
    }
}
