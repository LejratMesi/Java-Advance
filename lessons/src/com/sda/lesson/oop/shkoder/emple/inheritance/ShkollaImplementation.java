package com.sda.lesson.oop.shkoder.emple.inheritance;

public class ShkollaImplementation extends Shkolla {

    //encapsulimi
    private String emri;
    private Integer numriStudentave;

    public ShkollaImplementation() {
    }

    public ShkollaImplementation(String emri, Integer numriStudentave) {
        this.emri = emri;
        this.numriStudentave = numriStudentave;
    }


    void printoEmrinKlases() {
        System.out.println(emri);
    }


    void printoNumrinEStudentave() {
        System.out.println(numriStudentave);
    }

    public void setEmri(String emri){
        this.emri = emri;
    }

    public String getEmri(){
        return emri;
    }

    public void setNumriStudentave(Integer numriStudentave){
        this.numriStudentave = numriStudentave;
    }

    public Integer getNumriStudentave(){
        return numriStudentave;
    }


    public void printoEmrin(String emri) {
        super.printo(emri);
    }
}
