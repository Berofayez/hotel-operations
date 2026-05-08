package com.pluralsight;

import java.time.LocalTime;

public class Employee {
    private int employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private final double regularHours = 40;
    private int startTime;

    public Employee(int employeeId, String name, String department, double payRate) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
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

    public double getTotalPay(){
        return payRate * hoursWorked;
    }
    public double getRegularHours(){
        return regularHours;

    }
    public double getOvertimeHours(){
        return  hoursWorked - regularHours;
    }

    public void punchIn(int startTime){
        this.startTime = startTime;
    }

    public void punchOut(int endTime){
        hoursWorked += endTime - startTime;
    }

    public void punchIn(){
        int startTime = LocalTime.now().getHour();
    }
    public void punchOut(){
        int endTime = LocalTime.now().getHour();
        hoursWorked += endTime - startTime;
    }

    public void punchTimeCard(int startTime, int endTime){
        hoursWorked += endTime - startTime;
    }
}
