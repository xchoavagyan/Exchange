package com.company.currency;

public class Dram extends AbstractCurrencyUnit {
    public Dram(double currency) {
        super(currency);
    }

    public Dram() {
    }

    @Override
    public void printCurrency() {
        System.out.println(" Exchange " + getCurrency() + " Dram");
    }
}
