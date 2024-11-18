package com.workintech.developers;

public class Main {
    public static void main(String[] args) {
        //hrmanager
        HRManager hrManager = new HRManager(1, "John Doe", 5000);

        //jr,mid,sr.
        JuniorDeveloper juniorDev = new JuniorDeveloper(2, "Alice", 3000);
        MidDeveloper midDev = new MidDeveloper(3, "Bob", 5000);
        SeniorDeveloper seniorDev = new SeniorDeveloper(4, "Charlie", 7000);

        //add hrMan.
        hrManager.addEmployee(juniorDev);
        hrManager.addEmployee(midDev);
        hrManager.addEmployee(seniorDev);

        //add dev work methods
        juniorDev.work();
        midDev.work();
        seniorDev.work();

        //add employee wage
        System.out.println(juniorDev.getName() + "'s new salary: " + juniorDev.getSalary());
        System.out.println(midDev.getName() + "'s new salary: " + midDev.getSalary());
        System.out.println(seniorDev.getName() + "'s new salary: " + seniorDev.getSalary());
    }
}
