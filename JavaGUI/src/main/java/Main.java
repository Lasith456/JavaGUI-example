/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lasithviduranga
 */
import javax.swing.*;
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        addressBook ab=new addressBook();
        String input,s;
        int ch;
        while(true){
            input=JOptionPane.showInputDialog("Enter 1 to Add Person \nEnter 2 to Search person \nEnter 3 to Delete Person\n Enter 4 to Exit");
            ch=Integer.parseInt(input);
            switch(ch){
                case 1:
                    ab.addPerson();;
                    break;
                case 2:
                    s=JOptionPane.showInputDialog("Enter name:");
                    ab.searchPerson(s);
                    break;
                case 3:
                    s=JOptionPane.showInputDialog("Enter Name:");
                    ab.deletePerson(s);
                    break;
                case 4:
                    ab.savePerson();
                    System.exit(0);
            }
        }
    }
    
}
