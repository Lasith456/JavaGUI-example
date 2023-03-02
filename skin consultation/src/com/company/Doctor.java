package com.company;

import java.time.LocalDate;

public class Doctor extends Person{
    private String id;
    private int medicalLicenenum;
    private String specialization;

    public Doctor(String name, String surName, LocalDate birthDay, int MobileNumber, String id, int medicalLicenenum, String specialization){
        super(name,surName,birthDay,MobileNumber);
        this.id=id;
        this.medicalLicenenum=medicalLicenenum;
        this.specialization=specialization;
    }
    public String getid(){
        return id;
    }
    public int getMedicalLicenenum(){
        return medicalLicenenum;
    }
    public String getSpecialization(){
        return specialization;
    }
}

