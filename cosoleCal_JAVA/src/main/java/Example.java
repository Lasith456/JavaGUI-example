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

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int num1 = input.nextInt();
        System.out.println("Enter Number 2: ");
        int num2 = input.nextInt();
        System.out.println("A.Addition");
        System.out.println("B.Subtraction");
        System.out.println("C.Multiplication");
        System.out.println("D.Division");
        System.out.println("please select one optipn....:-");
        String inp = input.next();
        switch (inp) {
            case "A":
                add(num1, num2); /// Addition method///
                break;
            case "B":
                sub(num1, num2); /// Substraction method///
                break;
            case "C":
                multi(num1, num2); /// multiplication method///
                break;
            case "D":
                dev(num1, num2); /// Division method///
                break;
            default:
                System.out.println("invalid entry");
                break;
        }

    }

    public static void add(int num1, int num2) {
        System.out.println("Addition-->" + num1 + num2);
    }

    public static void sub(int num1, int num2) {
        int x = 0;
        if (num1 > num2) {
            x = num1 - num2;
        } else if (num2 > num1) {
            x = num2 - num1;
        } else {
            System.out.println("invalid entry...");
        }
        System.out.println("Substraction answer is" + x);
    }

    public static void multi(int num1, int num2) {
        System.out.println("multiplication is:" + (num1 * num2));
    }

    public static void dev(int num1, int num2) {
        if (num1 > num2) {
            System.out.println("devision is:" + (num1 / num2));
        } else if (num2 > num1) {
            System.out.println("devision is:" + (num2 / num1));
        } else {
            System.out.println("invalid entry");
        }
    }
}