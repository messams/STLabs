/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.stlab3;

/**
 *
 * @author SIRME
 */
public class Fruit {

    private String name, color, type;
    private Float SL;

    public Fruit() {
        name = "Apple";
        color = "red";
        type = "fruit";
        SL = 10.987f;
    }

    public Fruit(String name, String color, String type, Float SL) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.SL = SL;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setSL(Float SL) {
        this.SL = SL;
    }

    public Float getSL() {
        return SL;
    }

}
