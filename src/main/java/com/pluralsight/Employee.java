package com.pluralsight;

public class Employee {

//added stored methods
    private String employeeID;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;


//add constructors for each stored

    public Employee(String employeeID, String name, String department, double payRate, double hoursWorked) {
        this.employeeID = employeeID;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }


//add getters and setters for each stored

    public String getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(String employeeID) {
        this.employeeID = employeeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getPayRate() {
        return payRate;
    }

    public void setPayRate(double payRate) {
        this.payRate = payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(double hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    //add regular hours
    public double getRegularHours(double regularHours) {
       if(this.hoursWorked <= 40){
        } return regularHours;
        }

    //add overtime hours
    public double getOvertimeHours(double overtimeHours) {
        if(this.hoursWorked >= 41){
        } return overtimeHours;
    }

    // add  total pay derived getters
    public void  getTotalPay(double totalPay) {

        //add regular pay

        // add overtime pay

    }
}
