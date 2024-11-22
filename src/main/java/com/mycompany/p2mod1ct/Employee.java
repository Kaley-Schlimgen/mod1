/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2mod1ct;

/**
 *
 * @author kaleyschlimgen
 */
public class Employee {
    public void setFirstName(String newFirstName) {
        firstName = newFirstName;
    }
    
    public void printStatus() {
        System.out.println("Name: " + firstName);
    }
    
    protected String firstName;

    
}
