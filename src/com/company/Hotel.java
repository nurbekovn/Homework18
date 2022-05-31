package com.company;

public class Hotel extends PersonAbstract{
    private String address;

    public Hotel() {};

    public Hotel(String setName) {
        super(setName);
    }

    public void getAddress(String address) {System.out.println("Address: " + address);}


    @Override
    public String payRent() {return "This is family pay rent";}
}

//    public Hotel(String grandfather, String grandmather,
//                 String father, String mother, String child) {
//        super(grandfather, grandmather, father, mother, child);
//    }
//
//    @Override
//    public String toString() {
//        return "Hotel " + super.toString();
//    }
//
//    @Override
//    public void methodHint() {
//        System.out.println("Hotel : they pay rent ");
//    }
//}
