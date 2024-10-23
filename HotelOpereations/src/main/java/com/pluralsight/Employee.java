package com.pluralsight;

import java.time.LocalDateTime;

public class Employee {
    private int employeeID;
    private String name;
    private String department;
    private int hoursWorked;
    private double payRate;

    LocalDateTime dateTime = LocalDateTime.now();

    public Employee(int employeeID, String name, String department, int hoursWorked, double payRate) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.hoursWorked = hoursWorked;
        this.payRate = payRate;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getRegularHours() {
        return hoursWorked = 40;
    }
    public double getOverTime() {
        return hoursWorked - 40;
    }

    public void punchIn(Employee employee){
        
    }


}


