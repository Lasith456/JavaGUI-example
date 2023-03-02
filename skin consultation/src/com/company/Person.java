package com.company;

import java.time.LocalDate;

public class Person {
    private String name;
    private LocalDate birthDay;
    private String surName;
    private Integer MobileNumber;

    public Person(String name, String surName, LocalDate birthDay,Integer MobileNumber) {
        this.name=name;
        this.surName=surName;
        this.birthDay=birthDay;
        this.MobileNumber=MobileNumber;
    }
    public LocalDate getBirthDay() {
        return birthDay;
    }
    public String getName(){
        return name;
    }
    public String getSurName(){
        return surName;
    }
    public int getMobileNumber(){
        return MobileNumber;
    }

}
