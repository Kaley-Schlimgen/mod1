/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.p2mod1ct;

/**
 *
 * @author kaleyschlimgen
 */
public class P2Mod1CT {

    public static void main(String[] args) {
        Employee employeeItem = new Employee();
        Manager managerItem = new Manager();
        
        System.out.println("EMPLOYEE INFORMATION");
        employeeItem.setFirstName("John");
        employeeItem.setLastName("Smith");
        employeeItem.setSalary(35000);
        employeeItem.setEmployeeID(555);
        employeeItem.employeeSummary();
        System.out.println();
        
        System.out.println("MANAGER INFORMATION");
        managerItem.setFirstName("Sue");
        managerItem.setLastName("Sanderson");
        managerItem.setSalary(70000);
        managerItem.setEmployeeID(001);
        managerItem.setDepartment("Sales");
        managerItem.employeeSummary();
   
    }
}
