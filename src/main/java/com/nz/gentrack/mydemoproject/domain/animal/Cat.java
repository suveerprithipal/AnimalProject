package com.nz.gentrack.mydemoproject.domain.animal;

public class Cat extends Animal {

    private String noise = "meow";

    @Override
    public String getNoise() {
        return noise;
    }

    @Override
    public void setNoise(String noise) {
        this.noise = noise;
    }

}
