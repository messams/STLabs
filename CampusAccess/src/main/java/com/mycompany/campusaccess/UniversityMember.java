/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.campusaccess;

/**
 *
 * @author Malak
 */
public abstract class UniversityMember {
    private String name;
    private int id;
    private String department;
    private String systemRefCode;

    public UniversityMember(String name, int id, String department, String initials) {
        this.name = name;
        setId(id); 
        this.department = department;
        this.systemRefCode = "CampusID:KSU-ICS-AI-" + initials.toUpperCase();
    }

    public abstract String[] getAccessAreas();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (id < 0) {
            throw new IllegalArgumentException("ID cannot be negative.");
        }
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSystemRefCode() {
        return systemRefCode;
    }

   
    @Override
    public String toString() {
        return name + " (ID: " + id + ")\nDepartment: " + department +"\nAccess Areas: " + String.join(", ", getAccessAreas()) +"\nSystem Ref: " + systemRefCode;
    }
}