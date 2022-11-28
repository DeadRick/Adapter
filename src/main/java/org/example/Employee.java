package org.example;

public abstract class Employee {
    public String name;
    public Integer salary;
    final Integer yearOfBirth;

    public Employee(String name, Integer year, Integer salary) {
        yearOfBirth = year;
        this.name = name;
        this.salary = salary;
    }

    public Employee(String name, Integer year) {
        this(name, year, 100);
    }

    public abstract void doWork();
}
