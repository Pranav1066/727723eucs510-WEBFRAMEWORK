package com.praga.demo.model;

public class Address {
    public String name;
    public int doorNo;
    public String streetName;
    public int pincode;
    public String area;
    public String district;
    public String state;
    public String country;
    public Address(int a,String b)
    {
        this.doorNo=a;
        this.streetName=b;
    }
}
