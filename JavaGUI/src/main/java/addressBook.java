/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lasithviduranga
 */
import java.io.*;
import java.util.*;
import javax.swing.*;
public class addressBook {
    ArrayList<personInfo> persons= new ArrayList<>();
    void addPerson(){
        String name=JOptionPane.showInputDialog("Enter name:");
        String add=JOptionPane.showInputDialog("Enter Address: ");
        String pNum=JOptionPane.showInputDialog("Enter phone Number:");
        personInfo p=new personInfo(name,add,pNum);
        persons.add(p);
    }
    void searchPerson(String n){
        for(int i=0; i<persons.size();i++){
            personInfo p=(personInfo)persons.get(i);
            if(n.equals(p.name)){
                p.display();
            }
        }
    }
    void deletePerson(String n){
        for(int i=0;i<persons.size();i++){
            personInfo p=(personInfo) persons.get(i);
            if (n.equals(p.name)){
                persons.remove(i);
            }
        }
    }
    void savePerson(){
        try{
            personInfo p;
            String line;
            FileWriter fw= new FileWriter("persons.txt");
            PrintWriter pw=new PrintWriter(fw);
            for(int i=0;i<persons.size();i++){
                p=(personInfo)persons.get(i);
                line=p.name+","+p.address+","+p.phoneNumber;
                pw.println(line);
            }
            pw.flush();
            pw.close();
            fw.close();
        }catch(IOException ioEx){
            System.out.println(ioEx);
        }
    }
}

