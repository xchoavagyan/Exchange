package com.company.currency;

public class Pound extends AbstractCurrencyUnit {
    public Pound(double currency) {
        super(currency);
    }

    public Pound() {
    }

    @Override
    public void printCurrency() {
        System.out.println(" Exchange " + getCurrency() + " Pound");
    }

}
