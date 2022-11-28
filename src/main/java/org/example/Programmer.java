package org.example;

import java.util.Random;

public final class Programmer extends Employee implements Gradable {
    int grade = 1;
    public Programmer(String name, Integer year, Integer salary) {
        super(name, year, salary);
    }

    public Programmer(String name, Integer year) {
        super(name, year, 500);
    }

    @Override
    public void doWork() {
        System.out.println(name + "are coding a program!");
    }

    @Override
    public void updateGrade() {
        Random random = new Random();
        if (random.nextDouble() <= 0.5) {
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
