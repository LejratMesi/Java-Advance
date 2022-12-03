package com.sda.lesson.oop;

public class Shtet implements ArrayInterface{

    private Kontinent kontinenti;
    private Qytet[] qyteti;

    public Shtet(){}
    public Shtet (Kontinent kontinent, Qytet qytet){
        this.kontinenti = kontinent;
        this.qyteti = qyteti;
    }

    public Kontinent getKontinenti() {
        return kontinenti;
    }

    public void setKontinenti(Kontinent kontinenti) {
        this.kontinenti = kontinenti;
    }

    public Qytet[] getQyteti() {
        return qyteti;
    }

    public void setQyteti(Qytet[] qyteti) {
        this.qyteti = qyteti;
    }

    @Override
    public void printContinentName() {
        System.out.println(kontinenti.getName());
    }

    @Override
    public void nameThaStartsWithLetterS() {
        System.out.println("nameThaStartsWithLetterS>>>>");
        for (int i = 0;i< qyteti.length;i++){
            if (qyteti[i].getEmri().startsWith("S")){
                System.out.println(qyteti[i].getEmri());
            }
        }
    }

    @Override
    @JAVA10
    public void maxPopullsia() {
        System.out.println("maxPopullsia>>>>>>>");
        int max = qyteti[0].getPopullsia();
        for (int i = 1;i< qyteti.length;i++){
            if (qyteti[i].getPopullsia() > max){
                max = qyteti[i].getPopullsia();
            }
        }

        System.out.println("Popullsia me e madhe eshte " + max);
    }
}
