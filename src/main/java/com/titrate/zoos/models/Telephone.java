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

    @OneToMany(mappedBy = "telephone")
    private Telephone telephone;

    public Telephone() {
    }

    public Telephone(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public long getTelephoneid() {
        return telephoneid;
    }

    public void setTelephoneid(long telephoneid) {
        this.telephoneid = telephoneid;
    }

    public String getPhonetype() {
        return phonetype;
    }

    public void setPhonetype(String phonetype) {
        this.phonetype = phonetype;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Telephone getTelephone() {
        return telephone;
    }

    public void setTelephone(Telephone telephone) {
        this.telephone = telephone;
    }
}
