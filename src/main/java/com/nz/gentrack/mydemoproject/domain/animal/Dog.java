package com.nz.gentrack.mydemoproject.domain.animal;

public class Dog extends Animal {

    private String noise = "bark";

    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }
}
