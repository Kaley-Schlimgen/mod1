/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.p2mod1ct;

/**
 *
 * @author kaleyschlimgen
 */
public class Manager extends Employee {
    public void setDepartment(String newDepartment) {
        managerDepartment = newDepartment;
    }
    
    @Override
    public void printStatus() {
        System.out.println("Department: " + managerDepartment);
    }
    
    private String managerDepartment;
    
}
