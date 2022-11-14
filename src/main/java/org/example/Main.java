package org.example;

import javax.swing.*;

public class Main extends JFrame {

    private JLabel lblManufacturer;
    private JTextField txtManufacturer;
    private JButton btnStartTest;


    Main(){
        super();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("IS4_Aplikacja_testowa_Skrzypczynski_Mikolaj");
        setSize(800,600);
        setLayout(new BoxLayout(this.getContentPane(),BoxLayout.Y_AXIS));
        initGUI();
        setVisible(true);



    }
    public static void main(String[] args) {
        Main main = new Main();
    }

    void initGUI()
    {
        lblManufacturer = new JLabel("test");
        add(lblManufacturer);
        txtManufacturer = new JTextField();
        add(txtManufacturer);
        btnStartTest    = new JButton("test");
        add(btnStartTest);



    }











}