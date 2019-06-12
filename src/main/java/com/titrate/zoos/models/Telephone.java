package com.titrate.zoos.models;


import javax.persistence.*;

@Entity
@Table(name="telephone")
public class Telephone {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long telephoneid;

    private String phonetype;
    private String phonenumber;

    @OneToMany(mappedBy = "zooid")
    private Zoo zoo;
}
