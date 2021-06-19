package entity;

import abstracts.IEntity;

import java.util.Date;

public class Game implements IEntity {
    private int id;
    private String name;
    private double Unitprice;
    private  int stock;
    private boolean status;
    private Date relaseDate;

    public Game(int id, String name, double unitprice,int stock, boolean status, Date relaseDate) {
        this.id = id;
        this.name = name;
        Unitprice = unitprice;

        this.stock = stock;
        this.status = status;
        this.relaseDate = relaseDate;
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

    public double getUnitprice() {
        return Unitprice;
    }

    public void setUnitprice(double unitprice) {
        Unitprice = unitprice;
    }

   public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Date getRelaseDate() {
        return relaseDate;
    }


}
