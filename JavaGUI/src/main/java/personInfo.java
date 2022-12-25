/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author lasithviduranga
 */
import javax.swing.*;
public class personInfo {
    String name;
    String address;
    String phoneNumber;
    personInfo(String n,String a,String p){
        name=n;
        address=a;
        phoneNumber=p;
    }
    void display(){
        JOptionPane.showMessageDialog(null,"Name :"+ name +"\n Address :"+ address+"\nPhone number"+phoneNumber);
    }
}
