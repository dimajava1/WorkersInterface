package com.company;

public class FixedWorker implements  Workers{
    private int ID;
    private double Pay;
    private String Name;
    FixedWorker(int ID, double pay, String name){

    }
    @Override
    public int getID() {
        return ID;
    }

    @Override
    public void setID(int ID) {
this.ID = ID;
    }
    @Override
    public void setPay() {
        this.Pay = Pay;
    }
    @Override
    public double getPay() {
        return Pay;
    }
    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName() {
        this.Name = Name;
    }
}
