package com.workintech.developers;

import java.util.ArrayList;

public class HRManager extends Employee {
    private ArrayList<JuniorDeveloper> juniorDevelopers = new ArrayList<>();
    private ArrayList<MidDeveloper> midDevelopers = new ArrayList<>();
    private ArrayList<SeniorDeveloper> seniorDevelopers = new ArrayList<>();

    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
    }

    public void work() {
        System.out.println("HRManager manages employees and processes salaries.");
    }

    public void addEmployee(JuniorDeveloper developer) {
        if (juniorDevelopers.contains(developer)) {
            System.out.println("Junior developer already exists.");
        } else {
            juniorDevelopers.add(developer);
        }
    }

    public void addEmployee(MidDeveloper developer) {
        if (midDevelopers.contains(developer)) {
            System.out.println("Mid developer already exists.");
        } else {
            midDevelopers.add(developer);
        }
    }

    public void addEmployee(SeniorDeveloper developer) {
        if (seniorDevelopers.contains(developer)) {
            System.out.println("Senior developer already exists.");
        } else {
            seniorDevelopers.add(developer);
        }
    }
}
