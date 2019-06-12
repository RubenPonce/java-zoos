package com.titrate.zoos.models;

import javax.persistence.*;
import java.util.ArrayList;

public class Animal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long animalid;
    private String animalType;

    @ManyToMany
    @JoinTable(name="zooanimals", joinColumns = {@JoinColumn(name="animalid")}, inverseJoinColumns = {@JoinColumn(name = "zooid")} )
    ArrayList<Zoo> zoos = new ArrayList<>();

    public long getAnimalid() {
        return animalid;
    }

    public void setAnimalid(long animalid) {
        this.animalid = animalid;
    }

    public String getAnimalType() {
        return animalType;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public ArrayList<Zoo> getZoos() {
        return zoos;
    }

    public void setZoos(ArrayList<Zoo> zoos) {
        this.zoos = zoos;
    }
}
