package com.titrate.zoos.models;

import javax.persistence.*;

public class Zoo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long zooid;

    private String zooname;

    @ManyToOne
    @JoinColumn(name="telephoneid")
    private Telephone telephone;

}
