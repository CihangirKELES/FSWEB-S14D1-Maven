package com.workintech.developers;

public class JuniorDeveloper extends Employee {
    //const
    public JuniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    //work method Override
    @Override
    public void work() {
        System.out.println(getName() + " is working as a Junior Developer.");
        setSalary(getSalary() + 1000);
    }
}
