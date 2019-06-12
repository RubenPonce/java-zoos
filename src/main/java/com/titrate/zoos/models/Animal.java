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
}
