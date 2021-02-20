package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    @Override
    public void setBonus(BigDecimal bonus) {
        if (bonus == null) {
            throw new IllegalArgumentException();
        }
        if (bonus.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException();
        }

        if (percent <= 100) {
            this.setBonus(bonus);
        }
        if (percent > 100 && percent <= 200) {
            this.setBonus(bonus.multiply(BigDecimal.valueOf(2)));
        }
        if (percent > 200) {
            this.setBonus(bonus.multiply(BigDecimal.valueOf(3)));
        }

    }
}

