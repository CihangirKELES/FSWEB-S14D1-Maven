package com.workintech.developers;

public class HRManager extends Employee {
    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    //const
    public HRManager(int id, String name, double salary) {
        super(id, name, salary);
        juniorDevelopers = new JuniorDeveloper[5];
        midDevelopers = new MidDeveloper[5];
        seniorDevelopers = new SeniorDeveloper[5];
    }

    //addEmployee method 'jrDev'
    public void addEmployee(JuniorDeveloper developer) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = developer;
                System.out.println(developer.getName() + " added to Junior Developers.");
                return;
            }
        }
        System.out.println("Junior Developer array is full!");
    }

    //addEmployee method 'midDev'
    public void addEmployee(MidDeveloper developer) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = developer;
                System.out.println(developer.getName() + " added to Mid Developers.");
                return;
            }
        }
        System.out.println("Mid Developer array is full!");
    }

    //addEmployee method 'srDev'
    public void addEmployee(SeniorDeveloper developer) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = developer;
                System.out.println(developer.getName() + " added to Senior Developers.");
                return;
            }
        }
        System.out.println("Senior Developer array is full!");
    }
}
