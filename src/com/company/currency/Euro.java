package com.company.currency;

public class Euro extends AbstractCurrencyUnit {
    public Euro(double currency) {
        super(currency);
    }

    public Euro() {
    }

    @Override
    public void printCurrency() {
        System.out.println(" Exchange " + getCurrency() + " Euro");
    }
}
