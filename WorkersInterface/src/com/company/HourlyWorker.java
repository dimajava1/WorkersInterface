package com.company;

import java.util.Scanner;

public class HourlyWorker implements  Workers {
    private int ID;
    private double Pay;
    private String Name;
    private int workingHours;
    Scanner in = new Scanner(System.in);
    private double stavka;


    public double getStavka() {
        return stavka;
    }

    public void setStavka(double stavka) {
        System.out.println("Введите почасовю ставку для сотрудников: ");
        this.stavka = in.nextDouble();
    }

    public int getWorkingHours() {
        return workingHours;
    }

    public void setWorkingHours(int workingHours) {
        System.out.println("Введите количество рабочих часов для сотрудника: ");
        this.workingHours = in.nextInt();
    }

    @Override
    public int getID() {
        return 0;
    }

    @Override
    public void setID(int ID) {

    }

    @Override
    public double getPay() {
        return Pay;
    }

    @Override
    public void setPay() {
        this.Pay = stavka*workingHours*20.8;
    }

    @Override
    public String getName() {
        return Name;
    }

    @Override
    public void setName() {
        this.Name = Name;
    }

    HourlyWorker(int ID, double Pay, String  name){
        System.out.println("Введите количество рабочих часов для сотрудника: ");
        this.workingHours = in.nextInt();
        System.out.println("Введите почасовю ставку для сотрудников: ");
        this.stavka = in.nextDouble();
        this.ID= ID;
        this.Pay = stavka*workingHours*20.8;
        this.Name = name;
    }
}
