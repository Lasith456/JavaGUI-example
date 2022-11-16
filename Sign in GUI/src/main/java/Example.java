/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author lasithviduranga
 */

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Example extends JFrame{
    JFrame frame1 =new JFrame();
    JLabel label1=new JLabel("Login Page");
    JLabel label2= new JLabel("User Name:-");
    JLabel label3=new JLabel("Password:-");
    JLabel label4=new JLabel();
    JTextArea txt1=new JTextArea();
    JPasswordField txt2=new JPasswordField();
    JButton button1 =new JButton("Submit");
    Font fntT =new Font("TimesNewRoman",Font.BOLD,30);
    Font fnt =new Font("Arial",Font.TRUETYPE_FONT,24);
    Font fnt2 =new Font("Arial",Font.PLAIN,20);
  
    public Example(){
        
        //Design frame 1      
        frame1.setTitle("Sign in Page");
        frame1.setSize(500,500);
        frame1.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame1.setVisible(true);
        frame1.setLayout(null);
       
        // Design Label 1     
        label1.setSize(200,50);
        label1.setLocation(170,100);
        label1.setFont(fntT);
        
        // Design Label 2   
        label2.setSize(200,50);
        label2.setLocation(40,190);
        label2.setFont(fnt);
        
        //Design Label 3
        label3.setSize(200, 50);
        label3.setLocation(40, 240);
        label3.setFont(fnt);
        
        // Desig Button 1
        button1.setSize(100,50);
        button1.setLocation(200,400);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent arg0){
                JOptionPane.showMessageDialog(rootPane, "Succefull");
                System.exit(0); 
            }
        });
        
        //Design Text area 1(txt1)
        txt1.setSize(240,30);
        txt1.setLocation(190,200);
        txt1.setFont(fnt2);
        
        //Design Text area 2(txt2)
        txt2.setSize(240,30);
        txt2.setLocation(190,250);
        txt2.setFont(fnt2);
       
        //Add label1,Label2,Label3,txt1,txt2 for frame 1
        frame1.add(label1);
        frame1.add(label2);
        frame1.add(label3);
        frame1.add(txt1);
        frame1.add(txt2);
        frame1.add(button1);
    }
    public static void main(String[] args) {
        Example obj= new Example();
        
    }
    
}
