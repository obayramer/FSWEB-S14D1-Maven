package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("Junior Developer is learning and working on simple tasks.");
        setSalary(getSalary() + 5000);
    }
}
