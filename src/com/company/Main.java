package com.company;

import javax.swing.*;

import static javax.swing.JFrame.*;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println("22 in pocket");

        SimpleClass sc = new SimpleClass();
        sc.setBounds(100,100,100,100);
        sc.setDefaultCloseOperation(EXIT_ON_CLOSE);
        sc.setVisible(true);
        
        System.out.println("Ops");
    }
}
