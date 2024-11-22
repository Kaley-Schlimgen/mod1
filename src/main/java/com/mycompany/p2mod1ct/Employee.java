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
    
    public void setLastName(String newLastName) {
        lastName = newLastName;
    }

    public void setEmployeeID(int newEmployeeID) {
        employeeID = newEmployeeID;
    }
    
    public double setSalary(double newSalary) {
        salaryAmount = 0;
        salaryAmount = newSalary;
//FIXME format 2 decimal places
        
        return salaryAmount;
    
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getEmployeeID() {
        return employeeID;
    }
    //public double getSalary() {
    //    return salaryAmount;
    //}

    public void employeeSummary() {
        //System.out.println("EMPLOYEE INFORMATION");
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Salary: $" + salaryAmount);
        System.out.println("ID: " + employeeID);
    }
    
    protected String firstName;
    protected String lastName;
    protected int employeeID;
    protected double salaryAmount;

    
}
