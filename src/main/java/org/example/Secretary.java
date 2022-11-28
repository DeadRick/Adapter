package org.example;

import java.util.Random;

public class Secretary extends Employee implements Gradable {
    int grade = 5;
    public Secretary(String name, Integer year, Integer salary) {
        super(name, year, salary);
    }

    public Secretary(String name, Integer year) {
        super(name, year);
    }

    @Override
    public void doWork() {
        System.out.println(name + " do a secretary work!");
    }

    @Override
    public void updateGrade() {
        Random random = new Random();
        if (random.nextDouble() <= 0.2) {
            grade++;
        } else {
            grade--;
        }
    }

    @Override
    public int getGrade() {
        return grade;
    }
}
