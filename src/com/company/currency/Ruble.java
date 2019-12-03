package com.company.currency;

public class Ruble extends AbstractCurrencyUnit {
    public Ruble(double currency) {
        super(currency);
    }

    public Ruble() {
    }

    @Override
    public void printCurrency() {
        System.out.println(" Exchange " + getCurrency() + " Ruble");
    }
}
