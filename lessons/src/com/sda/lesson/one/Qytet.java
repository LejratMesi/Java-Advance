package com.sda.lesson.one;

public class Qytet {
    private String emri;
    private int popullsia;
    private boolean protesta;

    public Qytet(String emri, int popullsia, boolean protesta) {
        this.emri = emri;
        this.popullsia = popullsia;
        this.protesta = protesta;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public int getPopullsia() {
        return popullsia;
    }

    public void setPopullsia(int popullsia) {
        this.popullsia = popullsia;
    }

    public boolean isProtesta() {
        return protesta;
    }

    public void setProtesta(boolean protesta) {
        this.protesta = protesta;
    }
}
