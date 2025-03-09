/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.stlab2;

/**
 *
 * @author SIRME OverLoading
 */
public class STLab2 {

    public static void main(String[] args) {
        // OverLoding 
        Fruit f1 = new Fruit("Apple", 10);
        Fruit f2 = new Fruit("Banana");
        Fruit f3 = new Fruit();

        // Class and Instance 
        Club op = new Club();
        Club member1 = new Club("Esssam");
        Club member2 = new Club("Malak");

        System.out.println("Number of members now is: " + op.getCount());

        Club member3 = new Club("Mohamed");
        System.out.println("Number of members now is: " + op.getCount());

    }
}
