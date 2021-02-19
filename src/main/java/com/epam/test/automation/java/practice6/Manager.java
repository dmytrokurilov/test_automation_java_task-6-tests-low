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
        if (quantity <= 100) {
            super.setBonus(bonus);
        }
        if (quantity > 100 && quantity <= 150) {
            super.setBonus(bonus.add(BigDecimal.valueOf(500)));
        }
        if (quantity > 150) {
            super.setBonus(bonus.add(BigDecimal.valueOf(1000)));
        }
    }
}

