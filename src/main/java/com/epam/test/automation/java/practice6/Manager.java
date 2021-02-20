package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class Manager extends Employee {
    private final int quantity;

    public Manager(String name, BigDecimal salary, int clientAmount) {
        super(name, salary);
        quantity = clientAmount;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (quantity <= 0 || bonus == null || bonus.compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException();
        }
        else if (quantity > 100 && quantity <=150) {
            this.bonus = bonus.add(BigDecimal.valueOf(500));
        }
        else if (quantity > 150) {
            this.bonus = bonus.add(BigDecimal.valueOf(1000));
        }
        else {
            this.bonus = bonus;
        }

    }
}

