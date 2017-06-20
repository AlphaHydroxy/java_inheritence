package com.example.user.employee;
import static org.junit.Assert.assertEquals;
import org.junit.*;

public class EmployeeTest {

    Employee employee;
    Manager manager;
    Director director;
    Engineer engineer;
    Admin admin;

    @Before
    public void before() {
        employee = new Employee(1, "Jia", "ssn0", 2000);
        manager = new Manager(2, "Richard", "ssn1", 3000, "Doggo");
        director = new Director(3, "Rocky", "ssn2", 4000, "Doggo", 50000);
        engineer = new Engineer(4, "Terry", "ssn3", 1999);
        admin = new Admin(5, "Lilly", "ssn4", 1998);
    }

    @Test
    public void employeeRaiseSalaryPreventNegativeValue(){
        double beforeSalary = employee.getSalary();
        employee.raiseSalary(-5000.0);
        double afterSalary = employee.getSalary();
        assertEquals(2000.0, employee.raiseSalary(), 0.01);
    }

    @Test
    public void managerRaiseSalaryPreventNegativeValue(){
        double beforeSalary = manager.getSalary();
        manager.raiseSalary(-7000);
        double afterSalary = manager.getSalary();
        assertEquals(beforeSalary, afterSalary, 0.01);
    }


    @Test
    public void employeePreventEmptyValueOnName(){
        String before = employee.getName();
        employee.setName("");
        String after = employee.getName();
        assertEquals("", employee.setName());
    }

    @Test
    public void employeePreventNullValueOnName(){
        String before = employee.getName();
        employee.setName(null);
        String after = employee.getName();
        assertEquals(before, after);
    }
}
