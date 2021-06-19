package entity;

import abstracts.IEntity;

public class Campaign implements IEntity {
    private int id;
    private String name;
    private double discount;

    public Campaign(int id, String name, double discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDiscount() {
        return (100-discount)/100;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
