/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stlab5;

/**
 *
 * @author SIRME
 */
public class C extends B {

    int b;
    static int a;
    int c;

    public C(int b, int c, int n, int m, int x, int y) {
        super(n, m, x, y);
        this.b = b;
        this.c = c;
    }

    @Override
    public String toString() {
        return super.toString() + "C{" + "b=" + b + ", c=" + c + ", a=" + a + '}';
    }

}
