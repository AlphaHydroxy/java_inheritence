package com.example.user.employee;

public class Employee {

    private int empId;
    private String name;
    private String ssn;
    private double salary;

    public Employee(int empId, String name, String ssn, double salary) {
        this.empId = empId;
        this.name = name;
        this.ssn = ssn;
        this.salary = salary;
    }

    public void setName(String name) {
        if (name == "" || name == null){
            return;
        }
        this.name = name;
    }

    public double getSalary() {
       return this.salary;
    }

    public void raiseSalary(double amount){
        if(amount < 0) {
            return;
        }
        this.salary += amount;
    }

    public String getName() {
        return this.name;
    }
}
