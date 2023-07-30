package com.sda.lesson.collections.kukesUshtrim;

public class Person {

    private String emer;
    private String mbiemer;
    private Integer mosha;


    public Person(String emer, String mbiemer, Integer mosha){
        this.emer = emer;
        this.mbiemer = mbiemer;
        this.mosha = mosha;
    }


    public String getEmer() {
        return emer;
    }

    public void setEmer(String emer) {
        this.emer = emer;
    }

    public String getMbiemer() {
        return mbiemer;
    }

    public void setMbiemer(String mbiemer) {
        this.mbiemer = mbiemer;
    }

    public Integer getMosha() {
        return mosha;
    }

    public void setMosha(Integer mosha) {
        this.mosha = mosha;
    }

    @Override
    public String toString() {
        return "Person{" +
                "emer='" + emer + '\'' +
                ", mbiemer='" + mbiemer + '\'' +
                ", mosha=" + mosha +
                '}';
    }
}
