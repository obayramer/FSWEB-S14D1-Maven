package com.workintech.developers;

public class MidDeveloper extends Employee {
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("Mid Developer is handling complex tasks.");
        setSalary(getSalary() + 10000);
    }
}