/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lasithviduranga
 */

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class Example extends JFrame{
    JFrame frame1 =new JFrame();
    JPanel jp =new JPanel();
    public Example(){
        frame1.setTitle("Sign in Page");
        frame1.setSize(500,500);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setVisible(true);
        jp.setBackground(Color.black);
    }
    public static void main(String[] args) {
        Example obj= new Example();
        System.out.println("Sign in project");
    }
    
}
