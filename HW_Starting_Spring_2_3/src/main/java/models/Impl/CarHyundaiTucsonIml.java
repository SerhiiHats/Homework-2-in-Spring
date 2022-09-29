package models.Impl;

import models.Engine;
import models.ICar;

import java.time.LocalDate;

public class CarHyundaiTucsonIml implements ICar {
    private String marka;
    private String model;
    private int yearOfBuild;
    private double cena;
    private Engine engine;


    public CarHyundaiTucsonIml(Engine engine) {
        this.engine = engine;
    }

    public void init(){
        marka = "Hyundai";
        yearOfBuild = LocalDate.now().getYear();
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearOfBuild() {
        return yearOfBuild;
    }

    public void setYearOfBuild(int yearOfBuild) {
        this.yearOfBuild = yearOfBuild;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "CarIml{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yearOfBuild=" + yearOfBuild +
                ", cena=" + cena +
                ", engine=" + engine +
                '}';
    }
}
