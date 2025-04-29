/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.stlab6;

/**
 *
 * @author SIRME
 */
public class STLab6 {
    
    public static void testPoly(Fruit f) {
        f.ayhaga();
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Fruit f = new Fruit();
        Fruit a = new Apple();
        Fruit b = new Banana();
        Fruit c = new Citrus();
        Fruit o = new Orange();
        Fruit l = new Limon();
        Fruit g = new Guava();
        
        ((Apple) a).apClassName();
        a.ayhaga();
        
        Fruit fArr[] = new Fruit[5];
        fArr[0] = a;
        fArr[1] = b;
        fArr[2] = c;
        fArr[3] = o;
        fArr[4] = l;
        
        for (int i = 0; i < 5; i++) {
            fArr[i].ayhaga();
        }
        
        testPoly(new Apple());
        testPoly(new Banana());
        testPoly(new Citrus());
        testPoly(new Orange());
        testPoly(new Limon());
        testPoly(new Guava());
        
    }
}
