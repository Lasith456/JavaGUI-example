package com.company;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Consultation {
    JFrame menuFrame=new JFrame();
    JPanel menuhead=new JPanel();
    JButton addPbutton=new JButton("Add Patient");
    JButton consbutton=new JButton("Consultation");
    JButton docbutton=new JButton("Doctor List");
    JButton mexitbutton=new JButton("Exit");
    JButton dexitbutton=new JButton("Main menu");
    JLabel menuName=new JLabel("Skin Consultation Centre");

    //Doctor Table
    JFrame doctorFrame=new JFrame();
    JPanel docPanel=new JPanel();
    JTable doctable = new JTable();
    JButton sbutton=new JButton("Sort List");
    JButton unbutton=new JButton("Unsorted list");

    //consultant Table
    JFrame consultFrame=new JFrame();
    JTextArea txtArea = new JTextArea();
    JTextField choice=new JTextField();
    JButton consmenu=new JButton("Main menu");
    JButton show=new JButton("Show Details");
    JLabel con3=new JLabel("Booking ID:");

    //Add patient
    JFrame patientFrame=new JFrame();
    JPanel addpat=new JPanel();
    JPanel subpat=new JPanel();
    JPanel subpatc=new JPanel();
    JLabel p1label1=new JLabel("Patient's First Name:");
    JLabel p1label2=new JLabel("Patient's Last Name:");
    JLabel p1label3=new JLabel("Patient's Date of birth (yyyy-mm-dd):");
    JLabel p1label4=new JLabel("Patient's Mobile Number:");
    JLabel p1label5=new JLabel("Patient's Sickness:");
    JLabel P1label7=new JLabel("Patient's NIC Number:");
    JTextField p1txt1=new JTextField();
    JTextField p1txt2=new JTextField();
    JTextField p1txt3=new JTextField();
    JTextField p1txt4=new JTextField();
    JTextField p1txt5=new JTextField();
    JTextField p1txt6=new JTextField();
    JTextField p1txt7=new JTextField();
    JTextField p1txt8=new JTextField();
    JLabel p1label6=new JLabel();
    JLabel p2label1=new JLabel("Booking ID:");
    JLabel p2label1c=new JLabel();
    JLabel p2label1b=new JLabel();
    JLabel p2label1d=new JLabel();
    JLabel p2label2=new JLabel("Consultation Cost:");
    JLabel p2label3=new JLabel("Doctors Name:");
    JLabel p2label4=new JLabel("Date(day-Month-Year):");
    JLabel p2label5=new JLabel("Start Time(HH:MM):");
    JLabel p2label6=new JLabel("End Time(HH:MM):");
    JButton paddbutton=new JButton("Add Patient");
    JButton checkbutton=new JButton("check Availablity");
    JButton subbutton=new JButton("Submit");
    JButton metbutton=new JButton("Main menu");

    public int timetecount;
    public int costvalue;
    Font fntMenu=new Font("TimesNewRoman",Font.BOLD,50);
    Font fntTable=new Font("TimesNewRoman",Font.BOLD,20);
    public static ArrayList<String> temporaryStore=new ArrayList<>();
    public static ArrayList<String> timeTemp=new ArrayList<>();
    public Consultation(ArrayList<Doctor> doctorArrayList, ArrayList<Patient> patientList){
        menuFrame.setTitle("Skin Consultation Centre");
        menuFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        menuFrame.setSize(1650,1080);
        menuFrame.setLayout(null);
        menuFrame.setVisible(true);
        menuFrame.getContentPane().setBackground(new Color(121,149,240));
        menuFrame.add(menuhead);
        menuFrame.add(addPbutton);
        menuFrame.add(consbutton);
        menuFrame.add(docbutton);
        menuFrame.add(mexitbutton);
        menuhead.add(menuName);

        menuhead.setBackground(new Color(155,74,106));
        menuhead.setBounds(0,0,1650,200);
        addPbutton.setBounds(50,500,300,150);
        addPbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuFrame.setVisible(false);
                patientFrame.setVisible(true);
            }
        });
        consbutton.setBounds(550,500,300,150);
        consbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuFrame.setVisible(false);
                consultFrame.setVisible(true);
            }
        });
        docbutton.setBounds(1050,500,300,150);
        docbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuFrame.setVisible(false);
                doctorFrame.setVisible(true);
            }
        });
        mexitbutton.setBounds(1150,700,200,40);
        mexitbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        menuName.setHorizontalTextPosition(JLabel.CENTER);
        menuName.setVerticalTextPosition(JLabel.CENTER);
        menuName.setForeground(new Color(20,160,150));
        menuName.setFont(fntMenu);

        //Doctor Table frame
        doctorFrame.setTitle("Doctor Details Table");
        doctorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        doctorFrame.setSize(1650,1080);
        doctorFrame.setLayout(null);
        doctorFrame.getContentPane().setBackground(new Color(121,149,240));
        doctorFrame.add(docPanel);
        doctorFrame.add(unbutton);
        unbutton.setBounds(550,600,300,150);
        doctorFrame.add(sbutton);
        sbutton.setBounds(50,600,300,150);
        doctorFrame.add(dexitbutton);
        dexitbutton.setBounds(1050,600,300,150);
        docPanel.setBackground(Color.GRAY);
        docPanel.setBounds(10,80,1400,500);
        doctable.setBounds(10,10,1200,400);
        dexitbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                doctorFrame.setVisible(false);
                menuFrame.setVisible(true);
            }
        });
        DefaultTableModel defaultTableModel = new DefaultTableModel() {
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        unbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                defaultTableModel.setRowCount(0);
                for (int i = 0; i < doctorArrayList.size(); i++) {
                    String doctorName = doctorArrayList.get(i).getName();
                    String doctorSurname = doctorArrayList.get(i).getSurName();
                    String dateofbirth = String.valueOf(doctorArrayList.get(i).getBirthDay());
                    String mobilenumber = String.valueOf(doctorArrayList.get(i).getMobileNumber());
                    String lisencenum = String.valueOf(doctorArrayList.get(i).getMedicalLicenenum());
                    String specialization = doctorArrayList.get(i).getSpecialization();

                    defaultTableModel.addRow(new Object[]{doctorName, doctorSurname, dateofbirth, mobilenumber, lisencenum, specialization});
                }
            }
        });
        sbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                defaultTableModel.setRowCount(0);
                for (int y = 0; y < doctorArrayList.size(); y++) {
                    temporaryStore.add(doctorArrayList.get(y).getName());
                }
                for (int i = 0; i < doctorArrayList.size(); i++) {
                    Collections.sort(temporaryStore);
                    String doctorName = temporaryStore.get(i);
                    for (int x = 0; x < doctorArrayList.size(); x++) {
                        if (doctorArrayList.get(x).getName() == temporaryStore.get(i)) {
                            String doctorSurname = doctorArrayList.get(x).getSurName();
                            String dateofbirth = String.valueOf(doctorArrayList.get(x).getBirthDay());
                            String mobilenumber = String.valueOf(doctorArrayList.get(x).getMobileNumber());
                            String lisencenum = String.valueOf(doctorArrayList.get(x).getMedicalLicenenum());
                            String specialization = doctorArrayList.get(x).getSpecialization();
                            defaultTableModel.addRow(new Object[]{ doctorName, doctorSurname, dateofbirth, mobilenumber, lisencenum, specialization});
                        }
                    }
                }
                temporaryStore.clear();
            }
        });
        defaultTableModel.setColumnIdentifiers(new String[]{"Name", "SurName", "Date Of Birth","Mobile Number", "License Number", "Specialisation"});
        doctable.setModel(defaultTableModel);

        JScrollPane scrollPane = new JScrollPane(doctable);
        scrollPane.setFont(fntTable);
        docPanel.add(scrollPane);

        //Add patients..
        subpat.setVisible(false);
        patientFrame.setTitle("Add Patients");
        patientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        patientFrame.setSize(1650,1080);
        patientFrame.setLayout(null);
        patientFrame.getContentPane().setBackground(new Color(121,149,240));
        patientFrame.add(addpat);
        patientFrame.add(subpatc);
        patientFrame.add(metbutton);
        metbutton.setBounds(1150,700,200,40);
        metbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menuFrame.setVisible(true);
                patientFrame.setVisible(false);
            }
        });
        subpatc.setBackground(Color.GRAY);
        subpatc.setBounds(750,100,600,500);
        addpat.setBackground(Color.GRAY);
        addpat.setBounds(50,100,600,500);
        subpatc.setVisible(true);
        patientFrame.add(subpat);
        subpat.setBackground(Color.GRAY);
        addpat.setLayout(null);
        subpat.setLayout(null);
        subpat.setBounds(750,100,600,500);
        addpat.add(p1label1);
        addpat.add(p1txt1);
        addpat.add(p1txt2);
        addpat.add(p1txt3);
        addpat.add(p1txt4);
        addpat.add(p1txt5);
        addpat.add(p1txt6);
        addpat.add(p1txt7);
        addpat.add(paddbutton);
        addpat.add(p1txt8);
        p1label1.setBounds(20,80,290,30);
        p1txt1.setBounds(300,80,290,30);
        addpat.add(p1label2);
        p1label2.setBounds(20,120,290,30);
        p1txt2.setBounds(300,120,290,30);
        addpat.add(p1label3);
        p1label3.setBounds(20,160,290,30);
        p1txt3.setBounds(300,160,60,30);
        p1txt4.setBounds(370,160,30,30);
        p1txt5.setBounds(410,160,30,30);
        addpat.add(p1label4);
        p1label4.setBounds(20,200,290,30);
        p1txt6.setBounds(300,200,290,30);
        addpat.add(p1label5);
        p1label5.setBounds(20,240,290,30);
        addpat.add(P1label7);
        P1label7.setBounds(20,280,290,30);
        p1txt7.setBounds(300,240,290,30);
        p1txt8.setBounds(300,280,290,30);
        paddbutton.setBounds(250,450,100,40);
        addpat.add(p1label6);
        p1label6.setBounds(250,400,300,40);
        paddbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                subpat.setVisible(true);
                subpatc.setVisible(false);
                p2label1c.setVisible(true);
                try{
                    int getId = Integer.parseInt(p1txt8.getText());
                    if(patientList.size()==0){
                        costvalue=15;
                    }else{
                        for (int i = 0; i < patientList.size(); i++) {
                            if (getId==patientList.get(i).getNic()) {
                                costvalue = 25;
                            } else {
                                costvalue = 15;
                            }
                        }
                    }

            } catch(NumberFormatException numberFormatException){
                    System.out.println("Invalid input please try again..");
            }
            }
        });
        subpat.add(p2label1);
        subpat.add(p2label2);
        subpat.add(p2label1c);
        subpat.add(p2label3);
        subpat.add(p2label4);
        subpat.add(p2label5);
        subpat.add(p2label6);
        subpat.add(p2label1b);
        subpat.add(p2label1d);

        p2label1d.setBounds(220,280,300,30);
        p2label1.setBounds(20,80,200,30);
        p2label1c.setBounds(220,80,300,30);
        p2label1b.setBounds(220,400,300,30);
        p2label3.setBounds(20,120,300,30);
        p2label4.setBounds(20,160,300,30);
        p2label5.setBounds(20,200,300,30);
        p2label6.setBounds(20,240,300,30);
        p2label2.setBounds(20,280,300,30);

        //Combo box data input..
        String doc[]=new String[doctorArrayList.size()+1];
        for(int i = 0; i<doctorArrayList.size(); i++) {
            doc[i] = doctorArrayList.get(i).getName();
        }
        JComboBox combodoc=new JComboBox(doc);
        combodoc.setBounds(220,120,200,20);
        subpat.add(combodoc);

        String date[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30","31"};
        JComboBox comboboxd=new JComboBox(date);
        subpat.add(comboboxd);
        comboboxd.setBounds(220,160,60,20);

        String month[]={"01","02","03","04","05","06","07","08","09","10","11","12"};
        JComboBox comboboxm=new JComboBox(month);
        comboboxm.setBounds(280,160,70,20);
        subpat.add(comboboxm);

        String year[]={"2022","2023","2024","2025"};
        JComboBox comboboxy=new JComboBox(year);
        comboboxy.setBounds(340,160,100,20);
        subpat.add(comboboxy);

        String time[]={"08","09","10","11","12","14","15","16","17","18","19","20"};
        JComboBox comboboxh=new JComboBox(time);
        comboboxh.setBounds(220,200,70,20);
        subpat.add(comboboxh);

        String minutes[]={"00"};
        JComboBox comboboxmi=new JComboBox(minutes);
        comboboxmi.setBounds(290,200,70,20);
        subpat.add(comboboxmi);

        String etime[]={"08","09","10","11","12","14","15","16","17","18","19","20"};
        JComboBox ecomboboxh=new JComboBox(etime);
        ecomboboxh.setBounds(220,240,70,20);
        subpat.add(ecomboboxh);

        String eminutes[]={"00"};
        JComboBox ecomboboxmi=new JComboBox(eminutes);
        ecomboboxmi.setBounds(290,240,70,20);
        subpat.add(ecomboboxmi);

        //Check availabel time
        subpat.add(checkbutton);
        checkbutton.setBounds(30,450,150,40);
        timeTemp.add("ooowwwoo");
        checkbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nameT = String.valueOf(combodoc.getSelectedItem());
                String yearT = String.valueOf(comboboxy.getSelectedItem());
                String monthT = String.valueOf(comboboxm.getSelectedItem());
                String dayT = String.valueOf(comboboxd.getSelectedItem());
                String stimeHT = String.valueOf(comboboxh.getSelectedItem());
                String stimemT = String.valueOf(comboboxmi.getSelectedItem());
                String etimeHT = String.valueOf(ecomboboxh.getSelectedItem());
                String etimemT = String.valueOf(ecomboboxmi.getSelectedItem());
                String tempTime = nameT + yearT + monthT + dayT + stimeHT + stimemT + etimeHT + etimemT;
                String conDoc="Dr."+nameT+" \n"+"Date:-"+yearT+"-"+monthT+"-"+dayT+"\n"+"Time:-"+stimeHT+":"+stimemT+" to "+etimeHT+":"+etimemT;
                for (int timete = 0; timete < timeTemp.size(); timete++) {
                    timetecount=timete;
                }
                if (tempTime.equals(timeTemp.get(timetecount))) {
                    p2label1b.setText("this time is not availabel");
                    int position;
                    for (int i=0; i<doctorArrayList.size(); i++) {
                        if(doctorArrayList.get(i).getName()== nameT ){
                            position=i-1;
                            JOptionPane.showMessageDialog(null,"Dr."+doctorArrayList.get(position).getName()+" is available this time");
                        }
                    }
                } else {
                    p2label1b.setText("this time is availabel");
                    subbutton.setVisible(true);
                    timeTemp.add(tempTime);
                    int hours=(Integer.parseInt(etimeHT)-Integer.parseInt(stimeHT));

                    int price=costvalue*hours;
                    p2label1d.setText(String.valueOf(price));
                }
                int r=patientList.size();
                int num=r+1000;
                p2label1c.setText(String.valueOf(num));
                p2label1d.setVisible(true);
                p2label1b.setVisible(true);
                int year1=Integer.parseInt(p1txt3.getText());
                int month1=Integer.parseInt(p1txt4.getText());
                int day1=Integer.parseInt(p1txt5.getText());
                int nic=Integer.parseInt(p1txt8.getText());
                LocalDate birthDay = LocalDate.of(year1,month1,day1);
                patientList.add(new Patient(p1txt1.getText().trim(),p1txt2.getText().trim(),birthDay,p1txt6.getText().trim(),p1txt7.getText().trim(),nic,num,conDoc));
            }
        });
        subpat.add(subbutton);
        subbutton.setVisible(false);
        subbutton.setBounds(400,450,150,40);
        subbutton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                p1txt1.setText("");
                p1txt2.setText("");
                p1txt6.setText("");
                p1txt7.setText("");
                p1txt3.setText("");
                p1txt4.setText("");
                p1txt5.setText("");
                p1txt8.setText("");
                p2label1c.setText("");
                p2label1d.setText("");
                p2label1b.setText("");
                p2label1c.setVisible(false);
                p2label1d.setVisible(false);
                p2label1b.setVisible(false);
                p1label6.setText("Succefully added...");
                p1label6.setText("");
                JOptionPane.showMessageDialog(null,"Your details Succefully Added.");
                subpatc.setVisible(true);
                subpat.setVisible(false);
            }
        });

        //Console Table frame
        consultFrame.setTitle("Consultation");
        consultFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        consultFrame.setSize(1650,1080);
        consultFrame.setLayout(null);
        consultFrame.getContentPane().setBackground(new Color(121,149,240));
        consultFrame.add(txtArea);
        consultFrame.add(consmenu);
        consultFrame.add(show);
        consultFrame.add(choice);
        consultFrame.add(con3);
        choice.setBounds(350,450,250,40);
        con3.setBounds(30,450,300,40);
        show.setBounds(150,550,200,40);
        txtArea.setBounds(750,100,600,500);
        txtArea.setForeground(Color.black);
        consmenu.setBounds(1150,700,200,40);

        show.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int choices=Integer.parseInt(choice.getText());
                int position=0;
                boolean sure=false;
                for (int i=0; i<patientList.size(); i++) {
                    if(patientList.get(i).getNum()== choices ){
                        position=i;
                        sure=true;
                    }
                }
                if (sure){
                    String patientName = patientList.get(position).getName();
                    String patientSurname = patientList.get(position).getSurName();
                    String patientDateofbirth = String.valueOf(patientList.get(position).getBirthDay());
                    String pMobilenumber = String.valueOf(patientList.get(position).getMobileNumber());
                    String pNic = String.valueOf(patientList.get(position).getNic());
                    String pSpecialization = patientList.get(position).getSickness();
                    String details=patientList.get(position).getDetails();
                    txtArea.setText("Patient Full Name: "+patientName+" "+patientSurname+"\n" +
                            "Patient's Birthday: "+patientDateofbirth+"\n" +
                            "Patient's Mobile Number: "+pMobilenumber+"\n" +
                            "Patient's NIC Number: "+pNic+"\n" +
                            "Patient's Sickness: "+pSpecialization+"\n"+details);
                }
            }
        });
        consmenu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                consultFrame.setVisible(false);
                menuFrame.setVisible(true);
                txtArea.setText(" ");
                choice.setText(" ");
            }
        });
    }
}
