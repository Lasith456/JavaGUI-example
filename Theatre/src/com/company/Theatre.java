package com.company;

import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Theatre {
    static Scanner input=new Scanner(System.in);
    static Theatre theatre=new Theatre();
    String[] Row1 = {"O","O","O","O","O","O"," ","O","O","O","O","O","O"};
    String[] Row2 = {"O","O","O","O","O","O","O","O"," ","O","O","O","O","O","O","O","O"};
    String[] Row3 = {"O","O","O","O","O","O","O","O","O","O"," ","O","O","O","O","O","O","O","O","O","O"};
    public static void main(String[] args) {

        System.out.println("------------------****************$$$$$$$$****************------------------");
        System.out.println(".......................Welcome to the New Theatre...........................");
        System.out.println("-------------------------------------------------");
        theatre.menu();
    }
    public void menu(){
            System.out.println("Please select an option:");
            System.out.println("1) Buy a ticket");
            System.out.println("2) Print seating area");
            System.out.println("3) Cancel ticket");
            System.out.println("4) List available seats");
            System.out.println("5) Save to file");
            System.out.println("6) Load from file");
            System.out.println("7) Print ticket information and total price");
            System.out.println("8) Sort tickets by price");
            System.out.println("       0) Quit");
            System.out.println("-------------------------------------------------");
            System.out.print("Enter option: ");
            int choos=input.nextInt();
            switch (choos){
                case 1:
                    theatre.buy_ticket();
                    break;
                case 2:
                    theatre.print_seating_area();
                    break;
                case 3:
                    theatre.cancel_ticket();
                    break;
                case 4:
                    theatre.show_available();
                    break;
                case 5:
                    theatre.save();
                    break;
                case 6:
                    theatre.load();
                    break;
                case 7:
                    break;
                case 8:
                    break;
                case 0:
                    break;
                default:
                    while (choos != 1 || choos != 2 || choos != 3 || choos != 4 || choos != 5 || choos != 6 || choos != 7 || choos != 8 || choos != 0) {
                        System.out.println("Your number is not valid please enter again ");
                        try {
                            //loop=true;
                        } catch (InputMismatchException e) {
                            System.out.println("\n!!!!! Your input is Not valid !!!!! \n");
                        }
                    }
                    break;
            }

    }
    public void buy_ticket(){
        System.out.println("Please enter Row No:");
        int rowno=input.nextInt();
        System.out.println("Please enter Seat No:");
        int seatno=input.nextInt();
        int seatnum=seatno-1;
        switch (rowno) {
            case 1:
                if (seatnum<6){
                    if (Row1[seatnum] == "X") {
                        System.out.println("Sorry.. This seat is occupied.. Please choose another seat.");
                    } else {
                        Row1[seatnum]="X";
                        theatre.menu();
                    }
                }else {
                    if (Row1[seatno] == "X") {
                        System.out.println("Sorry.. This seat is occupied.. Please choose another seat.");
                    } else {
                        Row1[seatno]="X";
                        theatre.menu();
                    }
                }

                break;
            case 2:
                if (seatnum<8){
                    if (Row2[seatnum] == "X") {
                        System.out.println("Sorry.. This seat is occupied.. Please choose another seat.");
                    } else {
                        Row2[seatnum]="X";
                        theatre.menu();
                    }
                }else {
                    if (Row2[seatno] == "X") {
                        System.out.println("Sorry.. This seat is occupied.. Please choose another seat.");
                    } else {
                        Row2[seatno]="X";
                        theatre.menu();
                    }
                }
                break;
            case 3:
                if (seatnum<10){
                    if (Row3[seatnum] == "X") {
                        System.out.println("Sorry.. This seat is occupied.. Please choose another seat.");
                    } else {
                        Row3[seatnum]="X";
                        theatre.menu();
                    }
                }else {
                    if (Row3[seatno] == "X") {
                        System.out.println("Sorry.. This seat is occupied.. Please choose another seat.");
                    } else {
                        Row3[seatno]="X";
                        theatre.menu();
                    }
                }
                break;
            default:
                System.out.println("Only 3 rows theatre have please insert again...");
                theatre.buy_ticket();
                break;
        }
    }
    public void print_seating_area(){
        System.out.println("    ************");
        System.out.println("    *  STAGE  *");
        System.out.println("    ************");
        System.out.println();
        System.out.print("    ");
        for (int i=0; i<Row1.length; i++)
        {
            System.out.print(Row1[i]);
        }
        System.out.println();
        System.out.print("  ");
        for (int i=0;i<Row2.length;i++){
            System.out.print(Row2[i]);
        }
        System.out.println();
        for (int i=0;i<Row3.length;i++){
            System.out.print(Row3[i]);
        }
        System.out.println();
        theatre.menu();
    }
    public void cancel_ticket(){
        System.out.println("Please enter Row No:");
        int rowno=input.nextInt();
        System.out.println("Please enter Seat No:");
        int seatno=input.nextInt();
        int seatnum=seatno-1;
        switch (rowno) {
            case 1:
                if (seatnum<6){
                    if (Row1[seatnum] == "X") {
                        System.out.println("This seat is not available..Do you want to delete it..");
                        Row1[seatnum]="O";
                        theatre.menu();
                    } else {
                        System.out.println("This seat is available..please try again.");
                        theatre.menu();
                    }
                }else {
                    if (Row1[seatno] == "X") {
                        System.out.println("This seat is not available..Do you want to delete it..");
                        Row1[seatno]="O";
                        theatre.menu();
                    } else {
                        System.out.println("This seat is available..Please try again.");
                        theatre.menu();
                    }
                }

                break;
            case 2:
                if (seatnum<8){
                    if (Row2[seatnum] == "X") {
                        System.out.println("This seat is not available..Do you want to delete it..");
                        Row1[seatnum]="O";
                        theatre.menu();
                    } else {
                        System.out.println("This seat is available..");
                        theatre.menu();
                    }
                }else {
                    if (Row2[seatno] == "X") {
                        System.out.println("This seat is not available..Do you want to delete it..");
                        Row1[seatno]="O";
                        theatre.menu();
                    } else {
                        System.out.println("This seat is available..Please try again.");
                        theatre.menu();
                    }
                }
                break;
            case 3:
                if (seatnum<10){
                    if (Row3[seatnum] == "X") {
                        System.out.println("This seat is not available..Do you want to delete it..");
                        Row1[seatnum]="O";
                        theatre.menu();
                    } else {
                        System.out.println("This seat is available..Please try again.");
                        theatre.menu();
                    }
                }else {
                    if (Row3[seatno] == "X") {
                        System.out.println("This seat is not available..Do you want to delete it..");
                        Row1[seatno]="O";
                        theatre.menu();
                    } else {
                        System.out.println("This seat is available..Please try again");
                        theatre.menu();
                    }
                }
                break;
            default:
                System.out.println("Only 3 rows theatre have please insert again...");
                theatre.buy_ticket();
                break;
        }
    }
    public void show_available(){
        System.out.print("Seats availabel in row 1: ");
        for (int i = 1; i < Row1.length; i++) {
            if (Row1[i] == "O") {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.print("Seats availabel in row 2: ");
        for (int i = 1; i < Row2.length; i++) {
            if (Row2[i] == "O") {
                System.out.print(i + ",");
            }
        }
        System.out.println();
        System.out.print("Seats availabel in row 3: ");
        for (int i = 1; i < Row3.length; i++) {
            if (Row3[i] == "O") {
                System.out.print(i + ",");
            }
        }
    }
    public void save(){
        try {
            FileWriter myWriter = new FileWriter("Row1.txt");// Store data in file
            for (int i = 0; i < Row1.length; i++) {

                myWriter.write(Row1[i] + ":");   // Arrange the saving list
            }
            myWriter.close();
            System.out.println("Successfully stored program data to the (Row1.txt) file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("Row2.txt");// Store data in file
            for (int i = 0; i < Row2.length; i++) {

                myWriter.write(Row2[i] + ":");   // Arrange the saving list
            }
            myWriter.close();
            System.out.println("Successfully stored program data to the (Row2.txt) file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("Row3.txt");// Store data in file
            for (int i = 0; i < Row3.length; i++) {

                myWriter.write(Row3[i] + ":");   // Arrange the saving list
            }
            myWriter.close();
            System.out.println("Successfully stored program data to the (Row3.txt) file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    public void load(){

    }
}
