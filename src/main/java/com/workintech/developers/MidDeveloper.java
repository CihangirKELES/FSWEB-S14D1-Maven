package com.workintech.developers;

public class MidDeveloper extends Employee {
    //const
    public MidDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    //work method override
    @Override
    public void work() {
        System.out.println(getName() + " is working as a Mid Developer.");
        setSalary(getSalary() + 2000);
    }
}
