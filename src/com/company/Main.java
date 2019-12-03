package com.company;

import com.company.converter.Converter;
import com.company.converter.DollarConverter;
import com.company.currency.AbstractCurrencyUnit;
import com.company.currency.Dram;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Converter dollarConverter = new DollarConverter();
        Dram dram = new Dram(1000000);
        AbstractCurrencyUnit convert = dollarConverter.convert(dram);
        convert.printCurrency();
    }
}
