package com.company;

import java.time.LocalDate;

public class Patient extends Person{
    private String sickness;
    private String details;
    private int nic;
    private int num;
    public Patient(String name, String surName, LocalDate birthDay, String MobileNumber, String sickness,int nic,int num,String details) {
        super(name, surName, birthDay, Integer.valueOf(MobileNumber));
        this.sickness=sickness;
        this.nic=nic;
        this.num=num;
        this.details=details;
    }
    public String getSickness(){
        return sickness;
    }
    public int getNic(){
        return nic;
    }
    public int getNum(){
        return num;
    }
    public String getDetails(){
        return details;
    }
}
