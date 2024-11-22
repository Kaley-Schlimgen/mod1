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
        
        employeeItem.setFirstName("Bob");
        
        employeeItem.printStatus();
        
        managerItem.setFirstName("Sue");
        managerItem.setDepartment("Sales");
        
        managerItem.printStatus();
        //testing that it's updating
        //testtest
    }
}
