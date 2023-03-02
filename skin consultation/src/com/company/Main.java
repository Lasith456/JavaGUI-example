package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Doctor>doctorArrayList=new ArrayList<>();
        ArrayList<Patient> patientList=new ArrayList<>();
        loadData(doctorArrayList);
        WestminsterSkinConsultationManage westminsterSkinConsultationManage=new WestminsterSkinConsultationManage();
        boolean loop=true;
        while (loop){
        System.out.println("****************************************************************");
        System.out.println("******************* Skin Consultation Centre *******************");
        System.out.println("****************************************************************");
        System.out.println("* Do you want to add New Doctor then press letter A ");
        System.out.println("* Do you want to delete Doctor then press letter D ");
        System.out.println("* Do you want to print Doctor's then List press letter P ");
        System.out.println("* Do you want to save Doctor's then List press letter S ");
        System.out.println("* Do you want to open GUI then press letter G ");
        System.out.println("* Do you want to End then press letter E ");
        System.out.print("* Please Enter Your choice: ");
        String getp=input.nextLine();
        String get=getp.toUpperCase();
            switch (get){
                case "A":
                    westminsterSkinConsultationManage.addNewDoctor(doctorArrayList);
                    loop=true;
                    break;
                case "D":
                    westminsterSkinConsultationManage.deleteDoctor(doctorArrayList);
                    loop=true;
                    break;
                case "P":
                    westminsterSkinConsultationManage.printList(doctorArrayList);
                    loop=true;
                    break;
                case "S":
                    westminsterSkinConsultationManage.saveData(doctorArrayList);
                    loop=true;
                    break;
                case "G":
                    new Consultation(doctorArrayList,patientList);
                    loop=false;
                    break;
                case "E":
                    System.exit(0);
                    loop=false;
                    break;
                default:
                    while (get != "A" || get != "D" || get != "P" || get != "S" || get != "G" || get != "E") {
                        System.out.print("Your letter is not valid please enter again ");
                        try {
                            loop=true;
                        } catch (InputMismatchException e) {
                            System.out.println("\n!!!!! Your input is Not valid !!!!! \n");
                        }
                    }
                    break;
            }
        }
    }
    public static void loadData(ArrayList<Doctor> doctorList) {
        try {
            File myObj = new File("dData.txt");
            if (myObj.exists()){
                Scanner myReader = new Scanner(myObj);
                while (myReader.hasNextLine()) {
                    String[] dDetails = myReader.nextLine().split(":");
                    doctorList.add(new Doctor(dDetails[0],dDetails[1], LocalDate.parse(dDetails[2]),Integer.parseInt(dDetails[3]) ,dDetails[4],Integer.parseInt(dDetails[5]),dDetails[6]));
                }
                myReader.close();
                System.out.println("Last data successfull loaded...");
            }else{
            }
        } catch (FileNotFoundException e) {
            System.out.println("Data loading is failed..");
            e.printStackTrace();
        }
    }
}
