package com.sda.ushtrimi20_21_22_second;

public class Cone extends ThreeDShape{
    private Double brinjaKonit;
    private Double lartesiaKonit;
    private Double rrezeKonit;
    private Double vellimi;

    public Cone(Double brinjaKonit, Double lartesiaKonit, Double rrezeKonit) {
        this.brinjaKonit = brinjaKonit;
        this.lartesiaKonit = lartesiaKonit;
        this.rrezeKonit = rrezeKonit;
    }

    @Override
    public Double calculatePerimeter() {
        Double perimetriKonit=2*Math.PI*rrezeKonit;
        return perimetriKonit;
    }

    @Override
    public Double calculateArea() {
        double siperfaqjaKonit=Math.PI * rrezeKonit * (rrezeKonit + Math.sqrt(Math.pow(lartesiaKonit , lartesiaKonit) + Math.pow(rrezeKonit , 2)));
        return siperfaqjaKonit;
    }

    @Override
    public Double calculateVolume() {
         vellimi=Math.PI * Math.pow(rrezeKonit,2) * lartesiaKonit / 3;
        return vellimi;

    }

    @Override
    public void fill(Double water) {
        if (vellimi<water){
            System.out.println("Koni eshte mbushur me teper se kapaciteti i tij!");
        } else if (vellimi == water){
            System.out.println("Koni eshte mbushur ne kapacitetin e tij!");
        } else {
            System.out.println("Koni eshte mbushur me pak se kapaciteti!");
        }

    }
}
