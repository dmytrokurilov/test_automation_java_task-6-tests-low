package com.epam.test.automation.java.practice6;

public class SalesPerson extends Employee {
    private final int percent;

    public SalesPerson(String name, double salary, int percent)
    {
        super (name, salary);
        this.percent = percent;
    }
    public void setBonus(double bonus)
    {
        if (percent <= 100)
        {
            super.setBonus(bonus);
        }
        if (percent > 100 && percent <= 200)
        {
            super.setBonus(bonus * 2);
        }
        if (percent > 200)
        {
            super.setBonus(bonus * 3);
        }
    }
}
