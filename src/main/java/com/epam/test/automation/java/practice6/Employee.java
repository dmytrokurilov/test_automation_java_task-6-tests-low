package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public abstract class Employee {
    private final String name;
    private BigDecimal salary;
    private BigDecimal bonus;

    public String getName() {

        return name;
    }

    public BigDecimal getSalary() {

        return salary;
    }

    public void setSalary(BigDecimal salary) {

        this.salary = salary;
    }

    protected Employee(String name, BigDecimal salary) {
        this.name = name;
        this.salary = salary;
    }

    public BigDecimal getBonus() {
        return bonus;
    }


    public void setBonus(BigDecimal bonus) {
        this.bonus = bonus;
    }

    public BigDecimal toPay() {

        return salary.add(bonus);

    }
}
