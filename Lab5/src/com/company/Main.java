package com.company;
public class Main {

    public static void main(String[] args) {
        Manager man1 = new Manager("Lera",500);
        Manager man2 = new Manager("Valera",120);
        man2.setManager(man1);
        Employee emp1 = new Employee("Albert");
        emp1.setManager(man2);
        Employee emp2 = new Employee("Max");
        emp2.setManager(man2);
        Employee emp3 = new Employee("Roman");
        emp3.setManager(man1);
        Manager man3 = new Manager("Denis",305);
        Manager man4 = new Manager("Max",456);
        man4.setManager(man3);
        Manager man5 = new Manager("Mykola",752);
        man5.setManager(man4);
        Manager man6 = new Manager("Masha",536);
        man6.setManager(man5);
        Employee emp4 = new Employee("Denis");
        emp4.setManager(man6);

        emp4.getManagerName();
        System.out.println(emp4.getTopManager(emp4.getManager()).toString());
    }
}
