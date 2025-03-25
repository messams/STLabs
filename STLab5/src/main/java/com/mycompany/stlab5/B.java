/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stlab5;

/**
 *
 * @author SIRME
 */
public class B extends A {

    private int l;
    public int n;
    public int m;
    int o;

    public B(int n, int m, int x, int y) {
        super(x, y);
        this.n = n;
        this.m = m;
    }

    @Override
    public String toString() {
        return super.toString() + "\nB{" + "l=" + l + ", n=" + n + ", m=" + m + ", o=" + o + '}';
    }

}
