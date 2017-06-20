package com.example.user.employee;

public class Manager extends Employee {

    public String deptName;

    public Manager(int empId, String name, String ssn, double salary, String deptName) {
        super(empId, name, ssn, salary);
        this.deptName = deptName;
    }

    public String getDeptName(){
        return this.deptName;
    }

}
