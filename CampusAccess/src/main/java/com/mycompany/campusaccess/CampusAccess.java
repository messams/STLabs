/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.campusaccess;

/**
 *
 * @author SIRME
 */
public class CampusAccess {

    public static void main(String[] args) {
        Student s1 = new Student("Ali Khaled", 101, "Computer Science", "AK");
        Staff st1 = new Staff("Mohamed Essam", 102, "Engineering", "ME");
        Admin a1 = new Admin("Malak Khaled", 103, "Administration", "MK");

        AccessController.printAccessInfo(s1);
        System.out.println();
        AccessController.printAccessInfo(st1);
        System.out.println();
        AccessController.printAccessInfo(a1);
    }
}

  