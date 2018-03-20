package com.nz.gentrack.mydemoproject.domain.animal;

public class Animal {

    private String name;
    private int noOfLegs;
    private String noise = "Hello";

    public String getName() {
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs){
        this.noOfLegs = noOfLegs;
    }

    public String getNoise() {
        return noise;
    }

    public void setNoise(String noise) {
        this.noise = noise;
    }


}
