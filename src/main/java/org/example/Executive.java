package org.example;

public class Executive extends Manager {

    private final String car;
    public Executive(String name, Integer year, Integer salary) {
        super(name, year, salary);
        car = "Volga";
    }

    public Executive(String name, Integer year) {
        super(name, year, 1000);
        car = "Tesla";
    }

    public void getCar() {
            System.out.println("Wow! " + name + " have a new car. It's " + car);
    }

    protected void giveSalary(Employee human, Integer money) {
        System.out.println("\n" + name + " give a salary to " + human.name);
        if (human instanceof Programmer p) {
            System.out.println("Salary increased! " + (money - human.salary) * p.grade + "$\n");
            human.salary = money * ((Programmer) human).grade;
        } else if (human instanceof Secretary s) {
            System.out.println("Salary increased! " + (money - human.salary) * s.grade + "$\n");
            human.salary = money * ((Secretary) human).grade;
        } else {
            System.out.println("\n" + name + " give a salary to " + human.name);
            System.out.println("Salary increased! " + (money - human.salary) + "$\n");
            human.salary = money;
        }
    }
}
