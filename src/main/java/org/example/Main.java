package org.example;

public class Main {
    public static void main(String[] args) {
        // Interface example
        Programmer programmer = new Programmer("Mark", 2000, 5000);
        programmer.updateGrade();
        programmer.updateGrade();
        programmer.updateGrade();
        System.out.println("Grade is " + programmer.getGrade());

        // Legacy example
        Secretary secretary = new Secretary("Bob", 1912, 6500);
        secretary.updateGrade();
        secretary.updateGrade();
        secretary.updateGrade();

        Manager manager = new Manager("Martin", 2001, 100);
        Executive executive = new Executive("Elon", 1993, 999999);

        programmer.doWork();
        secretary.doWork();
        manager.doWork();

        executive.doWork();
        executive.giveSalary(manager, 5000);

        executive.getCar();

        Executive executive2 = new Executive("Jeff", 1976);
        executive2.getCar();

        executive2.giveSalary(secretary, 1000000);
    }
}