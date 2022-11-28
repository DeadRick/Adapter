package org.example;

public class Manager extends Employee {

    public Manager(String name, Integer year, Integer salary) {
        super(name, year, salary);
    }

    public Manager(String name, Integer year) {
        super(name, year);
    }

    @Override
    public final void doWork() {
        System.out.println(name + " do manager work!");
    }
}
