package com.workintech.developers;

public class SeniorDeveloper extends Employee {
    //const!
    public SeniorDeveloper(int id, String name, double salary) {
        super(id, name, salary);
    }

    //work method override
    @Override
    public void work() {
        System.out.println(getName() + " is working as a Senior Developer.");
        setSalary(getSalary() + 3000);
    }
}
