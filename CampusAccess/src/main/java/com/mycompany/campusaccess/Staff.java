/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campusaccess;

/**
 *
 * @author Malak
 */
public class Staff extends UniversityMember {

    public Staff(String name, int id, String department, String initials) {
        super(name, id, department, initials);
    }

    @Override
    public String[] getAccessAreas() {
        return new String[]{"Library", "Labs", "Buildings"};
    }
}
