package com.AkemyChallenge.University.Models;

import javax.persistence.*;

@Entity
@Table(name = "professors")
public class Professor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name="column")
    private String Name;

    @Column(name="last_name")
    private String LastName;

    @Column(name="DNI")
    private String DNI;

    @Column(name="active")
    private boolean Active;

    public Professor() {
    }

    public Professor(String name, String surname, String DNI, boolean active) {
        Name = name;
        LastName = surname;
        this.DNI = DNI;
        Active = active;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSurname() {
        return LastName;
    }

    public void setSurname(String surname) {
        LastName = surname;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isActive() {
        return Active;
    }

    public void setActive(boolean active) {
        Active = active;
    }
}
