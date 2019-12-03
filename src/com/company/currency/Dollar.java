package com.company.currency;

public class Dollar extends AbstractCurrencyUnit {
    public Dollar(double currency) {
        super(currency);
    }

    public Dollar() {
    }

    @Override
    public void printCurrency() {
        System.out.println(" Exchange " + getCurrency() + " Dollar");
    }

}
