package com.sda.lesson;

public class Bed {
    private String name;
    private String bedtype;

    public Bed(String name, String bedtype){
        this.name = name;
        this.bedtype = bedtype;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBedtype() {
        return bedtype;
    }

    public void setBedtype(String bedtype) {
        this.bedtype = bedtype;
    }
}
