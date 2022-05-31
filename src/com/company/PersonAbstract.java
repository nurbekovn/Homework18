package com.company;


public abstract class PersonAbstract implements Rent , ComServise {
    private String name;
    private int[] family;

    public PersonAbstract(String name) {
        this.name = name;
    }

    public PersonAbstract() {}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public String toString() {return name;}
}