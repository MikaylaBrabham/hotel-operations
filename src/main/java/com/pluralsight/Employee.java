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
    public double getRegularHours(){
       if(this.hoursWorked <= 40){
        return this.hoursWorked;
        } return 40;
}


    //add overtime hours
    public double getOvertimeHours() {
        if(this.hoursWorked >= 40){
            return this.hoursWorked - 40;
        } return 0;
    }


    // add  total pay
    public double getTotalPay() {
        //add regular pay
        double regularHours = this.getRegularHours() * this.payRate;
        // add overtime pay
        double overtimeHoursPay = this.getOvertimeHours() * this.payRate * 1.5;

        return regularHours + overtimeHoursPay;
        }


        // exercise 2

    //add in and define these new methods

            //these are stored
    // start time int private not void
    // end time int private not void


             // these are derived
    //punch in method private not void
        // employee is punched in
            // returns the employee start time


    //punch out method private not void
    // employee is punched out
        // calculate hours worked now (get start time - get end time )
        // calculate total hours worked ( their previous hours + todays hours)
    }

