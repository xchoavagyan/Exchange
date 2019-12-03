package com.company.currency;

public abstract class AbstractCurrencyUnit {
    private double currency;

    public AbstractCurrencyUnit(double currency) {
        this.currency = currency;
    }

    public AbstractCurrencyUnit() {
    }

    public abstract void printCurrency();

    public double getCurrency() {
        return currency;
    }

    public void setCurrency(double currency) {
        this.currency = currency;
    }
}
