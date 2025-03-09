/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stlab2;

/**
 *
 * @author SIRME Class Variables Vs. Instance Variable
 */
public class Club {

    int id = 1; // A class variable
    static int count = 0; // An instance variable

    public Club(String name) {
        count++;
        id = count;
        System.out.println(name + " has id No. " + id);
    }

    public Club() {
        System.out.println("Welcom to my Club!");
    }

    public static int getCount() {
        return count;
    }

}
