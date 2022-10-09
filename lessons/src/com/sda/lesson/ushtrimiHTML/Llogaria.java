package com.sda.lesson.ushtrimiHTML;

public class Llogaria {
    private String ID;
    private String emri;
    private int balanca;

    public Llogaria(String ID, String emri){
        this.ID = ID;
        this.emri = emri;
    }

    public  Llogaria (String ID, String emri,int balanca) {
        this.ID = ID;
        this.emri = emri;
        this.balanca = balanca;

    }

    public void setEmri (String emri){
        this.emri = emri;
    }
    public String getEmri(){
        return this.emri;
    }

    public void setID(String ID){
        this.ID = ID;
    }
    public String getID(){
        return this.ID;
    }
    public void setBalanca(int balanca){
        this.balanca = balanca;
    }
    public int getBalanca(){
        return this.balanca;
    }
    public int credit(int amount){
        balanca +=amount;
        return balanca;
    }
    public int debit(int amount){
        balanca -=amount;
        return balanca;
    }
    public void transferTo(Llogaria another,int amount){

        if (amount > balanca){
            System.out.println("Llogaria ka kaluar balancen");
        } else {
            another.credit(amount);
            debit(amount);
        }

    }

    @Override
    public String toString() {
        return "Llogaria{" +
                "ID='" + ID + '\'' +
                ", emri='" + emri + '\'' +
                ", balanca=" + balanca +
                '}';
    }
}
