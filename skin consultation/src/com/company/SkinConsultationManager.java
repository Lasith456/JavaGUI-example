package com.company;

import java.util.ArrayList;

public interface SkinConsultationManager {

    void addNewDoctor(ArrayList<Doctor> doctorArrayList);

    void printList(ArrayList<Doctor> doctorArrayList);

    void saveData(ArrayList<Doctor> doctorArrayList);

    void deleteDoctor(ArrayList<Doctor> doctorArrayList);
}
