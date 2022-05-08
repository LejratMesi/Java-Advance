package com.sda.exercise_12_13;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Car {
    String name;
    String model;
    Integer price;
    Integer yearOfManufacture;
    EngineType engineType;
    List<Manufacturer> manufacture;

    public Car(){}

    public Car(String name, String model, Integer price, Integer yearofmanufacture, EngineType engineType, ArrayList<Manufacturer> manufacture) {
        this.name = name;
        this.model = model;
        this.price = price;
        this.yearOfManufacture = yearofmanufacture;
        this.manufacture = manufacture;
        engineType = EngineType.S3;
    }

    @Override
    public boolean equals(Object o){
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        if (this==o ){
            return true;
        }
        Car car=(Car) o;
        return (this.getModel() == car.getModel());
    }

    @Override
    public int hashCode(){
        return Objects.hash(manufacture);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(Integer yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    public List<Manufacturer> getManufacture() {
        return manufacture;
    }

    public void setManufacture(List<Manufacturer> manufacture) {
        this.manufacture = manufacture;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }
}
