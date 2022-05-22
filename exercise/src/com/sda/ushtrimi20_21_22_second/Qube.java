package com.sda.ushtrimi20_21_22_second;

public class Qube extends ThreeDShape{
    private Double brinja;
    private Double vellimi;

    public Qube(Double brinja) {
        this.brinja = brinja;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimeterKub=12* brinja;
        return perimeterKub;
    }

    @Override
    public Double calculateArea() {
        Double areaKub= 6* Math.pow(brinja,2);
        return areaKub;
    }

    @Override
    public Double calculateVolume() {
        vellimi= Math.pow(brinja,3);
        return vellimi;
    }

    @Override
    public void fill(Double water) {
        if (vellimi<water){
            System.out.println("Kubi eshte mbushur me teper se kapaciteti i tij!");
        } else if (vellimi==water){
            System.out.println("Kubi eshte mbushur ne kapacitetin e tij!");
        } else {
            System.out.println("Kubi eshte mbushur me pak se kapaciteti!");
        }

    }
}
