package com.epam.test.automation.java.practice6;

import java.math.BigDecimal;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, BigDecimal salary, int percent) {
        super(name, salary);
        this.percent = percent;
    }

    public void setBonus(BigDecimal bonus) {
        if (percent <= 100) {
            super.setBonus(bonus);
        }
        if (percent > 100 && percent <= 200) {
            super.setBonus(bonus.multiply(BigDecimal.valueOf(2)));
        }
        if (percent > 200) {
            super.setBonus(bonus.multiply(BigDecimal.valueOf(3)));
        }
    }
}
