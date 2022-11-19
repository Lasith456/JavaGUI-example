/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lasith viduranga
 */
import java.util.*;
class Example {
    public static void main(String args[]){
        boolean bool= true;
        while(bool){
            Scanner input=new Scanner(System.in);
            System.out.println("Enter Student name: ");
            String name =input.nextLine();
            System.out.println("Enter Student Addres: ");
            String address=input.nextLine();
            System.out.println("Enter Number of Subject: ");
            int numb=input.nextInt();
            System.out.println("");
            int[] marks = new int[numb]; 
            int total=0;
            
            //Subject marks enter //
            for (int i=0; i<numb;i++){
                System.out.println("Enter Subject"+" "+(i+1)+" "+"Marks :");
                int x=input.nextInt();
                total=total+x;
                
                marks[i]=x;
                
            }
            
            // Print Entry//
            System.out.println(" A - Show Student Details");
            System.out.println(" B - Show Student All Marks");
            System.out.println(" C - Show student results");
            System.out.println(" X - Exit");
            
            // Choose A or B or C or X //
            String letter = input.next();
            switch(letter){
                case "A":
                    System.out.println("Student name is"+name+"lives in "+address);
                    break;
                case "B":
                    for(int n=0; n<marks.length; n++){
                        System.out.println("Subject"+" "+(n+1)+" "+"mark is"+marks[n]);
                    }
                    break;
                    
                // Show result average<50 fail , average >50 pass//
                case "C":
                    int avg=total/numb;
                    if(avg<50){
                        System.out.println("You are fail the exam and youra avarege is :"+avg);
                    }else{
                        System.out.println("You are pass the exam and youra avarege is :"+avg);
                    }
                    break;
                    
                // exit option//
                case "X":
                    System.out.println("Good bye");
                    bool=false;
                    break;
                default:
                    System.out.println("Invalid Entry....");
            }
            
         
        }
    }
}