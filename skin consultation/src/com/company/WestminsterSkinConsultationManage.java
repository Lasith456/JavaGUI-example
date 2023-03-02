package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class WestminsterSkinConsultationManage implements SkinConsultationManager {
    Scanner input=new Scanner(System.in);
    public static ArrayList<String> sorttempList=new ArrayList<>();

    @Override
    public void addNewDoctor(ArrayList<Doctor> doctorArrayList){
        if(doctorArrayList.size()<10){
            int dID=doctorArrayList.size();
            System.out.print("Doctor's ID :");
            String id ="Doctor"+(dID+1);
            System.out.println(id);
            System.out.print("Please Enter Doctor's Name :");
            String name = input.next();
            System.out.print("Please Enter Doctor's SurName :");
            String surName = input.next();
            System.out.print("Please Enter Doctor's Mobile number :");
            int mobileNumber = input.nextInt();
            System.out.print("Please Enter Doctor's Licene Number :");
            int medicalLicenenum= input.nextInt();
            System.out.println("Please Enter Doctor's Birthday ");
            System.out.print("Year:");
            int year = input.nextInt();
            System.out.print("Month:");
            int month = input.nextInt();
            System.out.print("Date:");
            int day = input.nextInt();
            LocalDate birthDay = LocalDate.of(year, month, day);
            System.out.print("Please Enter Doctor's Specialization :");
            String specialization = input.next();
            doctorArrayList.add(new Doctor(name,surName,birthDay,mobileNumber,id,medicalLicenenum,specialization));
            System.out.println("Succefully Added ");
        }
        else{
            System.out.println("10 docotrs are added to list.. delete a doctor and try again..");
        }
    }
    @Override
    public void printList(ArrayList<Doctor> doctorArrayList){
        for (int y = 0; y < doctorArrayList.size(); y++) {
            sorttempList.add(doctorArrayList.get(y).getSurName());
        }
            for (int i = 0; i < doctorArrayList.size(); i++) {
                Collections.sort(sorttempList);
                String doctorsName = sorttempList.get(i);
                for (int x=0; x<doctorArrayList.size(); x++) {
                    if (doctorArrayList.get(x).getSurName() == sorttempList.get(i)) {
                        System.out.println("--** Details of the ID"+doctorArrayList.get(x).getid() +"doctor **--");
                        System.out.println("Surname:-"+doctorsName);
                        System.out.println("Name:-"+doctorArrayList.get(x).getName());
                        System.out.println("Birth day:-"+doctorArrayList.get(x).getBirthDay());
                        System.out.println("Mobile phone Number:-"+doctorArrayList.get(x).getMobileNumber());
                        System.out.println("Medical licenece number:-"+ doctorArrayList.get(x).getMedicalLicenenum());
                        System.out.println("Specialization:-"+doctorArrayList.get(x).getSpecialization());
                    }
                }

            }
            if(doctorArrayList.size() == 0){
                System.out.println("Don't have any doctors at the moment.Please Check again and try later.");
            }else{
                System.out.println("Total no.of Doctors :"+doctorArrayList.size());
                System.out.println("****************************************************************");
            }
        sorttempList.clear();
    }
    @Override
    public void saveData(ArrayList<Doctor> doctorArrayList) {
        //error catching for data store
        //
        try {
            FileWriter myWriter = new FileWriter("dData.txt");// Store data in file
            for (int i = 0; i < doctorArrayList.size(); i++) {

                myWriter.write(doctorArrayList.get(i).getName() + ":" +    // Arrange the saving list
                        doctorArrayList.get(i).getSurName() + ":" +
                        doctorArrayList.get(i).getBirthDay() + ":" +
                        doctorArrayList.get(i).getMobileNumber() + ":" +
                        doctorArrayList.get(i).getid()+ ":" +
                        doctorArrayList.get(i).getMedicalLicenenum()+ ":" +
                        doctorArrayList.get(i).getSpecialization()+ "\n"
                );
            }
            myWriter.close();
            System.out.println("Successfully stored program data to the (dData.txt) file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    @Override
    public void deleteDoctor(ArrayList<Doctor> doctorArrayList){
        System.out.print("please enter doctors MedicalLicene number:");
        int deleteId=input.nextInt();
        int position=0;
        boolean sure=false;
        for (int i=0; i<doctorArrayList.size(); i++) {
            if(doctorArrayList.get(i).getMedicalLicenenum() == deleteId ){
                position=i;
                sure=true;
            }
        }
        if (sure){
            System.out.print("Are you sure do you want to delete"+"Dr."+doctorArrayList.get(position).getName()+"(YES/NO)");
            String q2=input.next();
            String q4=q2.toUpperCase();
            switch (q4){
                case "YES":
                    System.out.println("--** Details of the deleted doctor **--");
                    System.out.println("Name:-"+doctorArrayList.get(position).getName()+doctorArrayList.get(position).getSurName());
                    System.out.println("ID:-"+doctorArrayList.get(position).getid());
                    System.out.println("Medical licenece number:-"+doctorArrayList.get(position).getMedicalLicenenum());
                    System.out.println("Birth day:-"+doctorArrayList.get(position).getBirthDay());
                    System.out.println("Mobile phone Number:-"+doctorArrayList.get(position).getMobileNumber());
                    System.out.println("Specialization:-"+doctorArrayList.get(position).getSpecialization());
                    doctorArrayList.remove(position);
                    System.out.println("Now total no.of Doctors :"+doctorArrayList.size());
                    System.out.println("****************************************************************");
                    break;
                case "NO":
                    System.out.println("Thank you... Now you're going to menu..");

                    break;
                default:
                    System.out.println("you're input is invalid... Please try again..");
                    deleteDoctor(doctorArrayList);
                    break;
            }
        }else {
            System.out.println("Entered id is not equal to list..please try again.. ");
            deleteDoctor(doctorArrayList);
        }

    }

}
