package com.epam.test.automation.java.practice6;

public class Manager extends Employee {
    private final int quantity;

    public Manager(String name, double salary, int clientAmount)
    {
        super(name, salary);
        quantity = clientAmount;
    }
    public void setBonus(double bonus)
    {
        if (quantity <= 100)
        {
            super.setBonus(bonus);
        }
        if (quantity > 100 && quantity <= 150)
        {
            super.setBonus(bonus + 500);
        }
        if (quantity > 150)
        {
            super.setBonus(bonus + 1000);
        }
    }
}
